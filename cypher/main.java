package cypher;
import java.util.Scanner;
import cypher.*;


public class main {

	public static void main(String[] args) {

//System.out.println(caeser.decrypt(substitution.decrypt(substitution.encrypt(caeser.encrypt("Meet", 5))),5))	;

	
	System.out.println(substitution.key);
	System.out.println(substitution.decrypt(substitution.key));
	
	System.out.println("ABCDEFGHIJKLMNOPQRSTUVWXYZ");
	System.out.println(substitution.encrypt("ABCDEFGHIJKLMNOPQRSTUVWXYZ"));
}

}