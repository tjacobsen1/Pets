public class PetOwner {
    private String name;
    private Pet[] pets;

    public PetOwner(String name, Pet[] petList) {
        this.name = name;
        pets = new Pet[petList.length];
        for(int i = 0; i <= petList.length-1; i++) {
            this.pets[i] = petList[i];
        } 
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

    public void petPet(int x) {
        pets[x].setPetted();
    }

    public void walkPet(int x) {
        pets[x].setWalked();
    }

    public void feedPet(int x) {
        pets[x].setFed();
    }

    public String petTalk(int x){
        return pets[x].talk();
    }
}