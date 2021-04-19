import java.util.ArrayList;
import java.util.List;

class country
{   String name;
   
	List<state> countrylist = new ArrayList<state>();
	
	 void setlist(state s)
	{
		countrylist.add(s);
	}
	 List getlist()
	{
		return countrylist;
	}
}
