package gun3Odev;

public class StudentManager extends UserManager{

	@Override
	public void add(User student) {
		super.add(student);
		System.out.println("Öğrenci eklendi: " + student.getEmail());
	}

	@Override
	public void remove(User student) {
		super.remove(student);
		System.out.println("Öğrenci silindi: " + student.getEmail());
	}
	
	public void addAddress(Student student, String address) {
		student.setAddress(address);
		System.out.println("Öğrencinin adresi eklendi: " + student.getAddress());
		
	}

	
	
}
