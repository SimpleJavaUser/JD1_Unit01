package by.htp.les06.main;

import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int a;
		int b;
		int z;
		
		a = 12;
		b = 23;
		
		z = sum(a, b);// ����������� ���������
		
		System.out.println(a + " + " + b + " = " + z);
		
		z = sum(13, b+2);
		
		System.out.println("[" + a + " + " + b + " = " + z + "]");

	}
	
	// by value �� ��������
	public static int sum(int a, int b) {// ���������� ���������
		int sum;
	
		sum = a + b;
		
		return sum;
		
	}

}
