package Hibernate.ManyToMany;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;


@Entity

public class Student3 {
	@Id
private int stid;
private String stname;
private int marks;
@ManyToMany(mappedBy = "student")
private List<Laptop3> lap=new ArrayList<Laptop3>();
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
public List<Laptop3> getLap() {
	return lap;
}
public void setLap(List<Laptop3> lap) {
	this.lap = lap;
}
}
