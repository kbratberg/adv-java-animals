
import us.mattgreen.Cat;
import us.mattgreen.Dog;
import us.mattgreen.Teacher;

import java.util.Scanner;

    public class UserInput {
        public UserInput() {
        }

        public static void userInput(){
            Scanner input = new Scanner(System.in);
            int animal;
            String name = "";
            int mousesKilled = 0;
            Boolean friendly = null;
            String isFriendly;
            int age=0;

            System.out.println("What type of animal would you like to create?\n" +
                    "1. Cat\n2. Dog\n3. Person\n" +
                    "Enter corresponding number> ");
            animal = input.nextInt();
            if (animal == 1)
            {
                System.out.println("What is your cat's name>");
                name = input.nextLine();
                System.out.println("How many mice has your cat killed? ");
                mousesKilled = input.nextInt();
                Cat newCat = new Cat(mousesKilled, name);
            }
            else if (animal == 2)
            {
                System.out.println("What is your dog's name>");
                input.nextLine();
                name = input.nextLine();
                System.out.println("Is your dog friendly Y/N? ");
                isFriendly = input.nextLine();
                if(isFriendly.equalsIgnoreCase("Y"))
                {
                    friendly = true;
                }else if (isFriendly.equalsIgnoreCase("N"))
                {
                    friendly = false;
                }
                Dog newDog = new Dog(friendly, name);
            }
            else if (animal == 3)
            {
                System.out.println("What is the person's name?");
                input.nextLine();
                name = input.nextLine();
                System.out.println("What is the person's age?");
                age = input.nextInt();
                Teacher newPerson = new Teacher(age, name);
            }
        }

    }




