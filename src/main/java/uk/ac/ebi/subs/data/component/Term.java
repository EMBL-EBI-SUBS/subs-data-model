package uk.ac.ebi.subs.data.component;

import lombok.EqualsAndHashCode;
import lombok.ToString;

import java.net.URL;

/**
 * Ontology terms are to be represented as a URL
 * Terms should be selected from <a href="https://www.ebi.ac.uk/ols">OLS</a>
 *
 * Examples:
 * the EFO term for Bone Density should has the URL http://www.ebi.ac.uk/efo/EFO_0003923
 * the LBO term for Texel has the URL  http://purl.obolibrary.org/obo/LBO_0000640
 *
 */
@ToString
@EqualsAndHashCode
public class Term {
    private String url;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
