package com.projetAgile.ubo;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.projetAgile.ubo.Entities.Formation;
import com.projetAgile.ubo.Repositories.FormationRepository;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableSwagger2
@SpringBootApplication
public class UboApplication implements CommandLineRunner  {
	@Autowired 
	private FormationRepository formationRepository;

	public static void main(String[] args) {
		SpringApplication.run(UboApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		formationRepository.save(new Formation("code2", "l", new Date(), new Date() , "o", 1, "nomFormation2"));
		formationRepository.save(new Formation("code1", "m",new Date(), new Date() , "o", 2, "nomFormation1"));
		formationRepository.findAll().forEach(f->{
			 System.out.println(f.toString() );
		});

	}

}
