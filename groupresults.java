class groupresults{
    public static void main(String XP[]){
       
        //declaring reference points 
        results Peter;
        results Mark;
        Mark = new results();
        Peter = new results();

        //define Mark's Results
        Mark.student = "Mark";
        Mark.phy = 60;
        Mark.eng = 70;
        Mark.chem = 77;
        Mark.maths = 71;
        Mark.showresults();


        //define Peter's Results
        Peter.student = "Peter";
        Peter.phy = 77;
        Peter.eng = 82;
        Peter.chem = 89;
        Peter.maths = 78;
        Peter.showresults();



    }
}