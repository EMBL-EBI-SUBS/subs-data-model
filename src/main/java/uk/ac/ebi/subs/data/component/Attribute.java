package uk.ac.ebi.subs.data.component;

import lombok.EqualsAndHashCode;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

@ToString
@EqualsAndHashCode
public class Attribute implements Comparable<Attribute> {
    String name;
    String value;
    String units;
    List<Term> terms = new ArrayList<>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

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
        if (o.getName() != getName()) {
            return o.getValue().compareTo(getValue());
        } else {
            return o.getName().compareTo(getName());
        }
    }
}
