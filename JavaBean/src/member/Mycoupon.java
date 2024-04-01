package member;

import java.sql.Date;

public class Mycoupon implements java.io.Serializable{
    private Integer coupNo;
    private Integer memNo;
    private Integer coupUsedStat;
    private String coupInfo;
    private Date coupExpDate;

    public Integer getCoupNo() {
        return coupNo;
    }

    public void setCoupNo(Integer coupNo) {
        this.coupNo = coupNo;
    }

    public Integer getMemNo() {
        return memNo;
    }

    public void setMemNo(Integer memNo) {
        this.memNo = memNo;
    }

    public Integer getCoupUsedStat() {
        return coupUsedStat;
    }

    public void setCoupUsedStat(Integer coupUsedStat) {
        this.coupUsedStat = coupUsedStat;
    }

    public String getCoupInfo() {
        return coupInfo;
    }

    public void setCoupInfo(String coupInfo) {
        this.coupInfo = coupInfo;
    }

    public Date getCoupExpDate() {
        return coupExpDate;
    }

    public void setCoupExpDate(Date coupExpDate) {
        this.coupExpDate = coupExpDate;
    }
}
