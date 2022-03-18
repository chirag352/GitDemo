package seleniumPackage;

public class Spliiting_String {

	public static void main(String[] args) {
		
		String s1 = "Chirag Jitendra Gandhi";
		
		/*
		 * String[] s2 = s1.split(" ");
		 * 
		 * System.out.println(s2[0]);
		 * 
		 * String[] s3 = s1.split("Jitendra");
		 * 
		 * System.out.println(s3[0]);
		 */
		
		/*
		 * for (int i=0; i<s1.length();i++) { System.out.println(s1.charAt(i)); }
		 */
		
		for(int i=s1.length()-1; i>=0; i--) {
			
			System.out.println(s1.charAt(i));
		}
		
		
		}
}
