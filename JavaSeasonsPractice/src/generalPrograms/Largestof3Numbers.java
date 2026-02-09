package generalPrograms;

import java.util.Scanner;

public class Largestof3Numbers {

	public static void main(String[] args) {
		/*
		int a=10;
		int b=50;
		int c=30;
		*/
		Scanner inp= new Scanner(System.in);
		System.out.println("Enter a value :");
		int a=inp.nextInt();
		System.out.println("Enter b value :");
		int b=inp.nextInt();
		System.out.println("Enter c value :");
		int c=inp.nextInt();
		
		if(a>b && a>c) 
		{
			System.out.println("a is largest num:"+ a);
		}
		else if(b>a && b>c)
		{
			System.out.println("b is largest num:"+ b);
		}
		else
		{
			System.out.println("c is largest num:"+ c);
		}

	}

}
