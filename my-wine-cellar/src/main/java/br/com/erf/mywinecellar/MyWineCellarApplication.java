package br.com.erf.mywinecellar;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MyWineCellarApplication {
	public String PORT = System.getenv( "PORT");
	public String URI = System.getenv( "URI");

	public static void main(String[] args) {
		SpringApplication.run(MyWineCellarApplication.class, args);
	}

}
