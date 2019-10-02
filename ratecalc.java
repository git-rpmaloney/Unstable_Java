class ratecalc{
    public void ratecalc(){
        System.out.println("Rates are: ");
        System.out.println("");
        System.out.println("30%");
    }
    public void ratecalc(int salary){
        float result;
        result = salary * 0.3f;
        System.out.println("Result is: "+result);
    }
    public void ratecalc(double salary, double rate){
        float result;
        result = salary * rate;
        System.out.println("Based on your calculation: "+rate);
    }
}