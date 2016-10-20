package uk.ac.ebi.subs.data.component;

import com.fasterxml.jackson.annotation.JsonIgnore;
import uk.ac.ebi.subs.data.submittable.Submittable;

import java.util.Collection;
import java.util.Optional;

public abstract  class AbstractSubsRef<T extends Submittable> {
    String alias;
    String accession;
    String archive;
    String domain;


    public abstract T getReferencedObject();

    public abstract void setReferencedObject(T referencedObject);

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

    @JsonIgnore
    public boolean isAccessioned() {
        return (accession != null && accession.isEmpty());
    }

    @Override
    public String toString() {
        return "AbstractSubsRef{" +
                "alias='" + alias + '\'' +
                ", accession='" + accession + '\'' +
                ", archive='" + archive + '\'' +
                ", domain='" + domain + '\'' +
                ", referencedObject=" + this.getReferencedObject() +
                '}';
    }


    public void fillIn(Collection<T>... itemSources) {
        for (Collection<T> items : itemSources){
            T match = this.findMatch(items);
            this.setReferencedObject(match);

            if (match != null && !this.isAccessioned()){
                this.accession = match.getAccession();
            }

            if (match != null) {
                return;
            }
        }
    }

    public T findMatch(Collection<T> items){
        Optional<T> optionalSubmittable = items.stream()
                .filter(s -> this.isMatch(s))
                .findFirst();

        if (optionalSubmittable.isPresent()) {
            return optionalSubmittable.get();
        }
        else {
            return null;
        }
    }

    public boolean isMatch(T submittable) {
        Optional<Archive> optionalArchive = Optional.ofNullable(submittable.getArchive());
        if(optionalArchive.isPresent()) {
            return
                    this.archive.equals(optionalArchive.get().name()) && // must always match archive
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
        return false;
    }
}
