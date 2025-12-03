class DemoConditionalConstruct
{
	public static void main(String[] args)
	{
		int age;
		char nationality;
		age = 25;
		nationality = 'I';
		if(age>18 && nationality == 'I')
		{
			System.out.println("Eligible for Voting");
			System.out.println(nationality);
		}
		else
		{
			System.out.println("NOT Eligible for Voting");	
			System.out.println(nationality);
		}
	}
}