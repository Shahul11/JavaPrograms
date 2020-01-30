package JavaPrograms;

public class CountTheCharacters {

	public static void main(String[] args) {
		
		String s1="The best of the both the worlds";
		
		int counter=0;
		
		for (int i = 0; i < s1.length(); i++) {
			
			if(s1.charAt(0)!= ' ')
			{
				counter++;
			}
			
		}
		System.out.println("Total length of the string " + counter);

	}

}
