package sheridan.chrisnei.midterm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import sheridan.chrisnei.midterm.domain.Employee;

import javax.validation.Valid;

@Controller
@RequestMapping("/employee")
public class EmployeeController {

    @GetMapping("/input")
    public String displayInputPage(Model model) {
        model.addAttribute("employee", new Employee());
        return "input-page";
    }

    @PostMapping("/update/{id}")
    public String displayOutputPage(@Valid Employee employee,
                            BindingResult result, Model model) {
        if (result.hasErrors()) {
            return "input-page";
        }
        return "redirect:employee/output-page";
    }
}
