package uk.org.aeb.json.jackson;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    String input = "";
    PrintMenu();

    while (!input.equalsIgnoreCase("Q")) {

      input = scanner.nextLine();

      if (input.isEmpty()) {
        PrintMenu();
      }

    }

  }
  
  private static void PrintMenu() {
    System.out.println("Select menu option:");
    System.out.println("-------------------");
    System.out.println("* Display menu again (ENTER)");
    System.out.println("* Quit (Q)");
  }
    
}
