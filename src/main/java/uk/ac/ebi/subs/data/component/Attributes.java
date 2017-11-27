package uk.ac.ebi.subs.data.component;

import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public interface Attributes {

    Map<String,Collection<Attribute>> getAttributes();

    void setAttributes(Map<String,Collection<Attribute>> attributes);

    default void addAttribute(String name, Attribute attribute){
        Map<String,Collection<Attribute>> attributes = this.getAttributes();


        if (!attributes.containsKey(name)){
            attributes.put(name,new LinkedList<>());
        }

        attributes.get(name).add(attribute);
    }

}
