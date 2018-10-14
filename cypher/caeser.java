package cypher;

public class caeser {
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
}
