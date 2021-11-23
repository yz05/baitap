package chip;

import java.util.Scanner;

public class phuongtrinhb2 {
	public static void main (String[] args) {
		int a ; 
		int b; 
		int c; 
		a = Nhapsonguyen ("Nhap a = "); 
		b = Nhapsonguyen ("Nhap b = "); 
		c = Nhapsonguyen ("Nhap c = ");
		Giaiptb2 (a,b,c);		
	}
	public static int Nhapsonguyen (String str)
	{
		int x ; 
		Scanner sc= new Scanner (System.in);
		System.out.println(str);
		x = sc.nextInt();
		return x ; 
	}
	public static void Giaiptb2 (int a, int b , int c) {
		if (a==0)
		{
			if (b==0)
			{ 
				if (c==0)
					System.out.println("Phuong trinh co vo so nghiem");
				else 
					System.out.println("Phuong trinh vo nghiem");
			}
			else 
				System.out.println("Phuong trinh co 1 nghiem la i =" + (-c/b));
		}
		else 
		{
			float x1 ; 
			float x2 ; 
			float delta = b*b + 4*a*c ; 
			if (delta <0)
				System.out.println("Phuong trinh vo ngghiem");
			else if (delta >0)
			{
				System.out.println("Phuong trinh co nghiem x1 =" +(-b + Math.sqrt(delta)/(2*a)));
				System.out.println("Phuong trinh co nghiem x2= " +(-b - Math.sqrt(delta)/(2*a)));
				
			}
			else 
				System.out.println("Phuong trinh co nghiem kep x1=x2" +(-b/(2*a)));
		}
	}

}
