package JavaPractice;

public class _003_if_else_if_ConditionalStatements {
	public static void main(String args[]) {
		
	
	int a=24;
	int b=20;
	int c=a+b;
	
	//if statement
	if(a+b==24) {
		System.out.println("a+b=24");
	}
	else if (a+b==34){
		System.out.println("a+b=34 ");
	}
	else if (a+b==04){
		System.out.println("a+b=04 ");
	}
	else if (a+b==44){
		System.out.println("a+b=44 ");
	}
	else{
		System.out.println("a+b");
	}
	
	
	System.out.println("a+b="+c);
	
	
}
}
