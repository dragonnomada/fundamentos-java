import java.util.Scanner;

class Demo {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    
    System.out.println("¿Cuál es tu nombre?");
    String nombre = scanner.nextLine();

    System.out.printf("Hola %s, ¿Cómo estás?", nombre);

    scanner.close();
  }

}