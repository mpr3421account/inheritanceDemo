package application;
//child class or sub-class
public class NormalMember extends Member{

    public NormalMember(){
        System.out.println("Child constructor with no parameter");


    }

    public NormalMember(String pName, int pMemberID, int pMemberSinse) {
        super(pName, pMemberID, pMemberSinse);
        System.out.println("Child Constructor with 3 parameters");
    }


   @Override
    public void calculateAnnualFee(){
        annualFee = (1-0.01*getDiscount())*(100+12*30);
    }
}
