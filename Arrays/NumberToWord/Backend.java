class Backend{
    public static String converter(int number){
        String Ones [] = {"","one","two","three","four","five","six","seven","eight","nine","ten","eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","nineteen"};
        String Ty [] = {"", "twenty","thirty","fourty","fifty","sixty","seventy","eighty","ninety"};
        String Result = "";
        
        if(number>=1000){
            Result += Ones[number/1000]+"Thousand";
            number%=1000;
        }
        return converter;
    }
}