
public class InstructorManager extends UserManager {
	
	public void singUp(Instructor instructor) {
		System.out.println(instructor.getFirstName()+" "+instructor.getLastName()+" kodlama.io sitesine kayd�n�z ba�ar� ile yap�lm��t�r.");
	}
	
	public void removeAccount(Instructor instructor) {
		System.out.println(instructor.getFirstName()+" "+instructor.getLastName()+" kodlama.io sitesine kayd�n�z silinmi�tir.");
	}
	
	public void addCources(Instructor instructor) {
		
		System.out.println(instructor.getFirstName()+" "+instructor.getLastName()+" adl� e�itmenin "+instructor.getWriteCources()+
		" adl� kursu ba�ar� ile olu�turulmu�tur.");
	}
	
	public void removeCources(Instructor instructor) {
		
		System.out.println(instructor.getFirstName()+" "+instructor.getLastName()+" adl� e�itmenin "+instructor.getWriteCources()+
		" adl� kursu silinmi�tir.");
	}

}
