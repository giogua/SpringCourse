package de.reply.rvl.SpringCourse;

import java.util.Random;

public class RandomFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		String[] fortunes= {"This is the fortune #1","This is the fortune #2","This is the fortune #3"};
		Random rand = new Random();
		return fortunes[rand.nextInt(3)];
	}

}
