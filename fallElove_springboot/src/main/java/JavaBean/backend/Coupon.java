package backend;

import java.sql.Date;

public class Coupon implements java.io.Serializable{
    private Integer coupNo;
    private String coupName;
    private String coupCond;
    private Double coupDisc;
    private Date coupAddDate;
    private Date coupExpDate;
    private Date coupRelDate;
    private Integer coupRealStat;

    public Integer getCoupNo() {
        return coupNo;
    }

    public void setCoupNo(Integer coupNo) {
        this.coupNo = coupNo;
    }

    public String getCoupName() {
        return coupName;
    }

    public void setCoupName(String coupName) {
        this.coupName = coupName;
    }

    public String getCoupCond() {
        return coupCond;
    }

    public void setCoupCond(String coupCond) {
        this.coupCond = coupCond;
    }

    public Double getCoupDisc() {
        return coupDisc;
    }

    public void setCoupDisc(Double coupDisc) {
        this.coupDisc = coupDisc;
    }

    public Date getCoupAddDate() {
        return coupAddDate;
    }

    public void setCoupAddDate(Date coupAddDate) {
        this.coupAddDate = coupAddDate;
    }

    public Date getCoupExpDate() {
        return coupExpDate;
    }

    public void setCoupExpDate(Date coupExpDate) {
        this.coupExpDate = coupExpDate;
    }

    public Date getCoupRelDate() {
        return coupRelDate;
    }

    public void setCoupRelDate(Date coupRelDate) {
        this.coupRelDate = coupRelDate;
    }

    public Integer getCoupRealStat() {
        return coupRealStat;
    }

    public void setCoupRealStat(Integer coupRealStat) {
        this.coupRealStat = coupRealStat;
    }
}
