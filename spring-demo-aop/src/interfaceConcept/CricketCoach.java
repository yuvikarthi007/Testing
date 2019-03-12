package interfaceConcept;

import InjectionConcept.FortuneService;

public class CricketCoach implements Coach{

	private FortuneService fortuneService;
	
	private String emailAddress;
	
	private String team;
	
	
	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		this.team = team;
	}

	public CricketCoach(){
		System.out.println("inside no arg constructor");
		
	}
	
	public void setFortuneService(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return this.fortuneService.getFortune();
	}
	
	public void startCoaching() {
		System.out.println("started coaching");
	}
	public void endCoaching() {
		System.out.println("end coaching");
	}
	

}
