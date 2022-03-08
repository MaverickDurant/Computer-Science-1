
public class CryptoManager 
{
	
	static int upper_bound;
	static int lower_bound;
	
	public static String decryptBellaso(String encryptedText, String bellasoStr)
	{
		String plain = "";
		
		while (bellasoStr.length() < encryptedText.length())
		{
			bellasoStr+=bellasoStr.substring(0,(encryptedText.length()-bellasoStr.length()));
		}
		
		for (int i = 0; i < encryptedText.length(); i++)
		{
			char c= (char)Integer_key((int)encryptedText.charAt(i)-(int)bellasoStr.charAt(i));
			plain += Character.toString(c);
		}
		
		return plain;
	}
	
	public static String encryptBellaso(String plainText, String bellasoStr)
	{
		String plain = "";
		
		while (bellasoStr.length()<plainText.length())
		{
			bellasoStr += bellasoStr.substring(0,(plainText.length()-bellasoStr.length()));
		}
		
		for (int i=0; i < plainText.length(); i++)
		{
			char c=(char)Integer_key((int)plainText.charAt(i)+(int)bellasoStr.charAt(i) );

			plain += Character.toString(c);
		}
		
		return plain;
	}
	
	public static int Integer_key(int key)
	{
		while (key > upper_bound)
		{
			key -= (upper_bound-lower_bound);
		}
		
		return key;
	}
	
	public static String decryptCaesar(String encryptedText, int key)
	{
		String old = "";
		
		key = Integer_key(key);
		
		for (int i=0; i < encryptedText.length(); i++)
		{
			old += Character.toString((char) ((int)encryptedText.charAt(i)-key));
		}
		
		return old;

	}
	
	public static String encryptCaesar(String plainText, int key)
	{
		String plain = "";
		
		key = Integer_key(key);
		
		for (int i = 0; i < plainText.length(); i++)
		{
			plain += Character.toString((char) ((int)plainText.charAt(i)+key));
		}
		
		return plain;
	}
	
	public static boolean stringInBounds(String plainText)
	{
		boolean bounds = true;
		
		for (int i=0; i<plainText.length(); i++)
		{
			if (!((int)plainText.charAt(i) >= lower_bound && (int)plainText.charAt(i) <= upper_bound))
			{
				bounds = false;
				
				break;
			}			
		}	
		
		return bounds;		
	}
}
