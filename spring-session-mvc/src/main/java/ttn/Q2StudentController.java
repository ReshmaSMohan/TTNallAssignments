package ttn;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class Q2StudentController extends MultiActionController {

    public ModelAndView action1(HttpServletRequest httpServletRequest,
                                HttpServletResponse httpServletResponse) {

        ModelAndView modelAndView = new ModelAndView("index");
        return modelAndView;
    }

    public void action2(HttpServletRequest httpServletRequest,
                        HttpServletResponse httpServletResponse) throws IOException {
        httpServletResponse.setContentType("text/html");
        httpServletResponse.getWriter().println("<b>HELLO World FROM action2 method</b>");
    }

}
