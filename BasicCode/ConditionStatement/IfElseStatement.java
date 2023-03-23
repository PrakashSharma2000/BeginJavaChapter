package ConditionStatement;

public class IfElseStatement {
    public static void main(String[] args) {
        //This is a code for Java' IF else condition.

        //This is what we call a If else condition.

        int sugarlevel = 100; // intiated a integer.

        if(sugarlevel>100){
            System.out.println("You are not allowed to eat sweets");
        }
        else{
            System.out.println("Okay! you are healthy but be carefull to what you eat");
        }

        sugarlevel = 90;

        if(sugarlevel<100){
            System.out.println("Your Sugar level dropped by 10");
            sugarlevel = 80;
        }
        else if(sugarlevel<90){
            System.out.println("OMG! Your Sugar level has dropped from 90");
            sugarlevel=90; /*This code is use less cause it will get out from condition when sugarlevel is 90,
            as in first condition we have have defined above sugarlevel as 90.
            */
        }
        else {
            System.out.println("Your sugarlevel has dropped below 80, Go have some choclate");
        }
    }
}
