package Mapping.OneToMany;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Lap {
	@Id
	private  int idlap;
	private String model;
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

}
