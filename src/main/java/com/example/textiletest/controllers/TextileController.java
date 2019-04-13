package com.example.textiletest.controllers;

import com.example.textiletest.entities.Textile;
import com.example.textiletest.services.TextileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import javax.xml.soap.Text;
import java.security.Principal;

@Controller
public class TextileController {

    @Autowired
    TextileService textileService;

    @RequestMapping("/textile/add")
    public String addTextile(Model model){
        model.addAttribute("textile", new Textile());
    return "addTextile";
    }

    @RequestMapping(value="/textile/add", method = RequestMethod.POST)
    public String saveTextile(Textile textile){
        textileService.save(textile);
        return "addTextile";
    }

    @RequestMapping("/textile/delete/{id}")
    public String removeTextile(@PathVariable("id") long id){
        textileService.deleteById(id);
        return "redirect:/textile";
    }

    @RequestMapping("/textile")
    public String showTextiles(Model model){
        model.addAttribute("textiles", textileService.findAll());
        return "textiles";
    }

//    @RequestMapping("/man")
//    public String showManager(){
//        return "managersite";
//    }

    @RequestMapping("/")
public String showIndex(){
        return "redirect:/textile";
}


}