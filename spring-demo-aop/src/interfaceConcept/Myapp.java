package interfaceConcept;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Myapp {

	public static void main(String[] args) {
//		Coach c=new BaseBallCoach();
//		c.print();
		ClassPathXmlApplicationContext context =new 
				ClassPathXmlApplicationContext("initMethodConcept.xml");
		Coach c=context.getBean("myApp",Coach.class);
//		Coach d=context.getBean("myApp",Coach.class);
//		boolean result =(c==d);
//		System.out.println("Same instance" +result);
//		System.out.println("location1" +c);
//		System.out.println("location1" +d);
//		
//		c.print();
		System.out.println("myFortune is "+c.getDailyFortune());
//		System.out.println("emailAddress"+c.getEmailAddress());
//		System.out.println("team name is"+c.getTeam());
		context.close();

	}

}
