public class AllEmployees {
    private Employee arr[];
    private int current;

    public AllEmployees(int current) {
        this.arr = new Employee[200];
        this.current = current;
    }

    public int numSupervisor() {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] instanceof Supervisor) {
                count++;
            }
        }
        return count;
    }

    public Nurse getNewNurse(String type) {
        int max = Integer.MIN_VALUE;
        Nurse nurse = null;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] instanceof Nurse &&
                    ((Nurse) arr[i]).getType().equals(type)) {
                count++;
                if (arr[i].getId() > max) {
                    max = arr[i].getId();
                    nurse = (Nurse) arr[i];
                }
            }
        }

        if (count == 0) {
            return null;
        } else {
            return nurse;
        }
    }
    public void addEmployee(Employee employee) {
        if (current < arr.length) {
            arr[current++] = employee;
        } else {
            System.out.println("the arr is full");
        }
    }
}