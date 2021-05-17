
public class StudentManager extends UserManager{
	public void signIn(Course course) {
		System.out.println("Kursa kayıt olundu : " + course.name);
	}
}
