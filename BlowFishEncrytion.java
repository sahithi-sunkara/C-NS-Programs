import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Base64;
public class BlowFishEncrytion{
public static void main(String[] args){
try{
String plaintext="Hello World";
String keyString="My SecretKey";
SecretKeySpec key = new SecretKeySpec (keyString.getBytes(),"Blowfish");
Cipher cipher = Cipher.getInstance("Blowfish");
cipher.init(Cipher.ENCRYPT_MODE,key);
byte[]encryptedBytes = cipher.doFinal(plaintext.getBytes());
String encryptedText = Base64.getEncoder().encodeToString(encryptedBytes);
System.out.println("Encrypted Text: "+encryptedText);
} catch(Exception e){
e.printStackTrace();
}
}
}
