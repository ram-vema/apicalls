package com.example.apicalls;

import com.example.apicalls.dao.UserRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;



@SpringBootApplication
public class ApicallsApplication {

	public static void main(String[] args) {



		ConfigurableApplicationContext ApplicationContext = SpringApplication.run(ApicallsApplication.class, args);


		UserRepository UserRepository = ApplicationContext.getBean("userRepository", UserRepository.class);

	}
}








//		users user1=new users(5,"abc888","Active");
//		 List<users> activeUsers =  UserRepository.findByStatus("active");
//
//		for (users status:activeUsers)
//			  {
//				  System.out.println(status);
//		}
//		System.out.println(UserRepository.findById(2));
//		System.out.println(UserRepository.findByStatus("active"));

//		System.out.println(UserRepository.findByUseridAndPassword(1,"abc123"));
//		users save =UserRepository.save(user1);
//		List<users> all =UserRepository.findAll();
//		for (users users: all)
//			  {
//				  System.out.println(users);
//
//		}

