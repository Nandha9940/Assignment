package Hibernate.ManyToOne;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
@Entity
public class Laptop2 {
	@Id
	private int idlap;
	private String model;
	
	@ManyToOne
	private Student2 student;

	public int getIdlap() {
		return idlap;
	}

	public void setIdlap(int idlap) {
		this.idlap = idlap;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public Student2 getStudent() {
		return student;
	}

	public void setStudent(Student2 student) {
		this.student = student;
	}



}
