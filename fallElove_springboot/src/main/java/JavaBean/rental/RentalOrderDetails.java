package JavaBean.rental;

import java.math.BigDecimal;
import java.sql.Date;

public class RentalOrderDetails {

    private Integer ROrdNo;
    private Integer RNo;
    private BigDecimal RPrice;
    private BigDecimal RDesPrice;

    public Integer getROrdNo() {
        return ROrdNo;
    }

    public void setROrdNo(Integer ROrdNo) {
        this.ROrdNo = ROrdNo;
    }

    public Integer getRNo() {
        return RNo;
    }

    public void setRNo(Integer RNo) {
        this.RNo = RNo;
    }

    public BigDecimal getRPrice() {
        return RPrice;
    }

    public void setRPrice(BigDecimal RPrice) {
        this.RPrice = RPrice;
    }

    public BigDecimal getRDesPrice() {
        return RDesPrice;
    }

    public void setRDesPrice(BigDecimal RDesPrice) {
        this.RDesPrice = RDesPrice;
    }
}
