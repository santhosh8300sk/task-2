import java.util.*;

public class BankDetails {
   Scanner sc = new Scanner(System.in);
   private float bank_balance;
    
        public void deposit(float bank_balance){
             this.bank_balance=bank_balance;
             int amt;
           System.out.println("enter the amount you want to deposit");
           amt=sc.nextInt();
        this.bank_balance+=amt;
         System.out.println("amount "+this.bank_balance+" is deposited succesfully");
         
        }
        public void withdrawl(){
          int amt;
        System.out.println("enter the amount you want to withdraw");
        amt=sc.nextInt();
     this.bank_balance=this.bank_balance-amt;
      System.out.println("amount "+amt+" is withdrawn succesfully");
      System.out.println("balance amount is "+this.bank_balance);
     }
     public void checkBalance(){
     System.out.println("your account has "+this.bank_balance);
 }
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      float bb=0;
      String accno;
         BankDetails b=new BankDetails();
         String[] acc = new String[3];
         acc[0]= "22126510087";
         acc[1]="22126510115";
         acc[2]="221265101302";
         System.out.println("enter account number: ");
         accno = sc.nextLine();
         for(int i=0;i<acc.length;i++){
           if(accno.equals(acc[i])){
             break;
           }
           if(i==acc.length){
             System.out.println("account no is wrong");
             System.exit(0);
           }
         }
         while(true){
         
         System.out.println("Enter operation you want to perfform??\n1.Deposit\n2.withdrawl\n3.check balance\n4.exit");
         int m = sc.nextInt();
         switch(m){
                  case 1: b.deposit(bb);
                    break;
                  case 2: b.withdrawl();
                    break;
                  case 3: b.checkBalance();
                    break;
                  case 4: System.exit(0);
                    break;
                       
         }
         }
         
         }  
    }
