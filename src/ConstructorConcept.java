
public class ConstructorConcept {
	String name;
	int age;
	String jobTitle;
	boolean status;
	
	public  ConstructorConcept(boolean status) {
		//passing constructor local variable "status" to class variable status
		//parameter value is assigned to class variable 
		this.status=status;
	}
	
	public static void main (String[] a) {
		//invoking constructor by passing parameter as true
		ConstructorConcept ct= new ConstructorConcept(true);
				System.out.println(ct.status);
		
	}
	
	
}
