import java.util.ArrayList; 
public class Course
{
    private ArrayList<Person> participants;
    public Course(){participants= new ArrayList<Person>();}
    public void ajouter (Person p){
        participants.add(p);
    }
    
    
}
