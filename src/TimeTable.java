import java.util.ArrayList;
import java.util.LinkedList;

public class TimeTable {
	
	//Fields
	private ArrayList<LinkedList<Period>> table;
	
	//Constructors
	public TimeTable() {
		table = new ArrayList<LinkedList<Period>>(7);
		for(int i = 0; i < 7; i++) {
			table.add(new LinkedList<Period>());
		}
	}
	
	//Methods
	public void add(Period p) {
		LinkedList<Period> day = table.get(p.getDay());
		for(int i = 0; i < day.size(); i++) {
			int c = p.compareTo(day.get(i));
			if(c == 0) {
				day.set(i, p);
				break;
			}
			else if(c > 0) {
				day.add(i, p);
				break;
			}
		}
	}
}
