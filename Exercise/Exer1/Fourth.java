import java.util.*;
public class Fourth {
	
	public static void main(String[] args )
	{
	char a;
	System.out.println("What is the command keyword to exit a loop in Java?");
	System.out.println("a. int");
	System.out.println("b. continue");
	System.out.println("c. break");
	System.out.println("d. exit");
	System.out.println("Enter correct choice for the question:");
	Scanner sc=new Scanner(System.in);
	a=sc.next().charAt(0);
	do{
	if(a=='c'){
	System.out.println("right!!!!!");
	break;
	}
	else{
	System.out.println("Not");
	break;
	}
	}while(true);
	}
	}

