package uk.ac.ebi.subs.data.submittable;


import lombok.EqualsAndHashCode;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.CompoundIndex;
import org.springframework.data.mongodb.core.index.CompoundIndexes;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.hateoas.Identifiable;

/*
    Caution - Spring data does not apply indexes from parent classes
     the index definition has to be in the child classes

    The compound indexes block below should in sync with the reference copy in AbstractSubsEntity
 */
@CompoundIndexes({
        @CompoundIndex(name = "domain_alias", def = "{ 'domain.name': 1, 'alias': 1 }"),
        @CompoundIndex(name = "accession", def = "{ 'accession': 1}"),
        @CompoundIndex(name = "submissionId_status", def = "{ 'submissionId': 1, 'status': 1}")
})
@Document
@ToString
@EqualsAndHashCode
public class EgaDacPolicy extends uk.ac.ebi.subs.data.core.EgaDacPolicy implements Identifiable<String> {

    @Id
    private String id;

    @Override
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
