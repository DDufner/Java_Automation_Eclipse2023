import java.util.ArrayList;

public class Core_Java_IfElse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {2,54,7,4,23,33}; 
		
		for (int number : array) {
			if (number %2 ==0) {
			
				System.out.println(number);
			
			}
		}
		
		/*for (int item = 0; item<array.length; item ++) {
			if (array[item] %2 ==0) {
				System.out.println(array[item]);
			} else {
				System.out.println("duh");
			}
		}*/
		
		ArrayList<String> arrayList = new ArrayList<String>();
		arrayList.add("ghoulies");
		arrayList.add("munchies");
		arrayList.add("gremlins 2: the new batch");
		arrayList.remove("munchies");
		
		for (String item : arrayList) {
			
				System.out.println(item);
			
			
		}
		
		
	}

}
