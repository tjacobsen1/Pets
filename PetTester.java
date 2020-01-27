public class PetTester {
    public static void main(String[] args) {
        Dog dog = new Dog("Rufus", "undecided");
        Cat cat = new Cat("Salami", "yes");
        Yorkie york = new Yorkie("TK", "Attack Helicopter");
        Horse horse = new Horse("Corona", "Virus");
        Bat bat = new Bat("Gurbanguly", "Turkomen");

        Pet[] pets = {dog, cat, york, horse, bat};
        PetOwner owner = new PetOwner("Jefe", pets);

        //owner.petPet(0);
       // owner.walkPet(0);
        //owner.feedPet(1);
        //owner.walkPet(1);
        owner.petPet(4);

        owner.cheatTheSystemAndMakePetHappy(3);
        
        System.out.println(owner.petTalk(0));
        System.out.println(owner.petTalk(1));
        System.out.println(owner.petTalk(4));
        System.out.println(owner.petTalk(3));


        if(owner.getCorona()){
            System.out.println("You have died of Corona");
            System.exit(0);
        }
        
    }
}