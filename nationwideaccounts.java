class nationwideaccounts{
    public void NetSalary(int salary, int absent) throws absentee{
        float tax = 0, net = 0;
        if(absent > 5){
            absentee e1 = new absentee();
            throw e1;
        }
        tax = salary*21/100;
        net = salary - net;
        System.out.println("Your salary: "+salary);
        System.out.println("Your Tax: "+tax);
        System.out.println("Your Net: "+net);
    }
}