class findthisword{
public static void main(String args[]){
int findcount=0;
        String word = "";
        String Alpha;
        String find = "bert";
        String message = "i am bert and my name is bert and i love bert ";
        int i = 0;
        for(;i<message.length();i++){
            Alpha = message.substring(i,i+1);
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