import java.util.*;
public class Ary{
	public static void main(String[] args)
	{
		int n;
		boolean no=false;
		System.out.println("Enter length of array");
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		int[] arr=new int[10];
		for(int i=0;i<n;i++) {
			arr[i]=s.nextInt();
		}
		for(int i=0;i<n;i++) {
			int a;
			if(arr[i]==2) {
				no=true;
			    break;}
		}
		if(no)
			System.out.println("Yes");
		else
			System.out.println(no);
	}
}