class interest_obj{
    static float base;
    
    public void calculate(int loan){
        float totalinterest = loan * base;
        System.out.println("Total Interest Is: "+totalinterest);
    }

    public void setbase(float setter){
        base = setter; 
    }
}