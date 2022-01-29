package fr.mc.monvoisinkevin.BackendMineralcontest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class MineralContestBackendApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(MineralContestBackendApplication.class, args);
	}

	@GetMapping
	@ResponseBody
	public String currentUserName() {
		return "Hello world";
	}
}
