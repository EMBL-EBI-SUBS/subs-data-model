package uk.ac.ebi.subs.data.component;


import lombok.EqualsAndHashCode;
import lombok.ToString;

@ToString
@EqualsAndHashCode
public class Publication {
    String pubmedId;
    String doi;

    public String getPubmedId() {
        return pubmedId;
    }

    public void setPubmedId(String pubmedId) {
        this.pubmedId = pubmedId;
    }

    public String getDoi() {
        return doi;
    }

    public void setDoi(String doi) {
        this.doi = doi;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Publication that = (Publication) o;

        if (pubmedId != null ? !pubmedId.equals(that.pubmedId) : that.pubmedId != null) return false;
        return doi != null ? doi.equals(that.doi) : that.doi == null;

    }

    @Override
    public int hashCode() {
        int result = pubmedId != null ? pubmedId.hashCode() : 0;
        result = 31 * result + (doi != null ? doi.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Publication{" +
                "pubmedId='" + pubmedId + '\'' +
                ", doi='" + doi + '\'' +
                '}';
    }
}
