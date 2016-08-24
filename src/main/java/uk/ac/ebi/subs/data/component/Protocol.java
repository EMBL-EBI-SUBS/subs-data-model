package uk.ac.ebi.subs.data.component;

import java.util.ArrayList;
import java.util.List;

public class Protocol implements Attributes {
    String name;
    String type;
    String description;
    List<Attribute> attributes = new ArrayList<Attribute>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public List<Attribute> getAttributes() {
        return attributes;
    }

    @Override
    public void setAttributes(List<Attribute> attributes) {
        this.attributes = attributes;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Protocol protocol = (Protocol) o;

        if (name != null ? !name.equals(protocol.name) : protocol.name != null) return false;
        if (type != null ? !type.equals(protocol.type) : protocol.type != null) return false;
        if (description != null ? !description.equals(protocol.description) : protocol.description != null)
            return false;
        return attributes != null ? attributes.equals(protocol.attributes) : protocol.attributes == null;

    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (type != null ? type.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + (attributes != null ? attributes.hashCode() : 0);
        return result;
    }
}
