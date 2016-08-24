package uk.ac.ebi.subs.data.component;

public class Attribute {
        String tagName;
        String tagValue;
        String units;
        Term term;

        public String getTagName() {
                return tagName;
        }

        public void setTagName(String tagName) {
                this.tagName = tagName;
        }

        public String getTagValue() {
                return tagValue;
        }

        public void setTagValue(String tagValue) {
                this.tagValue = tagValue;
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
