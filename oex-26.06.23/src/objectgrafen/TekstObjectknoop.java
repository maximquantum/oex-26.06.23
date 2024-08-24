package objectgrafen;

public class TekstObjectknoop extends Objectknoop {
	
	String tekstinhoud;
	
	public String getTekstinhoud() { return tekstinhoud; }
	
	/**
	 * @post | getTekstinhoud() == tekstinhoud
	 */
	public TekstObjectknoop(String tekstinhoud) {
		this.tekstinhoud = tekstinhoud;
	}

}
