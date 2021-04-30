
public class Main {

	public static void main(String[] args) {
		
		Instructor user1=new Instructor();
		user1.setFirstName("Engin");
		user1.setLastName("Demiroğ");
		user1.setBirtDate("1/1/2021");
		user1.setEmail("engindemirog@kodlama.io");
		user1.setAdress("İstanbul");
		user1.setWriteCources("Java/React");
		user1.setCourceTime("16 Week");
		
		Student user2=new Student();
		user2.setFirstName("arif");
		user2.setLastName("a");
		user2.setBirtDate("1/1/2021");
		user2.setEmail("a123@outlook.com");
		user2.setAdress("İstanbul");
		user2.setCreditCardNumber("1111 1111 1111 11");
		user2.setMyCourse("Java/React");
		
		UserManager userManager=new UserManager();
		InstructorManager instructorManager=new InstructorManager();
		StudentManager studentManager=new StudentManager();
		
		instructorManager.singUp(user1);
		instructorManager.addCources(user1);
		studentManager.joinCources(user2);
		studentManager.removeCources(user2);
		instructorManager.removeCources(user1);
		studentManager.removeAccount(user2);
		instructorManager.removeAccount(user1);
		studentManager.singUp(user2);
		
		
		
		
		
		
	}

}
