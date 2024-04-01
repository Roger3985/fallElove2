package rental_cyh;

import java.sql.Date;

public class RentalMyTrack {

    private Integer RNo;
    private Integer MemNo;
    private Date RTrackTime;
    private Date ExpRentalDate;

    public Integer getRNo() {
        return RNo;
    }

    public void setRNo(Integer RNo) {
        this.RNo = RNo;
    }

    public Integer getMemNo() {
        return MemNo;
    }

    public void setMemNo(Integer memNo) {
        MemNo = memNo;
    }

    public Date getRTrackTime() {
        return RTrackTime;
    }

    public void setRTrackTime(Date RTrackTime) {
        this.RTrackTime = RTrackTime;
    }

    public Date getExpRentalDate() {
        return ExpRentalDate;
    }

    public void setExpRentalDate(Date expRentalDate) {
        ExpRentalDate = expRentalDate;
    }

}
