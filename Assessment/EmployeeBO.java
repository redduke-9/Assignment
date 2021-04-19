import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class EmployeeBO
{
	public static void main(String[] args) throws ParseException 
	{
		Scanner scan = new Scanner(System.in);
		ArrayList<Employee> emp = new ArrayList<Employee>();
		SimpleDateFormat obj = new SimpleDateFormat("dd-mm-yyyy");
		emp.add(new Employee("Rohini", "DataAnalysis", obj.parse("10-10-2000"), 45, 90000));
		emp.add(new Employee("Ranganathan", "Production", obj.parse("09-10-2000"), 45, 92000));
		emp.add(new Employee("Pankaj", "Marketing", obj.parse("02-02-2002"), 38, 75000));
		
		System.out.println("1.Sort employees by salary");
		System.out.println("2.Sort employees by age and by date of\r\n" + "joining");
		System.out.println("Enter Your Choice");
		int choice = scan.nextInt();
		switch(choice)
		{
			case 1: {
						Collections.sort(emp, new SalaryComparator());
						System.out.println(String.format("%-15s %-30s %-30s %-10s %-10s\n", "Employee Name", "Department", "DOJ", "Age", "Salary"));
						for (int i = 0; i < emp.size(); i++)
						{
							System.out.println(emp.get(i));
						}
						
						break;
					}
			case 2: {
						Collections.sort(emp, new AgeComparator());
						System.out.println(String.format("%-15s %-30s %-30s %-10s %-10s\n", "Employee Name", "Department", "DOJ", "Age", "Salary"));
						for (int i = 0; i < emp.size(); i++)
						{
							System.out.println(emp.get(i));
						}
						break;
					}
			default:
					break;
		}
	scan.close();
	}
}