package some_programs;

public class Swapping_pgm {

	public static void main(String[] args) {
		//1.Swapping without using 3rd variable
		/*int a=4,b=6;
		//System.out.println("Before Swapping:"+ 'a' +"="+a +" "+ "and"+ " "+'b' +"="+b);
		System.out.println("Before swapping");
		System.out.println("the value of a:"+a);
		System.out.println("the value of b:"+b);
		a=a+b;
		b=a-b;
		a=a-b;
		//System.out.println("After Swapping:"+ 'a' +"="+a +" "+ "and"+ " "+'b' +"="+b);
		System.out.println("After swapping");
		System.out.println("the value of a:"+a);
		System.out.println("the value of b:"+b);*/
		//2.Swapping with using 3rd variable
		int x=4,y=6,temp;
		System.out.println("Before Swapping:"+ 'x' +"="+x +" "+ "and"+ " "+'y' +"="+y);
		temp=x;
		x=y;
		y=temp;
		System.out.println("After Swapping:"+ 'x' +"="+x +" "+ "and"+ " "+'y' +"="+y);

	}

}
