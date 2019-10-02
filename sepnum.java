class sepnum{
    public static void main(String avcp[]){
        int Bill;
        int Paid;
        int BalanceDue;
        int NewBalance;
        Bill = 1;
        Paid = 50;
        BalanceDue = Paid-Bill;
        NewBalance = BalanceDue;
        if(NewBalance>=50){
            System.out.println("Fifty :"+NewBalance/50);
            NewBalance = (NewBalance%50);
            
        }
        if(NewBalance>=20){
            System.out.println("Twenty x"+NewBalance/20);
            NewBalance = (NewBalance%20);
            
            }
        if(NewBalance>=10){
            System.out.println("Ten x"+NewBalance/10); 
            NewBalance =(NewBalance%10);
            
            }
        if(NewBalance>=5){
            System.out.println("Five x"+NewBalance/5);
            NewBalance = (NewBalance%5);
            
        }
        if(NewBalance>=2){
            System.out.println("Two Pounds x"+NewBalance/2);
            NewBalance = (NewBalance%2);
           
        }
        if(NewBalance>=1){
            System.out.println("One Pounds x"+NewBalance/1);
            NewBalance = (NewBalance%1);
            
        }
        }
    }
