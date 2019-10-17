import java.util.*;
class CLITest{
    public static void main(String args[]){

        Scanner usrn = new Scanner(System.in);
        Scanner passw = new Scanner(System.in);
        System.out.println("Welcome to CLI");
        try{
        Thread.sleep(2000);//2000ms = 2s
        }
        catch(InterruptedException ex){
        };
        System.out.println("Please enter your login details:");
        System.out.print("Enter your username: ");
        String Username = usrn.next();
        System.out.print("Enter your Passcode ####: ");
        String Password = passw.next();
    }
}