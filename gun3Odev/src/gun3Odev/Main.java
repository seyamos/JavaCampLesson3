package gun3Odev;

public class Main {

	public static void main(String[] args) {
		
		Student student1 = new Student(1, "seyda@seyda.com", "1234", "�eyda", "Erbay", "�stanbul");		
		Instructor instructor1 = new Instructor(1, "engin@gmail.com","1234", "Engin ", "Demiro�", "MCT,PMP, ITIL", "Foto1");
				
		System.out.println("��renci Operasyonlar�:");
		StudentManager studentManager = new StudentManager();
		studentManager.add(student1);		
		studentManager.addAddress(student1, " �stanbul");
		
		System.out.println("----------------------------");
		
		System.out.println("E�itmen Operasyonlar�:");
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.add(instructor1);
		instructorManager.addAbout(instructor1, "MCT,PMP,ITIL");
		
		
		
		
	}

}
