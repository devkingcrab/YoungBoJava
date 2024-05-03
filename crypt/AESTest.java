package com.example.crypt;

import java.nio.charset.Charset;
import java.security.GeneralSecurityException;
import java.util.Scanner;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.KeyGenerator;

public class AESTest {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.print("��ȣȭ�� ���ڿ��� �Է��ϼ���: ");
        String plainText = scanner.nextLine();

        //���Ű ����
        KeyGenerator keyGenerator = KeyGenerator.getInstance("AES");
        keyGenerator.init(256);
        SecretKey secretKey = keyGenerator.generateKey();
        Charset charset = Charset.forName("UTF-8");

        //��ȣȭ
        byte[] encryptData = encrypt(secretKey, plainText.getBytes(charset));
        System.out.println("��ȣȭ�� ���: " + bytesToHex(encryptData));

        //��ȣȭ
        byte[] decryptData = decrypt(secretKey, encryptData);
        System.out.println("��ȣȭ�� ���: " + new String(decryptData, charset));
    }
    private static byte[] encrypt(SecretKey secretKey, byte[] plaindata) throws GeneralSecurityException {
        Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5Padding");
        cipher.init(Cipher.ENCRYPT_MODE, secretKey);
        byte[] encryptData = cipher.doFinal(plaindata);
        return encryptData;
    }

    private static byte[] decrypt(SecretKey secretKey, byte[] encryptData) throws GeneralSecurityException {
        Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5Padding");
        cipher.init(Cipher.DECRYPT_MODE, secretKey);
        byte[] decryptData = cipher.doFinal(encryptData);
        return decryptData;
    }

    static String bytesToHex(byte[] bytes) {
        StringBuilder hexString = new StringBuilder();
        for (byte b : bytes) {
            hexString.append(String.format("%02X", b));
        }
        return hexString.toString();
    }
}


    
