class ComparativeArray{
    public static void main(String args[]){
        int number[] = {12,100,230,345,3456,239,1834,5882,2884,01};
        int i;
        int maxvalue = number[0];

        for(i=0;i<number.length;i++){
            if(number[i]>maxvalue){
                maxvalue = number[i];
                System.out.println("MAX VALUE UPDATED WITH:"+maxvalue);
                System.out.println("");
            }
        }
        System.out.println("The maximum value in array is: "+maxvalue);
    }
}