import java.util.Scanner;

public class lll{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Entre the number of minutes:");
		double minute =input.nextDouble();
		int a = minute/(60*24);
		int yaer=a/365;
		int day=a%365;
		System.out.println(minute+" minutes is apporximately "+year+" years and "+day+" days.");
	}
}
