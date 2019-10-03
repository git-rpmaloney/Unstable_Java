class search{ 
    public void searchterm(String msg, String find){
        int findcount=0;
        String word = "";
        String Alpha;
        int i = 0;
        for(;i<msg.length();i++){
            Alpha = msg.substring(i,i+1);
            if(Alpha.equals(" ")){
                System.out.println(word);
                if(word.equals(find)){
                    System.out.println("***FOUND!!***");
                    findcount+=1;
                }
                word="";
            }
            else{
                word+=Alpha;
            }
            
        }
         System.out.println("TOTAL FINDCOUNT IS "+(findcount));
    }
}