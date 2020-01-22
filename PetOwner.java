public class PetOwner {
    private Dog dog;
    private Cat cat;
    private String name;

    public PetOwner(String name, Dog dog, Cat cat) {
        this.name = name;
        this.dog = dog;
        this.cat = cat;
    }

    public boolean isHappy() {
        if (dog.isHappy() && cat.isHappy()) {
            return true;
        } else {
            return false;
        }
    }

    public String getName() {
        return this.name;
    }

    public void petDog() {
        dog.setPetted();
    }

    public void walkDog() {
        dog.setWalked();
    }

    public void feedDog() {
        dog.setFed();
    }

    public void petCat() {
        cat.setPetted();
    }

    public void walkCat() {
        cat.setWalked();
    }

    public void feedCat() {
        cat.setFed();
    }

}