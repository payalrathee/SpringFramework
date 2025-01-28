package spring.SpringPractice;

import java.util.*;

public class Employee {

	private int id;
	private String name;
	private List<String> projects;
	private Set<Address> adrs;
	private Map<String,String> skills;
	private Properties exp;
	private Employee manager;
	
	public Employee() {
		System.out.println("Employee constr");
	}

	public Employee(int id, String name, List<String> projects, Set<Address> adrs, Map<String, String> skills,
			Properties exp, Employee manager) {
		super();
		this.id = id;
		this.name = name;
		this.projects = projects;
		this.adrs = adrs;
		this.skills = skills;
		this.exp = exp;
		this.manager = manager;
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

	public List<String> getProjects() {
		return projects;
	}

	public void setProjects(List<String> projects) {
		this.projects = projects;
	}

	
	public Set<Address> getAdrs() {
		return adrs;
	}

	public void setAdrs(Set<Address> adrs) {
		this.adrs = adrs;
	}

	public Map<String, String> getSkills() {
		return skills;
	}

	public void setSkills(Map<String, String> skills) {
		this.skills = skills;
	}

	public Properties getExp() {
		return exp;
	}

	public void setExp(Properties exp) {
		this.exp = exp;
	}
	

	public Employee getManager() {
		return manager;
	}

	public void setManager(Employee manager) {
		this.manager = manager;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", projects=" + projects + ", adrs=" + adrs + ", skills="
				+ skills + ", exp=" + exp + ", manager=" + manager + "]";
	}

	
	
	
}
