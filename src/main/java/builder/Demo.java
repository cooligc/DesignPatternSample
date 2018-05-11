package builder;

public class Demo {

	
	public static void main(String[] args) {
		
		/*EmployeeBuilder builder = new EmployeeBuilder();
		builder.init().withEmployeeName("Sitakant");*/
		
		Employee employee = EmployeeBuilder.init()
											.withEmployeeDept("ABC")
											.withEmployeeId(1111L)
											.withEmployeeName("AAAA")
											.withEmployeeSalary(22222L)
											.build();
		
		System.out.println(employee);
		
	}
}
