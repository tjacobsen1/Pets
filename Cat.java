public class Cat {
    private String name;
    private String gender;
    private boolean walked = false;
    private boolean fed = false;
    private boolean petted = false;

    public Cat(String name, String gender) {
        this.name = name;
        this.gender = gender;
    }

    public String getName() {
        return this.name;
    }

    public String getGender() {
        return this.gender;
    }

    public boolean isHappy() {
        if (fed && petted && walked) {
            return true;
        } else {
            return false;
        }
    }

    public void setPetted() {
        petted = true;
    }
    
    public void setFed() {
        fed = true;
    }

    public void setWalked() {
        walked = true;
    }
}