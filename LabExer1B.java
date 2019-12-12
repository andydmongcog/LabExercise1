import java.util.Scanner;

public class LabExer1B{
	public static void main(String[] args){
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please enter an integer: ");
		
		int mynum = scan.nextInt();
		
		showNumberPlus10(mynum);
		showNumberPlus100(mynum);
		showNumberPlus1000(mynum);
		
	}
	public static void showNumberPlus10(int x){
		System.out.println(x + 10);
	} 
	public static void showNumberPlus100(int x){
		System.out.println(x + 100);
	} 
	public static void showNumberPlus1000(int x){
		System.out.println(x + 1000);
	} 
}