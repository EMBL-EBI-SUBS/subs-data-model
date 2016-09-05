package uk.ac.ebi.subs.data.component;

import uk.ac.ebi.subs.data.submittable.Submittable;

import java.util.Collection;
import java.util.Optional;

public class SubsLink<T extends Submittable> {
    String alias;
    String accession;
    String archive;
    String domain;

    T referencedObject;

    public T getReferencedObject() {
        return referencedObject;
    }

    public void setReferencedObject(T referencedObject) {
        this.referencedObject = referencedObject;
    }

    public String getArchive() {
        return archive;
    }

    public void setArchive(String archive) {
        this.archive = archive;
    }

    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
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
                ", archive='" + archive + '\'' +
                ", domain='" + domain + '\'' +
                ", referencedObject=" + referencedObject +
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
                this.archive.equals(submittable.getArchive().name()) && // must always match archive
                        (//EITHER
                                // BOTH are accessioned and the accession matches
                                (
                                        this.isAccessioned() &&
                                                submittable.isAccessioned() &&
                                                this.accession.equals(submittable.getAccession())
                                ) ||
                                // OR the aliases match
                                (
                                        submittable.getAlias().equals(this.getAlias()) &&
                                                this.getArchive().equals(submittable.getArchive().name()) &&
                                                this.getDomain().equals(submittable.getDomain().getName())
                                )
                        );
    }
}
