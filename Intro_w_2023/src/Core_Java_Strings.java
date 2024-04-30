
public class Core_Java_Strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 String str1 = "New object";
		 
		 String str2 = new String("New object");
		 
		 String[] splitString = str1.split(" ");
		 
		 System.out.println(splitString[0]);
		 for (int i = str1.length()-1; i>=0; i--) {
			 System.out.println(str1.charAt(i));
		 }

	}

}
