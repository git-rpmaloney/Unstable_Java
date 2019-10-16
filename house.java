class house{
    public static void main(String cxzp[]){
        int rent;
        int counciltax;
        int electric;
        int water;
        int gas;
        int tvlicense;
        int renterinsurance;
        int netflix;
        int broadband;
        int mobilephones;
        int monthlycost;
        int salary;
        double cbcont;
        double totalrem;
        double net;
        int carinsu;
        double stulo;
        double rota;
        double cbrem;
        double job;
        job = (8.21 * 16)*4;
        carinsu = 163;
        rota = 13;
        stulo = 8994 / 12; 
        rent = 800;
        counciltax = 139;
        electric = 71;
        gas = 71;
        water = 21;
        tvlicense = 39/3;
        renterinsurance = 13;
        netflix = 12;
        broadband = 65;
        mobilephones = 30;
        monthlycost = rent + counciltax + electric + gas + water + tvlicense + renterinsurance + netflix + broadband +  mobilephones;
        salary = 1800;
        cbcont =(monthlycost * 0.25f);
        cbrem = stulo - (cbcont + carinsu + rota);
        net = (salary-monthlycost);
        totalrem = (cbcont + net);
        System.out.println("MONTHLY COST OF RUNNING THE HOUSE: " + monthlycost);
        System.out.println("NET (@ £1600): " + net);
        System.out.println("COURTNEY CONTRIBUTION: "+cbcont);
        System.out.println("AFTER COURTNEY CONTRIBUTION (NET): " + totalrem);
        System.out.println(cbrem);
        System.out.println((cbrem+totalrem)/2);   
        System.out.println((cbrem+totalrem+job)/2);  
        System.out.println(monthlycost);


    }
}