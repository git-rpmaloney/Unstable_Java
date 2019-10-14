class fizzBuzz{
public String fizzBuzz(int arg1) {
    int collected = arg1;
    if((collected%3 == 0 && collected%5 == 0)) {
        String phrase = "fizzbuzz";
        return phrase; 
    }
    else if((collected%3)==0) {
        String phrase = "fizz";
        return phrase; 
    }
    else if((collected%5)==0) {
        String phrase = "buzz";
        return phrase;
    }
    else {
        return null;
    }
}
}