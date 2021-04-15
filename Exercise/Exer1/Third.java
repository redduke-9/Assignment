import java.util.*;
public class Third {
	public static void main(String[] args)
	{
	char a;
	System.out.println("How to declare a variable correctly?");
	System.out.println("a. int 1x=10;");
	System.out.println("b. int x=10;");
	System.out.println("c. float x=10.0f;");
	System.out.println("d. string x='10';");
	Scanner sc=new Scanner(System.in);
	a=sc.next().charAt(0);
	switch(a){
	case 'a':
	System.out.println("Wrong");
	break;
	case 'b':
	System.out.println("Right!!!");
	break;
	case 'c':
	System.out.println("Wrong");
	break;
	case 'd':
	System.out.println("Wrong");
	break;
	default:
	System.out.println("Only options");
	}}}

