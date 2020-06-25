package com.mumosystems.tag.controller;
import com.mumosystems.tag.model.Issue;
import com.mumosystems.tag.services.JiraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class TagController
{
    @Autowired
    private JiraService jira;

    @RequestMapping(value ="/tag", method = RequestMethod.GET)
    public ModelAndView getProjectPage(@RequestParam("projectKey") String projectKey)
    {
        ModelAndView model = new ModelAndView();
        try {
            model.setViewName("project-page");
            List<Issue> issues = jira.getProjectIssues(projectKey, 20,0);
            model.addObject("issues", issues);
        } catch(Exception ex)
        {
            model.setViewName("error");
            model.addObject("error_message", ex.getMessage());
        }
        return model;
    }
}
