public class PetTester {
    public static void main(String[] args) {
        Dog dog = new Dog("Rufus", "undecided");
        Cat cat = new Cat("Salami", "yes");
        PetOwner owner = new PetOwner("Jefe", dog, cat);

        owner.petDog();
        owner.walkDog();
        owner.feedDog();
        owner.walkCat();
        if (dog.isHappy()) {
            System.out.println("WOOF!"); 
        }
        else {
            System.out.println("woof");
        }

        if (cat.isHappy()) {
            System.out.println("meow");
        } else {
            System.out.println("roar");
        }
    
    }
}