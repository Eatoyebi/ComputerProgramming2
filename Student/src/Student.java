public class Student {
    private String name;
    private int ID;
    private int units;

    public Student(String name, int ID) {
        this.name = name;
        this.ID = ID;
    }

    public static void main(String[] args) {
        Student student = new Student("Nick", 42342);
        System.out.println("Student name and ID:  " + student.getName() + " " + student.getID());
        student.incrementUnits(165);
        System.out.println("Student has " + student.getUnits() + " units");
        System.out.println("The student has enough units:  " + student.hasEnoughUnits());
        student.incrementUnits(15);
        System.out.println("Total units required: " + student.getUnits());
        System.out.println("The student is " + student.toString());
    }

    public String getName() {
        return name;
    }

    public int getID() {
        return ID;
    }

    public int getUnits() {
        return units;
    }

    public void incrementUnits(int units) {
        this.units += units;
    }

    public Boolean hasEnoughUnits() {
        if (this.units < 180) {
            return false;
        }
        return true;
    }

    public String toString() {
        return this.name + "(#" + this.ID + ")";
    }
}
