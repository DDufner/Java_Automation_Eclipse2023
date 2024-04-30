
public class Core_Java_Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int number = 5; 
		String word = "a special string-a-ding-ding la la";
		char letter = 'x';
		double price = 1.99;
		boolean  currentState = true;
		
		System.out.println(word);
		
		
		int[] array = new int[4]; 
		array[0] = 4;
		array[1] = 31;
		array[2] = 43;
		array[3] = 33;
	
		for(int item = 0; item < array.length; item ++) {
			System.out.println(array[item]);
		}
		
		
		for (int num: array) {
			System.out.println(num);
		}
		
	}

}
