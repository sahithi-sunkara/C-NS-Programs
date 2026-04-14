import java.security.MessageDigest;
class Sha1Ex
{

public static void main(String args[])
{
try
{
String msg = "Hello World"; 
MessageDigest md= MessageDigest.getInstance("SHA-1"); 
byte[] msgbytes = msg.getBytes(); 


byte[] digestbytes = md.digest(msgbytes); 




to hex

StringBuilder hexstring = new StringBuilder();

for(byte b: digestbytes )
{

String hex = Integer.toHexString(0xff &b);


if(hex.length()==1)
{
hexstring.append('0');
}
hexstring.append(hex);
}


System.out.println("Original Message: "+msg); System.out.println("Message Digest: "+hexstring.toString());
}
catch(Exception e)

{
}
}
}
