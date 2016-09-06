package uk.ac.ebi.subs.data.component;

import org.junit.Before;
import org.junit.Test;

import uk.ac.ebi.subs.data.submittable.Project;
import uk.ac.ebi.subs.data.submittable.Sample;

import java.util.LinkedList;
import java.util.List;

import static org.hamcrest.Matchers.*;
import static org.junit.Assert.*;


public class SubsLinkTest {

    SubsLink<Project> subsLink;
    List<Project> candidates;


    @Test
    public void happyTrailAccession(){
        addCandidate("unclebob").setAccession("acc1");

        run();

        assertThat("subs link accession", subsLink.getAccession(), equalTo("acc1"));
        assertThat("subs link ref", subsLink.getReferencedObject(), equalTo(candidates.get(0)));
    };

    @Test
    public void happyTrailNoAccession(){
        addCandidate("unclebob");

        run();

        assertThat("subs link accession", subsLink.getAccession(), nullValue());
        assertThat("subs link ref", subsLink.getReferencedObject(), equalTo(candidates.get(0)));
    };


    @Test(expected = RuntimeException.class)
    public void noMatch(){
        addCandidate("notunclebob");

        run();
    }

    @Test(expected = RuntimeException.class)
    public void tooManyMatches(){
        addCandidate("unclebob");
        addCandidate("unclebob");
        run();
    }


    @Before
    public void setUp(){
        subsLink = new SubsLink<Project>();
        candidates = new LinkedList<>();

        subsLink.setRealm(Realm.Usi.name());
        subsLink.setAlias("unclebob");
    };

    private Project addCandidate(String alias){
        Project p = new Project();
        p.setAlias(alias);
        p.setRealm(Realm.Usi);
        candidates.add(p);
        return p;
    }



    private void run(){
        subsLink.fillIn(candidates);
    }

}


