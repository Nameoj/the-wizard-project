package fr.wildcodeschool.thewizardproject.sorciers;

public class Dumbledore implements WizardInterface {
	
	private OutFit myOutFit;
	
	@Override
	public String giveAdvice() {
		
		return "La peur d'un nom ne fait qu'accroître la peur de la chose elle-même";
		
	}
	
	public Dumbledore(OutFit theOutFit) {
		
		myOutFit = theOutFit;
	}
	

	@Override
	public String changeDress() {
		
		return myOutFit.change();
	}
}
