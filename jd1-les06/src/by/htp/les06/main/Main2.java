package by.htp.les06.main;

import java.util.Random;

public class Main2 {

	public static void main(String[] args) {
		int n = 10;
		int[] mas = new int[n];
		
		print(mas);
		initWithRandom(mas);
		print(mas);

	}

	public static void initWithRandom(int[] mas) {
		Random rand = new Random();

		for (int i = 0; i < mas.length; i++) {
			mas[i] = rand.nextInt(1000);
		}

	}

	public static void print(int[] mas) {
		for (int i = 0; i < mas.length; i++) {
			System.out.print(mas[i] + ", ");
		}
		System.out.println();
	}

}
