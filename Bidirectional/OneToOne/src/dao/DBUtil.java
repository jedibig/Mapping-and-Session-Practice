package dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class DBUtil {
    public static SessionFactory sf = null;
    static {
        sf = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory(); // pool of connections; point to one database;
    }

    public static Session getSession(){
        return sf.openSession();
    }

}
