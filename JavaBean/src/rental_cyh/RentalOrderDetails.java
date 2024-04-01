package rental_cyh;

import java.sql.Date;

public class RentalOrderDetails {

    private Integer ROrdNo;
    private Integer RNo;
    private Double RPrice;
    private Double RDesPrice;

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

    public Double getRPrice() {
        return RPrice;
    }

    public void setRPrice(Double RPrice) {
        this.RPrice = RPrice;
    }

    public Double getRDesPrice() {
        return RDesPrice;
    }

    public void setRDesPrice(Double RDesPrice) {
        this.RDesPrice = RDesPrice;
    }

}
