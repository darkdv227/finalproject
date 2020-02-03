package kr.co.jhta.erp.vo;

import java.util.Date;

public class FactoryOrder {

	private int no;
	private int productNo;
	private int amount;
	private Date createDate;
	private String status;
	
	public FactoryOrder() {}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public int getProductNo() {
		return productNo;
	}

	public void setProductNo(int productNo) {
		this.productNo = productNo;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "FactoryOrder [no=" + no + ", productNo=" + productNo + ", amount=" + amount + ", createDate="
				+ createDate + ", status=" + status + "]";
	}
	
	
}
