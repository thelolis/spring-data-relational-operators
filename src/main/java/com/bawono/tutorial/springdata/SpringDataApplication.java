package com.bawono.tutorial.springdata;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.bawono.tutorial.springdata.model.Pemain;
import com.bawono.tutorial.springdata.repository.PemainRepository;

@SpringBootApplication
public class SpringDataApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringDataApplication.class, args);
		PemainRepository pemainrepository = context.getBean(PemainRepository.class);
		System.out.println("Perintah OR");
		for (Pemain contohLike : pemainrepository.findByNamaContainingOrNamaContaining("Toure", "an")) {
			System.out.println(contohLike);
		}
		System.out.println("Perintah AND");
		for (Pemain contohLike : pemainrepository.findByNamaLikeAndUsiaEquals("%Toure%", 36)) {
			System.out.println(contohLike);
		}
		System.out.println("Perintah LessThan");
		for (Pemain contohLike : pemainrepository.findByNamaKesebelasanNot("Real Madrid")) {
			System.out.println(contohLike);
		}
		
	}
}
