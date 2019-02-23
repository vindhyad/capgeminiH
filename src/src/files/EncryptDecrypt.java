package files;

public class EncryptDecrypt {
	public static void decryption(StringBuilder encryptedMsg,int key)
	{
		String msg=encryptedMsg.toString();
		char[] letters=msg.toCharArray();
	
 StringBuilder decryptedMsg=new StringBuilder();
 for(int i=0;i<letters.length;i++)
 		{
	 decryptedMsg.append((char)(byte)(letters[i]-key));
 		}
 System.out.println(decryptedMsg);
	}
	public static void main(String[] args) {
		    decryption(encryption("HelloWorld",3),3);                                                                                                                                                                          

	}
	private static StringBuilder encryption(String msg, int key) {
		
		String msg1="HelloWorld";
		char[] letters=msg1.toCharArray();
	
 StringBuilder encryptedMsg=new StringBuilder();
 for(int i=0;i<letters.length;i++)
 		{
	 encryptedMsg.append((char)(byte)(letters[i]+key));
 		}
 System.out.println(encryptedMsg);
	
		return null;
	}

}
