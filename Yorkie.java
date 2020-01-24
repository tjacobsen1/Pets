public class Yorkie extends Dog {

    int petCount = 0;

    public Yorkie(String name, String gender) {
        super(name, gender);
    }

    public void setPetted() {
        petCount ++;
        super.setPetted();
    }

    public boolean isHappy() {
        if (getFed() && getPetted() && getWalked() && petCount > 9) {
        return true;
        } else {
            return false;
        }
    }

}