package com.klapertart.elide;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan
public class SampleRestfulElideApplication {

	public static void main(String[] args) {
		SpringApplication.run(SampleRestfulElideApplication.class, args);
	}

}
