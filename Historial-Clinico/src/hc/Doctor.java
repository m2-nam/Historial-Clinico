package hc;

public class Doctor {
	private String id;
    private String name;
    private String lastname;
    private String specialization;
    public Doctor(String id, String name, String lastname, String specialization) {
		this.id = id;
		this.name = name;
		this.lastname = lastname;
		this.specialization = specialization;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getlLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getSpecialization() {
		return specialization;
	}

	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}
	
	
	@Override
	public String toString() {
		return System.out.println("ID of the doctor: " + id + 
		"\nName: " + name + "\nLastname: " + lastname+
		"\nSpecialization: " + specialization);
	}
	
}
