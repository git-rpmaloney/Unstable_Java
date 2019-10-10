

import java.util.Random;

public class GiveFeedback{

    final static int NO_WORDS = 5;	
    final static int NO_SENTS = 20;	
    final static String SPACE = " ";	
    final static String PERIOD = ".";

    static Random r = new Random();

    public static void main( String args[] ){

        String article[] = { "Your", "This", "this week's", "tuesday's", "monday's" };
        String noun[] = { "feedback's", "reflection's", "understanding's", "consideration's", "approach's" };
        String verb[] = { "good", "excellent", "feedback-like", "reflection-like", "learning-like" };
        String preposition[] = { "try", "maybe", "how about", "why don't you", "Shafeeq" };

        String sentence;
        for (int i = 0; i < NO_SENTS; i++){
            sentence = article[rand()];
            char c = sentence.charAt(0);
            sentence = sentence.replace( c, Character.toUpperCase(c) );
            sentence += SPACE + noun[rand()] + SPACE;
            sentence += (verb[rand()] + SPACE + preposition[rand()]);
            sentence += (SPACE + article[rand()] + SPACE + noun[rand()]);
            sentence += PERIOD;
            System.out.println(sentence);
            sentence = "";
        }
    }

    static int rand(){
        int ri = r.nextInt() % NO_WORDS;
        if ( ri < 0 )
            ri += NO_WORDS;
        return ri;
    }
}

