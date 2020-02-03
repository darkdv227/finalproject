package kr.co.jhta.erp.vo;

public class Category {

	private int no;
	private String name;
	private int divisionNo;
	
	public Category() {}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getDivisionNo() {
		return divisionNo;
	}

	public void setDivisionNo(int divisionNo) {
		this.divisionNo = divisionNo;
	}

	@Override
	public String toString() {
		return "Category [no=" + no + ", name=" + name + ", divisionNo=" + divisionNo + "]";
	}
	
	
}
