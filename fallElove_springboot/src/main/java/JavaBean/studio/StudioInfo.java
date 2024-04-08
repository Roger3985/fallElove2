package JavaBean.studio;

import java.math.BigDecimal;

public class StudioInfo {
	private Integer sNo;
	private String sName;
	private String sInfo;
	private BigDecimal sPrice;

	public Integer getsNo() {
		return sNo;
	}

	public void setsNo(Integer sNo) {
		this.sNo = sNo;
	}

	public String getsName() {
		return sName;
	}

	public void setsName(String sName) {
		this.sName = sName;
	}

	public String getsInfo() {
		return sInfo;
	}

	public void setsInfo(String sInfo) {
		this.sInfo = sInfo;
	}

	public BigDecimal getsPrice() {
		return sPrice;
	}

	public void setsPrice(BigDecimal sPrice) {
		this.sPrice = sPrice;
	}
}
