class ArrayMath{
    public static void main(String args[]){
        int No1, No2;
        float Result = 0;
        String Sign;

        try{
            No1 = Integer.parseInt(args[0]);
            No2 = Integer.parseInt(args[2]);
            Sign = args[1];

            if(Sign.equals("+")){
                Result = No1 + No2;
            }

            if(Sign.equals("-")){
                Result = No1 - No2;
            }

            if(Sign.equals("/")){
                Result = No1 / No2;
            }

            if(Sign.equals("x")){
                Result = No1 * No2;
        
            }


            System.out.println(Result);
        }
        catch(ArithmeticException X){
            System.out.println("You cannot divide by zero, numpty.");
        }
        catch(ArrayIndexOutOfBoundsException Y){
            System.out.println("Try putting something in the box, idiot.");
        }
    }
}