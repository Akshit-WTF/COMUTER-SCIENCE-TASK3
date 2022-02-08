import java.util.*;  

class Main {
  public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    System.out.print("Enter your age:");  
    int age= sc.nextInt();
    if (age < 15) {
      System.out.print("Sorry, you cannot watch this film.");  
    } else {
      System.out.print("You are old enough to watch this film!");  
    }
  }
}
