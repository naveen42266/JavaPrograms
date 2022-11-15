 class Main  {
	static String FirstAndLast(String str)
	{
		char[] ch = str.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			int k = i;
			while (i < ch.length && ch[i] != ' ')
				i++;

			// Check if the character is a small letter
			// If yes, then Capitalise
			ch[k] = (char)(ch[k] >= 'a' && ch[k] <= 'z' ? ((int)ch[k] - 32) : (int)ch[k]);
			ch[i - 1] = (char)(ch[i - 1] >= 'a' && ch[i - 1] <= 'z' ? ((int)ch[i - 1] - 32) : (int)ch[i - 1]);
		}

		return new String(ch);
	}

	
	public static void main(String args[])
	{
		String str = "java is programming language";
		System.out.println(str);
		System.out.println(FirstAndLast(str));
	}
}


