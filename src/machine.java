import javax.swing.*;
import java.io.IOException;
import java.util.Scanner;


 class machine {
     public static String a = "subhash123";
     public static int b = 1234,i,n=3,p=3,worngpin=0,worngid=0,ccash=1500,scash=200;
     public static Scanner sc = new Scanner(System.in);
     public static void main(String[] args)throws IOException {

         System.out.println("             ****Welcome to South Bihar Bank****\n\n");

         /*login();
         pass();*/
         menu();
         System.out.println("thanks for using BIHAR SOUTH BANK ATM");
     }


     public static void login()
     {
         System.out.println("Log In ID: ");
         while (worngid < 4) {
             String loginid = sc.nextLine();
             if (a.equals(loginid)) {
                 break;
             } else
             {
                 System.out.println("             $$$$$$$Invalid User ID$$$$$$$");
                 System.out.println("number of attempt left :" + n);
                 worngid++;
                 n--;
                 if (n!=-1) {
                     System.out.println("          Renter Log In ID: ");
                 }
             }
         }
     }



     public static  void pass() {
         System.out.println("enter password: ");
         n=3;
         while (worngpin < 4) {
             int pass = sc.nextInt();
             if (pass != b) {
                 System.out.println("             $$$$$$$wrong password$$$$$$$");
                 System.out.println("number of attempt left :" + n);
                 worngpin++;
                 n--;
                 if (n != -1) {
                     System.out.println("        enter passs word again ");
                 }
             } else
                 break;
         }
     }


     public static void menu()
     {
         System.out.println("1.Current Account\n2.Saving Account\n3.Total Bank Balance\n4.Cancel");
         byte ch = sc.nextByte();
         switch (ch)
         {
             case 1:
                 ca();
             case 2:
                 /*sa();*/
                 break;

             case 3:
             {
                 System.out.println(ccash+scash);
             }break;
             case 4:
                 break;
         }
     }

     public static void ca()
     {
         int chance=0;
         System.out.println("Current Account");
         System.out.println("1.Cash Withdrawal\n2.Balance Inquiry\n3.Cash Deposit\n4.Exit\n5.back");
         byte ch= sc.nextByte();
         switch (ch) {
             case 1:
                 while (chance < 3) {
                     System.out.println("enter amount in Multiple of  ₹500");
                     int amm = sc.nextInt();

                     if (amm  <500) {
                         System.out.println("can't withdrwa cash less than ₹500");
                     }
                     else if (amm % 500 != 0) {
                         System.out.println("not valid amount entered");
                     }
                     else if(amm>ccash)
                     {
                         System.out.println("INsuffun fund");
                     }
                     if (amm % 500 == 0 && ccash >= amm) {
                         ccash = ccash - amm;
                         System.out.println("balance left is " + ccash);
                         break;
                     }

                     chance++;
                 }




             break;
             case 2:
             {
                 System.out.println(ccash);
             }break;

             case 3:
             {
                 byte choice=0;
                 while(choice<3)
                 { System.out.println("enter amount ");
                     int amm=sc.nextInt();
                     if(amm<0)
                     {
                         System.out.println("error ammount caant be less than 0");
                     }
                     else
                     {
                         ccash=ccash+amm;
                         System.out.println(" current balance is "+ccash);
                         break;
                     }

                     choice++;


                 }


             }break;
             case 4:
                 break;
             case 5:
                 menu();
         }
     }






 }



