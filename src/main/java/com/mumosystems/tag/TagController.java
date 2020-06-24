package com.mumosystems.tag;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class TagController
{
    @RequestMapping(value ="/tag", method = RequestMethod.GET)
    public ModelAndView getProjectPage() {
        ModelAndView model = new ModelAndView();
        model.setViewName("tag");
        model.addObject("test", "test value");
        return model;
    }
}
