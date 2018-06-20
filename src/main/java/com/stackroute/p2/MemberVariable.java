package com.stackroute.p2;

 class Member {
   
	private String name ;
	private int age;
	private int salary;
	public Member() {};
	public Member(String nameInput,int ageInput,int salary){
		this.name=nameInput;
		this.age=ageInput;
		this.salary=salary;
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
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	@Override
    public String toString() {
        return "Member [name=" + name + ", age=" + age + ", salary=" + salary + "]";
    }
}
class MemberVariable{
//	public static void main(String[] args) {
    public Member createMemberInstance(String name,int age,int salary) {
        return new Member(name,age,salary);
        }
//	public void display() {
//		Member mem=new Member("abhishek",24,800000);
//		System.out.println("Members Name "+mem.getName());
//		System.out.println("Members Age "+mem.getAge());
//		System.out.println("Members Salary "+mem.getSalary());
//	
//	}
}


