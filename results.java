class results{
    int maths,phy,chem,eng;
    private float total, aggr;
    String student;
    //show results method

private void calculations(){
total = maths+phy+chem+eng;
aggr = total/4;
}

public void showresults(){
calculations();
System.out.println("STUDENT:"+student);
System.out.println("Maths "+maths);
System.out.println("Physics "+phy);
System.out.println("Chemistry "+chem);
System.out.println("English "+eng);
System.out.println("Total Marks "+total);
System.out.println("Aggregate "+aggr);
System.out.println("");
}
}