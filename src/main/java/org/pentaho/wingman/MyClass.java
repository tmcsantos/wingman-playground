package org.pentaho.wingman;

import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MyClass {
  private static final Logger logger = LoggerFactory.getLogger(MyClass.class);

  public String sayHello() {
    return sayHello(Optional.empty());
  }

  public String sayHello(Optional<String> who) {
    logger.debug("saying 'Hello' to " + who.orElse("") + "...");
    return "Hello" + (who.isPresent() ? " " : "") + who.orElse("") + "!";
  }
}
