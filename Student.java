public class Student {
// put data members here
 private String name;
 private int id;
 private double gpa; 

//constructor
 public Student(String studentname, int id, double gpa){
    this.name = studentname;
    this.id = id;
    this.gpa = gpa;
}
// put getters here
public String getName(){
    return this.name;
    }
public int getId(){
    return this.id;
}
public double getGpa(){
    return this.gpa;
}

// put setters here
public void setGpa(double newGpa){
    this.gpa = newGpa;
}

//other member functions (methods here)
    public void displaystudent(){
        System.out.println("the student "+ this.name + " has the id of "+ this.id + " and has a GPA of "+ this.gpa + ".");
    }


    public static void main(String[] args) {
//create a student here
Student student1 = new Student("Bob",1,3.5);
Student student2 = new Student("Sally",2,3.5);
//call the displayStudent method here
        student1.displaystudent();
        student1.setGpa(6.0);

        student2.displaystudent();
        student2.setGpa(6.0);

// System.out.printIn(student1.get)
    }
}
