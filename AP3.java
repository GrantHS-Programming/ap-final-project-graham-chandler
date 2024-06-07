import java.util.Scanner;

public class AP3 {
    static Scanner answer = new Scanner(System.in);
    public static void main(String[]args){
        game();

    }

    public static void game(){
        System.out.println("Hello, this is the Oregon Humane Society. ");
        System.out.println("Would you like to adopt an animal?");
        String yes = answer.next();
        if(yes.equals("yes")){
            System.out.println("Perfect! Which animal would you like to meet?");
            System.out.println("(1) Dog   (2) Cat   (3) Parrot   (4) Hamster");
            String num  = answer.next();
            if(num.equals("1")){
                System.out.println("Meet Pero - He is a black lab, 3 years old, and 75 pounds.");
                System.out.println("Do you want to play, listen, or adopt pero?");
                String play = answer.next();
                if(play.equals("play")){
                    System.out.println("Pero runs around while chasing a ball, and wags his tail!");
                    System.out.println("Would you like to listen, adopt, or meet other animals?");
                    String listen = answer.next();
                    if(listen.equals("listen")){
                        System.out.println("RUFFF RUFFF RUFFF");
                        System.out.println("Would you like to adopt, or meet other animals?");
                        String adopt = answer.next();
                        if(adopt.equals("adopt")){
                            System.out.println("Congratulation, Pero is your new dog!");
                            System.out.println("Would you like to view other animals");
                            String otheranimals = answer.next();
                            if(otheranimals.equals("yes")){
                                System.out.println("Which animal would you like to meet?");
                                System.out.println("(1) Cat   (3) Parrot   (4) Hamster");
                            }
                            if(otheranimals.equals("no")){
                                System.out.println("Goodbye!");
                            }
                        }
                    }
                }
            }
        }
    }
}
