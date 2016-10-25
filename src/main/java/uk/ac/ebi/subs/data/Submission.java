package uk.ac.ebi.subs.data;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.CompoundIndex;
import org.springframework.data.mongodb.core.index.CompoundIndexes;
import org.springframework.data.mongodb.core.mapping.DBRef;
import uk.ac.ebi.subs.data.component.Domain;
import uk.ac.ebi.subs.data.submittable.Protocol;
import uk.ac.ebi.subs.data.component.Submitter;
import uk.ac.ebi.subs.data.submittable.*;

import java.util.*;

@CompoundIndexes({
        @CompoundIndex(name = "domain_rev_submission_date", def = "{ 'domain.name': 1, 'submissionDate': -1 }")
})
public class Submission {
    @Id
    String id;
    Submitter submitter = new Submitter();


    Domain domain = new Domain();
    Date submissionDate = new Date();
    String status;

    @DBRef(lazy = true) List<Analysis> analyses = new ArrayList<>();
    @DBRef(lazy = true) List<Assay> assays = new ArrayList<>();
    @DBRef(lazy = true) List<AssayData> assayData = new ArrayList<>();
    @DBRef(lazy = true) List<EgaDac> egaDacs = new ArrayList<>();
    @DBRef(lazy = true) List<EgaDacPolicy> egaDacPolicies = new ArrayList<>();
    @DBRef(lazy = true) List<EgaDataset> egaDatasets = new ArrayList<>();
    @DBRef(lazy = true) List<Project> projects = new ArrayList<>();
    @DBRef(lazy = true) List<Sample> samples = new ArrayList<>();
    @DBRef(lazy = true) List<SampleGroup> sampleGroups = new ArrayList<>();
    @DBRef(lazy = true) List<Study> studies = new ArrayList<>();
    @DBRef(lazy = true) List<Protocol> protocols = new ArrayList<>();

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Submitter getSubmitter() {
        return submitter;
    }

    public void setSubmitter(Submitter submitter) {
        this.submitter = submitter;
    }

    public Domain getDomain() {
        return domain;
    }

    public void setDomain(Domain domain) {
        this.domain = domain;
    }

    public Date getSubmissionDate() {
        return submissionDate;
    }

    public void setSubmissionDate(Date submissionDate) {
        this.submissionDate = submissionDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<Submittable> allSubmissionItems() {
        List<Submittable> submittables = new ArrayList<>();

        for (List<? extends AbstractSubsEntity> items : Arrays.asList(analyses, assays, assayData, egaDacs, egaDacPolicies, egaDatasets, projects, samples, sampleGroups, studies)) {
            submittables.addAll(items);
        }
        return Collections.unmodifiableList(submittables);
    }

    public List<Analysis> getAnalyses() {
        return analyses;
    }

    public void setAnalyses(List<Analysis> analyses) {
        this.analyses = analyses;
    }

    public List<Assay> getAssays() {
        return assays;
    }

    public void setAssays(List<Assay> assays) {
        this.assays = assays;
    }

    public List<AssayData> getAssayData() {
        return assayData;
    }

    public void setAssayData(List<AssayData> assayData) {
        this.assayData = assayData;
    }

    public List<EgaDac> getEgaDacs() {
        return egaDacs;
    }

    public void setEgaDacs(List<EgaDac> egaDacs) {
        this.egaDacs = egaDacs;
    }

    public List<EgaDacPolicy> getEgaDacPolicies() {
        return egaDacPolicies;
    }

    public void setEgaDacPolicies(List<EgaDacPolicy> egaDacPolicies) {
        this.egaDacPolicies = egaDacPolicies;
    }

    public List<EgaDataset> getEgaDatasets() {
        return egaDatasets;
    }

    public void setEgaDatasets(List<EgaDataset> egaDatasets) {
        this.egaDatasets = egaDatasets;
    }

    public List<Project> getProjects() {
        return projects;
    }

    public void setProjects(List<Project> projects) {
        this.projects = projects;
    }

    public List<Sample> getSamples() {
        return samples;
    }

    public void setSamples(List<Sample> samples) {
        this.samples = samples;
    }

    public List<SampleGroup> getSampleGroups() {
        return sampleGroups;
    }

    public void setSampleGroups(List<SampleGroup> sampleGroups) {
        this.sampleGroups = sampleGroups;
    }

    public List<Study> getStudies() {
        return studies;
    }

    public void setStudies(List<Study> studies) {
        this.studies = studies;
    }

    public List<Protocol> getProtocols() {
        return protocols;
    }

    public void setProtocols(List<Protocol> protocols) {
        this.protocols = protocols;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Submission that = (Submission) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Submission{" +
                "id='" + id + '\'' +
                ", submitter=" + submitter +
                ", domain=" + domain +
                ", submissionDate=" + submissionDate +
                ", status='" + status + '\'' +
                ", analyses=" + (analyses != null ? "[" + analyses.size() + "]" : "[0]") +
                ", assays=" + (assays != null ? "[" + assays.size() + "]" : "[0]") +
                ", assayData=" + (assayData != null ? "[" + assayData.size() + "]" : "[0]") +
                ", egaDacs=" + (egaDacs != null ? "[" + egaDacs.size() + "]" : "[0]") +
                ", egaDacPolicies=" + (egaDacPolicies != null ? "[" + egaDacPolicies.size() + "]" : "[0]") +
                ", egaDatasets=" + (egaDatasets != null ? "[" + egaDatasets.size() + "]" : "[0]") +
                ", projects=" + (projects != null ? "[" + projects.size() + "]" : "[0]") +
                ", samples=" + (samples != null ? "[" + samples.size() + "]" : "[0]") +
                ", sampleGroups=" + (sampleGroups != null ? "[" + sampleGroups.size() + "]" : "[0]") +
                ", studies=" + (studies != null ? "[" + studies.size() + "]" : "[0]") +
                '}';
    }
}
