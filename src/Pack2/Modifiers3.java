package Pack2;
import Pack1.*;
public class Modifiers3 extends	ProtectedAccessModifier {

	public static void main(String[] args) {
		Modifiers3 modifiers3 = new Modifiers3();
		modifiers3.display();
		// calling protected display method in pack1 which can be accessible in its sub class
	}

}
