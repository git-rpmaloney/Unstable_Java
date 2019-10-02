class embeddedif {
    public static void main(String asdf[]){
    int num;
    num = 100;
    if(num >500){
        System.out.println("Greater than 500");
        if(num > 900){
            System.out.println("Number greater than 900");
        }
        else{
            System.out.println("Number not greater than 900");
        }
        }
        else{
            System.out.println("Number not greater than 500");
            if(num>=100){
                System.out.println("Number is greater than 100");
            }
            else{
                System.out.println("Number is not greater than 100");
            }
        }
    }
}