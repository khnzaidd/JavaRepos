import java.util.Scanner;
class ExceptionDemo{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int x,y,z;
		x=sc.nextInt();
		System.out.println("Enter Denominator");
		y=sc.nextInt();
		z=x/y;
		System.out.println(z);
	}
}
