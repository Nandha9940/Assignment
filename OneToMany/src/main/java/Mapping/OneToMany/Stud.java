package Mapping.OneToMany;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Stud {
	@Id
private int stid;
private String stname;
private int marks;
@OneToMany
private List<Lap> lap=new ArrayList<Lap>();
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
public List<Lap> getLap() {
	return lap;
}
public void setLap(List<Lap> lap) {
	this.lap = lap;
}
public void setMarks(int marks) {
	this.marks = marks;
}

}