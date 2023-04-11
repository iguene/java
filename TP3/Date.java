
/**
 * Décrivez votre classe Date ici.
 *
 * @author (votre nom)
 * @version (un numéro de version ou une date)
 */
public class Date
{
    private int[] t;
    public Date (int jour , int mois , int annee){
        t=new int[3];
        t[0]= jour;
        t[1]= mois;
        t[2]= annee;
        
    }
    
    public String toSting(){
        String s="";
        
        if (t[0]<10){
            s=s+"0"+t[0];
        }
        else {
            s=s+t[0];
        }
        s=s+"/";
        if (t[1]<10){
            s=s+"0"+t[1];
        }
        else {
            s=s+t[1];
        }
        s=s+"/"+t[2];
        
        return s;
    }
    
   }
