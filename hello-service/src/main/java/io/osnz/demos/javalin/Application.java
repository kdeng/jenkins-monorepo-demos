package io.osnz.demos.javalin;

import io.javalin.Javalin;

/**
 * @author Kefeng Deng (https://bit.ly/2JFoCO1)
 */
public class Application {

  public static void main(String[] args) {
    Javalin app = Javalin.create().start(7000);
    app.get("/", ctx -> ctx.result("Hello World"));
  }

}
