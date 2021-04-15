public class Bankpoly {
	public static void main(String args[]){  
		RBI b;  
		b=new SBI();  
		System.out.println("SBI Rate of Interest: "+b.RateOfInterest());  
		b=new HDFC();  
		System.out.println("HDFC Rate of Interest: "+b.RateOfInterest());  
		b=new Axis();  
		System.out.println("Axis Rate of Interest: "+b.RateOfInterest());  
		}  
		} 