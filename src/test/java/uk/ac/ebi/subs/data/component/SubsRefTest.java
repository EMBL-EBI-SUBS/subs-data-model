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
    Project match;


    @Test
    public void happyTrailAccession(){
        addCandidate("unclebob").setAccession("acc1");

        run();

        assertThat("subs ref filled in", match, notNullValue());
        assertThat("subs link ref", match, equalTo(candidates.get(0)));
    };

    @Test
    public void happyTrailNoAccession(){
        addCandidate("unclebob");

        run();

        assertThat("subs link accession", match, notNullValue());
        assertThat("subs link ref", match, equalTo(candidates.get(0)));
    };


    @Test
    public void noMatch(){
        addCandidate("notunclebob");

        run();

        assertThat("subs ref filled in", match, nullValue());
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
        subsLink.setTeam("testTeam");

        match = null;
    };

    private Project addCandidate(String alias){
        Project p = new Project();
        p.setAlias(alias);
        p.setArchive(Archive.Usi);
        p.setTeam(new Team());
        p.getTeam().setName("testTeam");
        candidates.add(p);
        return p;
    }



    private void run(){
        match = subsLink.findMatch(candidates);
    }

}


