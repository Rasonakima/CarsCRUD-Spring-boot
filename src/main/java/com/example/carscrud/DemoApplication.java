package com.example.carscrud;

// import java.util.stream.Stream;

// import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
// import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	// @Bean ApplicationRunner init(CarRepository repository) { return args -> {
	// Stream.of("Ferrari", "Jaguar", "Porsche", "Lamborghini", "Bugatti",
	// "AMC Gremlin", "Triumph Stag", "Ford Pinto", "Yugo GV").forEach(name -> { Car
	// car = new Car(name); repository.save(car); });
	// repository.findAll().forEach(System.out::println); }; }

}
