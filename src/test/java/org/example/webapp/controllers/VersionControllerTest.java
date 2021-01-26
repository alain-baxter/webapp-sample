package org.example.webapp.controllers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class VersionControllerTest {

   @BeforeEach
   void reset() {
      System.clearProperty(VersionController.ENV_KEY);
   }

   @Test
   void noEnvironment() {
      Assertions.assertEquals(VersionController.DEFAULT_ENV, VersionController.getEnvironment());
   }

   @Test
   void customEnvironment() {
      String environment = "custom";
      System.setProperty(VersionController.ENV_KEY, environment);
      Assertions.assertEquals(environment, VersionController.getEnvironment());
   }
}
