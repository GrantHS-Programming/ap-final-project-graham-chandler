import java.util.Scanner;
public class APfinalproject {
    public static void main(String[] args){
        startGame();
        //playGame();
    }
    public static void startGame(){
        System.out.println("This is Akinator NBA edition, your job is to give me clues, and I will guess what NBA team you are thinking of!");

        System.out.println("Are you ready to start?");
        Scanner answer = new Scanner(System.in);
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
        String[] westTeams = {"Mavs", "Nuggets", "Warriors", "Rockets", "Clippers", "Lakers", "Grizzlies", "Wolves", "Pelicans", "Thunder", "Suns", "Blazers", "Kings", "Spurs", "Raptors", "Jazz", "Wizards"};
        String[] eastTeams = {"Hawks", "Celtics", "Nets", "Hornets", "Bulls", "Cavs", "Mavs", "Nuggets", "Pistons", "Warriors", "Rockets", "Pacers", "Clippers", "Lakers", "Grizzlies", "Heat", "Bucks", "Wolves", "Pelicans", "Knicks", "Thunder", "Magic", "76'ers", "Suns", "Blazers", "Kings", "Spurs", "Raptors", "Jazz", "Wizards"};
        System.out.print("1. ")

    }
}
