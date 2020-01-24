public class Cat extends Pet{

    public Cat(String name, String gender) {
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
            return "meow"; 
        }
        else {
            return "roar";
        }
    }
}