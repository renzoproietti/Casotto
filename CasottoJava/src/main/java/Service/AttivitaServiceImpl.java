package Service;


import Entity.Attivita;
import Repository.AttivitaRepository;


import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

public class AttivitaServiceImpl implements Service.AttivitaService {

	private AttivitaRepository attivitaRepository;
	private AttivitaService attivitaService;

	public AttivitaServiceImpl(AttivitaRepository attivitaRepository) {
		this.attivitaRepository = attivitaRepository;
	}

	/**
	 * 
	 * @param idAttivita
	 * @param name
	 * @param description
	 * @param maxPartecipants
	 * @param actualPartecipants
	 * @param date
	 * @param hour
	 */
	public Attivita createAttivita(String idAttivita, String name, String description, int maxPartecipants, int actualPartecipants, LocalDate date, LocalTime hour) {
		return new Attivita(idAttivita, name, description, maxPartecipants, actualPartecipants,date, hour);
	}

	/**
	 * 
	 * @param idAttivita
	 */
	public void deleteAttivita(String idAttivita) {
		Attivita attivita = attivitaRepository.findById(idAttivita);
		attivitaRepository.delete(attivita);
	}

	/**
	 * 
	 * @param idAttivita
	 */
	public Attivita getAttivita(String idAttivita) {
		return attivitaRepository.findById(idAttivita);
	}

	public List<Attivita> getAllAttivita() {
		return attivitaRepository.findAll();
	}

	@Override
	public void addAttivita(String idAttivita) {
		// TODO - implement AttivitaServiceImpl.addCliente
		throw new UnsupportedOperationException();
	}


	/**
	 * 
	 * @param idAttivita
	 */
	public void removeAttivita(String idAttivita) {
		// TODO - implement AttivitaServiceImpl.removeCliente
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param date
	 */
	public List<Attivita> getAttivitaByDate(LocalDate date) {
		return attivitaRepository.findAll().stream().filter(a -> a.getDate().isEqual(date)).toList();
	}

}