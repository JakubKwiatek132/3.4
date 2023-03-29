import java.util.Scanner;

class Main {
  public static void main(String[] args) {
     Scanner skan = new Scanner(System.in);

    System.out.println("Podaj liczbe ");
    int a = skan.nextInt();
    
    int wynik = 1;
    for (int i = 1; i <= a; i++) {
     wynik = wynik * i;
  }
  System.out.println("Silnia: " + result);
  }
}