class multiple_exceptions{
    public static void main(String x[]){
    String No1, No2, No3;
    float Result;
    No1 = "HELLO";
    No2 = "40";
    No3 = "50";
    
    try{
     Result = Integer.parseInt(No1)/Integer.parseInt(No2);
        System.out.println("Result is"+Result);
    }
    catch(Exception C){
        System.out.println("AN UNKNOWN ERROR HAS OCCURED! AHHHHH!");
    }
    catch(ArithmeticException A){
        System.out.println("YOU CANNOT DIVIDE BY ZERO!");
    }
    catch(NumberFormatException B){
        System.out.println("ARE YOU SURE YOUR NUMBER IS NOT A LETTER?");
    }
    
}
}