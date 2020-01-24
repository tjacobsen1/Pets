public class PetTester {
    public static void main(String[] args) {
        Dog dog = new Dog("Rufus", "undecided");
        Cat cat = new Cat("Salami", "yes");
        Yorkie york = new Yorkie("TK", "Attack Helicopter");
        Pet[] pets = {dog, cat, york};
        PetOwner owner = new PetOwner("Jefe", pets);

        owner.petPet(0);
        owner.walkPet(0);
        owner.feedPet(1);
        owner.walkPet(1);
        
        System.out.println(owner.petTalk(0));
        System.out.println(owner.petTalk(1));
        
    }
}