package entities;


import java.util.Scanner;

public class Member {



    public String welcome = "Welcome to ABC Fitness";

    protected double annualFee;
    private String name;
    private int memberID;
    private int memberSinse;
    private int discount;

    public Member(){
        System.out.println("Parent Constructor with no parameter");
    }

    public Member(String pName, int pMemberID, int pMemberSinse) {
        name = pName;
        memberID = pMemberID;
        memberSinse = pMemberSinse;
    }

    public int getDiscount() {
        return discount;
    }

    public void setDiscount() {
        Scanner input = new Scanner(System.in);
        String password;
        System.out.print("Please enter the admin password:");
        password = input.nextLine();

        if(password.equals("abcd")){
            System.out.println("Invalid Password. You do not have authority to edit discount.");
        }
        else {
            System.out.print("Please enter the discount: ");
            discount = input.nextInt();
        }

    }
    public void displayMemInfo(){
        System.out.println("Member Name: " + name);
        System.out.println("Member ID: " + memberID);
        System.out.println("Member Since: " + memberSinse);
        System.out.println("Annual Fee: " + annualFee);
    }

    public void calculateAnnualFee(){
        annualFee = 0;
    }


}
