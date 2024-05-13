import java.util.ArrayList;
import java.util.Scanner;
public class APfinalproject {
    static Scanner answer = new Scanner(System.in);
    public static void main(String[] args){
        startGame();
        //playGame();

    }
    public static void startGame(){
        System.out.println("This is Akinator NBA edition, your job is to give me yes or no answers, and I will guess what NBA team you are thinking of!");
        System.out.println("Are you ready to start?");
        answer.useDelimiter("\\n");
        String startAnswer = answer.next();
        if(startAnswer.equals("yes")){
            playGame();
        }
        if(startAnswer.equals("no")){
            System.out.print("fuck you");
        }
    }
    public static void playGame(){
        ArrayList<String> nbaTeams = new ArrayList<>();
        nbaTeams.add("Mavs");
        nbaTeams.add("Nuggets");
        nbaTeams.add("Warriors");
        nbaTeams.add("Rockets");
        nbaTeams.add("Clippers");
        nbaTeams.add("Lakers");
        nbaTeams.add("Grizzlies");
        nbaTeams.add("Wolves");
        nbaTeams.add("Pelicans");
        nbaTeams.add("Thunder");
        nbaTeams.add("Suns");
        nbaTeams.add("Blazers");
        nbaTeams.add("Kings");
        nbaTeams.add("Spurs");
        nbaTeams.add("Jazz");
        //upper is EC - lower is WC
        nbaTeams.add("Hawks");
        nbaTeams.add("Bucks");
        nbaTeams.add("Celtics");
        nbaTeams.add("Knicks");
        nbaTeams.add("Nets");
        nbaTeams.add("Cavs");
        nbaTeams.add("Hornets");
        nbaTeams.add("Heat");
        nbaTeams.add("Magic");
        nbaTeams.add("Pacers");
        nbaTeams.add("Pistons");
        nbaTeams.add("76ers");
        nbaTeams.add("Bulls");
        nbaTeams.add("Raptors");
        nbaTeams.add("Wizards");
        System.out.println("1. What conference is your team in?");
        String startAnswer = answer.next();
        if(startAnswer.equals("east")){
            nbaTeams.remove("Mavs");
            nbaTeams.remove("Nuggets");
            nbaTeams.remove("Warriors");
            nbaTeams.remove("Rockets");
            nbaTeams.remove("Clippers");
            nbaTeams.remove("Lakers");
            nbaTeams.remove("Grizzlies");
            nbaTeams.remove("Wolves");
            nbaTeams.remove("Pelicans");
            nbaTeams.remove("Thunder");
            nbaTeams.remove("Suns");
            nbaTeams.remove("Blazers");
            nbaTeams.remove("Kings");
            nbaTeams.remove("Spurs");
            nbaTeams.remove("Jazz");
            System.out.println("2. Has your team won a championship?");
            String q2Answer = answer.next();
            if(q2Answer.equals("yes")){
                nbaTeams.remove("Nets");
                nbaTeams.remove("Magic");
                nbaTeams.remove("Pacers");
                nbaTeams.remove("Hornets");
                System.out.println("3. Does your team have red in its logo?");
                String q3Answer = answer.next();
                if(q3Answer.equals("yes")){
                    nbaTeams.remove("Knicks");
                    nbaTeams.remove("Celtics");
                    nbaTeams.remove("Bucks");
                    System.out.println("4. Does your team have an animal mascot");
                    String q4answer = answer.next();
                    if(q4answer.equals("yes")){
                        nbaTeams.remove("Hawks");
                        nbaTeams.remove("Cavs");
                        nbaTeams.remove("Bulls");
                        nbaTeams.remove("Raptors");
                        System.out.println("5. Is your team in Florida?");
                        String q5answer = answer.next();
                        if(q5answer.equals("yes")){
                            System.out.println("Was your team the Miami Heat?");
                            String GuessMiami = answer.next();
                        }

                    }
                }
            }
        }
        if(startAnswer.equals("west")){
            System.out.println("2. Has your team won a championship");
        }



    }
}
