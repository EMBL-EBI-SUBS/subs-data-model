package uk.ac.ebi.subs.data.component;

import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public interface Attributes {

    Map<String,List<Attribute>> getAttributes();

    void setAttributes(Map<String,List<Attribute>> attributes);

    default void addAttribute(String name, Attribute attribute){
        Map<String,List<Attribute>> attributes = this.getAttributes();


        if (!attributes.containsKey(name)){
            attributes.put(name,new LinkedList<>());
        }

        attributes.get(name).add(attribute);
    }

}
