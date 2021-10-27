
import java.util.*;
import java.text.DecimalFormat;

 class Currency
{
    Scanner sc = new Scanner(System.in);
        double amount, dollar, pound, euro, yen,  rupee,taka,dinar;
        
        
        DecimalFormat f = new DecimalFormat("##.##");
  
    
        
   public  void Rupee(){
           
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
        dinar = amount*0.0040;
         System.out.println("Your " + amount + " Rupee is : " + f.format(dinar) + " Kuwaiti dinar");
        
        }
        
   public  void Dollar()
        {
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
 
            taka = amount *85.49;
            System.out.println("Your " + amount + " Dollar is : " + f.format(taka) + " taka");
            dinar = amount*0.30;
             System.out.println("Your " + amount + " Dollar is : " + f.format(dinar) + " Kuwaiti dinar");
        }
        
      public  void Pound()
        {
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
            dinar = amount*0.41;
             System.out.println("Your " + amount + " Pound is : " + f.format(dinar) + " Kuwaiti dinar");
        }
        
     public   void Euro()
        {
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
            dinar = amount*0.35;
             System.out.println("Your " + amount + " euro is : " + f.format(dinar) + " Kuwaiti dinar");
        }
        
      public  void Yen()
        {
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
            dinar = amount*0.0026;
             System.out.println("Your " + amount + " yen is : " + f.format(dinar) + " Kuwaiti dinar");
        }
        
     public  void Taka()
        {
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
            dinar = amount*0.0035;
             System.out.println("Your " + amount + " taka is : " + f.format(dinar) + " Kuwaiti dinar");
            
        }
        
          public  void Dinar()
        {
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





public class Main {
	public static void main(String[] args) {
		Currency c = new Currency();
		Scanner sc = new Scanner(System.in);
		   System.out.println("\tHi, Welcome to the Currency Converter!\t\n");
 
        System.out.println("\tMain menu of currency convertion.\t");
        System.out.println("\t----------------------------------");
        
        System.out.println("1:Ruppe......\n2:Dollar....... \n3:Pound......... \n4:Euro........ \n5:Yen......\n6:Taka.......\n7: Dinar");
        System.out.println("Enter the currency number that you want to convert: ");
      int choice=sc.nextInt();
       
        
       switch(choice){
            
       case 1:
        c.Rupee();
  
        break;
        case 2:
        c.Dollar();
         break;
         
         case 3:
         c.Pound();
          break;
          
         case 4:
          c.Euro();
           break;
        
         case 5: 
         c.Yen();
           break;
        
        case 6:
        c.Taka();
        break;
        
        case 7:
        c.Dinar();
         default:
          {
            System.out.println("Wrong input. Please try again.");
        }

        }
	}
}
