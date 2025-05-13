package mHereEncDec;

import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.SecretKeySpec;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.BadPaddingException;
import java.util.Base64;

public class Encryption {

    public static final String AES_KEY = "fedcba9876543210"; // Use this as key

    // Encryption method
    public String encrypt(String input, String key) throws IllegalBlockSizeException, NoSuchAlgorithmException, NoSuchPaddingException, InvalidKeyException, BadPaddingException {
        byte[] output;
        SecretKeySpec skey = new SecretKeySpec(key.getBytes(), "AES");
        Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5Padding");
        cipher.init(Cipher.ENCRYPT_MODE, skey);
        output = cipher.doFinal(input.getBytes());
        return Base64.getEncoder().encodeToString(output); // Encode encrypted byte array to Base64
    }

    public static void main(String[] args) {
        try {
        	Encryption encryptionExample = new Encryption();
            String plaintext = "bmwm5!2025"; // Example plaintext
            String encryptedText = encryptionExample.encrypt(plaintext, AES_KEY);
            System.out.println("Encrypted Text: " + encryptedText);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}