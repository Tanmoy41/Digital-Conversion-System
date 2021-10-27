import java.util.*;
import java.text.DecimalFormat;
 
class Temperature {
    Scanner sc = new Scanner(System.in);
    double temperature, celsius, fahrenheit, kelvin;
    DecimalFormat f = new DecimalFormat("##.##");
 
    Temperature() {
        System.out.println("\t Welcome to Temperature Converter!\t\n");
        System.out.println("\tMain menu of Temperature conversion.\t");
        System.out.println("\t----------------------------------");
        System.out.println("1:Celsius.....\n2:Fahrenheit....... \n3:Kelvin.........");
        System.out.println("Enter your choice: ");
        int a = sc.nextInt();
        switch (a) {
        case 1:
            Celsius();
            break;
        case 2:
            Fahrenheit();
            break;
        case 3:
            Kelvin();
            break;
        default: {
            System.out.println("Wrong input. Please try again.");
        }
        }
    }
 
     void Celsius() {
        System.out.println("Enter the number(temperature) that you want to convert: ");
        temperature = sc.nextFloat();
        fahrenheit = (temperature * 9 / 5) + 32;
        System.out
                .println("Your " + temperature + " converted temperature is : " + f.format(fahrenheit) + " Fahrenheit");
        kelvin = temperature + 273.15;
        System.out.println("Your " + temperature + " converted temperature is : " + f.format(kelvin) + " Kelvin");
    }
 
     void Fahrenheit() {
        System.out.println("Enter the amount(temperature) that you want to convert: ");
        temperature = sc.nextFloat();
        celsius = (temperature - 32) * 5 / 9;
        System.out.println("Your " + temperature + " converted temperature is : " + f.format(celsius) + " Celsius");
        kelvin = (temperature - 32) * 5 / 9 + 273.15;
         System.out.println("Your " + temperature + " converted temperature is : " + f.format(kelvin) + " Kelvin");
    }
 
    
      void Kelvin() {
        System.out.println("Enter the amount(temperature) that you want to covert : ");
        temperature = sc.nextFloat();
        
        celsius = temperature - 273.15;
        System.out.println("Your " + temperature + " converted temperature is : " + f.format(celsius) + " Celsius");
        fahrenheit = (temperature - 273.15) * 9 / 5 + 32;
        System.out.println("Your " + temperature + " converted temperature is : " + f.format(fahrenheit) + " Fahrenheit");
    }
   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Temperature t = new Temperature();
        System.out.println("\t Welcome to Temperature Converter!\t\n");
        System.out.println("\tMain menu of Temperature convertion.\t");
        System.out.println("\t----------------------------------");
        System.out.println("1:Celsius.....\n2:Fahrenheit....... \n3:Kelvin.........");
        System.out.println("Enter your choice: ");
        int a = sc.nextInt();
        switch (a) {
        case 1:
             t.Celsius();
            break;
        case 2:
        t.Fahrenheit();
            break;
        case 3:
        t.Kelvin() ;
            break;
        default: {
            System.out.println("Wrong input. Please try again.");
        }
        }
    }
}