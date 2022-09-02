package application;

public class inheritanceDemo {
    public static void main(String[] args) {
        /*NormalMember mem1 = new NormalMember("James", 1, 2010);
        VIPMember mem2 = new VIPMember("Andy", 2, 2011);

        mem1.calculateAnnualFee();
        mem2.calculateAnnualFee();

        mem1.displayMemInfo();
        mem2.displayMemInfo();

        mem1.setDiscount();
        mem1.calculateAnnualFee();
        mem1.displayMemInfo();*/


        //Polymorphism

        Member[] clubMember = new Member[6];
        clubMember[0] = new NormalMember("James", 1, 2010);
        clubMember[1] = new NormalMember("Andy", 2, 2011);
        clubMember[2] = new NormalMember("Bill", 3, 2011);
        clubMember[3] = new VIPMember("Carol", 4, 2012);
        clubMember[4] = new VIPMember("Evelyn", 5, 2012);
        clubMember[5] = new VIPMember("Yvone", 6, 2013);

        for(Member m:clubMember){
            m.calculateAnnualFee();
            m.displayMemInfo();
        }



    }
}
