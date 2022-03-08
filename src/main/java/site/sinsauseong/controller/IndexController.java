package site.sinsauseong.controller;


import lombok.extern.log4j.Log4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@Log4j
public class IndexController {

    @RequestMapping("/")
    public ModelAndView index() {
        log.info("index controller start");
        ModelAndView mav = new ModelAndView();
        mav.addObject("Title", "Index Title");
        mav.addObject("Content","Ind    ex Content");
        mav.setViewName("index");
        return mav;
    }
}
