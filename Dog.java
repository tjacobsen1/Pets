public class Dog extends Pet {

    public Dog(String name, String gender) {
        super(name, gender);
    }

    public String talk(){
        if (isHappy()) {
            return "WOOF!"; 
        }
        else {
            return "woof";
        }
    }
}