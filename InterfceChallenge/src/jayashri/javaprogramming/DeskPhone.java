package jayashri.javaprogramming;

public class DeskPhone implements ITelephone {

    private int myNumber;
    private boolean isRinging;

    public DeskPhone(int myNumber) {
        this.myNumber = myNumber;
    }

    @Override
    public void powerOn() {
        System.out.println("No action taken, desk phone has no power button");
    }

    @Override
    public void dial(int phoneNumber) {
        System.out.println("Now ringing "+phoneNumber+" on deskphone");

    }

    @Override
    public void answer() {
        System.out.println("Answering the desk phone");
        isRinging = false;

    }

    @Override
    public boolean callPhone(int phoneNumber) {
        if(phoneNumber == myNumber){
            isRinging = true;
        }else{
            isRinging = false;
        }
        return isRinging;
    }

    @Override
    public boolean isRinging() {
        return false;
    }
}
