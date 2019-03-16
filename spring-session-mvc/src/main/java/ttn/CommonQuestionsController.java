package ttn;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;

@Controller
public class CommonQuestionsController {

    //Question 10
    @ModelAttribute
    void addingObject(Model model){
        model.addAttribute("heading","Spring MVC Demo");
    }

    //Question 3
    @RequestMapping("/")
    ModelAndView index(){
        ModelAndView modelAndView = new ModelAndView("index");
        return modelAndView;
    }

    //Question 4
    @RequestMapping("hello")
    @ResponseBody
    String hello(){
        return "Hello World From Method 2";
    }

    //Question 5
    @RequestMapping("/modeldemo")
    ModelAndView modelDemo() {
        ModelAndView modelAndView = new ModelAndView("index");
        modelAndView.addObject("msg", "Model : Hello World");
        return modelAndView;
    }

    //Question 6
    @RequestMapping("/name/{firstname}/{lastname}")
    @ResponseBody
    String returnName(@PathVariable String firstname,@PathVariable String lastname) {
        return "Firstname : "+firstname + " :: Lastname : " +lastname;
    }

    //Question 7
    @RequestMapping("/namedmap/{firstname}/{lastname}")
    @ResponseBody
    String returnMapName(@PathVariable Map<String, String> requestMap) {
        return "Firstname : "+requestMap.get("firstname") + " :: Lastname : " + requestMap.get("lastname");
    }

    //Question 8
    @RequestMapping("/form")
    public ModelAndView form(){
        ModelAndView modelAndView = new ModelAndView("form");
        return modelAndView;
    }

    @RequestMapping(value = "formData", method = RequestMethod.POST)
    @ResponseBody
    String submitForm(@RequestParam("firstname") String firstname,
                      @RequestParam("lastname") String lastname) {
        return "Firtsname " + firstname + ":: Lastname " + lastname;
    }

    //Question 9
    @RequestMapping("student")
    @ResponseBody
    String student(StudentCO student){
        return student.getFirstname()+" :: "+student.getLastname();
    }

}
