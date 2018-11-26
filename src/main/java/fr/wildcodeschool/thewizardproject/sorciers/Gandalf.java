package fr.wildcodeschool.thewizardproject.sorciers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("Seigneur")
public class Gandalf implements WizardInterface {
	
	private OutFit myOutFit;
	
	@Override
	public String giveAdvice() {
		
		return "VOUS NE PASSEREZ PAS !!!!!!!!!!";
		
	}
	
	@Autowired
	public Gandalf(OutFit theOutFit) {
		
		myOutFit = theOutFit;
	}

	@Override
	public String changeDress() {
	
		return this.myOutFit.change();
	}
}
