public class Student {
    private String ID;
    private String Name;
    private double CGPA;

    public Student(String name, String ID, double CGPA) {
        this.Name = name;
         this.CGPA = CGPA;
         this.ID = ID;
    }

    public double getCGPA() {
        return CGPA;
    }
    public String getID() {
        return ID;
    }
    public String getName() {
        return Name;
    }
}
