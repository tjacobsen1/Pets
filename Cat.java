public class Cat {
    private String name;
    private String gender;
    private boolean walked = false;
    private boolean fed = false;
    private boolean petted = false;
    private boolean happy = false;

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

    public void setPet() {
        petted = true;
    }
    
    public void setFed() {
        fed = true;
    }

    public void setWalked() {
        walked = true;
    }
}