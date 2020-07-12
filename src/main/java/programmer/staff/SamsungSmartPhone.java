package programmer.staff;

public class SamsungSmartPhone implements SmartPhone{

    private boolean isCharged;

    public SamsungSmartPhone(boolean isCharged) {
        this.isCharged = isCharged;
    }

    public SamsungSmartPhone() {
    }

    public void callColleague(){
        if(!isCharged) {
            throw new IllegalStateException("Phone is not charged!");
        }
    }
}
