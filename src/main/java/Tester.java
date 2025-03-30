

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Tester {
	public static void main(String[] args) {
		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");
		//System.out.println("1");
		SessionFactory factory = configuration.buildSessionFactory();
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		Student student = new Student();
		student.setId(5);
		student.setName("sohan");
		student.setAge(22);
		session.save(student);
		transaction.commit();
		session.close();
		System.out.println("inserted");
		 
 	
	
	
	
	}

}
