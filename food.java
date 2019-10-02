class food{
    public static void main(String f[]){
        int foodrem;
        int people; //this works because ryan wrote it and therefore there is no need to change it :) 
        float foodreq;
        foodrem = 100;
        people = 10;
        foodreq = (foodrem/people);
        
        if(foodreq>4) System.out.println("There is enough food for everyone, precisely " + foodreq + " units of food per person.");
        else System.out.println("There is not enough food for everyone, currently there is only " + foodreq + " per person. You need " + (4 - foodreq) + " more to feed everyone.");
        

    }
}