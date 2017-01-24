package uk.ac.ebi.subs.data.component;


import lombok.EqualsAndHashCode;
import lombok.ToString;

@ToString
@EqualsAndHashCode
public class File {
    String name;
    String checksum;
    String checksumMethod;
    String type;
    String unencryptedChecksum;
    String label;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getChecksum() {
        return checksum;
    }

    public void setChecksum(String checksum) {
        this.checksum = checksum;
    }

    public String getChecksumMethod() {
        return checksumMethod;
    }

    public void setChecksumMethod(String checksumMethod) {
        this.checksumMethod = checksumMethod;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getUnencryptedChecksum() {
        return unencryptedChecksum;
    }

    public void setUnencryptedChecksum(String unencryptedChecksum) {
        this.unencryptedChecksum = unencryptedChecksum;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }
}
