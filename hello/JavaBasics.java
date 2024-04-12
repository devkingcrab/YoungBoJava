package com.example.hello;

public class JavaBasics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age = 25;
        String name = "John";
        System.out.println("이름: " + name + ", 나이: " + age);

        // 조건문 (if-else)
        int score = 85;
        if (score >= 90) {
            System.out.println("A학점");
        } else if (score >= 80) {
            System.out.println("B학점");
        } else {
            System.out.println("C학점 이하");
        }

        // 반복문 (for)
        System.out.println("for문 예시:");
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }

        // 반복문 (while)
        System.out.println("while문 예시:");
        int i = 1;
        while (i <= 5) {
            System.out.println(i);
            i++;
        }

	}

}
