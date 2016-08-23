package uk.ac.ebi.subs.linkresolution;

import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.assertThat;

import java.net.URL;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.IntegrationTest;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.boot.test.TestRestTemplate;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.web.client.RestTemplate;
import uk.ac.ebi.subs.Application;
import uk.ac.ebi.subs.data.component.Realm;
import uk.ac.ebi.subs.data.component.SubsLink;
import uk.ac.ebi.subs.data.submittable.Study;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = Application.class)
@WebAppConfiguration
@IntegrationTest({"server.port=0"})
public class LinkResolutionControllerIntegrationTest {

    @Value("${local.server.port}")
    private int port;

    @Autowired private UuidService uuidService;
    @Autowired private LinkResolutionRepository linkResolutionRepository;

    private RemoteLinkResolutionServiceImpl remoteLinkResolutionService;
    private Study study;
    private SubsLink subsLink;

    @Before
    public void setUp() throws Exception {
        this.study = new Study();

        uuidService.addUuid(study);

        study.setAccession("A1");
        study.setRealm(Realm.Usi);

        this.subsLink = study.asLink();

        this.remoteLinkResolutionService = new RemoteLinkResolutionServiceImpl();
        this.remoteLinkResolutionService.setBase(new URL("http://localhost:" + port + "/link"));
        this.remoteLinkResolutionService.setRestTemplate(new TestRestTemplate());
    }

    @After
    public void tearDown() throws Exception {
        linkResolutionRepository.delete(this.subsLink);
    }

    @Test
    public void getUuid() throws Exception {
        remoteLinkResolutionService.storeSubsLink(study);

        SubsLink expectedSubsLink = this.subsLink;

        SubsLink actualSubsLink = this.remoteLinkResolutionService.fetchSubsLink(expectedSubsLink.getUuid());

        assertThat(actualSubsLink.getUuid(), equalTo(expectedSubsLink.getUuid()));
        assertThat(actualSubsLink.getAccession(), equalTo(expectedSubsLink.getAccession()));
        assertThat(actualSubsLink.getRealm(), equalTo(expectedSubsLink.getRealm()));
    }

}