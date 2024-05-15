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
            System.out.println("2. Has your team won a championship?");
            String eastq2Answer = answer.next();
            if(eastq2Answer.equals("yes")){
                System.out.println("3. Does your team have red in its logo?");
                String eastq3Answer = answer.next();
                if(eastq3Answer.equals("yes")){
                    System.out.println("4. Does your team have an animal mascot");
                    String eastq4answer = answer.next();
                    if(eastq4answer.equals("yes")){
                        System.out.println("5. Is your team in Canada?");
                        String eastq5answer = answer.next();
                        if(eastq5answer.equals("yes")){
                            System.out.println("Was your team the Toronto Raptors?");
                            String GuessMiami = answer.next();
                            if(GuessMiami.equals("yes")){
                                System.out.println("I guessed your team!");
                            }
                        }

                    }
                }
                if(eastq3Answer.equals("no")){
                    System.out.println("4. Is your teams mascot an animal?");
                    String animal = answer.next();
                    if(animal.equals("yes")){
                        System.out.println("Is your team the Milwaukee Bucks?");
                        String GuessBucks = answer.next();
                        if(GuessBucks.equals("yes")){
                            System.out.println("I guessed your team!");
                        }
                    }
                    if(animal.equals("no")){
                        System.out.println(" 5. Did Bill Russel play on your team?");
                        String russel = answer.next();
                        if(russel.equals("yes")){
                            System.out.println("Is your team the Boston Celtics");
                            String GuessCeltics = answer.next();
                            if(GuessCeltics.equals("yes")){
                                System.out.println("I guessed your team!");
                            }
                        }
                        if(russel.equals("no")){
                            System.out.println("Is your team the New York Knicks?");
                            String GuessKnicks = answer.next();
                            if(GuessKnicks.equals("yes")){
                                System.out.println("I guessed your team!");
                            }
                        }
                    }
                }
            }
            if(eastq2Answer.equals("no")){
                System.out.println("3. Is your team in a landlocked state (Not D.C) ?");
                String landlocked = answer.next();
                if(landlocked.equals("yes")){
                    System.out.println("Is your team the Indianaplois Pacers");
                    String GuessPacers = answer.next();
                    if(GuessPacers.equals("yes")){
                        System.out.print("I guessed your team!");
                    }
                }
                if(landlocked.equals("no")){
                    System.out.println("Is your team the Washinton Wizards?");
                    String GuessWizards = answer.next();
                    if(GuessWizards.equals("yes")){
                        System.out.println("I guessed your team!");
                    }
                    if(GuessWizards.equals("no")){
                        System.out.println("4. Is blue in your teams colors?");
                        String blue = answer.next();
                        if(blue.equals("no")){
                            System.out.println("Is your team the Brooklyn Nets");
                            String GuessNets = answer.next();
                            if(GuessNets.equals("yes")){
                                System.out.println("I guessed your team!");
                            }
                        }
                        if(blue.equals("yes")){
                            System.out.println("5. Is your team in Florida");
                            String florida = answer.next();
                            if(florida.equals("yes")){
                                System.out.println("Is your team the Orlando Magic?");
                                String GuessMagic = answer.next();
                                if(GuessMagic.equals("yes")){
                                    System.out.println("I guessed your team!");
                                }
                            }
                            if(florida.equals("no")){
                                System.out.println("Is your team the Charlotte Hornets?");
                                String GuessHornets = answer.next();
                                if(GuessHornets.equals("yes")){
                                    System.out.println("I guessed your team!");
                                }
                            }
                        }
                    }
                }
            }
        }
        if(startAnswer.equals("west")){
            System.out.println("2. Has your team won a championship");
            String westq2Answer = answer.next();
            if(westq2Answer.equals("yes")){
                System.out.println("3. Does your team have blue in its logo?");
                String westq3Answer = answer.next();
                if(westq3Answer.equals("yes")){
                    System.out.println("4. Is your team in San Francisco ");
                    String westq4Answer = answer.next();
                    if(westq4Answer.equals("yes")){
                        System.out.println("Is your team the Golden State Warriors?");
                        String GuessWarriors = answer.next();
                        if(GuessWarriors.equals("yes")){
                            System.out.println("I guessed your team!");
                        }
                    }
                }
            }
        }



    }
}
