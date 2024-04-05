package member;

import java.sql.Date;

public class Notice {

    private Integer motNo;
    private Integer memNo;
    private String notContent;
    private Date notTime;
    private Integer notStat;

    public Integer getMotNo() {
        return motNo;
    }

    public void setMotNo(Integer motNo) {
        this.motNo = motNo;
    }

    public Integer getMemNo() {
        return memNo;
    }

    public void setMemNo(Integer memNo) {
        this.memNo = memNo;
    }

    public String getNotContent() {
        return notContent;
    }

    public void setNotContent(String notContent) {
        this.notContent = notContent;
    }

    public Date getNotTime() {
        return notTime;
    }

    public void setNotTime(Date notTime) {
        this.notTime = notTime;
    }

    public Integer getNotStat() {
        return notStat;
    }

    public void setNotStat(Integer notStat) {
        this.notStat = notStat;
    }
}
