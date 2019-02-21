package project;

public class Batch {

	public static void main(String[] args) {
		
		Student s1=new Student();
		Student s2=new Student();
		Student s3=new Student();
		s1.setName("ravi");
		s1.setRoll(100);
		s1.setClg("vjit");
		s1.setFees(9000);
		s2.setName("tharak");
		s2.setRoll(200);
		s2.setClg("cvsr");
		s2.setFees(2000);
System.out.println(s1.getName());
System.out.println(s1.getRoll());
System.out.println(s1.getAge());
System.out.println(s1.getClg());
System.out.println(s1.getFees());
System.out.println(s2.getName());
System.out.println(s2.getRoll());
System.out.println(s2.getAge());
System.out.println(s2.getClg());
System.out.println(s2.getFees());

}
}
