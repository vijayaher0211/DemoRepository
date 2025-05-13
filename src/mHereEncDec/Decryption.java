package mHereEncDec;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.SecretKeySpec;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.BadPaddingException;
import java.util.Base64;

public class Decryption {

    public static final String AES_KEY = "fedcba9876543210"; // Use this as key

    // Decryption method
    public String decrypt(String input, String key) throws IllegalBlockSizeException, NoSuchAlgorithmException, NoSuchPaddingException, InvalidKeyException, BadPaddingException {
        byte[] output;
        SecretKeySpec skey = new SecretKeySpec(key.getBytes(), "AES");
        Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5Padding");
        cipher.init(Cipher.DECRYPT_MODE, skey);
        output = cipher.doFinal(Base64.getDecoder().decode(input)); // Use Base64 from java.util
        return new String(output);
    }

    public static void main(String[] args) {
        try {
        	Decryption encryptionDecryption = new Decryption();
            String encryptedText = "DjYeMTJp1o4SIT0i/Kox7g=="; // Provided encrypted text
            String decryptedText = encryptionDecryption.decrypt(encryptedText, AES_KEY);
            System.out.println("Decrypted Text: " + decryptedText);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}