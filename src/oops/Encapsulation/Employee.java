package oops.Encapsulation;

public class Employee {
	private long ID;
	private String Name;
	private String Department;
	private static  String Company="Teletext";
	
	public Employee(long ID,String Name, String Department)
	{
		this.ID=ID;
		this.Name=Name;
		this.Department=Department;
		
	}
	public String toString()
	{
		
		return "[Employee Detail: "+ ID+","+Name+","+ Department+","+ Company+"]";
	}
	
	public void setID(int ID) {
		this.ID=ID;
	}
	
public static void main(String[] args) {
Employee E1 = new Employee(98,"Anubhav","QA");	
Employee E2 = new Employee(99,"Namit","Dev");
System.out.println(E1);
System.out.println(E2);


}

}
