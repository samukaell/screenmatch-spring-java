package br.com.alura.screenmatch;

import org.junit.jupiter.api.Test;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;

@SpringBootTest
class ScreenmatchApplicationTests implements CommandLineRunner {

	@Test
	void contextLoads() {
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Hello world! XD");
	}
}
