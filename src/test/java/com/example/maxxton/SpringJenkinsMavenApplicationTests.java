package com.example.maxxton;

import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class SpringJenkinsMavenApplicationTests {

  @Mock
  private HelloWorldController helloWorldController;

	@Test
	void contextLoads() {
	}

  @Test
  public void testHelloWorld() {
    String result = helloWorldController.getHelloWorld();
    assertEquals("Hello World!", result);
  }

}
