package com.example.crypt;

import java.util.Random;
import java.util.Scanner;

public class RandomExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.print("�õ� ���� �Է��ϼ��� (�⺻��: 0): ");
			long seed = scanner.nextLong();
			
			// �õ� ���� ����Ͽ� Random ��ü ����
			Random random = new Random(seed);
			
			// 10���� ���� ����
			System.out.println("������ ����:");
			for (int i = 0; i < 10; i++) {
			    int randomNumber = random.nextInt(100);
			    System.out.println(randomNumber);
			    //
			}
		}

	}

}
