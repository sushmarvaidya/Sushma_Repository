package some_programs;

public class Swapping_pgm {

	public static void main(String[] args) {
		//Swapping without using 3rd variable
		int a=4,b=6;
		System.out.println("Before Swapping:"+ 'a' +"="+a +" "+ "and"+ " "+'b' +"="+b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("After Swapping:"+ 'a' +"="+a +" "+ "and"+ " "+'b' +"="+b);

	}

}
