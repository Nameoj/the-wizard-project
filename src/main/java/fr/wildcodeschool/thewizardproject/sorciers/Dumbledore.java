package fr.wildcodeschool.thewizardproject.sorciers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("HarryPotter")
public class Dumbledore implements WizardInterface {
	
	private OutFit myOutFit;
	
	@Autowired
	public Dumbledore(OutFit theOutFit) {
		
		myOutFit = theOutFit;
		
	}
	
	@Override
	public String giveAdvice() {
		
		return "La peur d'un nom ne fait qu'accroître la peur de la chose elle-même";
		
	}

	@Override
	public String changeDress() {
		// TODO Auto-generated method stub
		return this.myOutFit.change();
	}
	

}
