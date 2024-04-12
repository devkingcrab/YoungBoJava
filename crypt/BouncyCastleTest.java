package com.example.crypt;
import java.security.Provider;
import java.security.Security;
import org.bouncycastle.jce.provider.BouncyCastleProvider;

public class BouncyCastleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Security.addProvider(new BouncyCastleProvider());
        Provider provider = Security.getProvider("BC"); //BC�� Bouncy Castle�� ����

        if (provider != null) {
            System.out.println("Bouncy Castle provider�� ��� �����մϴ�.");
        } else {
            System.out.println("Bouncy Castle provider�� ��� �Ұ��մϴ�.");
        }


	}

}
