import java.util.ArrayList;
import java.util.Scanner;
public class APfinalproject {
    static Scanner answer = new Scanner(System.in);
    public static void main(String[] args) {
        startGame();
        //playGame();
    }

    public static void startGame() {
        System.out.println("This is Akinator NBA edition, your job is to give me yes or no answers, and I will guess what NBA team you are thinking of!");
        Boolean playAgain = true;
        while(playAgain==true){
        System.out.println("Are you ready to start?");
        answer.useDelimiter("\\n");
        String startAnswer = answer.next();
        if (startAnswer.equals("yes")) {
            playGame();
        }
        if (startAnswer.equals("no")) {
            System.out.print("fuck you");
        }
        }
    }

    public static void playGame() {
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
        if (startAnswer.equals("east")) {
            System.out.println("2. Has your team won a championship?");
            String eastq2Answer = answer.next();
            if (eastq2Answer.equals("yes")) {
                System.out.println("3. Does your team have red in its logo?");
                String eastq3Answer = answer.next();
                if (eastq3Answer.equals("yes")) {
                    System.out.println("4. Does your team have an animal mascot?");
                    String eastq4answer = answer.next();
                    if (eastq4answer.equals("yes")) {
                        System.out.println("5. Is your team in Canada?");
                        String eastq5answer = answer.next();
                        if (eastq5answer.equals("yes")) {
                            System.out.println("Was your team the Toronto Raptors?");
                            String GuessMiami = answer.next();
                            if (GuessMiami.equals("yes")) {
                                System.out.println("I guessed your team!");
                            }
                            System.out.println("Do your want to play again?");
                            String playagain = answer.next();
                            if(playagain.equals("yes")){
                            }
                        }
                        if (eastq5answer.equals("no")) {
                            System.out.println("6. Did Micheal Jordan play for your team?");
                            String Jordan = answer.next();
                            if (Jordan.equals("yes")) {
                                System.out.println("Is your team the Chicago Bulls?");
                                String GuessBulls = answer.next();
                                if (GuessBulls.equals("yes")) {
                                    System.out.println("I guessed your team!");
                                }
                                System.out.println("Do your want to play again?");
                                String playagain = answer.next();
                                if(playagain.equals("yes")){
                                }
                            }
                            if (Jordan.equals("no")) {
                                System.out.println("Is your team the Atlanta Hawks?");
                                String GuessHawks = answer.next();
                                if (GuessHawks.equals("yes")) {
                                    System.out.println("I guessed your team!");
                                }
                                System.out.println("Do your want to play again?");
                                String playagain = answer.next();
                                if(playagain.equals("yes")){
                                }
                            }
                        }

                    }
                    if (eastq4answer.equals("no")) {
                        System.out.println("5. Has Lebron James played for your team?");
                        String Lebron = answer.next();
                        if (Lebron.equals("yes")) {
                            System.out.println("6. Is your team in Florida?");
                            String Miami = answer.next();
                            if (Miami.equals("yes")) {
                                System.out.println("Is your team the Miami Heat?");
                                String GuessMiami = answer.next();
                                if (GuessMiami.equals("yes")) {
                                    System.out.println("I guessed your team!");
                                }
                                System.out.println("Do your want to play again?");
                                String playagain = answer.next();
                                if(playagain.equals("yes")){
                                }
                            }
                            if (Miami.equals("no")) {
                                System.out.println("Is your team the Cleveland Cavaliers?");
                                String GuessCavs = answer.next();
                                if (GuessCavs.equals("yes")) {
                                    System.out.println("I guessed your team!");
                                }
                                System.out.println("Do your want to play again?");
                                String playagain = answer.next();
                                if(playagain.equals("yes")){
                                }
                            }
                        }
                        if (Lebron.equals("no")) {
                            System.out.println("6. Was your team direct rivals with the Bulls in the 90's?");
                            String rivals = answer.next();
                            if (rivals.equals("yes")) {
                                System.out.println("Is your team the Detroit Pistons?");
                                String GuessPistons = answer.next();
                                if (GuessPistons.equals("yes")) {
                                    System.out.println("I guessed your team!");
                                }
                                System.out.println("Do your want to play again?");
                                String playagain = answer.next();
                                if(playagain.equals("yes")){
                                }
                            }
                            if (rivals.equals("no")) {
                                System.out.println("Is your team the Philadelphia 76'ers");
                                String GuessPhilly = answer.next();
                                if (GuessPhilly.equals("yes")) {
                                    System.out.println("I guessed your team!");
                                }
                                System.out.println("Do your want to play again?");
                                String playagain = answer.next();
                                if(playagain.equals("yes")){
                                }
                            }
                        }
                    }
                }
                if (eastq3Answer.equals("no")) {
                    System.out.println("4. Is your teams mascot an animal?");
                    String animal = answer.next();
                    if (animal.equals("yes")) {
                        System.out.println("Is your team the Milwaukee Bucks?");
                        String GuessBucks = answer.next();
                        if (GuessBucks.equals("yes")) {
                            System.out.println("I guessed your team!");
                        }
                        System.out.println("Do your want to play again?");
                        String playagain = answer.next();
                        if(playagain.equals("yes")){
                        }
                    }
                    if (animal.equals("no")) {
                        System.out.println(" 5. Did Bill Russel play on your team?");
                        String russel = answer.next();
                        if (russel.equals("yes")) {
                            System.out.println("Is your team the Boston Celtics");
                            String GuessCeltics = answer.next();
                            if (GuessCeltics.equals("yes")) {
                                System.out.println("I guessed your team!");
                            }
                            System.out.println("Do your want to play again?");
                            String playagain = answer.next();
                            if(playagain.equals("yes")){
                            }
                        }
                        if (russel.equals("no")) {
                            System.out.println("Is your team the New York Knicks?");
                            String GuessKnicks = answer.next();
                            if (GuessKnicks.equals("yes")) {
                                System.out.println("I guessed your team!");
                            }
                            System.out.println("Do your want to play again?");
                            String playagain = answer.next();
                            if(playagain.equals("yes")){
                            }
                        }
                    }
                }
            }
            if (eastq2Answer.equals("no")) {
                System.out.println("3. Is your team in a landlocked state (Not D.C) ?");
                String landlocked = answer.next();
                if (landlocked.equals("yes")) {
                    System.out.println("Is your team the Indianaplois Pacers");
                    String GuessPacers = answer.next();
                    if (GuessPacers.equals("yes")) {
                        System.out.println("I guessed your team!");
                    }
                    System.out.println("Do your want to play again?");
                    String playagain = answer.next();
                    if(playagain.equals("yes")){
                    }
                }
                if (landlocked.equals("no")) {
                    System.out.println("Is your team the Washinton Wizards?");
                    String GuessWizards = answer.next();
                    if (GuessWizards.equals("yes")) {
                        System.out.println("I guessed your team!");
                    }
                    if (GuessWizards.equals("no")) {
                        System.out.println("4. Is blue in your teams colors?");
                        String blue = answer.next();
                        if (blue.equals("no")) {
                            System.out.println("Is your team the Brooklyn Nets");
                            String GuessNets = answer.next();
                            if (GuessNets.equals("yes")) {
                                System.out.println("I guessed your team!");
                            }
                            System.out.println("Do your want to play again?");
                            String playagain = answer.next();
                            if(playagain.equals("yes")){
                            }
                        }
                        if (blue.equals("yes")) {
                            System.out.println("5. Is your team in Florida");
                            String florida = answer.next();
                            if (florida.equals("yes")) {
                                System.out.println("Is your team the Orlando Magic?");
                                String GuessMagic = answer.next();
                                if (GuessMagic.equals("yes")) {
                                    System.out.println("I guessed your team!");
                                }
                                System.out.println("Do your want to play again?");
                                String playagain = answer.next();
                                if(playagain.equals("yes")){
                                }
                            }
                            if (florida.equals("no")) {
                                System.out.println("Is your team the Charlotte Hornets?");
                                String GuessHornets = answer.next();
                                if (GuessHornets.equals("yes")) {
                                    System.out.println("I guessed your team!");
                                }
                                System.out.println("Do your want to play again?");
                                String playagain = answer.next();
                                if(playagain.equals("yes")){
                                }
                            }
                        }
                    }
                }
            }
        }
        if (startAnswer.equals("west")) {
            System.out.println("2. Has your team won a championship?");
            String westq2Answer = answer.next();
            if (westq2Answer.equals("yes")) {
                System.out.println("3. Does your team have blue in its logo?");
                String westq3Answer = answer.next();
                if (westq3Answer.equals("yes")) {
                    System.out.println("4. Is your team in San Francisco?");
                    String westq4Answer = answer.next();
                    if (westq4Answer.equals("yes")) {
                        System.out.println("Is your team the Golden State Warriors?");
                        String GuessWarriors = answer.next();
                        if (GuessWarriors.equals("yes")) {
                            System.out.println("I guessed your team!");
                        }
                        System.out.println("Do your want to play again?");
                        String playagain = answer.next();
                        if(playagain.equals("yes")){
                        }
                    }
                    if (westq4Answer.equals("no")) {
                        System.out.println("5. Does your team have any yellow in it's logo?");
                        String yellow = answer.next();
                        if (yellow.equals("yes")) {
                            System.out.println("6. Does Nikola Jokic play for your team?");
                            String jokic = answer.next();
                            if (jokic.equals("yes")) {
                                System.out.println("Is your team the Denver Nuggets?");
                                String GuessNuggets = answer.next();
                                if (GuessNuggets.equals("yes")) {
                                    System.out.println("I guessed your team!");
                                }
                                System.out.println("Do your want to play again?");
                                String playagain = answer.next();
                                if(playagain.equals("yes")){
                                }
                            }
                        }
                        if(yellow.equals("no")){
                            System.out.println("6. Did Dirk play for your team?");
                            String Dirk = answer.next();
                            if(Dirk.equals("yes")){
                                System.out.println("Is your team the Dallas Maveriks?");
                                String GuessMavs = answer.next();
                                if(GuessMavs.equals("yes")){
                                    System.out.println("I guessed your team!");
                                }
                                System.out.println("Do your want to play again?");
                                String playagain = answer.next();
                                if(playagain.equals("yes")){
                                }
                            }
                            if(Dirk.equals("no")){
                                System.out.println("Is your team the OKC Thunder?");
                                String GuessThunder = answer.next();
                                if(GuessThunder.equals("yes")){
                                    System.out.println("I guessed your team!");
                                }
                                System.out.println("Do your want to play again?");
                                String playagain = answer.next();
                                if(playagain.equals("yes")){
                                }
                            }
                        }
                    }
                }
                if(westq3Answer.equals("no")){
                    System.out.println("4. Has Russel Westbrook played for your team?");
                    String West = answer.next();
                    if(West.equals("yes")){
                        System.out.println("5. Are your teams colors Yellow and Purple?");
                        String lakers = answer.next();
                        if(lakers.equals("yes")){
                            System.out.println("Is your team the Los Angelos Lakers?");
                            String GuessLakers = answer.next();
                            if(GuessLakers.equals("yes")){
                                System.out.println("I guessed your team!");
                            }
                            System.out.println("Do your want to play again?");
                            String playagain = answer.next();
                            if(playagain.equals("yes")){
                            }
                        }
                        if(lakers.equals("no")){
                            System.out.println("Is your team the Housten Rockets?");
                            String GuessRockets = answer.next();
                            if(GuessRockets.equals("yes")){
                                System.out.println("I guessed your team!");
                            }
                            System.out.println("Do your want to play again?");
                            String playagain = answer.next();
                            if(playagain.equals("yes")){
                            }
                        }
                    }
                    if(West.equals("no")){
                        System.out.println("5. Has Lamarcus Aldridge played for your team?");
                        String lam = answer.next();
                        if(lam.equals("yes")){
                            System.out.println("6. Is red one of your teams colors?");
                            String red = answer.next();
                            if(red.equals("yes")){
                                System.out.println("Is your team the Portland Trailblazers?");
                                String GuessBlazers = answer.next();
                                if(GuessBlazers.equals("yes")){
                                    System.out.println("I guessed your team!");
                                }
                                System.out.println("Do your want to play again?");
                                String playagain = answer.next();
                                if(playagain.equals("yes")){
                                }
                            }
                            if(red.equals("no")){
                                System.out.println("Is your team the San Antonio Spurs?");
                                String GuessSpurs = answer.next();
                                if(GuessSpurs.equals("yes")){
                                    System.out.println("I guessed your team!");
                                }
                                System.out.println("Do your want to play again?");
                                String playagain = answer.next();
                                if(playagain.equals("yes")){
                                }
                            }
                        }
                        if(lam.equals("no")){
                            System.out.println("Is your team the Sacramento Kings?");
                            String GuessKings = answer.next();
                            if(GuessKings.equals("yes")){
                                System.out.println("I guessed your team!");
                            }
                            System.out.println("Do your want to play again?");
                            String playagain = answer.next();
                            if(playagain.equals("yes")){
                            }
                        }
                    }
                }
            }
            if (westq2Answer.equals("no")) {
                System.out.println("3. Is your team based west of the Mississippi River?");
                String river = answer.next();
                if (river.equals("yes")) {
                    System.out.println("4. Is your team in California?");
                    String Cali = answer.next();
                    if (Cali.equals("yes")) {
                        System.out.println("Is your team the Clippers?");
                        String GuessClippers = answer.next();
                        if (GuessClippers.equals("yes")) {
                            System.out.println("I guessed your team!");
                        }
                        System.out.println("Do your want to play again?");
                        String playagain = answer.next();
                        if(playagain.equals("yes")){
                        }
                    }
                    if (Cali.equals("no")) {
                        System.out.println("5. Does Kevin Durant play on your team? ");
                        String KD = answer.next();
                        if (KD.equals("yes")) {
                            System.out.println("Is your team the Phoenix Suns");
                            String GuessSuns = answer.next();
                            if (GuessSuns.equals("yes")) {
                                System.out.println("I guessed your team!");
                            }
                            System.out.println("Do your want to play again?");
                            String playagain = answer.next();
                            if(playagain.equals("yes")){
                            }
                        }
                        if (KD.equals("no")){
                            System.out.println("Is your team the Minnesota Timberwolves?");
                            String GuessWolves = answer.next();
                            if (GuessWolves.equals("yes")) {
                                System.out.println("I guessed your team!");
                            }
                            if(GuessWolves.equals("no")){
                                System.out.println("Is your team the Utah Jazz?");
                                String GuessJazz = answer.next();
                                if(GuessJazz.equals("yes")){
                                    System.out.println("I guessed your team!");
                                }
                            }
                        }
                    }
                }
                if (river.equals("no")) {
                    System.out.println("4. Is your team in a landlocked state?");
                    String Tenn = answer.next();
                    if (Tenn.equals("yes")) {
                        System.out.println("Is your team the Memphis Grizzlies?");
                        String GuessGrizzlies = answer.next();
                        if (GuessGrizzlies.equals("yes")) {
                            System.out.println("I guessed your team!");
                        }
                    }
                    if (Tenn.equals("no")) {
                        System.out.println("Is your team the New Orleans Pelicans?");
                        String GuessPelicans = answer.next();
                        if (GuessPelicans.equals("yes")) {
                            System.out.println("I guesed your team!");
                        }
                    }
                }
            }
        }
    }
}