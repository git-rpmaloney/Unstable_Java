class bank{
    private float balance;
    private String member;
    int savings;

    public void updatebal(int newbal, String memname){
    balance = newbal;
    member = memname; 
    System.out.println("Your name is: "+member);
    System.out.println("Your balance is: "+balance);
    }
}