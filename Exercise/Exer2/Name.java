import java.util.*;
public class Name {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter your name:");
		String n=s.nextLine();
		System.out.println("name is :"+n);
		String names[]=n.split(" ");
		int l=names.length;
		for(int i=0;i<names.length-1;i++) {
			names[i]=names[i].toUpperCase();
			//System.out.println(names[i]);
			char c=names[i].charAt(0);
			System.out.print(c+".");
		}
		System.out.print(names[l-1]);
	}
}
