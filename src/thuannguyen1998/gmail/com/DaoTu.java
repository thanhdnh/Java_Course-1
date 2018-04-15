package thuannguyen1998.gmail.com;

public class DaoTu {
	public static String thuchien(String str) {
		int r = 0;
		String a = " ";
		for (int i = 0; str.length() > i; i++) 
		{
			if (str.substring(i, i + 1).compareTo(" ") == 0) 
			{
				a = str.substring(r, i) + " " + a;
				r = i;
			}
		}
		a = str.substring(r, str.length()) + " " + a;
		a = a.substring(1);
		return a.trim();
	}
}
