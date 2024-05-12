public class Nurse extends Employee{
    private String type;
    public Nurse(int id, String name, String address,String type) {
        super(id, name, address);
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
