package org.example.webapp.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.info.BuildProperties;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class VersionController {

   @Autowired
   BuildProperties buildProperties;

   @GetMapping("/version")
   public String version(Model model) {
      model.addAttribute("version", buildProperties.getVersion());
      return "version";
   }
}
