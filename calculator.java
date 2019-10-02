class calculator{
    public static void main(String BX[]){
        account ac;
        ac = new account();
        String Name;
        int Salary;
        float Tax,Net;
        Name = "James";
        Salary = 28000;
        Net = (Salary-ac.tax(28000))/12;
        System.out.println(Net);
        System.out.println(ac.tax(28000));
    }
    }