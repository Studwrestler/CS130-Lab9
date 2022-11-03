package lab9;

public class Student {
	String name;
	int age;
	String major;
	String hobby;
	double gpa;
	int time_spent_learning;
	public Student(String name, int age, String major, String hobby, double gpa, int time_spent_learning) {
		this.name=name;
		this.age=age;
		this.major=major;
		this.hobby=hobby;
		this.gpa=gpa;
		this.time_spent_learning=time_spent_learning;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public String getMajor() {
		return major;
	}
	public String getHobby() {
		return hobby;
	}
	public double getGpa() {
		return gpa;
	}
	public int getTimeSpentLearning() {
		return time_spent_learning;
	}
	public void setName(String name) {
		this.name=name;
	}
	public void setAge(int age) {
		this.age=age;
	}
	public void setMajor(String major) {
		this.major=major;
	}
	public void setHobby(String hobby) {
		this.hobby=hobby;
	}
	public void setGpa(double gpa) {
		this.gpa=gpa;
	}
	public void setTimeSpentLearning(int time_spent_learning) {
		this.time_spent_learning=time_spent_learning;
	}
	public static void HonorsEligible(double gpa) {
		if(gpa>=3.5)
			System.out.println("Honors Eligible");
		else
			System.out.println("Not Honors Eligible");
	}
	public static void main(String[]args) {
		Student student1= new Student("Harry", 19 , "CE","Football", 3.8, 2);
		System.out.println(student1.name);
		System.out.println(student1.age);
		System.out.println(student1.major);
		System.out.println(student1.hobby);
		System.out.println(student1.gpa);
		System.out.println(student1.time_spent_learning);
		
		student1.setAge(20);
		student1.setMajor("CS");
		student1.setGpa(3.5);
		
		System.out.println(student1.getAge());
		System.out.println(student1.getMajor());
		System.out.println(student1.getGpa());
		HonorsEligible(student1.gpa);
	}
}
