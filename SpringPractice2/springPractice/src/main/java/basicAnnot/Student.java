package basicAnnot;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.HashMap;

@Component
public class Student {
	
	@Value("28278")
	private int id;
	private String name;
	private List<String> subjects;
	private HashMap<String, Integer> marks;
	@Value("#{address}")
	private Address address;
	
	public Student() {
		super();
	}

	public Student(int id, String name, List<String> subjects, HashMap<String, Integer> marks, Address address) {
		super();
		this.id = id;
		this.name = name;
		this.subjects = subjects;
		this.marks = marks;
		this.address = address;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<String> getSubjects() {
		return subjects;
	}

	public void setSubjects(List<String> subjects) {
		this.subjects = subjects;
	}

	public HashMap<String, Integer> getMarks() {
		return marks;
	}

	public void setMarks(HashMap<String, Integer> marks) {
		this.marks = marks;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", subjects=" + subjects + ", marks=" + marks + ", address="
				+ address + "]";
	}

	@PostConstruct
	public void initMethod() {
		System.out.println("init");
	}
	
	@PreDestroy
	public void destroyMethod() {
		System.out.println("destroy");
	}

	
}
