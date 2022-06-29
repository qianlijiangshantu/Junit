package jingdianti;

import java.util.ArrayList;
import java.util.Scanner;

public class Ti {
	int z = 1;

	public void small() {
		int a = 0, b = 1, c = 0;
		System.out.println("兔子的数量为" + b);
		while (a + b < 100) {
			c = b + a;
			a = b;
			b = c;
			System.out.println("兔子的数量为" + c);
		}
	}

	public void small2() {
		for (int a = 2; a < 200; a++) {
			boolean flg = true;
			for (int b = 2; b < a; b++) {
				flg = true;
				if (a % b == 0) {
					flg = false;
					break;
				}
			}
			if (flg) {
				System.out.println(a);
			}
		}
	}

	public void small3() {
		for (int a = 100; a < 1000; a++) {
			int b = a / 100;
			int c = a / 10 % 10;
			int d = a % 10;
			if (a == (b * b * b) + (c * c * c) + (d * d * d)) {
				System.out.println(a);
			}
		}
	}

	public ArrayList<Integer> small4() {
		ArrayList<Integer> inlist = new ArrayList<Integer>();
		int a = 100;
		for (int b = 2; b < a; b++) {
			while (a % b == 0) {
				a = a / b;
				inlist.add(b);
			}
		}
		if (a != 1) {
			inlist.add(a);
		}
		return inlist;
	}

	public void small5() {
		System.out.println("请输入你的分数：");
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int c = a / 10;
		switch (c) {
		case 10:
		case 9:
			System.out.println("该同学的成绩为A分数为" + a);
			break;
		case 8:
		case 7:
		case 6:
			System.out.println("该同学的成绩为B分数为" + a);
			break;
		default:
			System.out.println("该同学的成绩为C分数为" + a);
			scanner.close();
		}
	}

	public void question6() {
		System.out.println("请输入两个整数：");
		Scanner scanner = new Scanner(System.in);
		int d = scanner.nextInt();
		int e = scanner.nextInt();
		int a = 0;
		int c = 0;
		int b = d * e;
		if (d < e) {
			a = e;
			e = d;
			d = a;
		}
		for (z = d; z < b; z++) {
			if (z % d == 0 && z % e == 0) {
				a = z;
				break;
			}
		}
		System.out.println("最小公倍数为" + a);
		c = b / a;
		System.out.println("最大公约数为" + c);
		scanner.close();
	}

	public void question8(int a, int b) {
		int[] lists = new int[b];
		lists[0] = a;
		for (int i = 1; i < b; i++) {
			lists[i] = a * 10 + lists[i - 1];
			a *= 10;
			System.out.println(lists[i]);
		}
		int sum1 = 0;
		for (int s : lists) {
			sum1 += s;
		}
		System.out.println(sum1);
	}

	public void question9() {
		for (int a = 1; a <= 1000; a++) {
			int c = 0;
			for (int b = 1; b < a; b++) {
				if (a % b == 0) {
					c += b;
					if (a == c) {
						System.out.println("完美因數為:" + a);
					}
				}
			}
		}
	}

	public void question10(double h, double a) {
		double sum = h;
		for (int n = 2; n <= a; n++) {
			sum += h;
			h /= 2;
		}
		System.out.println(sum);
	}

	public void question11() {
		int sum = 0;
		for (int a = 1; a < 5; a++) {
			for (int b = 1; b < 5; b++) {
				for (int c = 1; c < 5; c++) {
					if (a != b && c != a && c != b) {
						sum++;
						System.out.println(100 * a + 10 * b + c);
					}
				}
			}
			System.out.println("次數為:" + sum);
		}
	}

	public void question12(int a) {
		int b;
		b = a / 10;
		switch (b) {
		case 1:
			System.out.println(a * 0.1 + "萬元");
			break;
		case 2:
			System.out.println((a - 10) * 0.075 + 1 + "萬元");
			break;
		case 3:
		case 4:
			System.out.println((a - 20) * 0.05 + 1.75 + "萬元");
			break;
		case 5:
		case 6:
			System.out.println((a - 40) * 0.03 + 2.75 + "萬元");
		case 7:
		case 8:
		case 9:
		case 10:
			System.out.println((a - 60) * 0.015 + 3.35 + "萬元");
		default:
			System.out.println((a - 100) * 0.015 + 3.95 + "萬元");
		}
	}

	public void question13() {
		for (int a = 100000; a > 0; a--) {
			int b = (int) Math.sqrt(a + 100);
			int c = (int) Math.sqrt(a + 268);
			if ((b * b == (a + 100)) && (c * c == (a + 268))) {
				System.out.println(a);
			}
		}
	}

	public void question14() {
		int year = 1960;
		int mouth = 2;
		int day = 6;
		int sum = 0;
		int a[] = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		for (int i = 1; i < mouth; i++) {
			sum += a[i - 1];
		}
		if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
			if (mouth == 2) {
				day--;
			}
			sum += 1;
		}

		System.out.println(sum + day);
	}

	public void question15(int a, int b, int c) {
		if (a < b) {
			b = a + b;
			a = b - a;
			b = b - a;
		}
		if (a < c) {
			c = a + c;
			a = c - a;
			c = c - a;
		}
		if (b < c) {
			c = b + c;
			b = c - b;
			c = c - b;
		}
		System.out.println("从大到小依次为:" + a + b + c);
	}

	public void question16() {
		for (int a = 1; a < 10; a++) {
			for (int b = 1; b < 10; b++) {
				System.out.println("乘法表为:" + a + "*" + b);
			}
		}
	}

	public void question17() {
		int taoZi = 1;
		int day = 10;
		int c = 0;
		while (c < 10) {
			System.out.println("第" + day-- + "天的桃子个数为:" + taoZi);
			taoZi = 2 * (taoZi + 1);
			c++;
		}

	}

	public void question18() {
		String[] a = { "a", "b", "c" };
		String[] b = { "x", "y", "z" };
		for (int i = 0; i < a.length; i++) {
			for (int g = 0; g < b.length; g++) {
				if (a[i] == "a" && b[g] == "x") {
					continue;
				} else if (a[i] == "c" && b[g] == "x") {
					continue;
				} else if (a[i] == "c" && b[g] == "z") {
				} else {
					System.out.println(a[i] + b[g]);
				}
			}
		}
	}

	public void question19(int d) {
		if (d % 2  != 0) {
			for (int i = 1; i < d/2; i++) {
				
			}
		} else {
			System.out.println("入力引数が間違い");
		}
		for (int c = 1; c <=d ; c ++) {
			for (int a = d /2; a > 0; a--) {
				System.out.print(" ");
			}
			for (int b = c*2-1; b > 0; b--) {
				System.out.print("*");
			}
			System.out.println(" ");
		}
	}

	public void question20() {
		int a = 2, b = 1;
		int sum = 0;
		int n = 0;
		for (int i = 0; i < 20; i++) {
			sum += a / b;
			n = a;
			a = a + b;
			b = n;
		}
		System.out.println(sum);
	}

	public void question21() {
		int sum1 = 0;
		for (int a = 1; a <= 20; a++) {
			int b = 1;
			int sum = 1;
			while (b <= a) {
				sum *= b;
				b++;
			}
			sum1 += sum;
//			System.out.println(sum);
		}
		System.out.println(sum1);
	}

	public int question22(int a) {
		int b;
		if (a == 1) {
			return 1;
		}
		b = a * question22(a - 1);
		return b;
	}

	public int question23(int a) {
		int year = 10;
		year += 2 * a;
		if (a == 0) {
			return 10;
		}
		return year;
	}

	public void question24(int a) {
		int[] b = new int[5];
		for (int c = 0; c < 5; c++) {
			b[c] = a % 10;
			System.out.println(b[c]);
			a = a / 10;
			if (a < 10) {
				b[c] = a;
				System.out.println(b[c]);
				break;
			}
		}
	}

	public void question26(String a) {
		switch (a) {
		case "m":
			System.out.println("monday");
			break;
		case "t":
			System.out.println("请输入两位字母查询");
			break;
		case "tu":
			System.out.println("tuesday");
		case "th":
			System.out.println("thursday");
		case "w":
			System.out.println("wednesday");
			break;
		case "f":
			System.out.println("friday");
			break;
		case " s":
			System.out.println("请输入两位字母查询");
			break;
		case "sa":
			System.out.println("saturday");
			break;
		case "su":
			System.out.println("sunday");
			break;
		default:
			System.out.println("不存在该星期");
		}
	}

	public void question28() {
		int c = 0;
		int[] a = { 25, 3, 98, 58, 64, 35, 184, 26, 1, 38 };
		for (int e = 0; e < a.length; e++) {
			for (int b = 0; b < 9; b++) {
				for (int d = b+1; d < a.length; d++) {
					if (a[b] > a[d]) {
						c = a[b];
						a[b] = a[d];
						a[d] = c;
					}
				}
			}
			System.out.println(a[e]);
		}
	}

	public void question29() {
		int a [][] = {{1,3,6},{2,5,6},{6,3,8}};
		System.out.println(a[0][0]+a[1][1]+a[2][2]);
		System.out.println(a[2][0]+a[1][1]+a[0][2]);
	}

	public void question30() {
		
		
		
	}

	public void question31() {
		int [] q = {26,36,95,40,37,65};
		int [] z = new int[q.length];
		int c = q.length-1; 
		for (int a = 0; a < q.length; a++) {
			z[c] = q [a];
			c--;
		}		
		System.out.println(z[0]+"+"+z[1]+"+"+z[2]+"+"+z[3]+"+"+z[4]);
	}

	public void question34(int a,int b,int c) {
		int d = 0;
		if (a < c) {
			d = a;
			a = c;
			c = d;
		}
		if (b < c) {
			d = c;
			c = b;
			b = d;
		}
		if(a < b) {
			d = a;
			a = b;
			b = d;
		}
		System.out.println(a+"+"+b+"+"+c);
	}

	public void question37(int n) {
		int [] a = new int [n];
		
	}
	public void question39(int a) {
		double sum =0;
		if (a % 2 ==0) {
			for (double n = 2;n <= a;n += 2 ) {
				sum +=1/n;
			}
		}else {
			for (double c =1; c <= a; c +=2) {
				sum += 1/c;
			}
		}
		System.out.println(sum);
	}

	public void question42() {
		ArrayList<Integer> d = new ArrayList<Integer>();
		for (int a = 10; a < 100; a++) {
			if ( (a * 8 < 100) && (a * 9 > 100)) {
				System.out.println(a);
				d.add(a);
			}
		}
		for (int c: d) {
			System.out.println(c*809);
		}
	}

	public void question43() {
		ArrayList<Integer> a = new ArrayList<Integer>() ;
			for (int c = 10; c <10000000;c++ ) {
				
				for(int b = 1;b < 8; b++) {
					int sum = 0;
					if (b % 2 != 0 && b !=0) {
						sum = b;
					}
				}
			}
	}
}