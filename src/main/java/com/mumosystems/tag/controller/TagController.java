package com.mumosystems.tag.controller;
import com.mumosystems.tag.model.CheckoutProperties;
import com.mumosystems.tag.services.JiraService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class TagController
{
    JiraService jira = new JiraService();

    @RequestMapping(value ="/tag", method = RequestMethod.GET)
    public ModelAndView getProjectPage(@RequestParam("projectKey") String projectKey)
    {
        CheckoutProperties checkout = jira.getCheckoutProperties("BAR-1");
        ModelAndView model = new ModelAndView();
        model.setViewName("project-page");
        model.addObject("project", checkout.toString());
        return model;
    }
}
