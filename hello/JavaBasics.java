package com.example.hello;

public class JavaBasics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age = 25;
        String name = "John";
        System.out.println("�̸�: " + name + ", ����: " + age);

        // ���ǹ� (if-else)
        int score = 85;
        if (score >= 90) {
            System.out.println("A����");
        } else if (score >= 80) {
            System.out.println("B����");
        } else {
            System.out.println("C���� ����");
        }

        // �ݺ��� (for)
        System.out.println("for�� ����:");
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }

        // �ݺ��� (while)
        System.out.println("while�� ����:");
        int i = 1;
        while (i <= 5) {
            System.out.println(i);
            i++;
        }

	}

}
