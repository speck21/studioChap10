package org.launchcode.skillstracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@ResponseBody
public class SkillsController {

    @GetMapping("")
    public String homePage(){
        return "<h1>Skills Tracker</h1>" +
                "<h2>We have a few skills to learn. Here is the list!</h2>" +
                "<ol>" +
                    "<li>Java</li>" +
                    "<li>Python</li>" +
                    "<li>c++</li>" +
                "</ol>";
    }

    @GetMapping("form")
    public String favoriteForm(){
        return "<html>" +
                    "<body>" +

                        "<form action='form' method='post'>" +
                "<h2>Name: </h2>" +
                            "<input type='text' name='name' >" +
                "<h2>My favorite language: </h2> " +
                                "<select name='favorite' id='language'>" +
                                    "<option value='java'>Java</option>" +
                                    "<option value='python'>Python</option>" +
                                    "<option value='c++'>c++</option>" +
                                "</select>" +

//                        "</form>" +
                "<h2>My second favorite language: </h2>" +
//                        "<form action='secondFavorite' method='get'>" +

                                "<select name='secondFavorite' id='language'>" +
                                    "<option value='java'>Java</option>" +
                                    "<option value='python'>Python</option>" +
                                    "<option value='c++'>c++</option>" +
                                "</select>" +

//                        "</form>" +
                "<h2>My third favorite language: </h2>" +
//                        "<form action='thirdFavorite' method='get'>" +

                                "<select name='thirdFavorite' id='language'>" +
                                    "<option value='java'>Java</option>" +
                                    "<option value='python'>Python</option>" +
                                    "<option value='c++'>c++</option>" +
                                "</select>" +
                            "<input type='submit' value='Submit'>"  +
                        "</form>" +

                    "</body>" +
                "</html>";
    }

    @RequestMapping(value="form", method = {RequestMethod.POST})
    @ResponseBody
    public String listedFavorites(@RequestParam String name, @RequestParam String favorite, @RequestParam String secondFavorite, @RequestParam String thirdFavorite){
        return "<h1>" + name+ ": </h1>" +
                "<ol>" +
                "<li>" + favorite +"</li>" +
                "<li>" + secondFavorite +"</li>" +
                "<li>" + thirdFavorite +"</li>" +
                "</ol>";

    }



}
