public class Doctor extends Employee{
    private String type;

    public Doctor(int id,String name,String address){
        super(id, name, address);
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
