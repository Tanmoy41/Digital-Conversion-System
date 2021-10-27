import java.util.*;
import java.text.DecimalFormat;

class BMI {
    Scanner sc = new Scanner(System.in);
    double bmi, weight, height;
    DecimalFormat f = new DecimalFormat("##.##");

    BMI() {
        System.out.println("\t Welcome to BMI Calculator\t\n");

        System.out.println("Enter your weight(in pounds) : ");
        weight = sc.nextFloat();
        System.out.println("Enter your height(in inches) : ");
        height = sc.nextFloat();

        bmi = (weight / (height * height)) * 703;
        System.out.println("Your BMI is : " + f.format(bmi));
    }
}

class BMR {
    Scanner sc = new Scanner(System.in);
    double bmr, weight, height, age;
    DecimalFormat f = new DecimalFormat("##.##");

    BMR() {
        System.out.println("\t Welcome to BMR Calculator\t\n");

        System.out.println("Enter your gender(Male / Female) : ");
        String value = sc.nextLine();
        System.out.println("Enter your weight(in pounds) ");
        weight = sc.nextFloat();
        System.out.println("Enter your height(in inches) ");
        height = sc.nextFloat();
        System.out.println("Enter your age ");
        age = sc.nextFloat();
         
        

        if (value == "Female") {
            bmr = 655 + (4.35 * weight) + (4.7 * height) - (4.7 * age);
            System.out.println("Your BMR is : " + f.format(bmr));
        } 
         else if(value == "Male") {
            bmr = 66 + (6.23 * weight) + (12.7 * height) - (6.8 * age);
            System.out.println("Your BMR is : " + f.format(bmr));
        }
        else {
            System.out.println("Wrong input!!!");
        }
    }
}

public class healthConversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("\t Welcome to BMI & BMR Calculaor\t\n\n");
        System.out.println("\t Main menu of Calculaor\t");

        System.out.println("1: BMI.....\n2: BMR....... \n");
        System.out.println("Enter Your Choice: ");
        int a = sc.nextInt();

        switch (a) {
        case 1:
            BMI B = new BMI();
            break;
        case 2:
            BMR M = new BMR();
            break;
        default: {
            System.out.println("Wrong input. Please try again.");
        }
        }
    }
}
