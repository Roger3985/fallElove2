package JavaBean.product;

import java.math.BigDecimal;

public class ProductOrderDetail {
    private Integer pOrdNo;
    private Integer pNo;
    private BigDecimal pPrice;
    private Integer pOrdQty;
    private BigDecimal pRealPrice;
    private String pComContent;
    private Integer pScore;

    public Integer getpOrdNo() {
        return pOrdNo;
    }

    public void setpOrdNo(Integer pOrdNo) {
        this.pOrdNo = pOrdNo;
    }

    public Integer getpNo() {
        return pNo;
    }

    public void setpNo(Integer pNo) {
        this.pNo = pNo;
    }

    public BigDecimal getpPrice() {
        return pPrice;
    }

    public void setpPrice(BigDecimal pPrice) {
        this.pPrice = pPrice;
    }

    public Integer getpOrdQty() {
        return pOrdQty;
    }

    public void setpOrdQty(Integer pOrdQty) {
        this.pOrdQty = pOrdQty;
    }

    public BigDecimal getpRealPrice() {
        return pRealPrice;
    }

    public void setpRealPrice(BigDecimal pRealPrice) {
        this.pRealPrice = pRealPrice;
    }

    public String getpComContent() {
        return pComContent;
    }

    public void setpComContent(String pComContent) {
        this.pComContent = pComContent;
    }

    public Integer getpScore() {
        return pScore;
    }

    public void setpScore(Integer pScore) {
        this.pScore = pScore;
    }
}
