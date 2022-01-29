package fr.mc.monvoisinkevin.backendmineralcontest.api;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
@SpringBootApplication
public class MineralContestBackendApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(MineralContestBackendApplication.class, args);
	}

	@GetMapping("/api/getAllUrls")
	@ResponseBody
	public HashMap<String, String> currentUserName() {
		HashMap<String, String> urls = new HashMap<>();
		urls.put("api_workshop_list", "/api/workshop/list-files");
		urls.put("api_last_version_check", "/api/plugin/check-version");
		urls.put("api_get_current_version_messages", "/api/plugin/get-messages");
		urls.put("api_send_error", "/api/error/send");
		urls.put("api_send_metric", "/api/metrics");

		return urls;
	}
}
