
public class StudentManager extends UserManager {
	
	public void SingUp(Student student) {
		System.out.println(student.getFirstName()+" kodlama.io sitesine kaydýnýz baþarý ile yapýlmýþtýr.");
	}
	
	public void RemoveAccount(Student student) {
		System.out.println(student.getFirstName()+" kodlama.io sitesine kaydýnýz silinmiþtir.");
	}
	
	public void JoinCources(Student student) {
		
		System.out.println(student.getFirstName()+" "+" adlý öðrencinin "+student.getMyCourse()+
		" adlý kursa kaydý baþarý ile yapýlmýþtýr.");
	}
	
	public void RemoveCources(Student student) {
		
		System.out.println(student.getFirstName()+" "+
		" adlý öðrencinin+"+ student.getMyCourse() +" kursundan kaydý silinmiþtir.");
	}

}
