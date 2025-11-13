public class payment {
     public static void main(String[] args) {
         Payment p1 = new Payment();
         p1.pay(500);         Payment p2 = new CreditCardPayment();
         p2.pay(1000);         Payment p3 = new UpiPayment();
         p3.pay(1500);         Payment p4 = new NetBankingPayment();
         p4.pay(2000);
     }
 }
 class Payment {
     void pay(double amount) {
         System.out.println("General payment of ₹" + amount);
     }
 }
 class CreditCardPayment extends Payment {
     void pay(double amount) {
         System.out.println("Paid ₹" + amount + " using Credit Card.");
     }
 } class UpiPayment extends Payment {
     void pay(double amount) {
         System.out.println("Paid ₹" + amount + " using UPI.");
     }
 } class NetBankingPayment extends Payment {
     void pay(double amount) {
         System.out.println("Paid ₹" + amount + " using Net Banking.");
     }
 }