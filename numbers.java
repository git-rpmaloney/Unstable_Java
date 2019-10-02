class numbers{
    public static void main(String cbv[]){

//definitions
int num;
num = 27;

//conditional statements
if(num>2000){
    System.out.println("Number is bigger than 2000");
    if(num>3000){
        System.out.println("Number is greater than 3000");
    }
    else{
        System.out.println("Number is not greater than 3000");
        System.out.println("No additional questioning");
    }
    System.out.println("End of 2000 Questioning");
}

else{
    System.out.println("Number is not greater than 2000");
    if(num >1000){
        System.out.println("Number greater than 1000");
        if(num>1500){
            System.out.println("Number greater than 1500");
        }
        else{
                System.out.println("Number not greater than 1500");
            }
        
    }
    else{
        System.out.println("Number is not greater than 1000");
    }
    System.out.println("Final Statement");
}
    }
}