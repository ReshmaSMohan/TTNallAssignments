package springsession.springthymleaf.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import springsession.springthymleaf.entity.Employee;
import springsession.springthymleaf.entity.User;
import springsession.springthymleaf.repository.EmployeeRepository;
import springsession.springthymleaf.repository.UserRepository;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;
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
    public String question3(Model model) {
        User user = new User();
        model.addAttribute(user);
        return "q3form";
    }

    @RequestMapping(value = "/formAction", method = RequestMethod.POST)
    public String question3Action(User user,/*HttpServletRequest httpServletRequest,*/ Model model) {

       /* String id = httpServletRequest.getParameter("empId");
        String name = httpServletRequest.getParameter("empName");
        String email = httpServletRequest.getParameter("empMail");

        model.addAttribute("id", id);
        model.addAttribute("name", name);
        model.addAttribute("email", email);*/
       model.addAttribute(user);
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
    public void saveUserQ5(){
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
        User user2 = new User();
        user2.setName("mahima");
        user2.setEmail("mahi@gmail.com");
        user2.setAdmin(false);
        userRepository.save(user2);
        User user3 = new User();
        user3.setName("anu");
        user3.setEmail("anu@gmail.com");
        user3.setAdmin(false);
        userRepository.save(user3);
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
                msg="Hello admin : "+user.get().getName();
            else
                msg="Hello user : "+user.get().getName();
        }
        return msg;
    }

//    Question 7

    @RequestMapping("/q7")
    public String question7() {
        return "question7";
    }

    @GetMapping("/getTime")
    @ResponseBody
    public String getTime(){
        return new Date().toLocaleString();
    }

//    Question 8

    @RequestMapping("/q8")
    public String question8(Model model){
        model.addAttribute("users", userRepository.findAll());
        return "question8";
    }

//    Question 9
    @RequestMapping("/q9")
    public String question9(){
        return "question9";
    }

    @RequestMapping(value = "/getMsgQ9")
    @ResponseBody
    public String question9SetMsg(@RequestParam String type){
        String msg = "Hello : "+type.toLowerCase();
        return msg;
    }

//    Question 10
    @RequestMapping("/q10")
    public String question10(){
        return "question10";
    }

    @PostMapping("/registerEmployee")
    @ResponseBody
    public String registerEmployee(@ModelAttribute Employee employee) throws InterruptedException {
        Thread.sleep(1000L);
        //employeeRepository.save(employee);
        //return String.valueOf(employeeRepository.findById(employee.getId()));
        return employee.getName();
    }

}
