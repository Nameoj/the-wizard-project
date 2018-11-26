package fr.wildcodeschool.thewizardproject.sorciers;

public class Gandalf implements WizardInterface {
	
	private OutFit myOutFit;
	
	@Override
	public String giveAdvice() {
		
		return "VOUS NE PASSEREZ PAS !!!!!!!!!!";
		
	}
	
	public Gandalf(OutFit theOutFit) {
		
		myOutFit = theOutFit;
	}

	@Override
	public String changeDress() {
	
		return myOutFit.change();
	}
}
