package endava.TicketManagementSystem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@ComponentScan(basePackages = {"endava.TicketManagementSystem"})
public class TicketManagementSystemApplication {

	public static void main(String[] args) {

		SpringApplication.run(TicketManagementSystemApplication.class, args);
	}


}
