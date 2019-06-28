package example;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * Very basic HTTP controller.
 */
@Controller
class ExampleController {

    @GetMapping("/")
    String getPerson(Model model){
        model.addAttribute("person", new Person("Bob " + System.currentTimeMillis()));
        return "index";
    }

}
