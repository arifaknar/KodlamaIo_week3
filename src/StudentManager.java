
public class StudentManager extends UserManager {
	
	public void singUp(Student student) {
		System.out.println(student.getFirstName()+" kodlama.io sitesine kayd�n�z ba�ar� ile yap�lm��t�r.");
	}
	
	public void removeAccount(Student student) {
		System.out.println(student.getFirstName()+" kodlama.io sitesine kayd�n�z silinmi�tir.");
	}
	
	public void joinCources(Student student) {
		
		System.out.println(student.getFirstName()+" "+" adl� ��rencinin "+student.getMyCourse()+
		" adl� kursa kayd� ba�ar� ile yap�lm��t�r.");
	}
	
	public void removeCources(Student student) {
		
		System.out.println(student.getFirstName()+" "+
		" adl� ��rencinin+"+ student.getMyCourse() +" kursundan kayd� silinmi�tir.");
	}

}
