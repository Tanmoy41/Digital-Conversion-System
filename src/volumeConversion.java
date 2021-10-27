
import java.util.*;
import java.text.DecimalFormat;

class Volume
{
     Scanner sc = new Scanner(System.in);
        double volume, liters, barrels, gallons,pints,cubicfeet, cubicmeter;
        
        
        DecimalFormat f = new DecimalFormat("##.##");
     
        
        
   public  void Liters(){
           System.out.println("Enter the volume: ");
        volume = sc.nextFloat();
        
        
            barrels = volume *0.00629;
            System.out.println("Your " +volume + " liter is : " + f.format(barrels) + " Barrels");
 
            gallons= volume*0.264;
            System.out.println("Your " + volume+ " liter is : " + f.format(gallons) + " Gallons");
 
            pints = volume / 2.113;
            System.out.println("Your " + volume+ " liter is : " + f.format(pints) + " Pints");
 
            cubicfeet= volume/ 0.0353;
            System.out.println("Your " + volume+ " liter is : " + f.format(cubicfeet) + " Cubicfeet");
 
            cubicmeter= volume/ 0.001;
            System.out.println("Your " + volume+ " liter is : " + f.format(cubicmeter) + " Cubicmeter");
        
        
        }
        
   public  void Barrels()
        {
             System.out.println("Enter the volume: ");
        volume = sc.nextFloat();
        
            liters= volume* 158.987;
            System.out.println("Your " + volume + " barrels is : " + f.format(liters) + " Liters");
 
            pints= volume* 252;
            System.out.println("Your " + volume + " barrels is : " + f.format(pints) + " Pints");
 
            gallons = volume* 3785.412;
            System.out.println("Your " + volume + " barrels is : " + f.format(gallons) + " Gallons");
 
            cubicfeet = volume* 5.614583333;
            System.out.println("Your " + volume + " barrels is : " + f.format(cubicfeet) + " Cubic feet");
 
            cubicmeter= volume* 0.16;
            System.out.println("Your " + volume+ " barrels is : " + f.format(cubicmeter) + " Cubic metet");
            
        }
        
      public  void Gallon()
        {
             System.out.println("Enter the volume : ");
        volume = sc.nextFloat();
        
            liters= volume* 4.54609;
            System.out.println("Your " + volume + " gallon is : " + f.format(liters) + " Liters");
 
            pints = volume * 8;
            System.out.println("Your " + volume+ " gallon is : " + f.format(pints) + " Pints");
 
            barrels= volume* 0.036941180600848;
            System.out.println("Your " + volume+ " gallon is : " + f.format(barrels) + " Barrels");
 
            cubicmeter= volume* 0.00378541;
            System.out.println("Your " + volume+ " gallon is : " + f.format(cubicmeter) + " Cubic meter");
 
            cubicfeet= volume* 0.134 ;
            System.out.println("Your " + volume+ " gallon is : " + f.format(cubicfeet) + " Cubic feet");
            
        }
        
     public   void Pints()
        {
              System.out.println("Enter the amount of money : ");
        volume= sc.nextFloat();
        
             liters = volume * 0.473;
            System.out.println("Your " + volume + " pints is : " + f.format(liters) + " Liters");
 
            barrels = volume * 0.004032;
            System.out.println("Your " + volume+ " pints is : " + f.format(barrels) + " Barrels");
 
            gallons = volume* 0.125;
            System.out.println("Your " + volume+ " pints is : " + f.format(gallons) + " Gallons");
 
            cubicmeter = volume* 0.000473;
            System.out.println("Your " + volume+ " pints is : " + f.format(cubicmeter) + " Cubic meter");
            
            cubicfeet= volume * 0.0167;
            System.out.println("Your " + volume + " pints is : " + f.format(cubicfeet) + " Cubic feet");
            
        }
        
 
    public  void Cubicfeet()
        {
              System.out.println("Enter the volume: ");
        volume = sc.nextFloat();
        
             liters = volume * 28.317;
           System.out.println("Your " + volume+ " Cubicfeet is : " + f.format(liters) + " Liters");
 
            gallons = volume * 7.481;
            System.out.println("Your " + volume+ " Cubicfeet is : " + f.format(gallons) + " Gallons");
 
             barrels= volume* 0.18;
            System.out.println("Your " + volume+ " Cubicfeet is : " + f.format(barrels) + " Barrels");
 
            pints = volume* 59.844;
            System.out.println("Your " + volume + " Cubicfeet is : " + f.format(pints) + " Pints");
 
            cubicmeter= volume* 0.0283;
            System.out.println("Your " + volume + " Cubicfeet is : " + f.format(cubicmeter) + " Cubic meter");
            
        }
        
     public  void Cubicmeter()
        {
             System.out.println("Enter the volume : ");
        volume = sc.nextFloat();
        
            liters = volume * 1000;
            System.out.println("Your " + volume + " cubicmeter is : " + f.format(liters) + " Liters");
 
            gallons = volume * 264.172;
            System.out.println("Your " + volume + " cubicmeter is : " + f.format(gallons) + " Gallon");
 
            barrels = volume* 6.29;
            System.out.println("Your " + volume + " cubicmeter is : " + f.format(barrels) + " Barrels");
 
            pints = volume* 2113.376;
            System.out.println("Your " + volume+ " cubicmeter is : " + f.format(pints) + " Pints");
 
            cubicfeet = volume* 35.315;
            System.out.println("Your " + volume + " cubicmeter is : " + f.format(cubicfeet) + " Cubic feet");
            
            
        } 

}


public class volumeConverter {
 
    public static void main(String[] args) {
        
        Volume v = new Volume();
        
   Scanner sc = new Scanner(System.in);
 
        System.out.println("\t Welcome to the volume Converter!\t\n");
 
        System.out.println("\tMain menu of Volume convertion.\t");
        System.out.println("\t----------------------------------");
        
        System.out.println("1:Liters.....\n2:Barrels....... \n3:Pints......... \n4:Gallon........ \n5:Cubic Meter......\n6:Cubic Feet......");
 
 
        
       System.out.println("Enter the volume number: ");
      int a=sc.nextInt();
       
        
       switch(a){
            
       case 1:
        v.Liters();
        break;
        
        case 2:
        v.Barrels();
         break;
         
         case 3:
         v.Pints();
          break;
          
         case 4:
          v.Gallon();
          break;
        
         case 5: 
         v.Cubicmeter();
           break;
        
        case 6:
        v.Cubicfeet();
         break;
        
       
       
         default:
          {
            System.out.println("Wrong input. Please try again.");
        }

        }
    }
}
