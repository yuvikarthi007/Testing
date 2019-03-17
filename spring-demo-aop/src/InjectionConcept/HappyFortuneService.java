package InjectionConcept;

public class HappyFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		// TODO Auto-generated method stub
		System.out.println("fortunenew sample");
		System.out.println("fortunenew sample1");
		return "good";
	}

	@Override
	public String buyFortune() {
		// TODO Auto-generated method stub
		System.out.println("buy sample");
		System.out.println("buy sample1");
		return "good";
	}
}
