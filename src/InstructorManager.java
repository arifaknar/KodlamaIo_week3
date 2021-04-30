
public class InstructorManager extends UserManager {
	
	public void singUp(Instructor instructor) {
		System.out.println(instructor.getFirstName()+" "+instructor.getLastName()+" kodlama.io sitesine kaydýnýz baþarý ile yapýlmýþtýr.");
	}
	
	public void removeAccount(Instructor instructor) {
		System.out.println(instructor.getFirstName()+" "+instructor.getLastName()+" kodlama.io sitesine kaydýnýz silinmiþtir.");
	}
	
	public void addCources(Instructor instructor) {
		
		System.out.println(instructor.getFirstName()+" "+instructor.getLastName()+" adlý eðitmenin "+instructor.getWriteCources()+
		" adlý kursu baþarý ile oluþturulmuþtur.");
	}
	
	public void removeCources(Instructor instructor) {
		
		System.out.println(instructor.getFirstName()+" "+instructor.getLastName()+" adlý eðitmenin "+instructor.getWriteCources()+
		" adlý kursu silinmiþtir.");
	}

}
