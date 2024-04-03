package JavaBean.studio;

import java.sql.Date;

public class StudioTimeBooking {
	private Integer sTimeNo;
	private Integer sOrdNo;
	private Integer sNo;
	private Date closeDate;
	private Boolean closeTimeMorning;
	private Boolean closeTimeAfternoon;
	private Boolean closeTimeNight;
	
	
	public Integer getsTimeNo() {
		return sTimeNo;
	}
	public void setsTimeNo(Integer sTimeNo) {
		this.sTimeNo = sTimeNo;
	}
	public Integer getsOrdNo() {
		return sOrdNo;
	}
	public void setsOrdNo(Integer sOrdNo) {
		this.sOrdNo = sOrdNo;
	}
	public Integer getsNo() {
		return sNo;
	}
	public void setsNo(Integer sNo) {
		this.sNo = sNo;
	}
	public Date getCloseDate() {
		return closeDate;
	}
	public void setCloseDate(Date closeDate) {
		this.closeDate = closeDate;
	}
	public Boolean getCloseTimeMorning() {
		return closeTimeMorning;
	}
	public void setCloseTimeMorning(Boolean closeTimeMorning) {
		this.closeTimeMorning = closeTimeMorning;
	}
	public Boolean getCloseTimeAfternoon() {
		return closeTimeAfternoon;
	}
	public void setCloseTimeAfternoon(Boolean closeTimeAfternoon) {
		this.closeTimeAfternoon = closeTimeAfternoon;
	}
	public Boolean getCloseTimeNight() {
		return closeTimeNight;
	}
	public void setCloseTimeNight(Boolean closeTimeNight) {
		this.closeTimeNight = closeTimeNight;
	}

}
