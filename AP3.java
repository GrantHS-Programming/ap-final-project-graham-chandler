import java.sql.SQLOutput;
import java.util.Locale;
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
                                System.out.println("(1) Cat   (2) Parrot   (3) Hamster");
                                String me = answer.next();
                                if(me.equals("1")){
                                    System.out.println("Meet Gato - She is a Maine Coon, 7 years old, and 10 pounds.");
                                    System.out.println("Do you want to play, listen, or adopt Gato?");
                                }
                            }
                            if(otheranimals.equals("no")){
                                System.out.println("Goodbye!");
                            }
                        }
                    }
                }
                if(play.equals("listen")){
                    System.out.println("RUFF RUFF RUFF");
                    System.out.println("Would you like to play, adopt, or meet the other animals?");
                    String play2 = answer.next();
                    if(play2.equals("play")){
                        System.out.println("Pero runs around while chasing a ball, and wags his tail!");
                        System.out.println("Do you want to adopt or meet the other animals?");
                        String adopt2 = answer.next();
                        if(adopt2.equals("adopt")){
                            System.out.println("Congratulations, Pero is your new dog!");
                            System.out.println("Would you like to view the other animals?");
                            String otheranimals2 = answer.next();
                            if(otheranimals2.equals("yes")){
                                System.out.println("Which animal would you like to meet?");
                                System.out.println("(1) Cat   (2) Parrot   (3) Hamster");
                                String me2 = answer.next();
                                if(me2.equals("Cat")){
                                    System.out.println("Meet Gato - She is a Maine Coon, 7 years old, and 10 pounds.");
                                }
                            }
                            if (otheranimals2.equals("no")){
                                System.out.println("Goodbye!");
                            }
                        }
                    }
                    if(play2.equals("adopt")){
                        System.out.println("Congratulations, Pero is your new dog!");
                    }
                    if(play2.equals("meet other animals")){
                        System.out.println("Would you like to meet a parrot, hamster or cat?");
                        String cat = answer.next();
                        if(cat.equals("cat")){
                            System.out.println("Meet Gato");
                        }
                        if(cat.equals("Hamster")){
                            System.out.println("Meet Bert the hamster");
                        }
                    }
                }
            }
            if(num.equals("2")){
                System.out.println("Meet Gato - She is a Maine Coon, 7 years old and 10 pounds.");
                System.out.println("Would you like to play, listen, or adopt Gato?");
                String p = answer.next();
                if(p.equals("play")){
                    System.out.println("Gato plays with the string.");
                    System.out.println("Would you like to listen, or adopt Gato?");
                    String li = answer.next();
                    if(li.equals("listen")){
                        System.out.println("MEOW MEOW MEOW");
                        System.out.println("Would you like to adopt Gato?");
                        String a = answer.next();
                        if(a.equals("yes")){
                            System.out.println("Congratulations, Gato is your new Cat!");
                            System.out.println("Would you like to meet other pets?");
                            String op = answer.next();
                            if(op.equals("yes")){
                                System.out.println("Would you like to meet (1) Dog, (2) Parrot, (3) Hamster");
                                String meet = answer.next();
                                if(meet.equals("Parrot")){
                                    System.out.println("Meet Rico - He is a grey parrot, 3 years old, 4 pounds.");
                                    System.out.println("DO you want to play, listen or adopt Rico?");
                                    String add = answer.next();
                                    if(add.equals("play")){
                                        System.out.println("Rico flies around your head");
                                        System.out.println("Do you want to listen or adopt Rico?");
                                        String z = answer.next();
                                        if(z.equals("listen")){
                                            System.out.println("CHIRP CHIRP CHIRP");
                                            System.out.println("Do you want to adopt Rico?");
                                            String w = answer.next();
                                            if(w.equals("yes")){
                                                System.out.println("Congratualations, Rico is your new Parrot!");
                                                System.out.println("Would you like to meet more animals?");
                                                String mmmmm = answer.next();
                                                if(mmmmm.equals("no")){
                                                    System.out.println("Goodbye!");
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        if(yes.equals("no")){
            System.out.println("Goodbye!");
        }
    }
}
