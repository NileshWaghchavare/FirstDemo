//WAP-1. I have student class. You have to restricts the user from creating  the object of student class from outside(other class), write the code for it.
public class Student {
	int RoolNumber;
	//private Student{
		
	//}
	public static void main(String[] args) {
		Student student = new Student();
	}
}


//Ans-We cant create a object of student class due to constractor is private.