package JavaBean.product;


import java.math.BigDecimal;
import java.sql.Date;

public class ProductOrder {
    private Integer pOrdNo;
    private Integer memNo;
    private String pByrName;
    private Integer pByrPhone;
    private String pByrEmail;
    private String pRcvName;
    private String pRcvPhone;
    private Integer pTakeMethod;
    private String pAddr;
    private Integer pPayMethod;
    private BigDecimal pAllPrice;
    private Integer coupNo;
    private BigDecimal pDisc;
    private BigDecimal pRealPrice;
    private Date pOrdTime;
    private Integer pOrdStat;
    private Integer pStat;


    public Integer getpOrdNo() {
        return pOrdNo;
    }

    public void setpOrdNo(Integer pOrdNo) {
        this.pOrdNo = pOrdNo;
    }

    public Integer getmemNo() {
        return memNo;
    }

    public void setmemNo(Integer memNo) {
        this.memNo = memNo;
    }

    public String getpByrName() {
        return pByrName;
    }

    public void setpByrName(String pByrName) {
        this.pByrName = pByrName;
    }

    public Integer getpByrPhone() {
        return pByrPhone;
    }

    public void setpByrPhone(Integer pByrPhone) {
        this.pByrPhone = pByrPhone;
    }

    public String getpByrEmail() {
        return pByrEmail;
    }

    public void setpByrEmail(String pByrEmail) {
        this.pByrEmail = pByrEmail;
    }

    public String getpRcvName() {
        return pRcvName;
    }

    public void setpRcvName(String pRcvName) {
        this.pRcvName = pRcvName;
    }

    public String getpRcvPhone() {
        return pRcvPhone;
    }

    public void setpRcvPhone(String pRcvPhone) {
        this.pRcvPhone = pRcvPhone;
    }

    public Integer getpTakeMethod() {
        return pTakeMethod;
    }

    public void setpTakeMethod(Integer pTakeMethod) {
        this.pTakeMethod = pTakeMethod;
    }

    public String getpAddr() {
        return pAddr;
    }

    public void setpAddr(String pAddr) {
        this.pAddr = pAddr;
    }

    public Integer getpPayMethod() {
        return pPayMethod;
    }

    public void setpPayMethod(Integer pPayMethod) {
        this.pPayMethod = pPayMethod;
    }

    public BigDecimal getpAllPrice() {
        return pAllPrice;
    }

    public void setpAllPrice(BigDecimal pAllPrice) {
        this.pAllPrice = pAllPrice;
    }

    public Integer getCoupNo() {
        return coupNo;
    }

    public void setCoupNo(Integer coupNo) {
        this.coupNo = coupNo;
    }

    public BigDecimal getpDisc() {
        return pDisc;
    }

    public void setpDisc(BigDecimal pDisc) {
        this.pDisc = pDisc;
    }

    public BigDecimal getpRealPrice() {
        return pRealPrice;
    }

    public void setpRealPrice(BigDecimal pRealPrice) {
        this.pRealPrice = pRealPrice;
    }

    public Date getpOrdTime() {
        return pOrdTime;
    }

    public void setpOrdTime(Date pOrdTime) {
        this.pOrdTime = pOrdTime;
    }

    public Integer getpOrdStat() {
        return pOrdStat;
    }

    public void setpOrdStat(Integer pOrdStat) {
        this.pOrdStat = pOrdStat;
    }

    public Integer getpStat() {
        return pStat;
    }

    public void setpStat(Integer pStat) {
        this.pStat = pStat;
    }


}
