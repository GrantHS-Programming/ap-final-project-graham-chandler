import com.apple.eawt.AppEvent;

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
            String bi = answer.next();
            if(bi.equals("yes")){
                System.out.println("3. Does living in Europe sound interesting?");
                String Europe = answer.next();
                if(Europe.equals("yes")){
                    System.out.println("4. Do you like soccer?");
                    String soccer = answer.next();
                    if(soccer.equals("yes")) {
                        System.out.println("5. Is English your first language?");
                        String en = answer.next();
                        if(en.equals("yes")){
                            System.out.println("You should live in Manchester, England");
                        }
                        if(en.equals("no")){
                            System.out.println("You should live in Paris, France");
                        }
                    }
                    if(soccer.equals("no")){
                        System.out.println("Europe is not the place for you, there are no big cities that don't have soccer teams.");

                    }
                }
                if(Europe.equals("no")){
                    System.out.println("4. Does living in Asia sound better to you?");
                    String as = answer.next();
                    if(as.equals("yes")){
                        System.out.println("5. Do you like the beach?");
                        String b = answer.next();
                        if(b.equals("yes")){
                            System.out.println("you should live in Bangkok, Thailand!");
                        }
                        if(b.equals("no")){
                            System.out.println("You should live in Ulaanbaatar, Mongolia ");
                        }

                    }
                    if(as.equals("no")){
                        System.out.println("5. Do you like the Safari?");
                        String lion = answer.next();
                        if(lion.equals("yes")){
                            System.out.println("You should live in Cape Town, South Africa!");
                        }
                        if(lion.equals("no")){
                            System.out.println("You would like Cairo, Egypt.");
                        }
                    }
                }
            }
            if(bi.equals("no")){
                System.out.println("3. Do you prefer the beach or the mountains?");
                String chug = answer.next();
                if(chug.equals("beach")){
                    System.out.println("4. How about cold or warm climate?");
                    String cold = answer.next();
                    if(cold.equals("cold")){
                        System.out.println("5. Do you like free market business endeavours?");
                        String freeMarket = answer.next();
                        if(freeMarket.equals("yes")){
                            System.out.println("I think Mandal, Norway would be a great place to live!");
                        }
                        if(freeMarket.equals("no")){
                            System.out.println("You should live in Teriberka, Russia!");
                        }
                    }
                    if(cold.equals("warm")){
                        System.out.println("5. Do you like to be near crime?");
                        String dang = answer.next();
                        if(dang.equals("yes")){
                            System.out.println("You should live in Mulatos, Colombia");
                        }
                        if (dang.equals("no")){
                            System.out.println("You should live in Tarifa, Spain");
                        }
                    }
                }
                if(chug.equals("mountains")){
                    System.out.println("4. Do you like cheese, chocolate, and watches?");
                    String cheese = answer.next();
                    if(cheese.equals("yes")){
                        System.out.println("5. Do you want to live near a ski resort?");
                        String skiiiii = answer.next();
                        if(skiiiii.equals("yes")){
                            System.out.println("You should reside in Grindewald, Switzerland!");
                        }
                        if(skiiiii.equals("no")){
                            System.out.println("You should live in Lausanne, Switzerland!");
                        }
                    }
                    if(cheese.equals("no")){
                        System.out.println("5. Do you like a previously war torn country, with the posisbilty of stepping on a undetected active landmine!");
                        String mine = answer.next();
                        if(mine.equals("no")){
                            System.out.println("Annacy, France is right for you!");
                        }
                        if(mine.equals("yes")){
                            System.out.println("Karlovac, Croatia, is the place for you!");
                        }
                    }
                }
            }

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
                if(Ski.equals("no")){
                    System.out.println("4. Do you want to live near the coast?");
                    String coast = answer.next();
                    if(coast.equals("yes")){
                        System.out.println("5. Do you like pro sports?");
                        String BA = answer.next();
                        if(BA.equals("yes")){
                            System.out.println("Boston, Massachusetts is where you should live!");
                        }
                        if(BA.equals("no")){
                            System.out.println("You should live in Portsmouth, New Hampshire");
                        }
                    }
                    if(coast.equals("no")){
                        System.out.println("5. Do you like Mt. Rushmore");
                        String Rush = answer.next();
                        if(Rush.equals("yes")){
                            System.out.println("Onida, South Dakota is the place for you!");
                        }
                        if(Rush.equals("no")){
                            System.out.println("Whitetail, Montana is where you should live!");
                        }
                    }
                }
            }
        }
    }
}
