package uk.ac.ebi.subs.data.component;

public class Attribute {
        String name;
        String value;
        String units;
        Term term;

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

        public Term getTerm() {
                return term;
        }

        public void setTerm(Term term) {
                this.term = term;
        }
}
