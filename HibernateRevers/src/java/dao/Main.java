
package dao;

import entity.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

/**
 *
 * @author KHALID
 */
public class Main {
    public static void main(String[] args) {
        User us=new User();
        us.setUser("MD khalid Hossen");
        us.setPassword("7487");
        
        SessionFactory sess=HibernateUtil.getSessionFactory();
        Session session=sess.openSession();
        session.beginTransaction();
        session.save(us);
        session.getTransaction().commit();
        session.close();
    }
    
}
