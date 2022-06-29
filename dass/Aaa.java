package dass;

import java.util.Scanner;

public class Aaa {
	static int n_var1 = 10;
	public void display() {
		int n_var2 = 200;
		int n_var = n_var1 + n_var2;
		System.out.println("n_var1="+n_var1);
		System.out.println("n_var1="+n_var1);
	}
public static void main(String[] args) {
	int n_var3;
	n_var3 =  n_var1*2;
	System.out.println("n_var1="+n_var1);
	System.out.println("n_var3="+n_var3);
    System.out.println("请输入两个整数：");

    Scanner scanner = new Scanner(System.in);
    System.out.println(scanner.nextInt());
}
}
