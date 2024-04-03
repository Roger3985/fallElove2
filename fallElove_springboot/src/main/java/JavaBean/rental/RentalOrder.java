package JavaBean.rental;

import java.math.BigDecimal;
import java.sql.Date;
import java.sql.Timestamp;

public class RentalOrder {

    private Integer rOrdNo;
    private Integer memNo;
    private String  rByrName;
    private String  rByrPhone;
    private String  rByrEmail;
    private String  rRcvName;
    private String  rRcvPhone;
    private Byte rTakeMethod;
    private String  rAddr;
    private Byte rPayMethod;
    private BigDecimal rAllPrice;
    private BigDecimal rAllDepPrice;
    private Timestamp rOrdTime;
    private Timestamp rDate;
    private Timestamp rBackDate;
    private Timestamp rRealBackDate;
    private Byte rPayStat;
    private Byte rOrdStat;
    private Byte rtnStat;
    private String rtnRemark;
    private BigDecimal rtnCompensation;

    public Integer getrOrdNo() {
        return rOrdNo;
    }

    public void setrOrdNo(Integer rOrdNo) {
        this.rOrdNo = rOrdNo;
    }

    public Integer getMemNo() {
        return memNo;
    }

    public void setMemNo(Integer memNo) {
        this.memNo = memNo;
    }

    public String getrByrName() {
        return rByrName;
    }

    public void setrByrName(String rByrName) {
        this.rByrName = rByrName;
    }

    public String getrByrPhone() {
        return rByrPhone;
    }

    public void setrByrPhone(String rByrPhone) {
        this.rByrPhone = rByrPhone;
    }

    public String getrByrEmail() {
        return rByrEmail;
    }

    public void setrByrEmail(String rByrEmail) {
        this.rByrEmail = rByrEmail;
    }

    public String getrRcvName() {
        return rRcvName;
    }

    public void setrRcvName(String rRcvName) {
        this.rRcvName = rRcvName;
    }

    public String getrRcvPhone() {
        return rRcvPhone;
    }

    public void setrRcvPhone(String rRcvPhone) {
        this.rRcvPhone = rRcvPhone;
    }

    public Byte getrTakeMethod() {
        return rTakeMethod;
    }

    public void setrTakeMethod(Byte rTakeMethod) {
        this.rTakeMethod = rTakeMethod;
    }

    public String getrAddr() {
        return rAddr;
    }

    public void setrAddr(String rAddr) {
        this.rAddr = rAddr;
    }

    public Byte getrPayMethod() {
        return rPayMethod;
    }

    public void setrPayMethod(Byte rPayMethod) {
        this.rPayMethod = rPayMethod;
    }

    public BigDecimal getrAllPrice() {
        return rAllPrice;
    }

    public void setrAllPrice(BigDecimal rAllPrice) {
        this.rAllPrice = rAllPrice;
    }

    public BigDecimal getrAllDepPrice() {
        return rAllDepPrice;
    }

    public void setrAllDepPrice(BigDecimal rAllDepPrice) {
        this.rAllDepPrice = rAllDepPrice;
    }

    public Timestamp getrOrdTime() {
        return rOrdTime;
    }

    public void setrOrdTime(Timestamp rOrdTime) {
        this.rOrdTime = rOrdTime;
    }

    public Timestamp getrDate() {
        return rDate;
    }

    public void setrDate(Timestamp rDate) {
        this.rDate = rDate;
    }

    public Timestamp getrBackDate() {
        return rBackDate;
    }

    public void setrBackDate(Timestamp rBackDate) {
        this.rBackDate = rBackDate;
    }

    public Timestamp getrRealBackDate() {
        return rRealBackDate;
    }

    public void setrRealBackDate(Timestamp rRealBackDate) {
        this.rRealBackDate = rRealBackDate;
    }

    public Byte getrPayStat() {
        return rPayStat;
    }

    public void setrPayStat(Byte rPayStat) {
        this.rPayStat = rPayStat;
    }

    public Byte getrOrdStat() {
        return rOrdStat;
    }

    public void setrOrdStat(Byte rOrdStat) {
        this.rOrdStat = rOrdStat;
    }

    public Byte getRtnStat() {
        return rtnStat;
    }

    public void setRtnStat(Byte rtnStat) {
        this.rtnStat = rtnStat;
    }

    public String getRtnRemark() {
        return rtnRemark;
    }

    public void setRtnRemark(String rtnRemark) {
        this.rtnRemark = rtnRemark;
    }

    public BigDecimal getRtnCompensation() {
        return rtnCompensation;
    }

    public void setRtnCompensation(BigDecimal rtnCompensation) {
        this.rtnCompensation = rtnCompensation;
    }
}
