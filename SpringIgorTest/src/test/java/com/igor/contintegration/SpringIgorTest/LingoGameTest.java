   package com.igor.contintegration.SpringIgorTest;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.igor.contintegration.SpringIgorTest.classes.LingoGame;

public class LingoGameTest {

	private ApplicationContext ctx;
	
	@Before
	public void setUp() throws Exception {
		ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
	}

	@Test
	public void test() {
//		fail("Not yet implemented");
		LingoGame lGame = (LingoGame) ctx.getBean("myLirgoGame");
		lGame.startGame();
	}

}
