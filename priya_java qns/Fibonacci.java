class Fibonacci{
	public static void main(String[] args){
		int n = Integer.parseInt(args[0]);
		int a=0,b=1,c=0;
		System.out.println(a);
		System.out.println(b);
		while(c!=n)
		{
           c = a+b;
         System.out.println(c);  
         a=b;
         b=c;    
		}
	}
}