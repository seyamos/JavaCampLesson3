package gun2Odev;

public class Main {

	public static void main(String[] args) {		
		
		Course course1 = new Course(1, "C#");
		Course course2 = new Course(2, "Java");
		Course course3 = new Course(3, "Python");
		Course course4 = new Course(4, "C++");
		
		
		Course[] courses = {course1, course2};
		for(Course course:courses) {
			System.out.println(course.getName());	
		}
		
		
		Instructor instructor1 = new Instructor(1, "Engin", "Demiroð");
		
		Instructor[] instructors = {instructor1};
		
		for(Instructor instructor:instructors) {
			System.out.println(instructor.getFirstName() + instructor.getLastName());
		}
		
		CourseManager courseManager = new CourseManager();
		courseManager.add(course3);
		courseManager.remove(course4);
				
		//System.out.println(instructor1.getFirstName());
		//System.out.println(instructor1.getLastName());		
		
		//System.out.println(course1.getName());
		//System.out.println(course2.getName());
		
	}
	
	
	

}
