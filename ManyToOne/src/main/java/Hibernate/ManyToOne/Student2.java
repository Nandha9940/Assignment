package Hibernate.ManyToOne;

import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student2 {
	@Id

	private int stid;
	private String stname;
	private int marks;
@OneToMany(mappedBy ="student")
private List<Laptop2> laptop=new ArrayList<Laptop2>();

	public List<Laptop2> getLaptop() {
		return laptop;
	}

	public void setLaptop(List<Laptop2> laptop) {
		this.laptop = laptop;
	}

	public int getStid() {
		return stid;
	}

	public void setStid(int stid) {
		this.stid = stid;
	}

	public String getStname() {
		return stname;
	}

	public void setStname(String stname) {
		this.stname = stname;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

}
