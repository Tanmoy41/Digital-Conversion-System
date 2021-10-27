import java.util.*;
import java.text.DecimalFormat;

class Currency {
    Scanner sc = new Scanner(System.in);
    double amount, dollar, pound, euro, yen, rupee, taka, dinar;
    DecimalFormat f = new DecimalFormat("##.##");

    Currency() {
        System.out.println("\tHi, Welcome to the Currency Converter!\t\n");
        System.out.println("\tMain menu of currency conversion.\t");
        System.out.println("\t----------------------------------");
        System.out.println(
                "1:Ruppe......\n2:Dollar....... \n3:Pound......... \n4:Euro........\n5:Yen......\n6:Taka.......\n7: Dinar");
        System.out.println("Enter the currency number that you want to convert: ");
        int choice = sc.nextInt();
        switch (choice) {
        case 1:
            Rupee();
            break;
        case 2:
            Dollar();
            break;
        case 3:
            Pound();
            break;
        case 4:
            Euro();
            break;
        case 5:
            Yen();
            break;
        case 6:
            Taka();
            break;
        case 7:
            Dinar();
        default: {
            System.out.println("Wrong input. Please try again.");
        }
        }
    }

    public void Rupee() {
        System.out.println("Enter the amount of money : ");
        amount = sc.nextFloat();
        dollar = amount / 70;
        System.out.println("Your " + amount + " Rupee is : " + f.format(dollar) + " Dollar");
        pound = amount / 88;
        System.out.println("Your " + amount + " Rupee is : " + f.format(pound) + " Pound");
        euro = amount / 80;
        System.out.println("Your " + amount + " Rupee is : " + f.format(euro) + " Euro");
        yen = amount / 0.63;
        System.out.println("Your " + amount + " Rupee is : " + f.format(yen) + " Yen");
        taka = amount / 1.14;
        System.out.println("Your " + amount + " Rupee is : " + f.format(taka) + " taka");
        dinar = amount * 0.0040;
        System.out.println("Your " + amount + " Rupee is : " + f.format(dinar) + " Kuwaiti dinar");
    }

    public void Dollar() {
        System.out.println("Enter the amount of money : ");
        amount = sc.nextFloat();
        rupee = amount * 70;
        System.out.println("Your " + amount + " Dollar is : " + f.format(rupee) + " Ruppes");
        pound = amount * 0.78;
        System.out.println("Your " + amount + " Dollar is : " + f.format(pound) + " Pound");
        euro = amount * 0.87;
        System.out.println("Your " + amount + " Dollar is : " + f.format(euro) + " Euro");
        yen = amount * 111.087;
        System.out.println("Your " + amount + " Dollar is : " + f.format(yen) + " Yen");
        taka = amount * 85.49;
        System.out.println("Your " + amount + " Dollar is : " + f.format(taka) + " taka");
        dinar = amount * 0.30;
        System.out.println("Your " + amount + " Dollar is : " + f.format(dinar) + " Kuwaiti dinar");
    }

    public void Pound() {
        System.out.println("Enter the amount of money : ");
        amount = sc.nextFloat();
        rupee = amount * 88;
        System.out.println("Your " + amount + " pound is : " + f.format(rupee) + " Ruppes");
        dollar = amount * 1.26;
        System.out.println("Your " + amount + " pound is : " + f.format(dollar) + " Dollar");
        euro = amount * 1.10;
        System.out.println("Your " + amount + " pound is : " + f.format(euro) + " Euro");
        yen = amount * 140.93;
        System.out.println("Your " + amount + " pound is : " + f.format(yen) + " Yen");
        taka = amount * 117.64;
        System.out.println("Your " + amount + " pound is : " + f.format(taka) + " taka");
        dinar = amount * 0.41;
        System.out.println("Your " + amount + " Pound is : " + f.format(dinar) + " Kuwaiti dinar");
    }

    public void Euro() {
        System.out.println("Enter the amount of money : ");
        amount = sc.nextFloat();
        rupee = amount * 80;
        System.out.println("Your " + amount + " euro is : " + f.format(rupee) + " Ruppes");
        dollar = amount * 1.14;
        System.out.println("Your " + amount + " euro is : " + f.format(dollar) + " Dollar");
        pound = amount * 0.90;
        System.out.println("Your " + amount + " euro is : " + f.format(pound) + " Pound");
        yen = amount * 127.32;
        System.out.println("Your " + amount + " euro is : " + f.format(yen) + " Yen");
        taka = amount * 99.28;
        System.out.println("Your " + amount + " euro is : " + f.format(taka) + " taka");
        dinar = amount * 0.35;
        System.out.println("Your " + amount + " euro is : " + f.format(dinar) + " Kuwaiti dinar");
    }

    public void Yen() {
        System.out.println("Enter the amount of money : ");
        amount = sc.nextFloat();
        rupee = amount * 0.63;
        System.out.println("Your " + amount + " yen is : " + f.format(rupee) + " Ruppes");
        dollar = amount * 0.008;
        System.out.println("Your " + amount + " yen is : " + f.format(dollar) + " Dollar");
        pound = amount * 0.007;
        System.out.println("Your " + amount + " yen is : " + f.format(pound) + " Pound");
        euro = amount * 0.007;
        System.out.println("Your " + amount + " yen is : " + f.format(euro) + " Euro");
        taka = amount * 0.75;
        System.out.println("Your " + amount + " yen is : " + f.format(taka) + " taka");
        dinar = amount * 0.0026;
        System.out.println("Your " + amount + " yen is : " + f.format(dinar) + " Kuwaiti dinar");
    }

    public void Taka() {
        System.out.println("Enter the amount of money : ");
        amount = sc.nextFloat();
        rupee = amount * 0.88;
        System.out.println("Your " + amount + " taka is : " + f.format(rupee) + " Ruppes");
        dollar = amount * 0.012;
        System.out.println("Your " + amount + " taka is : " + f.format(dollar) + " dollar");
        pound = amount * 0.0085;
        System.out.println("Your " + amount + " taka is : " + f.format(pound) + " pound");
        euro = amount * 0.010;
        System.out.println("Your " + amount + " taka is : " + f.format(euro) + " euro");
        yen = amount * 1.34;
        System.out.println("Your " + amount + " taka is : " + f.format(yen) + " yen");
        dinar = amount * 0.0035;
        System.out.println("Your " + amount + " taka is : " + f.format(dinar) + " Kuwaiti dinar");
    }

    public void Dinar() {
        System.out.println("Enter the amount of money : ");
        amount = sc.nextFloat();
        rupee = amount * 248.64;
        System.out.println("Your " + amount + " dinar is : " + f.format(rupee) + " Ruppes");
        dollar = amount * 3.31;
        System.out.println("Your " + amount + " dinar is : " + f.format(dollar) + " dollar");
        pound = amount * 2.41;
        System.out.println("Your " + amount + " dinar is : " + f.format(pound) + " pound");
        euro = amount * 2.86;
        System.out.println("Your " + amount + " dinar is : " + f.format(euro) + " euro");
        yen = amount * 379.02;
        System.out.println("Your " + amount + " dinaris : " + f.format(yen) + " yen");
        taka = amount * 283.61;
        System.out.println("Your " + amount + " dinaris : " + f.format(taka) + " taka");
    }
}

class Weight {
    Scanner sc = new Scanner(System.in);
    double weight, kilogram, gram, miligram, pound, ton, ounce;
    DecimalFormat f = new DecimalFormat("##.##");

    Weight() {
        System.out.println("\t Welcome to the Weight Converter!\t\n");
        System.out.println("\tMain menu of Weight convertion.\t");
        System.out.println("\t----------------------------------");
        System.out.println(
                "1:Kilogram.....\n2:Gram....... \n3:Miligram......... \n4:Pound........ \n5:Ton......\n6:Ounce......");
        System.out.println("Enter your choice: ");
        int a = sc.nextInt();
        switch (a) {
        case 1:
            Kilogram();
            break;
        case 2:
            Gram();
            break;
        case 3:
            Miligram();
            break;
        case 4:
            Pound();
            break;
        case 5:
            Ton();
            break;
        case 6:
            Ounce();
            break;
        default: {
            System.out.println("Wrong input. Please try again.");
        }
        }
    }

    public void Kilogram() {
        System.out.println("Enter the amount(weight) that you want to convert: ");
        weight = sc.nextFloat();
        gram = weight * 1000;
        System.out.println("Your " + weight + " converted weight is : " + f.format(gram) + " Gram");
        miligram = weight * 1000000;
        System.out.println("Your " + weight + " converted weight is : " + f.format(miligram) + " Miligram");
        pound = weight / 2.20462;
        System.out.println("Your " + weight + " converted weight is : " + f.format(pound) + " Pound");
        ton = weight / 0.0011;
        System.out.println("Your " + weight + " converted weight is : " + f.format(ton) + " Ton");
        ounce = weight / 0.001;
        System.out.println("Your " + weight + " converted weight is : " + f.format(ounce) + " Ounce");
    }

    public void Gram() {
        System.out.println("Enter the amount(weight) that you want to convert: ");
        weight = sc.nextFloat();
        kilogram = weight / 1000;
        System.out.println("Your " + weight + " converted weight is : " + f.format(kilogram) + " Kilogram");
        miligram = weight * 1000;
        System.out.println("Your " + weight + " converted weight is : " + f.format(miligram) + " Miligram");
        pound = weight * 0.0022;
        System.out.println("Your " + weight + " converted weight is : " + f.format(pound) + " Pound");
        ton = weight * 0.000001;
        System.out.println("Your " + weight + " converted weight is : " + f.format(ton) + " Ton");
        ounce = weight * 0.0352;
        System.out.println("Your " + weight + " converted weight is : " + f.format(ounce) + " Ounce");
    }

    public void Miligram() {
        System.out.println("Enter the amount(weight) that you want to covert : ");
        weight = sc.nextFloat();
        kilogram = weight * 0.000001;
        System.out.println("Your " + weight + " converted weight is : " + f.format(kilogram) + " Kilogram");
        gram = weight * 0.001;
        System.out.println("Your " + weight + " converted weight is : " + f.format(gram) + " Gram");
        pound = weight * 0.000002;
        System.out.println("Your " + weight + " converted weight is : " + f.format(pound) + " Pound");
        ton = weight * 0.000000001;
        System.out.println("Your " + weight + " converted weight is : " + f.format(ton) + " Ton");
        ounce = weight * 0.00003;
        System.out.println("Your " + weight + " converted weight is : " + f.format(ounce) + " Ounce");
    }

    public void Pound() {
        System.out.println("Enter the amount(weight) that you want to convert : ");
        weight = sc.nextFloat();
        kilogram = weight * 0.453;
        System.out.println("Your " + weight + " converted weight is : " + f.format(kilogram) + " KIlogram");
        gram = weight * 453.592;
        System.out.println("Your " + weight + " converted weight is : " + f.format(gram) + " Gram");
        miligram = weight * 453592;
        System.out.println("Your " + weight + " converted weight is : " + f.format(miligram) + " Miligram");
        ton = weight * 0.0005;
        System.out.println("Your " + weight + " converted weight is : " + f.format(ton) + " Ton");
        ounce = weight * 16;
        System.out.println("Your " + weight + " converted weight is : " + f.format(ounce) + " Ounce");
    }

    public void Ton() {
        System.out.println("Enter the amount(weight) that you want to convert: ");
        weight = sc.nextFloat();
        kilogram = weight * 907.185;
        System.out.println("Your " + weight + " converted weight is : " + f.format(kilogram) + " Kilogram");
        gram = weight * 907185;
        System.out.println("Your " + weight + " converted weight is : " + f.format(gram) + " Gram");
        miligram = weight * 1000000000;
        System.out.println("Your " + weight + " converted weight is : " + f.format(miligram) + " Miligram");
        pound = weight * 2000;
        System.out.println("Your " + weight + " converted weight is : " + f.format(pound) + " Pound");
        ounce = weight * 32000;
        System.out.println("Your " + weight + " converted weight is : " + f.format(ounce) + " Ounce");
    }

    public void Ounce() {
        System.out.println("Enter the amount(weight) that you want to convert : ");
        weight = sc.nextFloat();
        kilogram = weight * 0.0283;
        System.out.println("Your " + weight + " converted weight is : " + f.format(kilogram) + " Kilogram");
        gram = weight * 28.34;
        System.out.println("Your " + weight + " converted weight is : " + f.format(gram) + " Gram");
        miligram = weight * 28349.5;
        System.out.println("Your " + weight + " converted weight is : " + f.format(miligram) + " Miligram");
        pound = weight * 0.0625;
        System.out.println("Your " + weight + " converted weight is : " + f.format(pound) + " Pound");
        ton = weight * 0.00003;
        System.out.println("Your " + weight + " converted weight is : " + f.format(ton) + " Ton");
    }
}

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
        System.out
                .println("Your " + temperature + " converted temperature is : " + f.format(fahrenheit) + " Fahrenheit");
    }
}

class Volume {
    Scanner sc = new Scanner(System.in);
    double volume, liters, barrels, gallons, pints, cubicfeet, cubicmeter;
    DecimalFormat f = new DecimalFormat("##.##");

    Volume() {
        System.out.println("\t Welcome to the volume Converter!\t\n");
        System.out.println("\tMain menu of Volume convertion.\t");
        System.out.println("\t----------------------------------");
        System.out.println(
                "1:Liters.....\n2:Barrels....... \n3:Pints......... \n4:Gallon........ \n5:Cubic Meter......\n6:Cubic Feet......");
        System.out.println("Enter your choice: ");
        int a = sc.nextInt();
        switch (a) {
        case 1:
            Liters();
            break;
        case 2:
            Barrels();
            break;
        case 3:
            Pints();
            break;
        case 4:
            Gallon();
            break;
        case 5:
            Cubicmeter();
            break;
        case 6:
            Cubicfeet();
            break;
        default: {
            System.out.println("Wrong input. Please try again.");
        }
        }
    }

    public void Liters() {
        System.out.println("Enter the amount(volume) that you want to convert: ");
        volume = sc.nextFloat();
        barrels = volume * 0.00629;
        System.out.println("Your " + volume + " converted volume is : " + f.format(barrels) + " Barrels");
        gallons = volume * 0.264;
        System.out.println("Your " + volume + " converted volume is : " + f.format(gallons) + " Gallons");
        pints = volume / 2.113;
        System.out.println("Your " + volume + " converted volume is : " + f.format(pints) + " Pints");
        cubicfeet = volume / 0.0353;
        System.out.println("Your " + volume + " converted volume is : " + f.format(cubicfeet) + " Cubicfeet");
        cubicmeter = volume / 0.001;
        System.out.println("Your " + volume + " converted volume is : " + f.format(cubicmeter) + " Cubicmeter");
    }

    public void Barrels() {
        System.out.println("Enter the amount(volume) that you want to convert: ");
        volume = sc.nextFloat();
        liters = volume * 158.987;
        System.out.println("Your " + volume + " converted volume is : " + f.format(liters) + " Liters");
        pints = volume * 252;
        System.out.println("Your " + volume + " converted volume is : " + f.format(pints) + " Pints");
        gallons = volume * 3785.412;
        System.out.println("Your " + volume + " converted volume is : " + f.format(gallons) + " Gallons");
        cubicfeet = volume * 5.614583333;
        System.out.println("Your " + volume + " converted volume is : " + f.format(cubicfeet) + " Cubic feet");
        cubicmeter = volume * 0.16;
        System.out.println("Your " + volume + " converted volume is : " + f.format(cubicmeter) + " Cubic meter");
    }

    public void Gallon() {
        System.out.println("Enter the amount(volume) that you want to covert : ");
        volume = sc.nextFloat();
        liters = volume * 4.54609;
        System.out.println("Your " + volume + " converted volume is : " + f.format(liters) + " Liters");
        pints = volume * 8;
        System.out.println("Your " + volume + " converted volume is : " + f.format(pints) + " Pints");
        barrels = volume * 0.036941180600848;
        System.out.println("Your " + volume + " converted volume is : " + f.format(barrels) + " Barrels");
        cubicmeter = volume * 0.00378541;
        System.out.println("Your " + volume + " converted volume is : " + f.format(cubicmeter) + " Cubic meter");
        cubicfeet = volume * 0.134;
        System.out.println("Your " + volume + " converted volume is : " + f.format(cubicfeet) + " Cubic feet");
    }

    public void Pints() {
        System.out.println("Enter the amount(volume) that you want to convert : ");
        volume = sc.nextFloat();
        liters = volume * 0.473;
        System.out.println("Your " + volume + " converted volume is : " + f.format(liters) + " Liters");
        barrels = volume * 0.004032;
        System.out.println("Your " + volume + " converted volume is : " + f.format(barrels) + " Barrels");
        gallons = volume * 0.125;
        System.out.println("Your " + volume + " converted volume is : " + f.format(gallons) + " Gallons");
        cubicmeter = volume * 0.000473;
        System.out.println("Your " + volume + " converted volume is : " + f.format(cubicmeter) + " Cubic meter");
        cubicfeet = volume * 0.0167;
        System.out.println("Your " + volume + " converted volume is : " + f.format(cubicfeet) + " Cubic feet");
    }

    public void Cubicfeet() {
        System.out.println("Enter the amount(volume) that you want to convert: ");
        volume = sc.nextFloat();
        liters = volume * 28.317;
        System.out.println("Your " + volume + " converted volume is : " + f.format(liters) + " Liters");
        gallons = volume * 7.481;
        System.out.println("Your " + volume + " converted volume is : " + f.format(gallons) + " Gallons");
        barrels = volume * 0.18;
        System.out.println("Your " + volume + " converted volume is : " + f.format(barrels) + " Barrels");
        pints = volume * 59.844;
        System.out.println("Your " + volume + " converted volume is : " + f.format(pints) + " Pints");
        cubicmeter = volume * 0.0283;
        System.out.println("Your " + volume + " converted volume is : " + f.format(cubicmeter) + " Cubic meter");
    }

    public void Cubicmeter() {
        System.out.println("Enter the amount(volume) that you want to convert : ");
        volume = sc.nextFloat();
        liters = volume * 1000;
        System.out.println("Your " + volume + " converted volume is : " + f.format(liters) + " Liters");
        gallons = volume * 264.172;
        System.out.println("Your " + volume + " converted volume is : " + f.format(gallons) + " Gallon");
        barrels = volume * 6.29;
        System.out.println("Your " + volume + " converted volume is : " + f.format(barrels) + " Barrels");
        pints = volume * 2113.376;
        System.out.println("Your " + volume + " converted volume is : " + f.format(pints) + " Pints");
        cubicfeet = volume * 35.315;
        System.out.println("Your " + volume + " converted volume is : " + f.format(cubicfeet) + " Cubic feet");
    }
}

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
        } else if (value == "Male") {
            bmr = 66 + (6.23 * weight) + (12.7 * height) - (6.8 * age);
            System.out.println("Your BMR is : " + f.format(bmr));
        } else {
            System.out.println("Wrong input!!!");
        }
    }

    // public class conversionSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\t Welcome to the Convertion System");
        System.out.println("\tMain menu of convertion.\t");
        System.out.println("\t----------------------------------");
        System.out.println("1:Currency...\n2:Volume....\n3:Weight......... \n4:Temparature......\n5:BMI...... \n6:BMR.....");
        System.out.println("Enter the convertion number: ");
        int c = sc.nextInt();
        switch (c) {
        case 1:
            Currency currency = new Currency();
            break;
        case 2:
            Volume volume = new Volume();
            break;
        case 3:
            Weight weight = new Weight();
            break;
        case 4:
            Temperature temperature = new Temperature();
            break;
        case 5:
            BMI bmi = new BMI();
            break;
        case 6:
            BMR bmr = new BMR();
            break;
        default: {
            System.out.println("Wrong input. Please try again.");
        }
        }
    }
}