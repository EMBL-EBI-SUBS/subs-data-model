package uk.ac.ebi.subs.linkresolution;

import static org.hamcrest.Matchers.*;
import static org.junit.Assert.assertThat;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import uk.ac.ebi.subs.Application;
import uk.ac.ebi.subs.data.submittable.Analysis;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = Application.class)
public class UuidServiceTest {

    @Autowired private UuidService uuidService;

    @Test
    public void setUuid(){
        Analysis sampleGroup = new Analysis();

        assertThat(sampleGroup.getUuid(),nullValue());

        this.uuidService.addUuid(sampleGroup);

        assertThat(sampleGroup.getUuid(),notNullValue());

        System.out.println("UUID Assigned:"+sampleGroup.getUuid());
    }

    @Test(expected = IllegalArgumentException.class)
    public void setUuidWithAccessionPresent(){
        Analysis sampleGroup = new Analysis();

        sampleGroup.setAccession("SG2");

        assertThat(sampleGroup.getUuid(),nullValue());

        this.uuidService.addUuid(sampleGroup);
    }


}
