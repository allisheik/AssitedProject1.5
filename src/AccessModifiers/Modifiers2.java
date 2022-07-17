package AccessModifiers;

class PrivateAccessModifier{
	
	private void display() {
		System.out.println("Hello Private in PrivateAccessModifier class");
	}
}

public class Modifiers2 {

	public static void main(String[] args) {
		
		PrivateAccessModifier privateClass = new PrivateAccessModifier();
		
		// privateClass.display();
		/* Throwing error "change visibility of display() to Package" 
		   while calling display method in PrivateAccessModifier */
		
		Modifiers2 modifiers2=new Modifiers2();
		
		System.out.println("In Main Class");
		//printing main method statement
		
		modifiers2.display2();
		// calling private method in same class can be executed
		
	}
	
	private void display2() {
		System.out.println("Hello Private within main class");
	}

}
