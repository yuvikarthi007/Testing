package InjectionConcept;

public class HappyFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		// TODO Auto-generated method stub
		System.out.println("fortunenew sample");
		System.out.println("fortunenew sample1");
		System.out.println("fortunenew sample2");
		return "good";
	}

}
