package thachche;

import java.util.Scanner;

public final class HelloWorld {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap nam hien tai: ");
		int year = sc.nextInt();
		System.out.println("Nhap tuoi: ");
		int age = sc.nextInt();
		System.out.println("Nam" + year + "ban" + age + "tuoi.");

	}
}
