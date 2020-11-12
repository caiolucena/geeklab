package model;

public class User {
	private String id;
	private String name;
	private int age;
	private String currentJob;
	
	public User(String id, String name, int age, String currentJob) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.currentJob = currentJob;
	}
	
	public String getId() {		
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getCurrentJob() {
		return currentJob;
	}
	public void setCurrentJob(String currentJob) {
		this.currentJob = currentJob;
	}	
	
}
