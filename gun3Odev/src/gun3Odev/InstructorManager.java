package gun3Odev;

public class InstructorManager extends UserManager{

	@Override
	public void add(User instructor) {		
		super.add(instructor);
		System.out.println("E�itmen eklendi: " + instructor.getEmail());
	}

	@Override
	public void remove(User instructor) {		
		super.remove(instructor);
		System.out.println("E�itmen silindi.");
	}
	
	public void addAbout(Instructor instructor, String About) {
		instructor.setAbout(About);
		System.out.println("E�itmenin sertifikalar� eklendi: " + instructor.getAbout());
	}
	

}
