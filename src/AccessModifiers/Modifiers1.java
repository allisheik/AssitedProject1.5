package AccessModifiers;

import Pack1.*;

class DefaultAccessModifier
{ 
  void display() 
     { 
         System.out.println("Hello defalut access Modifier"); 
     } 
} 

public class Modifiers1 {

	public static void main(String[] args) {
		// Illustrating Default Modifier
		System.out.println("Dafault Access Specifier");
		DefaultAccessModifier defaultAccessModifier = new DefaultAccessModifier(); 		  
		defaultAccessModifier.display(); 
		// Calling default method in DefaultAccessModifier

		PublicAcessModifier publicAcessModifier = new PublicAcessModifier();
		publicAcessModifier.display();

	}
}
