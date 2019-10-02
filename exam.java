class exam{
    private int maxmarks;
    public exam(int marksmax){
        maxmarks = marksmax ;
    }
    public void showresults(int marksobt){
        float perc = (float)marksobt*100/maxmarks;
        System.out.println("Your maximum obtainable marks are: "+maxmarks);
        System.out.println("");
        System.out.println("You obtained:"+marksobt+" Marks");
        System.out.println("");
        System.out.println("A total percentage of: "+perc);
        

        if(perc>=60){
            System.out.println("");
            System.out.println("***RESULTS AWARD SECTION***");
            System.out.println("You have passed the exam.");
            System.out.println("***END OF AWARD SECTION***");
        }
        else{
            System.out.println("");
            System.out.println("***RESULTS AWARD SECTION***");
            System.out.println("You have failed the exam.");
            System.out.println("***END OF AWARD SECTION***");
        }
    }
 }
