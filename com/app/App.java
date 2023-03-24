package com.app;




//import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.model.Employee;

public class App 
{
    public static void main( String[] args )
    {
       // 1.create object of Configuration class
    	 Configuration cfg=new Configuration();
    	 cfg.configure();
    	//2.Getting object of sessionFactory Interface
    	 SessionFactory sessionFactory =cfg.buildSessionFactory();
    	//3.getting object of session interface
    	 Session session=sessionFactory.openSession();
    	//4.Getting Transaction interface object 
    	 Transaction tr=session.beginTransaction();
    	 //5.Creating object of Employee class
    	 Employee em=new Employee();
    	 em.setEmp_name("robin");
    	 em.setSalary(9000);
    	// em.setDoj(new Date());
    	
    	 //6.save an Database with the help of session interface
    	 session.save(em);
    	 //7.commit all changes.
    	  tr.commit();
    	 System.out.println(em);
    	 
    	 //8.closing sessionFactory
    	 session.close();
    	 
    	 
    }
}
