package me.inassar.sfgpetclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Ahmed Nassar.
 * Date: 22 May, 2020
 * Time: 4:04 PM
 */
@Controller
@RequestMapping("/owners")
public class OwnersController {
    @RequestMapping({"","/","/index","/index.html"})
    public String listOwners(){return "owners/index";}
}