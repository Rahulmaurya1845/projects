import java.util.*;

class virat {
    int PIN = 2345;
    float balance;

    public void checkpin() {
        System.out.println("Enter the pin:");
        Scanner sc = new Scanner(System.in);
        int enterpin = sc.nextInt();
        if (enterpin == PIN) {
            menu();
        } else {
            System.out.println("Enter the valid pin:");
            menu();
        }
    }

    public void menu() {
        System.out.println("Enter Your Choice");
        System.out.println("1. Check Accbalance");
        System.out.println("2. Withdraw money");
        System.out.println("3. Deposit Money");
        System.out.println("4.Exit");
        Scanner sc = new Scanner(System.in);
        int opt = sc.nextInt();
        if (opt == 1) {
            checkbalance();
        } else if (opt == 2) {
            withdraw();
        } else if (opt == 3) {
            depositmoney();
        } else if (opt == 4) {
            return;
        } else {
            System.out.println("Enter the valid choice");
        }
    }

    public void checkbalance() {
        System.out.println("balance" + balance);
        menu();
    }

    public void withdraw() {
        System.out.println("Enter the amount you want to withdraw");
        Scanner sc = new Scanner(System.in);
        float amount = sc.nextFloat();
        if (amount > balance) {
            System.out.println("Insufficient balance");
        } else {
            balance = balance - amount;
            System.out.println("Balance withdraw successfully");
        }
        menu();
    }

    public void depositmoney() {
        System.out.println("Enter the Amount");
        Scanner sc = new Scanner(System.in);
        float amount = sc.nextFloat();
        balance = balance + amount;
        System.out.println("Balance deposit successfully");
        menu();
    }

}

public class atm {

    public static void main(String[] args) {
        virat obj = new virat();
        obj.checkpin();
    }
}