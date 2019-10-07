class exception2{
    public static void main(String X[]){
    try{
        int Result;
            Result = 4/0;
            System.out.println(Result);
        }
        catch(ArithmeticException E){
            System.out.println("YOU ARE TRYING TO DIVIDE BY ZERO YOU NUMPTY!");
        }
    }
}