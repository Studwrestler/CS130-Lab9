package lab9;

public class Student {
	private String name;
	private int age;
	private String major;
	private String hobby;
	private double gpa;
	private int time_spent_learning;
	public Student() {
		this.name=" ";
		this.age=0;
		this.major=" ";
		this.hobby=" ";
		this.gpa=0;
		this.time_spent_learning=0;
		
	}
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
	public String HonorsEligible() {
		String Honors;
		if(gpa>=3.5)
			Honors="true";
		else
			Honors="false";
		return Honors;
	}
	public static void main(String[]args) {
		Student student2 = new Student();
		student2.setName("Mitch");
		student2.setAge(20);
		student2.setMajor("CS");
		student2.setHobby("Basket Ball");
		student2.setGpa(3.4);
		student2.setTimeSpentLearning(1);
		
		System.out.println(student2.getName());
		System.out.println(student2.getAge());
		System.out.println(student2.getMajor());
		System.out.println(student2.getHobby());
		System.out.println(student2.getGpa());
		System.out.println("Hours spent learning:" + student2.getTimeSpentLearning());
		System.out.println("Honors check: "+ student2.HonorsEligible());
		
		Student student1= new Student("Harry", 19 , "CE","Football", 3.8, 2);
		System.out.println(student1.name);
		System.out.println(student1.age);
		System.out.println(student1.major);
		System.out.println(student1.hobby);
		System.out.println(student1.gpa);
		System.out.println("Hours spent learning: " +  student1.time_spent_learning);
		System.out.println("Honors check: "+ student1.HonorsEligible());
		
	}
}
