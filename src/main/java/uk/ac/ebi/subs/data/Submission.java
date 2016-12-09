package uk.ac.ebi.subs.data;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.CompoundIndex;
import org.springframework.data.mongodb.core.index.CompoundIndexes;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.hateoas.Identifiable;
import uk.ac.ebi.subs.data.annotation.CascadeSave;
import uk.ac.ebi.subs.data.component.Domain;
import uk.ac.ebi.subs.data.submittable.Protocol;
import uk.ac.ebi.subs.data.component.Submitter;
import uk.ac.ebi.subs.data.submittable.*;

import java.util.*;
import java.util.stream.Stream;

@CompoundIndexes({
        @CompoundIndex(name = "domain_rev_submission_date", def = "{ 'domain.name': 1, 'submissionDate': -1 }")
})
public class Submission implements Identifiable<String>{
    @Id
    String id;
    Submitter submitter = new Submitter();

    Domain domain = new Domain();
    Date submissionDate = new Date();
    String status;

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

    @DBRef(lazy = true) @CascadeSave(classToSave = Analysis.class)
    List<Analysis> analyses = new ArrayList<>();
    @DBRef(lazy = true) @CascadeSave(classToSave = Assay.class)
    List<Assay> assays = new ArrayList<>();
    @DBRef(lazy = true) @CascadeSave(classToSave = AssayData.class)
    List<AssayData> assayData = new ArrayList<>();
    @DBRef(lazy = true) @CascadeSave(classToSave = EgaDac.class)
    List<EgaDac> egaDacs = new ArrayList<>();
    @DBRef(lazy = true) @CascadeSave(classToSave = EgaDacPolicy.class)
    List<EgaDacPolicy> egaDacPolicies = new ArrayList<>();
    @DBRef(lazy = true) @CascadeSave(classToSave = EgaDataset.class)
    List<EgaDataset> egaDatasets = new ArrayList<>();
    @DBRef(lazy = true) @CascadeSave(classToSave = Project.class)
    List<Project> projects = new ArrayList<>();
    @DBRef(lazy = true) @CascadeSave(classToSave = Sample.class)
    List<Sample> samples = new ArrayList<>();
    @DBRef(lazy = true) @CascadeSave(classToSave = SampleGroup.class)
    List<SampleGroup> sampleGroups = new ArrayList<>();
    @DBRef(lazy = true) @CascadeSave(classToSave = Study.class)
    List<Study> studies = new ArrayList<>();
    @DBRef(lazy = true) @CascadeSave(classToSave = Protocol.class)
    List<Protocol> protocols = new ArrayList<>();

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

    /**
     * get a list of all the lists of objects implementing Submittable within the submission.
     * @return
     */
    private List<List<Submittable>> allSubmittablesLists(){
        List lists = Arrays.asList(analyses, assays, assayData, egaDacs, egaDacPolicies, egaDatasets, projects, samples, sampleGroups, studies);
        return (List<List<Submittable>>)lists;
    }

    public List<Submittable> allSubmissionItems() {
        List<Submittable> submittables = new ArrayList<>();

        this.allSubmittablesLists().forEach(submittables::addAll);

        return Collections.unmodifiableList(submittables);
    }

    public Stream<Submittable> allSubmissionItemsStream(){
        return allSubmittablesLists().stream().flatMap(l -> l.stream());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Submission that = (Submission) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(submitter, that.submitter) &&
                Objects.equals(domain, that.domain) &&
                Objects.equals(submissionDate, that.submissionDate) &&
                Objects.equals(status, that.status) &&
                Objects.equals(analyses, that.analyses) &&
                Objects.equals(assays, that.assays) &&
                Objects.equals(assayData, that.assayData) &&
                Objects.equals(egaDacs, that.egaDacs) &&
                Objects.equals(egaDacPolicies, that.egaDacPolicies) &&
                Objects.equals(egaDatasets, that.egaDatasets) &&
                Objects.equals(projects, that.projects) &&
                Objects.equals(samples, that.samples) &&
                Objects.equals(sampleGroups, that.sampleGroups) &&
                Objects.equals(studies, that.studies) &&
                Objects.equals(protocols, that.protocols);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, submitter, domain, submissionDate, status, analyses, assays, assayData, egaDacs, egaDacPolicies, egaDatasets, projects, samples, sampleGroups, studies, protocols);
    }

    @Override
    public String toString() {
        return "Submission{" +
                "id='" + id + '\'' +
                ", submitter=" + submitter +
                ", domain=" + domain +
                ", submissionDate=" + submissionDate +
                ", status='" + status + '\'' +
                ", analyses=" + analyses +
                ", assays=" + assays +
                ", assayData=" + assayData +
                ", egaDacs=" + egaDacs +
                ", egaDacPolicies=" + egaDacPolicies +
                ", egaDatasets=" + egaDatasets +
                ", projects=" + projects +
                ", samples=" + samples +
                ", sampleGroups=" + sampleGroups +
                ", studies=" + studies +
                ", protocols=" + protocols +
                '}';
    }
}
