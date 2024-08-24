package objectgrafen;

import java.util.HashSet;
import java.util.Set;

public class Objectknoop {
	
	/**
	 * @invar | verwijzers != null
	 * @invar | verwijzers.stream().allMatch(l -> l != null && l.reeks.contains(this))
	 * 
	 * @representationObject
	 * @peerObjects
	 */
	Set<LijstObjectknoop> verwijzers = new HashSet<>();
	
	/**
	 * @creates | result
	 * @peerObjects
	 */
	public Set<LijstObjectknoop> getVerwijzers() { return Set.copyOf(verwijzers); }

}
