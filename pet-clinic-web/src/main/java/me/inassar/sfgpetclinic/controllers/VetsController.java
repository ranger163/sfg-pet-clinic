package me.inassar.sfgpetclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Ahmed Nassar.
 * Date: 22 May, 2020
 * Time: 3:54 PM
 */
@Controller
@RequestMapping("/vets")
public class VetsController {

    @RequestMapping({"","/", "/index", "/index.html"})
    public String listVets() {
        return "vets/index";
    }

}