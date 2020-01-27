public class Bat extends Pet{

    public Bat(String name, String gender){
        super(name, gender);
    }

    public boolean isHappy() {
        if (getFed() || getPetted()) {
            return true;
        } else {
            return false;
        }
    }

    public String talk(){
        if (isHappy()) {
            return "lol you have Corona"; 
        }
        else {
            return "*audible bat noises*";
        }
    }


}