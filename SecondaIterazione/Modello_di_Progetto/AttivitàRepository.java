package SecondaIterazione.Modello_di_Progetto;

import PrimaIterazione.ModelloDiProgetto.*;

public interface AttivitÓRepository {

	/**
	 * 
	 * @param a
	 */
	void save(AttivitÓ a);

	List<AttivitÓ> findAll();

	/**
	 * 
	 * @param id
	 */
	AttivitÓ findById(string id);

	/**
	 * 
	 * @param a
	 */
	void delete(AttivitÓ a);

}