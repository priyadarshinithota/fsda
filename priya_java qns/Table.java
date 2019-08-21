class Table{
	public static void main(String[] args){
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		int i;
		for(i=0;i<=b;i++)
		{
			System.out.println(a+"*"+i+"="+a*i);
		}
	}
}