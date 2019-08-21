class Binary{
	public static void main(String[] args)
	{
     int a = Integer.parseInt(args[0]);
     int c=0,b=0;
     while(a!=0)
     {
     	c=a/2;
     	b=a%2;
     	System.out.println(b);
     	a=c;
     }
	}
}