package fr.wildcodeschool.thewizardproject.controllers;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import fr.wildcodeschool.thewizardproject.sorciers.WizardInterface;

public class App {
	
	public void start() {
		
		  ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath*:applicationWizard.xml");
	        WizardInterface myWizard = context.getBean("HarryPotter", WizardInterface.class);
	        context.close();
	        
	        System.out.println("");
	        System.out.println("******************");
	        System.out.println(myWizard.giveAdvice());
	        System.out.println("******************");
	        System.out.println(myWizard.changeDress());
	        System.out.println("******************");
	       
	}

}
