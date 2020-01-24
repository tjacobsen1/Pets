import java.util.Random;

public class TalkingCat extends Cat{
    private String[] compliments = {"You are epic", "You are not not epic", "You are kinda cool I guess, 6/10, we should talk more doe", "nice"};
    private String[] insults = {"rate 1/10, date no, hate yes", "plz die", "I hate your family"};
    Random rand = new Random();
    public TalkingCat(String name, String gender) {
        super(name, gender);
    }

    public boolean isHappy() {
        if (getFed() && !(getPetted() || getWalked())) {
            return true;
        } else {
            return false;
        }
    }

    public String talk(){
        if (isHappy()) {
            return compliments[rand.nextInt((int)compliments.length)]; 
        }
        else {
            return insults[rand.nextInt((int)insults.length)];
        }
    }
}