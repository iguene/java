public class Teacher extends Person
{
    private Course cours;
    public Teacher(String name){super( name);}
    
    public void teacher(Course cours){
        this.cours=cours;
    }
}
