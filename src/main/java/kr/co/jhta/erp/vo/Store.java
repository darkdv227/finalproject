package kr.co.jhta.erp.vo;

public class Store {

	private int no;
	private String name;
	private String address;
	private int employeeNo;
	
	public Store() {}

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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getEmployeeNo() {
		return employeeNo;
	}

	public void setEmployeeNo(int employeeNo) {
		this.employeeNo = employeeNo;
	}

	@Override
	public String toString() {
		return "Store [no=" + no + ", name=" + name + ", address=" + address + ", employeeNo=" + employeeNo + "]";
	}
	
	
}
