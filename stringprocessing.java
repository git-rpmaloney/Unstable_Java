class StringProcessing{
    
    //PRINTING A VERTICAL TEXT STARTS HERE
    public void printvertical(String msg){
        int i;
        for(i=0; i < msg.length();i+=1){
            System.out.println(msg.substring(i,i+1));
        }
    }

    // WORD COUNT STARTS HERE
    public void wordcount(String msg){
        int spacecount =0;
        String alpha;
        int i=0;
        for(i=0; i<msg.length();i+=1){
            alpha = msg.substring(i,i+1);
            if(alpha.equals(" ")){
                spacecount+=1;
            } 
            else{
                System.out.println("We have "+(spacecount+1)+" words.");
            }
        }
    }

    //PRINT VERTICALLY STARTS HERE
    public void find(String msg, String lookfor){
        String word = " ", Alpha;
        int i = 0;
        int findcount=0;
        for(;i<msg.length();i++){
            Alpha = msg.substring(i,i+1);
            if(Alpha.equals(" ")){
                if(word=="am"){
                    ++findcount;
                    System.out.println("Found +1" +lookfor+" "+findcount);
                }
                System.out.println(word);
                word=" ";
            }
            else{
                word+=Alpha;
            }
            }
            System.out.println(findcount);
        }



        }
    }
}
}
    


