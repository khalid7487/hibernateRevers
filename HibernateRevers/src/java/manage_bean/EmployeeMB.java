
package manage_bean;

import dao.HibernateUtil;
import entity.User;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

/**
 *
 * @author KHALID
 */
@ManagedBean
@SessionScoped
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
        return "success";
    }
        
}
