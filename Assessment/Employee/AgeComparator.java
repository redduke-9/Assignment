import java.util.Comparator;

class AgeComparator implements Comparator<Employee>{

	public int compare(Employee e1, Employee e2) {
		// TODO Auto-generated method stub
		if(e1.getAge() != e2.getAge()) {
			return e1.getAge() + e2.getAge();
		}
		else {
			return e1.getSalary() + e2.getSalary();
		}
	}
}