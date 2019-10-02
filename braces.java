class braces{
    public static void main(String qwerty[]){
        //defining variables
        int phy;
        int chem;
        int math;
        int total;
        float pct;
        //assigning values  
        phy = 100;
        chem =90;
        math = 70;
        total = phy+chem+math;
        pct = (total*100)/450;
        //conditional value statements
        if(pct >=50){
            System.out.println("Total: " + total);
            System.out.println("Percentage: " + pct);
            System.out.println("You have passed the term");
        }
        else{
            System.out.println("You have failed the term.");
        }

        }
    }
