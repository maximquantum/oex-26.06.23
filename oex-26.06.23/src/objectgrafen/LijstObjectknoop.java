package objectgrafen;

import java.util.ArrayList;
import java.util.List;

public class LijstObjectknoop extends Objectknoop {
	
	/**
	 * @representationObject
	 */
	List<Objectknoop> reeks = new ArrayList<>();
	
	/**
	 * @creates | result
	 * @peerObjects
	 */
	public List<Objectknoop> getReeks() { return List.copyOf(reeks); }
	
	public LijstObjectknoop() { reeks = new ArrayList<>(0); }
	
	/**
	 * @pre | index <= getReeks().size()
	 */
	public void insertObjectknoop(Objectknoop objectknoop, int index) {
		reeks.add(index, objectknoop);
	}
	
	/**
	 * @pre | index <= getReeks().size()
	 */
	public void removeObjectknoop(Objectknoop objectknoop, int index) {
		reeks.remove(index);
	}

}
