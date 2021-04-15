import java.util.*;
public class Vote {
	public static void main(String args[])
	{
	int a;
	Scanner sc=new Scanner(System.in);
	System.out.println("What is your age?");
	a=sc.nextInt();
	if(a>=18)
	System.out.println("You are eligible to vote.");
	else
	System.out.println("not eligible");
	sc.close();
	}

	}

