package PrimaIterazione.ModelloDiProgetto;

public class Attivitą {

	private string idAttivitą;
	private string name;
	private string description;
	private int maxParticipants;
	private int actualParticipants;
	private Date date;
	private Hour hour;

	public string getIdAttivitą() {
		return this.idAttivitą;
	}

	public string getName() {
		return this.name;
	}

	public string getDescription() {
		return this.description;
	}

	public int getMaxParticipants() {
		return this.maxParticipants;
	}

	public int getActualParticipants() {
		return this.actualParticipants;
	}

	public Date getDate() {
		return this.date;
	}

	public Hour getHour() {
		return this.hour;
	}

	/**
	 * 
	 * @param idAttivitą
	 */
	public void setId(string idAttivitą) {
		// TODO - implement Attivitą.setId
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param name
	 */
	public void setName(string name) {
		this.name = name;
	}

	/**
	 * 
	 * @param description
	 */
	public void setDescription(string description) {
		this.description = description;
	}

	/**
	 * 
	 * @param maxPartecipants
	 */
	public void setMaxPartecipants(int maxPartecipants) {
		// TODO - implement Attivitą.setMaxPartecipants
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param actualPartecipants
	 */
	public void setActualPartecipants(int actualPartecipants) {
		// TODO - implement Attivitą.setActualPartecipants
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param date
	 */
	public void setDate(Date date) {
		this.date = date;
	}

	/**
	 * 
	 * @param hour
	 */
	public void setHour(Hour hour) {
		this.hour = hour;
	}

}