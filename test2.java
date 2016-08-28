package javaCSCI;

public class test2 {
	
	public static void main(String[] args) {
		String str = "Hello";
		char a = 'a';
		char[] cArray = str.toCharArray();
		int sum = 0;
	
		for (int i = 0; i < str.length(); i++){
			System.out.println("i: " + i + " " + cArray[i]);
			System.out.println("a: " + (cArray[i] - a));
			sum += (cArray[i] - a);
			System.out.println();
		}
	
		System.out.println(sum);
	}
	
	
	
	
}	
