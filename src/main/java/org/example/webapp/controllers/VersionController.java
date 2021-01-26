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

   public static final String ENV_KEY = "server.environment";
   public static final String DEFAULT_ENV = "dev";

   @GetMapping("/version")
   public String version(Model model) {
      model.addAttribute("environment", getEnvironment());
      model.addAttribute("version", buildProperties.getVersion());
      return "version";
   }

   public static String getEnvironment() {
      return System.getProperty(ENV_KEY, DEFAULT_ENV);
   }
}
