package gun3Odev;

public class InstructorManager extends UserManager{

	@Override
	public void add(User instructor) {		
		super.add(instructor);
		System.out.println("Eðitmen eklendi: " + instructor.getEmail());
	}

	@Override
	public void remove(User instructor) {		
		super.remove(instructor);
		System.out.println("Eðitmen silindi.");
	}
	
	public void addAbout(Instructor instructor, String About) {
		instructor.setAbout(About);
		System.out.println("Eðitmenin sertifikalarý eklendi: " + instructor.getAbout());
	}
	

}
