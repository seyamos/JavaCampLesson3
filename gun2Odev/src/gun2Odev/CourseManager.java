package gun2Odev;

public class CourseManager {
	public void add(Course course) {
		System.out.println("Yeni kurs eklendi: " + course.getName());
	}
	
	public void remove(Course course) {
		System.out.println("Kurs silindi: " + course.getName());
		
	}

}
