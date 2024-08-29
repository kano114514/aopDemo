package com.example.demo;

import com.example.demo.service.RunSomething;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoApplicationTests {

	@Autowired
	private RunSomething runsomething;
	@Test
	void contextLoads() {
		runsomething.run();
	}

}
