

public class UseGenerics {

	public static void main(String[] args) {
		
		Department department = new Department();
		department.setId(1);
		department.setName("IT");
		
		Employee employee = new Employee();
		employee.setId(288333);
		employee.setName("Joya");
		employee.setSalary(70000.00);
		
		Generic<Department, Employee> Generic = new Generic<Department, Employee>(department, employee);
		
		Department dept = Generic.getT();
		
		System.out.println(dept);
		Employee emp = Generic.getU();
		System.out.println(emp);
		
		System.out.println("------------------------------");
		
		Generic<Integer, String> Generic2 = new Generic<Integer, String>(109292, "KK");
		
		System.out.println(Generic2.getT()+"\t"+Generic2.getU());
		
	}
}