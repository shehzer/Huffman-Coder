import java.util.ArrayList;
public class Main {
	public static void main(String args[]) {
		String message = "Hi My name is Shehzer";
		char[] msgChar= message.toCharArray();
		ArrayList<Character> characters = new ArrayList<Character>();
		for(int i = 0; i<msgChar.length; i++){
			if(!(characters.contains(msgChar[i]))) {
				characters.add(msgChar[i]);
			}
		}
				}
	
	}


