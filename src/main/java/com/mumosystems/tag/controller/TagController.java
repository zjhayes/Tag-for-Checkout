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

import java.util.ArrayList;
import java.util.List;

@Controller
public class TagController
{
    @Autowired
    private SearchService search;

    @RequestMapping(value = "/tag", method = RequestMethod.GET)
    public ModelAndView getProjectPage(@RequestParam("projectKey") String projectKey)
    {
        ModelAndView model = new ModelAndView();
        model.setViewName("project-page");
        return model;
    }

    @RequestMapping(value = "/tagSearch", method = RequestMethod.GET)
    @ResponseBody
    public ModelAndView runTagSearch(@RequestParam("projectKey") String projectKey, @RequestParam("sku") String sku)
    {
        ModelAndView model = new ModelAndView();
        try
        {
            model.setViewName("results");
            List<SearchResult> results = search.searchEachIssueInProjectForItem(projectKey, sku, 20,0);
            model.addObject("results", results);
            model.addObject("issueKeysString", createIssueKeyList(results));
        } catch(Exception ex)
        {
            model.setViewName("error");
            model.addObject("error_message", ex.getMessage());
        }
        return model;
    }

    @RequestMapping(value = "/updateItemStatus", method = RequestMethod.GET)
    @ResponseBody
    public String changeItemStatus(@RequestParam("issueKey") String issueKey, @RequestParam("itemId") String itemId,
                                   @RequestParam("newStatus") String newStatus)
    {
        System.out.println("Issue: " + issueKey);
        return "finished";
    }

    // TODO Find way to move this to javascript
    private String createIssueKeyList(List<SearchResult> results)
    {
        List<String> keyList = new ArrayList<>();
        for(SearchResult result : results)
        {
            keyList.add(result.getIssue().getKey());
        }
        return String.join(",", keyList);
    }
}
