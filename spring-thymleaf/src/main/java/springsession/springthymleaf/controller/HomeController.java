package springsession.springthymleaf.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import springsession.springthymleaf.entity.Employee;
import springsession.springthymleaf.entity.User;
import springsession.springthymleaf.repository.EmployeeRepository;
import springsession.springthymleaf.repository.UserRepository;

import javax.servlet.http.HttpServletRequest;
import java.util.Optional;

@Controller
public class HomeController {

    @Autowired
    EmployeeRepository employeeRepository;

    @Autowired
    UserRepository userRepository;

    //    Question 1
    @RequestMapping(value = "/q1")
    public String question1() {
        return "question1";
    }

    //    Question 2
    @RequestMapping(value = "/q2")
    public String question2() {
        return "question2";
    }

    //    Question 3
    @RequestMapping(value = "/q3")
    public String question3() {
        return "q3form";
    }

    @RequestMapping(value = "/formAction", method = RequestMethod.POST)
    public String question3Action(HttpServletRequest httpServletRequest, Model model) {

        String id = httpServletRequest.getParameter("empId");
        String name = httpServletRequest.getParameter("empName");
        String email = httpServletRequest.getParameter("empMail");

        model.addAttribute("id", id);
        model.addAttribute("name", name);
        model.addAttribute("email", email);
        return "question3";
    }

//    Question 4

    @RequestMapping("/q4")
    public String question4(Model model) {
        Employee employee = new Employee();
        employee.setId("1");
        employee.setName("reshma");
        employee.setEmail("resh@gmail.com");
        employeeRepository.save(employee);
        Employee employee1 = new Employee();
        employee1.setId("2");
        employee1.setName("Pooja");
        employee1.setEmail("pooja@gmail.com");
        employeeRepository.save(employee1);

        model.addAttribute("emp", employeeRepository.findAll());
        return "question4";
    }

//    Question 5

    @RequestMapping("/saveUsersForQ5")
    @ResponseBody
    public void saveUserQ4(){
        User user = new User();
        user.setName("reshma");
        user.setEmail("reshma@mail.com");
        user.setAdmin(true);
        userRepository.save(user);
        User user1 = new User();
        user1.setName("pooja");
        user1.setEmail("poojas@gmail.com");
        user1.setAdmin(false);
        userRepository.save(user1);
    }

    @RequestMapping("/q5")
    public String question5() {
        return "question5";
    }

    @RequestMapping("/q5FormAction")
    @ResponseBody
    public String question6(HttpServletRequest httpServletRequest) {
        String msg = "not a valid user id";
        Integer id = Integer.parseInt(httpServletRequest.getParameter("id"));
        Optional<User> user = userRepository.findById(id);
        if(user.isPresent())
        {
            if(user.get().getAdmin())
                msg="Welcome admin : "+user.get().getName();
            else
                msg="Welcome user : "+user.get().getName();
        }
        return msg;
    }


}
