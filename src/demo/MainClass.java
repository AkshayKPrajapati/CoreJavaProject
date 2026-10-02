package demo;

public class MainClass {
	public static void main(String[] args) {
		Person person = new Person();
		person.setName("Akshay");
		person.setAddress("Pune");
		person.setDob("26th April");
		person.setContactNo(6200305994L);

		System.out.println("Person Details : ");
		System.out.println("Name : " + person.getName());
		System.out.println("Address : " + person.getAddress());
		System.out.println("DOB: " + person.getDob());
		System.out.println("Contact No : " + person.getContactNo());

		System.out.println("-------------------------");
		Employee employee = new Employee();
		employee.setId(101);
		employee.setName("Nisha");
		employee.setAddress("Pune");
		employee.setDob("5th June");
		employee.setContactNo(987654321L);
		employee.setSalary(1000000.00f);
		employee.setDesignation("Java Developer");

		System.out.println("Employee Details :  ");
		System.out.println("Id : " + employee.getId());
		System.out.println("Name : " + employee.getName());
		System.out.println("Address : " + employee.getAddress());
		System.out.println("DOB : " + employee.getDob());
		System.out.println("Salary : " + employee.getSalary());
		System.out.println("Designation : " + employee.getDesignation());
		System.out.println("-------------------------");

		Manager manager = new Manager();
		manager.setId(201);
		manager.setName("Neha Prajapati");
		manager.setAddress("Pune");
		manager.setDob("14th Nov");
		manager.setContactNo(9876543210L);
		manager.setSalary(1000000.00f);
		manager.setDesignation("Project Manager");
		manager.setProjectId(1001);
		manager.setProjectName("LCM");

		System.out.println("Manager Details : ");
		System.out.println("Id : " + manager.getId());
		System.out.println("Name : " + manager.getName());
		System.out.println("Address : " + manager.getAddress());
		System.out.println("DOB : " + manager.getDob());
		System.out.println("Salary : " + manager.getSalary());
		System.out.println("Designation : " + manager.getDesignation());
		System.out.println("Project Id : " + manager.getProjectId());
		System.out.println("Project Name : " + manager.getProjectName());
	}
}
