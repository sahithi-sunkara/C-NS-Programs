import java.util.*; 
class CaserCipher
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in); 
int shift; System.out.println("Enter text:"); text = sc.nextLine(); 
System.out.println("Enter shift value:"); shift = sc.nextInt(); 
for(int i=0;i<text.length();i++) 
{
char ch;
ch = text.charAt(i);
if(ch>='A'&&ch<='Z')
{
ctext = ctext+ (char)((ch-'A'+shift)%26+'A'); 
}
else if(ch>='a'&&ch<='z') 
{
else
{
ctext = ctext+ (char)((ch-'a'+shift)%26+'a');	}
ctext = ctext+ch;
}
}
for(int i=0;i<ctext.length();i++) 
{
char ch;
ch = ctext.charAt(i);
if(ch>='A'&&ch<='Z') 
{
dtext = dtext+ (char)((ch-'A'+26-shift)%26+'A');
}
else if(ch>='a'&&ch<='z') 
{
dtext = dtext+ (char)((ch-'a'+26-shift)%26+'a');
}
else
{
dtext = dtext+ch;
}
}
System.out.println("Encrypted text :"+ctext); System.out.println("Decrypted text :"+dtext);
}
}
