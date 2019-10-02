class gcsetem{ 
    private int phy,mat,eng,ict; //data variables - each of these is private and cannot be edited outside of the class objects contained within
    private float perc,aggr,total; //data variables - none of these can be edited outside of the class 
    private int valid = 0; //declare the validity variable and assign initial value as 0
    private int failed = 0; //declare variable for number of failed exams
    private String warning = "THE VALUE ENTERED FOR ONE OF THE MARKS VIOLATES MARKING CONSTRAINTS -  IT HAS BEEN INDICATED BY A 0 ON THE MARKS SHEET"; //this is the warning message displayed where there is a violation

    public void Physics(int A){ 
        if(A>=0 & A<=150){
            phy=A;
            if(phy<60){
                failed+=1;
            }
        }
        else{
            valid = 1;
            System.out.println(warning);
        }
    }
    public void Maths(int B){
        if(B>=0 & B<=150){
            mat=B;
            if(mat<60){
                failed+=1;
            }
        }    
        else{
             valid =1;
             System.out.println("THE VALUE ENTERED FOR MATHS VIOLATES THE CONSTRAINTS OF THE MARK SET");
        }
    }
    public void English(int C){
        if(C>=0 & C<=150){
            eng=C;
            if(eng<60){
                failed+=1;
            }
        }
        else{
            valid=1;
             System.out.println("THE VALUE ENTERED FOR ENGLISH VIOLATES THE CONSTRAINTS OF THE MARK SET");
        }
    }
    public void ICT(int D){
        if(D>=0 & D<=150){
            ict=D;
            if(ict<60){
                failed+=1;
            }
        }
        else{
            valid=1;
             System.out.println("THE VALUE ENTERED FOR ICT VIOLATES THE CONSTRAINTS OF THE MARK SET");
        }
    }
    
    public void Calculation(){
        if(valid==0){
        total=mat+phy+eng+ict;
        aggr=total/4;
        perc=total*100/600;
        System.out.println("YOUR MARKS ARE:");
        System.out.println("");
        System.out.println("Maths Marks: "+mat);
        System.out.println("");
        System.out.println("English Marks: "+eng);
        System.out.println("");
        System.out.println("ICT Marks: "+ict);
        System.out.println("");
        System.out.println("Physics Marks: "+phy);
        System.out.println("");
        System.out.println("Total Marks: "+total);
        System.out.println("");
        System.out.println("Aggregate Marks: "+aggr);
        System.out.println("");
        System.out.println("Percentage Overall: "+perc);
        System.out.println("");
        PassFail();
        }
        else{
            System.out.println("***WARNING: ERRORl - THERE ARE INVALID MARKS WITHIN THE SHEET, MARKS INCALCULABLE,***");
        }
 }

    public void PassFail(){
        if(failed==0){
            System.out.println("YOU HAVE PASSED THE YEAR!");
        }
        if(failed==1){
            System.out.println("YOU HAVE FAILED ONE EXAM, YOU NEED TO RESIT THE EXAM");
        }
        if(failed==2){
            System.out.println("YOU HAVE FAILED TWO EXAMS, YOU NEED TO REPEAT THE COURSE");
        }
        if(failed>=3){
            System.out.println("YOU HAVE FAILED THREE OR MORE EXAMS, YOU NEED TO SEE AN ADMINISTRATOR");
        }
    }

    }
