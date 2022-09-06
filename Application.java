package model;

public class Application {
	
	public static void main(String[] args) {
		
		Employee emp1 = new Employee("1234", "E1234", "John", "1234v", "34, Park Street" );
		Employee emp2 = new Employee("2468", "E2468", "Jane", "2468v", "68, Park Lane");
		Employee emp3 = new Employee("6866", "E6866", "Jack", "6866v", "24, Park Avenue");
		
		boolean result1 = emp1.equals(emp2);
		System.out.println("emp1 equals to emp2 : " + result1);
		
		boolean result2 = emp1.equals(emp3);
		System.out.println("emp1 equals to emp3 : " + result2);
		
		System.out.println("================");
		
		System.out.println("emp2Id : " + emp2.getEmpId());
		System.out.println("emp2Code : " + emp2.getCode());
		
		System.out.println("================");
		
		emp2.setEmpId("1234");
		emp2.setCode("E1234");
		
		System.out.println("================");
		
		System.out.println("emp2Id : " + emp2.getEmpId());
		System.out.println("emp2Code : " + emp2.getCode());
		
		System.out.println("================");
		
		boolean result3 = emp1.equals(emp2);
		System.out.println("emp1 equals to emp2 : " + result3);
		
		boolean result4 = emp1.equals(emp3);
		System.out.println("emp1 equals to emp3 : " + result4);
			
	}

}
