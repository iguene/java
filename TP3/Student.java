public class Student extends Person{
    private Course cours;
    public Student (String name){super(name);}
    
    public void follows(Course cours){
        this.cours=cours;
    }
}
