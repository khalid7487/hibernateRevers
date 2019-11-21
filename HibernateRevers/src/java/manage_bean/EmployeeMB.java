
package manage_bean;

import dao.HibernateUtil;
import entity.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

/**
 *
 * @author KHALID
 */
public class EmployeeMB {
    User us=new User();

    public User getUs() {
        return us;
    }

    public void setUs(User us) {
        this.us = us;
    }
    
    public String saveUser(){
         SessionFactory sess=HibernateUtil.getSessionFactory();
        Session session=sess.openSession();
        session.beginTransaction();
        session.save(us);
        session.getTransaction().commit();
        session.close();
        return null;
    }
        
}
