package by.htp.les08.main;

import java.util.Random;

public class Main {

	public static void main(String[] args) {
		int[] mas = new int[10];

		init(mas);

		int min, indexMin;

		print(mas);
		System.out.println("------------------");
		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas.length - i - 1; j++) {
				if (mas[j] > mas[j + 1]) {
					int temp;
					temp = mas[j];
					mas[j] = mas[j + 1];
					mas[j + 1] = temp;
				}

				print(mas);
			}
			System.out.println("------------------");
		}
		print(mas);
		/*
		 * for(int i = 0; i < mas.length-1; i++) {
		 * 
		 * min = mas[i]; indexMin = i;
		 * 
		 * for(int j = i + 1; j < mas.length; j++) { if(min > mas[j]) { min = mas[j];
		 * indexMin = j; } }
		 * 
		 * mas[indexMin] = mas[i]; mas[i] = min;
		 * 
		 * print(mas);}
		 */

		long ll = 0;
		for(int i=1; i>=200; i++) {
			
			ll = ll - (int)Math.pow(i, 3);
		}
		
		
	}

	public static void init(int[] mas) {
		Random rand = new Random();
		for (int i = 0; i < mas.length; i++) {
			mas[i] = rand.nextInt(1000);
		}
	}

	public static void print(int[] mas) {
		for (int i = 0; i < mas.length; i++) {
			System.out.printf("%-5d", mas[i]);
		}
		System.out.println();
	}

}
