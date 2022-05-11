package SecondaIterazione.Modello_di_Progetto;

public interface PiattoRepository {

	/**
	 * 
	 * @param p
	 */
	void save(Piatto p);

	List<Piatto> findAll();

	/**
	 * 
	 * @param id
	 */
	Piatto findById(String id);

	/**
	 * 
	 * @param p
	 */
	void delete(Piatto p);

}