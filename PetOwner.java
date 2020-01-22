public class PetOwner {
    private Dog dog;
    private Cat cat;
    private boolean happy = false;
    private String name;

    public PetOwner(String name, Dog dog, Cat cat) {
        this.name = name;
        this.dog = dog;
        this.cat = cat;
    }

    public boolean isHappy() {
        if (dog.isHappy && cat.isHappy) {
            return true;
        } else {
            return false;
        }
    }

    public String getName() {
        return this.name;
    }

    public boolean getHappy() {
        return this.happy;
    }
}