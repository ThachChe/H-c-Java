package thachche;

import java.util.Scanner;

public class vonglap2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("nhap n= ");
		int n = sc.nextInt();
		int i = 1;
		while (i <= n) {
			if (i % 2 == 0) {
				System.out.println("So nguyen chan la: " + i);
			}
			i++;

		}

		sc.close();
	}

}
