package model;

public class Employee {
	
	public void setEmpId(String empId) {
		this.empId = empId;
	}
	
	public String getEmpId() {
		return empId;
	}
	
	public void setCode(String code) {
		this.code = code;
	}
	
	public String getCode() {
		return code;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setNic(String nic) {
		this.nic = nic;
	}
	
	public String getNic() {
		return nic;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	public String getAddress() {
		return address;
	}
	
	private String empId;
	private String code;
	private String name;
	private String nic;
	private String address;
	
	public Employee(String empId, String code, String name, String nic, String address) {
		this.empId = empId;
		this.code = code;
		this.name = name;
		this.nic = nic;
		this.address = address;
	}
	
	@Override
	public boolean equals(Object obj) {
		
		Employee emp = (Employee) obj;
		
		if(emp.getEmpId()==this.empId && emp.getCode()==this.code) {
			return true;
		}
		
		else {
			return false;
		}
			
	}
	
	@Override
	public String toString() {
		
		return "Employee {" + 
		       "empId = '" + empId + '\'' + 
		       ", code = '" + code + '\'' + 
		       ", name = '" + name + '\'' + 
		       ", nic = '" + nic + '\'' + 
		       ", address = '" + address + '\'' + 
		       '}';
		
	}
	

}
