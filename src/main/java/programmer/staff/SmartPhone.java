package programmer.staff;

public class SmartPhone {

    private boolean isCharged;

    public SmartPhone(boolean isCharged) {
        this.isCharged = isCharged;
    }

    public SmartPhone() {
    }

    public void callColleague(){
        if(!isCharged) {
            throw new IllegalStateException("Phone is not charged!");
        }
    }
}
