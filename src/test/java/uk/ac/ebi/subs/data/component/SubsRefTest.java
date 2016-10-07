package uk.ac.ebi.subs.data.component;

import org.junit.Before;
import org.junit.Test;

import uk.ac.ebi.subs.data.submittable.Project;

import java.util.LinkedList;
import java.util.List;

import static org.hamcrest.Matchers.*;
import static org.junit.Assert.*;


public class SubsRefTest {

    ProjectRef subsLink;
    List<Project> candidates;


    @Test
    public void happyTrailAccession(){
        addCandidate("unclebob").setAccession("acc1");

        run();

        assertThat("subs ref filled in", subsLink.getReferencedObject(), notNullValue());
        assertThat("subs link ref", subsLink.getReferencedObject(), equalTo(candidates.get(0)));
    };

    @Test
    public void happyTrailNoAccession(){
        addCandidate("unclebob");

        run();

        assertThat("subs link accession", subsLink.getAccession(), nullValue());
        assertThat("subs link ref", subsLink.getReferencedObject(), equalTo(candidates.get(0)));
    };


    @Test
    public void noMatch(){
        addCandidate("notunclebob");

        run();

        assertThat("subs ref filled in", subsLink.getReferencedObject(), nullValue());
    }

    @Test
    public void manyMatches(){
        addCandidate("unclebob");
        addCandidate("unclebob");
        run();
    }


    @Before
    public void setUp(){
        subsLink = new ProjectRef();
        candidates = new LinkedList<>();

        subsLink.setArchive(Archive.Usi.name());
        subsLink.setAlias("unclebob");
        subsLink.setDomain("testDomain");
    };

    private Project addCandidate(String alias){
        Project p = new Project();
        p.setAlias(alias);
        p.setArchive(Archive.Usi);
        p.setDomain(new Domain());
        p.getDomain().setName("testDomain");
        candidates.add(p);
        return p;
    }



    private void run(){
        subsLink.fillIn(candidates);
    }

}


