package project;

import java.io.Serializable;

public class Student implements Serializable{
	 String name;
	static int roll;
	 Double fees;
	static String clg;
	int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public double getFees() {
		return fees;
	}
	public void setFees(double  fees) {
		this.fees = fees;
	}
	public String getClg() {
		return clg;
	}
	public void setClg(String clg) {
		this.clg = clg;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
}
	