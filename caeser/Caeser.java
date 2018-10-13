package caeser;
import java.util.*;
import java.util.Scanner;


public class Caeser {



	public static String encrypt(String plainText, int shift){
		
		if(shift>26){

			shift = shift%26;

		}

		else if (shift<0){

			shift=(shift%26)+26;

		}

		String cipherText = "";

		int length =plainText.length();

		for(int i=0;i<length; i++) {

			char ch=Character.toLowerCase(plainText.charAt(i));

			if(Character.isLetter(ch)){

				if(Character.isLowerCase(ch)){

					char c= (char)(ch+shift);

					if(c>'z'){

						cipherText +=(char)((ch-26) + shift);

					}

					else{

						cipherText += c;

					

					}

				}

				else if(Character.isUpperCase(ch)){

					char c = (char)(ch+shift);

					if(c<'A'){

						cipherText += c;

					}	

				}

			}

			else{

			cipherText += ch;

		}

		}

		return cipherText;

	}

	public static String encrypt2(String cipherText, char[]key) {
		
		char[] ch = cipherText.toCharArray();
		
		for(int i=0;i<ch.length;i++) {
			for(int j=0;j<key.length;j++) {
			if(ch[i] == key[j]) {
				ch[i] = key[j+1];
			}
			cipherText+=ch[i];
		}
		}
		
		return cipherText;
	}


		// TODO Auto-generated method stub







public static void main(String[] args) {

	String text="ABZ";

	String cipher =encrypt(text, 3);

	System.out.println(cipher);
	
	Scanner reader = new Scanner(System.in);
	System.out.println("Enter number of Substitution key: /n");
	
	
	
	String key2 = reader.nextLine();
	char[] key = new char[key2.length()];
	key=key2.toCharArray();

	System.out.println(encrypt2(cipher,key));
}

}
