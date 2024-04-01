package rental_cyh;

import java.sql.Date;

public class RentalOrder {

    private Integer ROrdNo;
    private Integer MemNo;
    private String  RByrName;
    private String  RByrPhone;
    private String  RByrEmail;
    private String  RRcvName;
    private String  RRcvPhone;
    private Integer RTakeMethod;
    private String  RAddr;
    private Integer RPayMethod;
    private Double  RAllPrice;
    private Double  RAllDepPrice;
    private Date    ROrdTime;
    private Date    RDate;
    private Date    RBackDate;
    private Date    RRealBackDate;
    private Integer RPayStat;
    private Integer ROrdStat;
    private Integer RtnStat;
    private String  RtnRemark;
    private Double  RtnCompensation;

    public Integer getROrdNo() {
        return ROrdNo;
    }

    public void setROrdNo(Integer ROrdNo) {
        this.ROrdNo = ROrdNo;
    }

    public Integer getMemNo() {
        return MemNo;
    }

    public void setMemNo(Integer memNo) {
        MemNo = memNo;
    }

    public String getRByrName() {
        return RByrName;
    }

    public void setRByrName(String RByrName) {
        this.RByrName = RByrName;
    }

    public String getRByrPhone() {
        return RByrPhone;
    }

    public void setRByrPhone(String RByrPhone) {
        this.RByrPhone = RByrPhone;
    }

    public String getRByrEmail() {
        return RByrEmail;
    }

    public void setRByrEmail(String RByrEmail) {
        this.RByrEmail = RByrEmail;
    }

    public String getRRcvName() {
        return RRcvName;
    }

    public void setRRcvName(String RRcvName) {
        this.RRcvName = RRcvName;
    }

    public String getRRcvPhone() {
        return RRcvPhone;
    }

    public void setRRcvPhone(String RRcvPhone) {
        this.RRcvPhone = RRcvPhone;
    }

    public Integer getRTakeMethod() {
        return RTakeMethod;
    }

    public void setRTakeMethod(Integer RTakeMethod) {
        this.RTakeMethod = RTakeMethod;
    }

    public String getRAddr() {
        return RAddr;
    }

    public void setRAddr(String RAddr) {
        this.RAddr = RAddr;
    }

    public Integer getRPayMethod() {
        return RPayMethod;
    }

    public void setRPayMethod(Integer RPayMethod) {
        this.RPayMethod = RPayMethod;
    }

    public Double getRAllPrice() {
        return RAllPrice;
    }

    public void setRAllPrice(Double RAllPrice) {
        this.RAllPrice = RAllPrice;
    }

    public Double getRAllDepPrice() {
        return RAllDepPrice;
    }

    public void setRAllDepPrice(Double RAllDepPrice) {
        this.RAllDepPrice = RAllDepPrice;
    }

    public Date getROrdTime() {
        return ROrdTime;
    }

    public void setROrdTime(Date ROrdTime) {
        this.ROrdTime = ROrdTime;
    }

    public Date getRDate() {
        return RDate;
    }

    public void setRDate(Date RDate) {
        this.RDate = RDate;
    }

    public Date getRBackDate() {
        return RBackDate;
    }

    public void setRBackDate(Date RBackDate) {
        this.RBackDate = RBackDate;
    }

    public Date getRRealBackDate() {
        return RRealBackDate;
    }

    public void setRRealBackDate(Date RRealBackDate) {
        this.RRealBackDate = RRealBackDate;
    }

    public Integer getRPayStat() {
        return RPayStat;
    }

    public void setRPayStat(Integer RPayStat) {
        this.RPayStat = RPayStat;
    }

    public Integer getROrdStat() {
        return ROrdStat;
    }

    public void setROrdStat(Integer ROrdStat) {
        this.ROrdStat = ROrdStat;
    }

    public Integer getRtnStat() {
        return RtnStat;
    }

    public void setRtnStat(Integer rtnStat) {
        RtnStat = rtnStat;
    }

    public String getRtnRemark() {
        return RtnRemark;
    }

    public void setRtnRemark(String rtnRemark) {
        RtnRemark = rtnRemark;
    }

    public Double getRtnCompensation() {
        return RtnCompensation;
    }

    public void setRtnCompensation(Double rtnCompensation) {
        RtnCompensation = rtnCompensation;
    }

}
