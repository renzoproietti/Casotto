package SecondaIterazione.Modello_di_Progetto;

import PrimaIterazione.ModelloDiProgetto.*;

public class AttivitāServiceImpl implements AttivitāService {

	private AttivitāRepository attivitāRepository;
	private AttivitāService attivitāService;

	/**
	 * 
	 * @param idAttivitā
	 * @param name
	 * @param description
	 * @param maxPartecipants
	 * @param actualPartecipants
	 * @param date
	 * @param hour
	 */
	public Attivitā createAttivitā(string idAttivitā, string name, string description, int maxPartecipants, int actualPartecipants, Date date, Hour hour) {
		// TODO - implement AttivitāServiceImpl.createAttivitā
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param idAttivitā
	 */
	public void deleteAttivitā(string idAttivitā) {
		// TODO - implement AttivitāServiceImpl.deleteAttivitā
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param idAttivitā
	 */
	public Attivitā getAttivitā(string idAttivitā) {
		// TODO - implement AttivitāServiceImpl.getAttivitā
		throw new UnsupportedOperationException();
	}

	public List<Attivitā> getAllAttivitā() {
		// TODO - implement AttivitāServiceImpl.getAllAttivitā
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param idCliente
	 */
	public void addCliente(string idCliente) {
		// TODO - implement AttivitāServiceImpl.addCliente
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param idCliente
	 */
	public void removeCliente(string idCliente) {
		// TODO - implement AttivitāServiceImpl.removeCliente
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param date
	 */
	public List<Attivitā> getAttivitāByDate(Date date) {
		// TODO - implement AttivitāServiceImpl.getAttivitāByDate
		throw new UnsupportedOperationException();
	}

}