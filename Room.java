public class Room extends Contact{
    private int phonenum;

    public Room(String email, String name, int phonenum) {
        super(email, name);
        this.phonenum = phonenum;
    }

    public int getPhonenum() {
        return phonenum;
    }

    public void setPhonenum(int phonenum) {
        this.phonenum = phonenum;
    }

    @Override
    public void display() {
        System.out.println("This time add the phone your number...."+getEmail()+"," +getName()+","+phonenum);
    }
}
