package com.basics.learn.standaloneapp;

import com.basics.learn.standaloneapp.services.PrinterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StandaloneAppApplication implements CommandLineRunner {

	@Autowired
	PrinterService printerService;

	public static void main(String[] args) {

		SpringApplication.run(StandaloneAppApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		printerService.printMessage(args);
	}
}
