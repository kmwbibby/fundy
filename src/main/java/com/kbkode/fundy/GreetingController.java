package com.kbkode.fundy;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @date 13-May-2021
 * @author kbibby
 */
@Controller
public class GreetingController {

    @GetMapping( "/greeting" )
    public String greeting( @RequestParam( name = "name", required = false,
                                           defaultValue = "world" ) String name, Model model ) {
        model.addAttribute( "name", name );
        return "greeting";
    }
}
