public class PetOwner {
    private String name;
    private Pet[] pets;
    private boolean hasCorona;

    public PetOwner(String name, Pet[] petList) {
        this.name = name;
        pets = new Pet[petList.length];
        for(int i = 0; i <= petList.length-1; i++) {
            this.pets[i] = petList[i];
        } 
        this.hasCorona = false;
    }

    public boolean isHappy() {
        for (int i = 0; pets.length-1 >= i; i++) {
            if (!pets[i].isHappy()) {
                return false;
            }
        }
        return true;    
    }

    public String getName() {
        return this.name;
    }

    public boolean getCorona(){
        return this.hasCorona;
    }

    public void petPet(int x) {
        pets[x].setPetted();
        if(pets[x] instanceof Bat){
            hasCorona = true;
        }
    }

    public void walkPet(int x) {
        pets[x].setWalked();
    }

    public void feedPet(int x) {
        pets[x].setFed();
        if(pets[x] instanceof Bat){
            hasCorona = true;
        }
    }

    public String petTalk(int x){
        return pets[x].talk();
    }

    public void rideHorse(int x){
        if(pets[x] instanceof Horse){
            pets[x].setRode();
        }
    }

    public void brushHorse(int x){
        if(pets[x] instanceof Horse){
            pets[x].setBrushed();   
        }
    }

    public void cheatTheSystemAndMakePetHappy(int x){
        feedPet(x);
        if(pets[x] instanceof Dog) {
            petPet(x);
            walkPet(x);
        }
        if (pets[x] instanceof Yorkie) {
            for (int i = 10; i > 0; i--) {
                petPet(x);
            }
            walkPet(x);
        }
        if (pets[x] instanceof Horse) {
            walkPet(x);
            brushHorse(x);
            rideHorse(x);
            petPet(x);
        }
    }
}