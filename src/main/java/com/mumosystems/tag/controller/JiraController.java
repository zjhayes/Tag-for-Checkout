package com.mumosystems.tag.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class JiraController
{
    @GetMapping(value ="/issues")
    public String sendToJQL(HttpServletRequest request)
    {
        String baseUrl = String.format("%s://%s:%d/tasks/", request.getScheme(),
                request.getServerName(), request.getServerPort());

        return "redirect:" + baseUrl;
    }
}
