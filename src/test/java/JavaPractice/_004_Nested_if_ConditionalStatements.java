package JavaPractice;

public class _004_Nested_if_ConditionalStatements {
	public static void main(String args[]) {

		int telugu = 94;
		int english = 83;
		int hindi = 80;
int z=telugu;int b=english;int c=hindi;
		// if statement
		if (telugu >= 60 && english >= 60 && hindi >= 60) 
		{
			String a = "Congratulations. you are seleted for next round";
			System.out.println(a);
			if (telugu >= 90 && english >= 90 && hindi >= 90) 
			{
				System.out.println("you got first class");

			} else if (telugu >= 80 && english >= 80 && hindi >= 80) 
			{
				System.out.println("you got second class");

			} else if (telugu >= 70 && english >= 70 && hindi >= 70) 
			{
				System.out.println("you got 3rd class");

			} else if (telugu >= 60 && english >= 60 && hindi >= 60) 
			{
				System.out.println("you got 4th class");

			}
		}
		else 
		{
			System.out.println("you are not ealigibile ");
		}

		System.out.println( "telugu="+ telugu );
		System.out.println( "English="+ english );
		System.out.println( "Hindi="+ hindi );

	}
}
