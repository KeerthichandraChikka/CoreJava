package interview;

public class CountVowelsAndConsonants {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		String str="Sample123Sample";
		
		//method(str);
		
		checkVowels(str);

	}
	
	public static void method(String str) {
		int vowels=0, digits=0, consonants=0;
		
		for(int i=0;i<=str.length()-1;i++) {
			char c=str.charAt(i);
			if(c>='a' && c <='z' || c>='A' && c<='Z') {
				
				
			c=Character.toLowerCase(c);
			
			if(c=='a' || c=='e' || c=='i'|| c=='o' || c =='u') {
				vowels++;
			}
			else {
				consonants++;
			}
			}
			
			else {
				digits++;
			}
			
		}
		
		System.out.println("vowels:"+ vowels + " digits :"+digits +" consonants :"+consonants);
	}
	
	public static void checkVowels(String s){
		System.out.println(s.length());
		System.out.println(s.toLowerCase().replaceAll("a|e|i|o|u|", "").length());
	    System.out.println("Vowel Count: " + (s.length() - s.toLowerCase().replaceAll("a|e|i|o|u|", "").length()));
	    //Also eliminating spaces, if any for the consonant count
	    System.out.println("Consonant Count: " + (s.toLowerCase().replaceAll("a|e|i|o| |u", "").length()));
	}

}
