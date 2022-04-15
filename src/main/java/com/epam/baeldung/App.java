package com.epam.baeldung;

public class App {

  public static void main(String[] args) {
    System.out.println("Hello Proxy!");

    ExpensiveObject object = new ExpensiveObjectProxy();
    object.process();
    object.process();
  }

}

// https://www.baeldung.com/java-proxy-pattern