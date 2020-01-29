package us.mattgreen;

public class InputTypeVerifier {
    private String stringAnimal;
    private String stringAge;
    private String stringMiceKilled;
    private boolean valid;
    String stringKeepGoing;
    int keepGoing;

    public InputTypeVerifier(String stringAnimal, String isFriendly, String stringAge, String stringMiceKilled, String stringKeepGoing) {
        this.stringAnimal = stringAnimal;
        this.stringAge = stringAge;
        this.stringMiceKilled = stringMiceKilled;
        valid = true;
    }

    public InputTypeVerifier(String stringAnimal) {
        this.stringAnimal = stringAnimal;
    }


    public int getAnimal() {
        int animal = Integer.parseInt(stringAnimal);
        return animal;
    }

    public void setStringAnimal(String stringAnimal) {
        this.stringAnimal = stringAnimal;

    }


    public int getAge(String stringAge) {
        int age = Integer.parseInt(stringAge);
        return age;
    }

    public void setStringMiceKilled()
    {
        this.stringMiceKilled = stringMiceKilled;
    }

    public int getMousesKilled(String stringMiceKilled) {
        int mousesKilled = Integer.parseInt(stringMiceKilled);
        return mousesKilled;
    }

    public int getKeepGoing(String stringKeepGoing) {
        keepGoing = Integer.parseInt(stringKeepGoing);
        return keepGoing;
    }

    public void setStringKeepGoing(String stringKeepGoing) {
        this.stringKeepGoing = stringKeepGoing;
        keepGoing = Integer.parseInt(stringKeepGoing);
    }

    public boolean isValid(String isFriendly)
    {
        valid = true;
        if (!isFriendly.equalsIgnoreCase("y") || !isFriendly.equalsIgnoreCase("n"))
        {
            valid = false;
        }
        return valid;
    }

}
