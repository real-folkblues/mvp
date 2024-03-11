package org.launchcode.mvp;


//import org.launchcode.mvp.data.KanjiRepository;
//import org.launchcode.mvp.models.Kanji;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.CommandLineRunner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MvpApplication {



	public static void main ( String[] args ) {
		SpringApplication.run (MvpApplication.class, args);
	}
}

//public class MvpApplication implements CommandLineRunner {

//	public static void main(String[] args) {
//		SpringApplication.run(MvpApplication.class, args);
//	}

//	@Autowired
//	private KanjiRepository kanjiRepository;
//
//
//	public MvpApplication(KanjiRepository kanjiRepository) {
//		this.kanjiRepository = kanjiRepository;
//	}
//
//	@Override
//	public void run(String... args) throws Exception {
//
//	}

