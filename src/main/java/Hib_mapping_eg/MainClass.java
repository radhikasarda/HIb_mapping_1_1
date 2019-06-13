package Hib_mapping_eg;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Laptop laptop =new Laptop();
		laptop.setLid(101);
		laptop.setLname("Dell");
	
		
		Students s=new Students();
		s.setName("Prajjwal");
		s.setMarks(80);
		s.setRoll(1);
		s.setLaptop(laptop);
		laptop.setStudent(s);
		
		
		
		
		
		
    	
    	Configuration con=new Configuration().configure().addAnnotatedClass(Students.class).addAnnotatedClass(Laptop.class);
    	
    	SessionFactory sf=con.buildSessionFactory();
    	Session session=sf.openSession();
    	session.beginTransaction();
    	
    	
   
        
   
    	
    	session.save(s);
    	
    	session.save(s);
    	
    	session.getTransaction().commit();
    	
		
		
	}

}
