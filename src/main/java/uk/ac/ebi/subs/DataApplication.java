package uk.ac.ebi.subs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * A workaround while we're uniformly using spring boot with everything - this doesn't need a main class
 * TODO - remove the blanket use of spring boot and then get rid of this workaround
 */
@SpringBootApplication
public class DataApplication {
    public static void main(String[] args) {
        SpringApplication springApplication = new SpringApplication( DataApplication.class);
    }

}
