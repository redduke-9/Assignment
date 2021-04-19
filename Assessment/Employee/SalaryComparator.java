import java.util.Comparator;
class SalaryComparator implements Comparator<Employee>{
	public int compare(Employee e1, Employee e2) {
		// TODO Auto-generated method stub
		if(e1.getSalary() != e2.getSalary()) {
			return e1.getSalary() - e2.getSalary();
		}
		return 0;
	}
}