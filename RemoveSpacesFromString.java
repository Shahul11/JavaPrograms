package JavaPrograms;

import java.lang.reflect.Array;
import java.util.Arrays;

public class RemoveSpacesFromString {

	public static void main(String[] args) {
//		String s1 = "Hello I am a String with White Spaces";
//
//		char[] charArray = s1.toCharArray();
//
//		String stringWithSpaces = "";
//
//		for (int i = 0; i < charArray.length - 1; i++) {
//
//			if ((charArray[i] != ' ') && (charArray[i] != '\t')) {
//				stringWithSpaces = stringWithSpaces + charArray[i];
//			}
//
//		}
//		System.out.println(stringWithSpaces);
		
		arraySort();
	}
	
	
	public static void arraySort()
	{
		String s1= "helloworld";
		
		char[] c=s1.toCharArray();
				
				Arrays.sort(c);
		
		System.out.println(c);
		
		
	}

}
