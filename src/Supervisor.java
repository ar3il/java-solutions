public class Supervisor extends Employee{
    private String kind;
    public Supervisor(int id, String name, String address) {
        super(id, name, address);
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }
}
