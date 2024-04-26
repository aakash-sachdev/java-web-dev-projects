package com.launchcode.skilltracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SkillsController {

    //handle requests
    @GetMapping
    @ResponseBody
    public String skillsWithParams(){
        return "<html>" +
                "<body>" +
                "<h1>Skills Tracker</h1>"+
                "<h2>Select 3 languages</h2>"+
                "<ol>" +
                "<li>Java</li>" +
                "<li>Python</li>" +
                "<li>JavaScript</li>" +
                "</ol>" +
                "</body>" +
                "</html>";
    }

    @GetMapping("form")
    @ResponseBody
    public String skillsForms() {
         return "<html>" +
                "<body>" +
                "<form action='>" +
                "<input type = 'text' name='name' >" +
                "<ol>" +
                "<li>Java</li>" +
                "<li>Python</li>" +
                "<li>JavaScript</li>" +
                "</ol>" +
                "</body>" +
                "</html>";
        }
}
