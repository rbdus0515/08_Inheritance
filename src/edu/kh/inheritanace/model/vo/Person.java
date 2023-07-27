package edu.kh.inheritanace.model.vo;

public class Person {
	
	// 필드
	private String name; // 이름
	private int age; // 나이
	private String nationality; // 국적
	
	// 생성자
	
	// 기본 생성자
	public Person() {}
	
	// 매개변수 생성자
	// 매개변수의 개수, 순서, 타입 이 달라야 오버로딩 가능
	public Person(String name, int age, String nationality) {
		
		// this 참조변수
		this.name = name;
		this.age = age;
		this.nationality = nationality;
	}

	// 메서드
	// getter / setter
	
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
	
	public String getNationality() {
		return nationality;
	}
	
	public void setNationality(String nationality) {
		this.nationality = nationality;
	}
	

	public void breath() {
		System.out.println("사람은 코나 입으로 숨을 쉰다.");
	}
	
	public void move() {
		System.out.println("사람은 움직일 수 있다.");
	}
	
	@Override
	public String toString() {
		return name + " / " + age + " / " + nationality;
	}
	
}




























