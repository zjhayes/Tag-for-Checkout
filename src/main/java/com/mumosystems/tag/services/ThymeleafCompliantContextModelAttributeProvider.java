package com.mumosystems.tag.services;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ModelAttribute;

@ControllerAdvice
public class ThymeleafCompliantContextModelAttributeProvider {

    @ModelAttribute("atlassianConnectLicense")
    public String getLicense(@ModelAttribute("atlassian-connect-license") String license) {
        return license;
    }

    @ModelAttribute("atlassianConnectLocale")
    public String getLocale(@ModelAttribute("atlassian-connect-locale") String locale) {
        return locale;
    }

    @ModelAttribute("atlassianConnectTimezone")
    public String getTimezone(@ModelAttribute("atlassian-connect-timezone") String timezone) {
        return timezone;
    }

    @ModelAttribute("atlassianConnectAllJsUrl")
    public String getAllJsUrl(@ModelAttribute("atlassian-connect-all-js-url") String allJsUrl) {
        return allJsUrl;
    }
}