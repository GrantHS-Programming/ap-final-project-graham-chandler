import java.util.Scanner;

public class APfinalProject2 {
    static Scanner answer = new Scanner(System.in);

    public static void main(String[] args) {
        startGame();
        playGame();
    }

    public static void startGame() {
        System.out.println("In this game you will answer my questions and I will tell you where you should live in the World!");
        System.out.println(" ");
        System.out.println("Should we play?");
        answer.useDelimiter("\\n");
        String startAnswer = answer.next();
        if (startAnswer.equals("yes")) {
            playGame();
        }
    }

    public static void playGame() {
        System.out.println("1. Do you prefer in the United States?");
        String mountiansBeach = answer.next();
        if (mountiansBeach.equals("no")) {
            System.out.println("2. Do you want to live near or around a big city?");

        }
        if (mountiansBeach.equals("yes")) {
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
                        if(deadly.equals("no")){
                            System.out.println("Your ideal city is Houston, Texas!");
                        }
                    }
                    if(rentCompton.equals("no")){
                        System.out.println("5. Do you want to live in the deep south?");
                        String deep = answer.next();
                        if(deep.equals("yes")){
                            System.out.println("I think you should live in Birmingham, Alabama!");
                        }
                        if(deep.equals("no")){
                            System.out.println("Washington D.C is a great place for you!");
                        }

                    }
                }
                if(CrimeRate.equals("lower")){
                    System.out.println("4. Does being in a more humid climate appeal to you?");
                    String humid = answer.next();
                    if(humid.equals("yes")){
                        System.out.println("5. Do you want to have access to sports teams?");
                        String BigCity = answer.next();
                        if(BigCity.equals("yes")){
                            System.out.println("I think Orlando, Florida would be a suitbale place to live!");
                        }
                        if(BigCity.equals("no")){
                            System.out.println("Your City of choice is Charleston, South Carolina!");
                        }
                    }
                    if(humid.equals("no")){
                        System.out.println("5. Do you want close access to gambling?");
                        String gambling = answer.next();
                        if(gambling.equals("yes")){
                            System.out.println("I think you should live in Oceanside, California!");
                        }
                        if(gambling.equals("no")){
                            System.out.println("Santa Cruz, California is the place for you!");
                        }
                    }
                }
            }
            if (WarmCold.equals("colder")){
                System.out.println("3. Do you want to have access to good skiing?");
                String Ski = answer.next();
                if(Ski.equals("yes")){
                    System.out.println("4. Do you want to live near water?");
                    String water = answer.next();
                    if(water.equals("yes")){
                        System.out.println("5. Do you like having access to pro sports teams?");
                        String blazer = answer.next();
                        if(blazer.equals("yes")){
                            System.out.println("I think Portland, Oregon is a perfect place for you!");
                        }
                        if(blazer.equals("no")){
                            System.out.println("I think that Hood River, Oregon is a great place for you!");
                        }
                    }
                    if(water.equals("no")){
                        System.out.println("5. Does your ideal location have sports teams?");
                        String pro = answer.next();
                        if(pro.equals("yes")){
                            System.out.println("You should live in Denver, Colorado!");
                        }
                        if(pro.equals("no")){
                            System.out.println("You should live in Vail, Colorado!");
                        }
                    }
                }
            }
        }
    }
}
