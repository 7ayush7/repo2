package RevisionOfPrograms;

public class AmdocsEmployee {

	private String name;
	private String empId;
	public AmdocsEmployee(String name, String empId) {
		super();
		this.name = name;
		this.empId = empId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmpId() {
		return empId;
	}
	public void setEmpId(String empId) {
		this.empId = empId;
	}

}
