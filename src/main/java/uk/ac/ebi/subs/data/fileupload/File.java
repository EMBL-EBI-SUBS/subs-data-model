package uk.ac.ebi.subs.data.fileupload;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class File {

    private String id;

    private String generatedTusId;

    private String filename;

    private String uploadPath;

    private String targetPath;

    private String submissionId;

    private long totalSize;

    private long uploadedSize;

    private String createdBy;

    private LocalDateTime uploadStartDate;

    private LocalDateTime uploadFinishDate;

    private FileStatus status;

    private String checksum;
}
