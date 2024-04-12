package com.example.crypt;

import java.security.SecureRandom;


public class SecureRandomExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // SecureRandom ��ü ����
        SecureRandom random = new SecureRandom();
        
        // 16����Ʈ ũ���� ����Ʈ �迭 ����
        byte[] bytes = new byte[16];
        
        // ����Ʈ �迭�� SecureRandom���� ä��
        random.nextBytes(bytes);
        
        // ����Ʈ �迭�� 16���� ���ڿ��� ��ȯ
        String hexString = bytesToHex(bytes);
        
        // 16���� ���ڿ� ���
        System.out.println(hexString);

	}
	
    // ����Ʈ �迭�� 16���� ���ڿ��� ��ȯ�ϴ� �޼���
    private static String bytesToHex(byte[] bytes) {
        StringBuilder hexString = new StringBuilder();
        for (byte b : bytes) {
            // �� ����Ʈ�� 16���� ���ڿ��� ��ȯ�Ͽ� StringBuilder�� �߰�
            hexString.append(String.format("%02X", b));
        }
        return hexString.toString();
    }


}
