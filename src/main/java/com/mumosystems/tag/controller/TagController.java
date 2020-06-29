package com.mumosystems.tag.controller;
import com.atlassian.connect.spring.AtlassianHostUser;
import com.mumosystems.tag.model.SearchResult;
import com.mumosystems.tag.services.SearchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class TagController
{
    @Autowired
    private SearchService search;

    @RequestMapping(value = "/tag", method = RequestMethod.GET)
    public ModelAndView getProjectPage(@AuthenticationPrincipal AtlassianHostUser hostUser, @RequestParam("projectKey") String projectKey)
    {
        ModelAndView model = new ModelAndView();
        try {
            model.setViewName("project-page");
            List<SearchResult> results = search.searchEachIssueInProjectForItem(projectKey, "Used to staple paper.", 20,0);
            model.addObject("results", results);
        } catch(Exception ex)
        {
            model.setViewName("error");
            model.addObject("error_message", ex.getMessage());
        }
        return model;
    }

    @RequestMapping(value = "/hello-world", method = RequestMethod.GET)
    @ResponseBody
    public ModelAndView helloWorld(@AuthenticationPrincipal AtlassianHostUser hostUser) {
        System.out.println("XXXX HERE!");
        ModelAndView model = new ModelAndView();
        model.setViewName("error");
        model.addObject("error_message", "Hello World");
        return model;
    }

    @RequestMapping(value = "/tagSearch", method = RequestMethod.GET)
    @ResponseBody
    public ModelAndView runTagSearch(@AuthenticationPrincipal AtlassianHostUser hostUser)
    {
        ModelAndView model = new ModelAndView();
        model.setViewName("error");
        model.addObject("error_message", "Here");
        return model;
    }
}
