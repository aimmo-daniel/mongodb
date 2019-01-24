package com.sangjin.mongodb;

import com.sangjin.mongodb.account.Account;
import com.sangjin.mongodb.account.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.mongodb.core.MongoTemplate;

@SpringBootApplication
public class MongodbApplication {

	@Autowired
	MongoTemplate mongoTemplate;

	@Autowired
	AccountRepository accountRepository;

	public static void main(String[] args) {
		SpringApplication.run(MongodbApplication.class, args);
	}

	@Bean
	public ApplicationRunner applicationRunner() {
		return args -> {
			Account account = new Account();
			account.setEmail("tkdwlsdlzzz@gmail.com");
			account.setUsername("sangjin2");
			accountRepository.insert(account);

			System.out.println("finished");

		};
	}

}

