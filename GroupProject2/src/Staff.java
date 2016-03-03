
public class Staff extends User{
	String first,middle,last;
	String Username;
	String Password;
	CourseList Courses;
	String name;
	
	public Staff(String Username, String Password, String first, String middle, String last){
		this.Username = Username; this.Password = Password; this.first = first; this.middle = middle; this.last = last;
	}

	@Override
	void accessCourseList() {
		// TODO Auto-generated method stub
		
	}

	public void addCourse() {
		
	}

	public void setDescription(Course C){
		
	}
	
	public void deleteCourse() {
		// TODO Auto-generated method stub
		
	}
	
	public String getUsername(String Username){
		return this.Username = Username + ".edu";
	}//sets the User's name
	
	public String setPassword(String Password){
		return this.Password = Password;
	}//sets the User's Password
	
}
