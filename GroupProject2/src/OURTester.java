
public class OURTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Staff Jo = new Staff("Josho", "Password","Jo", "Mo", "Sho");
		System.out.println(Jo.Username);
		System.out.println(Jo.Password);
		System.out.println(Jo.first);
		System.out.println(Jo.middle);
		System.out.println(Jo.last);
		
		System.out.println("");
		
		Student JoStudent = new Student("Josho", "Password","Jo", "Mo", "Sho");
		System.out.println(JoStudent.Username);
		System.out.println(JoStudent.Password);
		System.out.println(JoStudent.first);
		System.out.println(JoStudent.middle);
		System.out.println(JoStudent.last);
	}

}
