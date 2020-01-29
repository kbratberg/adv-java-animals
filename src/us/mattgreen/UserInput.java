package us.mattgreen;


import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;


public class UserInput {

        int animal;
        String stringAnimal;
        String name = "";
        int mousesKilled = 0;
        String stringMiceKilled;
        Boolean friendly = null;
        String isFriendly;
        int age=0;
        String stringAge;
        Scanner input = new Scanner(System.in);
        ArrayList<Talkable> zoo;
        boolean valid;
        String stringKeepGoing;
        int keepGoing;

        public UserInput(ArrayList<Talkable>zoo) {
           this.zoo = zoo;

        }

        public void setUserInput() {
            try {
                do {
                    System.out.println("What type of animal would you like to create?\n" +
                            "1. Cat\n2. Dog\n3. Person\n" +
                            "Enter corresponding number> ");

                    stringAnimal = input.nextLine();
                    animal = new InputTypeVerifier(stringAnimal).getAnimal();

                    if (animal == 1) {

                        System.out.println("What is your cat's name>");
                        name = input.nextLine();
                        System.out.println("How many mice has your cat killed? ");
                        stringMiceKilled = input.nextLine();
                        mousesKilled = new InputTypeVerifier(stringMiceKilled).getMousesKilled(stringMiceKilled);
                        Cat newCat = new Cat(mousesKilled, name);
                        zoo.add(newCat);
                    } else if (animal == 2) {
                        System.out.println("What is your dog's name>");
                        name = input.nextLine();
                        System.out.println("Is your dog friendly Y/N? ");
                        isFriendly = input.nextLine();
                        valid = new InputTypeVerifier(isFriendly).isValid(isFriendly);
                        if (valid = true) {
                            if (isFriendly.equalsIgnoreCase("Y")) {
                                friendly = true;
                            } else if (isFriendly.equalsIgnoreCase("N")) {
                                friendly = false;
                            }
                        }
                        Dog newDog = new Dog(friendly, name);
                        zoo.add(newDog);
                    } else if (animal == 3) {
                        System.out.println("What is the person's name?");
                        name = input.nextLine();
                        System.out.println("What is the person's age?");
                        stringAge = input.nextLine();
                        age = new InputTypeVerifier(stringAge).getAge(stringAge);
                        Teacher newPerson = new Teacher(age, name);
                        zoo.add(newPerson);
                    }
                    System.out.println("To continue adding enter 1, otherwise to exit enter 0");
                    stringKeepGoing = input.nextLine();
                    keepGoing = new InputTypeVerifier(stringKeepGoing).getKeepGoing(stringKeepGoing);
                }while (keepGoing != 0);
            } catch (NumberFormatException e) {
                System.out.println("Improper data type, try again");
                setUserInput();
            } catch (InputMismatchException e)
            {
                System.out.println("You did not enter the correct response, try again");
                setUserInput();
            }catch (IllegalArgumentException e)
            {
                System.out.println("Sorry I don't understand, try again");
                setUserInput();
            }catch (Exception e)
            {
                System.out.println("Something went wrong here, Please try again");
                setUserInput();
            }
        }




    }




