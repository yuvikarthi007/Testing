package interfaceConcept;

import InjectionConcept.FortuneService;

public class BaseBallCoach implements Coach {

	private FortuneService fortuneService;
	
	public BaseBallCoach(FortuneService theFortuneService) {
		fortuneService= theFortuneService;
	}
	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("happy me");
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
		
	}
	@Override
	public String getEmailAddress() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public String getTeam() {
		// TODO Auto-generated method stub
		return null;
	}

}
