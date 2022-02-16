package Hibernate.ManyToMany;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
@Entity
public class Laptop3 {


	@Id
	private  int idlap;
	private String model;
	@ManyToMany
	private List<Student3> student=new ArrayList<Student3>();
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
	public List<Student3> getStudent() {
		return student;
	}
	public void setStudent(List<Student3> student) {
		this.student = student;
	}
}
