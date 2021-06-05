package hc;
public class ClinicalHistory {
    /**
	 * Attributes of ClinicalHistory
	 */
    private String code;
	private String date;
	private String idPacient;
	private String idDoctor;
	private String observations;
 
    /**
	 * Definition Constructor
	 */
	public ClinicalHistory(String code, String date, String idPacient,
    String idDoctor, String observations) {
        this.code = code;
        this.date = date;
        this.idPacient = idPacient;
        this.idDoctor = idDoctor;
        this.observations = observations;
    }      

    /**
    * Definition Get of Attributes
    */
    public String getCode() {
        return code;        
    }
    public String getDate() {
        return date;
    }
    public String getIdPacient() {
        return idPacient;
    }
    public String getIdDoctor() {
        return idDoctor;
    }
    public String getObservations() {
    return observations;
}


    /**
    * Definition Set of Attributes
    */
    public void setCode(String code) {
        this.code = code;
    }
    public void setDate(String date) {
        this.date = date;
    }
    public void setIdPacient(String idPacient) {
        this.idPacient = idPacient;
    }
    public void setIdDoctor(String idDoctor) {
        this.idDoctor = idDoctor;
    }
    public void setObservations(String observations) {
        this.observations = observations;
    }

    /**
    * Displays by console all the data of the ClinicalHistory
    */
    @Override
	public String toString() {
		return "ClinicalHistory [History Code:  "+ this.code + " date=" + this.date + ", idPacient=" + this.idPacient + ", idDoctor="
				+ this.idDoctor + ", observations=" + this.observations + "]";
	}
}

