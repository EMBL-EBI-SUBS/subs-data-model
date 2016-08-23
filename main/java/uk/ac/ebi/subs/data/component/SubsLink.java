package uk.ac.ebi.subs.data.component;

import org.springframework.data.annotation.Id;

public class SubsLink {
    String alias;
    String accession;
    String realm;

    @Id String uuid;

    public String getRealm() {
        return realm;
    }

    public void setRealm(String realm) {
        this.realm = realm;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public String getAccession() {
        return accession;
    }

    public void setAccession(String accession) {
        this.accession = accession;
    }

    @Override
    public String toString() {
        return "SubsLink{" +
                "alias='" + alias + '\'' +
                ", accession='" + accession + '\'' +
                ", realm='" + realm + '\'' +
                ", uuid='" + uuid + '\'' +
                '}';
    }
}
