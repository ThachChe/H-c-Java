package thachche;

import java.util.Scanner;

public class Method11 {
	public static boolean SDT(String phone) {
		
		boolean tick = true;
		
		if(phone.length()<9 && phone.length()>11) {
			tick = false;
			System.out.println("So dien thoai cua ban khong hop le !");
			return false;
		} 
		
		for(int i = 0; i < phone.length(); i++) {
			char ch = phone.charAt(i);
			
			if(!Character.isDigit(ch)) {
				tick = false;
				System.out.println("So dien thoai cua ban khong hop le !");
				return false;
			}
		}
		
		System.out.println("So dien thoai cua ban hop le !");
		return true;
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap so dien thoai cua ban: ");
		String sdt = sc.nextLine();
		
		
		SDT(sdt);
		
	}

}
