import java.util.Scanner;

class BankAcc {
    private double Balance;

    public BankAcc(double initialbalance) {
        Balance = initialbalance;
    }

    public double getbalance() {
        return Balance;
    }

    public void deposit(double amount) {
        Balance += amount;
    }

    public boolean withdraw(double amount) {
        if (amount <= Balance) {
            Balance -= amount;
            return true;
        } else {
            return false;
        }
    }
}

class ATM {
    private BankAcc acnt;

    public ATM(BankAcc acnt) {
        this.acnt = acnt;
    }

    public void displayMenu() {
        System.out.println("Welcome to the ATM!");
        System.out.println("1. Check Balance");
        System.out.println("2. Deposit amount");
        System.out.println("3. Withdraw amount");
        System.out.println("4. Exit the page");
    }

    public void processTransaction() {
        Scanner scanner = new Scanner(System.in);
        int choice;
        double amount;

        while (true) {
            displayMenu();
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Your balance is: Rs. " + account.getBalance());
                    break;
                case 2:
                    System.out.print("Enter the deposit amount: Rs. ");
                    amount = scanner.nextDouble();
                    if (amount > 0) {
                        account.deposit(amount);
                        System.out.println("Deposit successful.");
                    } else {
                        System.out.println("Invalid deposit amount.");
                    }
                    break;
                case 3:
                    System.out.print("Enter the withdrawal amount: Rs. ");
                    amount = scanner.nextDouble();
                    if (amount > 0 && account.withdraw(amount)) {
                        System.out.println("Withdrawal successful.");
                    } else {
                        System.out.println("Invalid withdrawal amount or insufficient balance.");
                    }
                    break;
                case 4:
                    System.out.println("Thank you for using the ATM. Goodbye!");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}       public static void main(String[] args) {
        BankAcc userAccount = new BankAcc(1000.0); // Initial balance of Rs. 1000
        ATM atm = new ATM(userAccount);
        atm.processTransaction();
    }
}