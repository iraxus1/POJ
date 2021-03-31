package pl.edu.pja;

import java.util.Scanner;

public class ATM {
    private int setAmount;
    private int choice;

    Account[] accounts = new Account[10];

    public ATM(int setAmount) {
        this.setAmount = setAmount;
        this.choice = 0;
    }

    public void setUsers(){
        for (int i = 0; i < 10; i++) {
            accounts[i] = new Account(i);
        }
    }

    public void setError(int choice) {
        if(choice > 9 || choice < 0){
            System.out.println("Error, type another ID(0-9)!");
        }
        else{
            this.choice = choice;
        }
    }

    private void withdraw(int input){
        if(accounts[choice].getmoney() < input){
            System.out.println("You don`t have enough money to withdraw!");
        }
        else if(input < 0){
            System.out.println("Entered value is <0!");
        }
        else{
            accounts[choice].setmoney(accounts[choice].getmoney() - input);
        }
    }

    private void deposit(int input){
        if(input < 0){
            System.out.println("Entered value is <0!");
        }
        else{
            accounts[choice].setmoney(accounts[choice].getmoney() + input);
        }
    }

    private void MainMenu(){
        System.out.println("User " + "[" + this.choice + "]\n[1]: Check balance\n[2]: Withdraw\n[3]: Deposit\n[4]: Change account\n[5]: Exit");
    }

    public void switchATM(){
        setError(choice);
        boolean exit = true;
        do{
            MainMenu();
            int input = new Scanner(System.in).nextInt();
            switch(input){
                case 1:{
                    System.out.println("Check balance: " + accounts[this.choice].getmoney());
                    break;
                }
                case 2:{
                    System.out.print("How much do you want to withdraw: ");
                    int variable = new Scanner(System.in).nextInt();
                    withdraw(variable);
                    break;
                }
                case 3:{
                    System.out.print("How much do you want to deposit: ");
                    int variable = new Scanner(System.in).nextInt();
                    deposit(variable);
                    break;
                }
                case 4:{
                    System.out.print("Type another ID: ");
                    int variable = new Scanner(System.in).nextInt();
                    setError(variable);
                    break;
                }
                case 5:{
                    exit = false;
                    break;
                }
            }
        }while(exit);
    }
}
