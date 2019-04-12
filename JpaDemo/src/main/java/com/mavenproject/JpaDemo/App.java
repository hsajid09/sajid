package com.mavenproject.JpaDemo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class App 

{
    public static void main( String[] args )
    {
    	Alien a= new Alien();
    	a.setAid(5);
    	a.setAname("David");
    	a.setTech("Oracle");
    
    	EntityManagerFactory emf= Persistence.createEntityManagerFactory("pu");
    	EntityManager em = emf.createEntityManager();
    	//Alien a= em.find(Alien.class, 2);
    	em.getTransaction().begin();
    	em.persist(a);
    	em.getTransaction().commit();
    	
    	System.out.println(a);
    	
    	
    	
    	
        
    }
}
