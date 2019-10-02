class tax{
    public static void main(String ayz[]){
        //definitions
        String name;
        int salary;
        float net;
        float tax = 0;
        //value assignment
        name = "Peter";
        salary = 1000;
        //conditional value assignment
        if(salary >=2000) tax = (salary*21)/100;
        if(salary <2000) tax = (salary*15)/100;
        net = salary-tax;
        //output of information
        System.out.println("YOUR INFORMATION: "+name);
        System.out.println("YOUR SALARY BEFORE TAX :"+salary);
        System.out.println("YOUR TAXED AMOUNT: "+tax);
        System.out.println("YOUR NET PAY: "+net);
        //end programme


    }
}