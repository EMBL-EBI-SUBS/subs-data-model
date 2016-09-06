package uk.ac.ebi.subs.data.component;

import uk.ac.ebi.subs.data.submittable.Submittable;

import java.util.Collection;
import java.util.Optional;

public class SubsLink<T extends Submittable> {
    String alias;
    String accession;
    String realm;

    String uuid;

    T referencedObject;

    public T getReferencedObject() {
        return referencedObject;
    }

    public void setReferencedObject(T referencedObject) {
        this.referencedObject = referencedObject;
    }

    public String getRealm() {
        return realm;
    }

    public void setRealm(String realm) {
        this.realm = realm;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public String getAccession() {
        return accession;
    }

    public void setAccession(String accession) {
        this.accession = accession;
    }

    public boolean isAccessioned() {
        return (accession != null && accession.isEmpty());
    }

    @Override
    public String toString() {
        return "SubsLink{" +
                "alias='" + alias + '\'' +
                ", accession='" + accession + '\'' +
                ", realm='" + realm + '\'' +
                ", uuid='" + uuid + '\'' +
                '}';
    }

    public void fillIn(Collection<T> items) {
        Optional<T> optionalSubmittable = items.stream()
                .filter(s -> this.isMatch(s))
                .reduce((s1, s2) -> {
                    throw new RuntimeException("Too many matches found for " + this.toString());
                });

        if (!optionalSubmittable.isPresent()) {
            throw new RuntimeException("No match found for " + this.toString());
        }

        T item = optionalSubmittable.get();

        if (item.isAccessioned()) {
            this.setAccession(item.getAccession());
        }
        this.referencedObject = item;
    }

    public boolean isMatch(T submittable) {
        return
                this.realm.equals(submittable.getRealm().name()) && // must always match realm
                        (//EITHER
                                // BOTH are accessioned and the accession matches
                                (this.isAccessioned() && submittable.isAccessioned() && this.accession.equals(submittable.getAccession()))
                                ||
                                        // OR the aliases match
                                        (submittable.getAlias().equals(this.getAlias())
                                                && this.getRealm().equals(submittable.getRealm().name())
                                        )
                        );
    }
}
