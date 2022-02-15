package edunova;



import org.hibernate.Session;
import util.HibernateUtil;


public class Start {
    private Session session;
    
    public Start(){
        this.session = HibernateUtil.getSession();
    }
    
    
    public static void main(String[] args) {
        new Start();
    }
    
}

