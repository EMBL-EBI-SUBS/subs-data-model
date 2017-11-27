package uk.ac.ebi.subs.data.component;

import lombok.EqualsAndHashCode;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

@EqualsAndHashCode
@ToString
public class Attribute implements Comparable<Attribute> {

    private String value;
    private String units;
    private List<Term> terms = new ArrayList<>();

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getUnits() {
        return units;
    }

    public void setUnits(String units) {
        this.units = units;
    }

    public List<Term> getTerms() {
        return terms;
    }

    public void setTerms(List<Term> terms) {
        this.terms = terms;
    }

    @Override
    public int compareTo(Attribute o) {
        return o.getValue().compareTo(getValue());
    }

}
