class braces2{
    public static void main(String qwerty[]){
        //defining the variables
        String name;
        int salary;
        float tax = 0;
        float net;
        //assigning values to variables
        name = "Rakcity";
        salary = 28000;
        //dependent variables
        if(salary>1500){
            tax = (salary*21)/100;
            net = salary - tax;
            System.out.println("Your salary is: "+salary);
            System.out.println("Your tax deduction is: "+tax);
            System.out.println("Your net pay is: "+net);
        }
        else{
            System.out.println("No tax is due.");
        }
    }
}