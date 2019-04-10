package infinityStone.controllers.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JarvisController {
	
	@GetMapping("/")
	public String defaultMap() {
		return "index";
	}

	@PostMapping("/jarvis")
	public String helloIronMan(@RequestParam String whatDoYouSee, Model model) {
		model.addAttribute("name" + whatDoYouSee);
		if(whatDoYouSee.toLowerCase().contains("stark"))
			return "ironMan";
		else
			return "thanos";
	}
}
