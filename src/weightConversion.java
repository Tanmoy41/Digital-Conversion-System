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

public class weightConversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Weight w = new Weight();
        System.out.println("\t Welcome to the weight Converter!\t\n");
        System.out.println("\tMain menu of weight convertion.\t");
        System.out.println("\t----------------------------------");
        System.out.println(
                "1:Kilogram.....\n2:Gram....... \n3:Miligram......... \n4:Pound........ \n5:Ton......\n6:Ounce......");
        System.out.println("Enter your choice: ");
        int a = sc.nextInt();
        switch (a) {
        case 1:
            w.Kilogram();
            break;
        case 2:
            w.Gram();
            break;
        case 3:
            w.Miligram();
            break;
        case 4:
            w.Pound();
            break;
        case 5:
            w.Ton();
            break;
        case 6:
            w.Ounce();
            break;
        default: {
            System.out.println("Wrong input. Please try again.");
        }
        }
    }
}

