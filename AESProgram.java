import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
public class AESProgram{
public static void main(String[] args) throws Exception{
String key = "1234567890123456";
String text = "HelloWorld12345";
SecretKeySpec secretKey = new SecretKeySpec(key.getBytes(),"AES");
Cipher cipher = Cipher.getInstance("AES");
cipher.init(Cipher.ENCRYPT_MODE,secretKey);
byte[]encrypted = cipher.doFinal(text.getBytes());
System.out.println("Encrypted Text: "+ new String(encrypted));
cipher.init(Cipher.DECRYPT_MODE,secretKey);
byte[]decrypted = cipher.doFinal(encrypted);
System.out.println("Decrypted Text: "+ new String(decrypted));
}
}
