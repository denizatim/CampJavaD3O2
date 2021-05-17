
public class Main {

	public static void main(String[] args) {
		
		Instructor instructor1 = new Instructor();
		instructor1.id = 1;
		instructor1.firstName = "Engin";
		instructor1.lastName = "Demiroğ";
		instructor1.email = "engindemirog@kodlama.io";
		instructor1.detail = "Deneyimli Eğitmen";
		
		Student student1 = new Student();
		student1.id = 2;
		student1.firstName = "Deniz";
		student1.lastName = "Atım";
		student1.email = "denizatim92@gmail.com";
		student1.address = "İstanbul, Türkiye";
		
		Course course1 = new Course();
		course1.id = 1;
		course1.name = "Java + React";
		course1.instructor = instructor1;
		Course course2 = new Course();
		course2.id = 2;
		course2.name = "C# + Angular";
		course2.instructor = instructor1;
		
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.logIn(instructor1);
		instructorManager.create(course1);
		instructorManager.create(course2);
		
		StudentManager studentManager = new StudentManager();
		studentManager.logIn(student1);
		studentManager.signIn(course1);
		studentManager.signIn(course2);

	}

}
