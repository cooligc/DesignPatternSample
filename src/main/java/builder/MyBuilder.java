/**
 * 
 */
package builder;

/**
 * @author sitakant
 *
 */
class EmployeeBuilder {

	private static Employee employee = null;
	
	private EmployeeBuilder() {}
	
	public static EmployeeBuilder init() {
		
		employee = new Employee();
		
		return new EmployeeBuilder();
	}
	
	public EmployeeBuilder withEmployeeName(String name) {
		employee.setName(name);
		return this;
	}
	
	public EmployeeBuilder withEmployeeSalary(Long salary) {
		employee.setSalary(salary);
		return this;
	}
	
	public EmployeeBuilder withEmployeeId(Long salary) {
		employee.setSalary(salary);
		return this;
	}
	
	public EmployeeBuilder withEmployeeDept(String dept) {
		employee.setDept(dept);
		return this;
	}
	
	public Employee build() {
		return employee;
	}
	
}


class Employee{
	private String name;
	private String dept;
	private Long empId;
	private Long salary;
	/**
	 * @param name
	 * @param dept
	 * @param empId
	 * @param salary
	 */
	public Employee(String name, String dept, Long empId, Long salary) {
		super();
		this.name = name;
		this.dept = dept;
		this.empId = empId;
		this.salary = salary;
	}
	
	public Employee() {
		
	}
	
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the dept
	 */
	public String getDept() {
		return dept;
	}
	/**
	 * @param dept the dept to set
	 */
	public void setDept(String dept) {
		this.dept = dept;
	}
	/**
	 * @return the empId
	 */
	public Long getEmpId() {
		return empId;
	}
	/**
	 * @param empId the empId to set
	 */
	public void setEmpId(Long empId) {
		this.empId = empId;
	}
	/**
	 * @return the salary
	 */
	public Long getSalary() {
		return salary;
	}
	/**
	 * @param salary the salary to set
	 */
	public void setSalary(Long salary) {
		this.salary = salary;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Employee [name=" + name + ", dept=" + dept + ", empId=" + empId + ", salary=" + salary + "]";
	}
	
	
	
}
