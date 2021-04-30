
public class StudentManager extends UserManager {
	
	public void singUp(Student student) {
		System.out.println(student.getFirstName()+" kodlama.io sitesine kaydýnýz baþarý ile yapýlmýþtýr.");
	}
	
	public void removeAccount(Student student) {
		System.out.println(student.getFirstName()+" kodlama.io sitesine kaydýnýz silinmiþtir.");
	}
	
	public void joinCources(Student student) {
		
		System.out.println(student.getFirstName()+" "+" adlý öðrencinin "+student.getMyCourse()+
		" adlý kursa kaydý baþarý ile yapýlmýþtýr.");
	}
	
	public void removeCources(Student student) {
		
		System.out.println(student.getFirstName()+" "+
		" adlý öðrencinin+"+ student.getMyCourse() +" kursundan kaydý silinmiþtir.");
	}

}
