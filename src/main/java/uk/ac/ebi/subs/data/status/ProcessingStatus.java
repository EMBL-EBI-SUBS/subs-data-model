package uk.ac.ebi.subs.data.status;

import lombok.EqualsAndHashCode;
import lombok.ToString;

@EqualsAndHashCode
@ToString
public class ProcessingStatus {

    private String status;

    public ProcessingStatus() {
    }

    public ProcessingStatus(ProcessingStatusEnum statusEnum) {
        this.setStatus(statusEnum.name());
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setStatus(ProcessingStatusEnum statusEnum) {
        this.status = statusEnum.name();
    }
}
