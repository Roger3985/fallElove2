package JavaBean.studio;

import java.sql.Date;

public class StudioTimeBooking {
	private Integer sTimeNo;
	private Integer sOrdNo;
	private Integer sNo;
	private Date closeDate;
	private Byte closeTimeMorning;
	private Byte closeTimeAfternoon;
	private Byte closeTimeNight;
	
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
	public Byte getCloseTimeMorning() {
		return closeTimeMorning;
	}
	public void setCloseTimeMorning(Byte closeTimeMorning) {
		this.closeTimeMorning = closeTimeMorning;
	}
	public Byte getCloseTimeAfternoon() {
		return closeTimeAfternoon;
	}
	public void setCloseTimeAfternoon(Byte closeTimeAfternoon) {
		this.closeTimeAfternoon = closeTimeAfternoon;
	}
	public Byte getCloseTimeNight() {
		return closeTimeNight;
	}
	public void setCloseTimeNight(Byte closeTimeNight) {
		this.closeTimeNight = closeTimeNight;
	}
	
	

}
