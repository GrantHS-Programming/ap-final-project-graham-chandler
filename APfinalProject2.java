import java.util.Scanner;

public class APfinalProject2 {
    static Scanner answer = new Scanner(System.in);

    public static void main(String[] args) {
        startGame();
        playGame();
    }

    public static void startGame() {
        System.out.println("In this game you will answer my questions and I will tell you where you should live in the United States!");
        System.out.println(" ");
        System.out.println("Should we play?");
        answer.useDelimiter("\\n");
        String startAnswer = answer.next();
        if (startAnswer.equals("yes")) {
            playGame();
        }
    }

    public static void playGame() {
        System.out.println("1. Do you prefer living by the mountains or the beach?");
        String mountiansBeach = answer.next();
        if (mountiansBeach.equals("Mountains")) {
            System.out.println("2. Do you want to live near or around a big city?");

        }
        if (mountiansBeach.equals("beach")) {
            System.out.println("2. Do you prefer a warmer or colder climate?");
            String WarmCold = answer.next();
            if (WarmCold.equals("warmer")) {
                System.out.println("3. Do you prefer a lower or higher crime rate?");
                String CrimeRate = answer.next();
                if (CrimeRate.equals("higher")) {
                    System.out.println("4. Do you think that living in an area with rent 55% greater than the US average is appealing?");
                    String rentCompton = answer.next();
                    if (rentCompton.equals("yes")) {
                        System.out.println("5. Would you like to live in a city with a homicide rate higher than 96.4% of all places in the US?");
                        String deadly = answer.next();
                        if (deadly.equals("yes")) {
                            System.out.println("I think Compton is the perfect place for your to raise your family!");
                        }
                    }
                }
            }
        }
    }
}
