
public class InstructorManager extends UserManager{
	public void create(Course course) {
		System.out.println("Kurs açıldı : " + course.name);
	}
}
