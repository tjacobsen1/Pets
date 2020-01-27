public class Horse extends Pet{

    private boolean brushed = false;
    private boolean rode = false;
    public Horse(String name, String gender){
        super(name, gender);
    }

    public void setBrushed(){
        this.brushed = true;
    }

    public void setRode(){
        this.rode = true;
    }

    public boolean isHappy() {
        if (brushed && rode && getFed() && getPetted() && getWalked()) {
            return true;
        } else {
            return false;
        }
    }

}