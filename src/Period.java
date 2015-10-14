public class Period {
	//Class fields + getters/setters
	private String dept, course, section, campuscd;	//Naming conventions from the website.
	public String getDept() {
		return dept;
	}
	public String getCourse() {
		return course;
	}
	public String getSection() {
		return section;
	}
	public String getCampuscd() {
		return campuscd;
	}

	private Integer day, startTime, endTime;		//Times are hours*100. So 2:30pm would be 1450.
	public int getStartTime() {
		return startTime;
	}
	public int getEndTime() {
		return endTime;
	}
	public int getDay() {
		return day;
	}
	public String getDayString() {
		switch(day){
		case 0:
			return "Monday";
		case 1:
			return "Tuesday";
		case 2:
			return "Wednesday";
		case 3:
			return "Thursday";
		case 4:
			return "Friday";
		case 5:
			return "Saturday";
		case 6:
			return "Sunday";
		default:
			return "No such day";
		}
	}
	
	//Constructors
	public Period(String dept, String course, String section, String campuscd,
			Integer day, Integer startTime, Integer endTime) {
		this.dept = new String(dept);			//"COSC"
		this.course = new String(course);		//"121" This CAN have non-numeric characters
		this.section = new String(section);		//"001"
		this.campuscd = new String(campuscd);	//"UBC" or "UBCO"
		this.day = day;
		this.startTime = startTime;
		this.endTime = endTime;
	}
	public Period(Integer day, Integer startTime, Integer endTime) {
		this(null, null, null, null, day, startTime, endTime);
	}
	public Period() {
		this(null, null, null, null, null, null, null);
	}
	
	//Methods
	public int getFitness() {	//Return the score indicating how good this period of time is.
		int blocks = ((endTime - startTime) / 50);
		return blocks * blocks;
	}
}