package article;

import java.sql.Date;
import java.sql.Timestamp;

public class Report {

    private Integer reportNo;
    private Integer artReplyNo;
    private Integer memNo;
    private Integer admNo;
    private Timestamp reportTime;
    private String reportReason;
    private Byte reportType;

    public Integer getReportNo() {
        return reportNo;
    }

    public void setReportNo(Integer reportNo) {
        this.reportNo = reportNo;
    }

    public Integer getArtReplyNo() {
        return artReplyNo;
    }

    public void setArtReplyNo(Integer artReplyNo) {
        this.artReplyNo = artReplyNo;
    }

    public Integer getMemNo() {
        return memNo;
    }

    public void setMemNo(Integer memNo) {
        this.memNo = memNo;
    }

    public Integer getAdmNo() {
        return admNo;
    }

    public void setAdmNo(Integer admNo) {
        this.admNo = admNo;
    }

    public Timestamp getReportTime() {
        return reportTime;
    }

    public void setReportTime(Timestamp reportTime) {
        this.reportTime = reportTime;
    }

    public String getReportReason() {
        return reportReason;
    }

    public void setReportReason(String reportReason) {
        this.reportReason = reportReason;
    }

    public Byte getReportType() {
        return reportType;
    }

    public void setReportType(Byte reportType) {
        this.reportType = reportType;
    }
}
