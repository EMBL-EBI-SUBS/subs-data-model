package uk.ac.ebi.subs.data.submittable;

import org.springframework.data.mongodb.core.index.CompoundIndex;
import org.springframework.data.mongodb.core.index.CompoundIndexes;
import uk.ac.ebi.subs.data.AbstractSubsEntity;
import uk.ac.ebi.subs.data.component.Domain;
import uk.ac.ebi.subs.data.component.Submitter;

import java.util.*;
import java.util.stream.Stream;

import org.springframework.data.annotation.Id;

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

    List<Analysis> analyses = new ArrayList<>();
    List<Assay> assays = new ArrayList<>();
    List<AssayData> assayData = new ArrayList<>();
    List<EgaDac> egaDacs = new ArrayList<>();
    List<EgaDacPolicy> egaDacPolicies = new ArrayList<>();
    List<EgaDataset> egaDatasets = new ArrayList<>();
    List<Project> projects = new ArrayList<>();
    List<Sample> samples = new ArrayList<>();
    List<SampleGroup> sampleGroups = new ArrayList<>();
    List<Study> studies = new ArrayList<>();

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
}
