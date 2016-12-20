package uk.ac.ebi.subs.data.component;

import com.fasterxml.jackson.annotation.JsonIgnore;
import uk.ac.ebi.subs.data.submittable.Submittable;

import java.util.Collection;
import java.util.Objects;
import java.util.Optional;

/**
 * A reference to another submitted item
 *
 *
 *
 * @param <T>
 */
public abstract  class AbstractSubsRef<T extends Submittable> {
    String alias;
    String accession;
    String archive;
    String domain;

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
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AbstractSubsRef<?> that = (AbstractSubsRef<?>) o;
        return Objects.equals(alias, that.alias) &&
                Objects.equals(accession, that.accession) &&
                Objects.equals(archive, that.archive) &&
                Objects.equals(domain, that.domain);
    }

    @Override
    public int hashCode() {
        return Objects.hash(alias, accession, archive, domain);
    }

    /**
     * Search the item sources for a match, and update your accession based upon them
     *
     * @param itemSources
     * @return
     */
    public T fillIn(Collection<T>... itemSources) {

            T match = this.findMatch(itemSources);

            if (match != null && !this.isAccessioned()){
                this.accession = match.getAccession();
            }

            return match;
    }

    /**
     * Return the first match within a list of sources
     * @param itemSources
     * @return
     */
    public T findMatch(Collection<T>... itemSources){
        for (Collection<T> items : itemSources) {
            Optional<T> optionalSubmittable = items.stream()
                    .filter(s -> this.isMatch(s))
                    .findFirst();

            if (optionalSubmittable.isPresent()) {
                return optionalSubmittable.get();
            }
        }
        return null;
    }

    /**
     * An object is a match if it meets either of these criteria
     *
     * <ul>
     *     <li>ref has an accession, and the object has the same accession</li>
     *     <li>ref has a domain and an alias, and the object has the same alias and domain</li>
     * </ul>
     * @param submittable
     * @return
     */
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
