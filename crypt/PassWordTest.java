package com.example.crypt;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;
import java.security.MessageDigest;

public class PassWordTest{

    public static void main(String[] args) {
        String password = "������";
        String digest = password(password.getBytes());
        System.out.println("MySQL Password�� �ؽð� =" + digest);
        Scanner scanner = new Scanner(System.in);
        System.out.println("��й�ȣ�� �Է��ϼ���: ");
        String input = scanner.nextLine();
        System.out.println("���� �Է��� password�� �ؽð� = " + password(input.getBytes()));
        scanner.close();
        if (digest.equals(password(input.getBytes()))) {
            System.out.println("MySQL Password�� ���� �Է��� password�� �ؽð��� ��ġ�մϴ�. ���� ��й�ȣ�� �Է��� ������ �����մϴ�. �α��� ����");
         
        } else {
            System.out.println("MySQL Password�� ���� �Է��� password�� �ؽð��� ��ġ���� �ʽ��ϴ�. �ٸ� ��й�ȣ�� �Է��� ������ �����մϴ�. �α��� ����");
        }

    }
    public static byte[] getHash(byte[] input) {
        try {
            MessageDigest md = MessageDigest.getInstance("SHA1");
            return md.digest(input);
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException("SHA1" + "Algorithm Not Found", e);
        }
    }

    static String bytesToHex(byte[] bytes) {
        StringBuilder hexString = new StringBuilder();
        for (byte b : bytes) {
            // �� ����Ʈ�� 16���� ���ڿ��� ��ȯ�Ͽ� StringBuilder�� �߰�
            hexString.append(String.format("%02X", b));
        }
        return hexString.toString();
    }

    public static String password(byte[] input) {
        byte[] digest = null;
        // Stage 1
        digest = getHash(input);
        return bytesToHex(digest);
    }
}


    
