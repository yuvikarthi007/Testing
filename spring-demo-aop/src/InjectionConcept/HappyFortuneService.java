package InjectionConcept;

public class HappyFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		// TODO Auto-generated method stub
		System.out.println("fortunenew sample3");
		
		return "good";
	}

}
