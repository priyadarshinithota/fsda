class Factorial{
	public static void main(String[] args) {
		int a = Integer.parseInt(args[0]);
		int fact = 1,i;
		for(i=a;i>=1;i--)
		{
		  fact=fact*i;
		//  a--;
		}

	System.out.println("factorial of given number is :"+fact);
		// System.out.println("factorial of given number is :"+a);
}
}