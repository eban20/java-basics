import java.util.Scanner;

class Main {
  public static void main(String[] args) {

 Scanner plex = new Scanner(System.in);

    System.out.printf("what is your weight in kg (kilogram) :");
    float weight = plex.nextFloat();
    //plex is variable for the Scanner input 
    plex.nextLine(); 

    System.out.printf(" what is your height in m (meters) :");
    float height = plex.nextFloat();
    plex.nextLine();

    float BMI = weight / (height * height);
    System.out.printf("your BMI is " + BMI + " kgm2");
    
    plex.close();
  }
}
