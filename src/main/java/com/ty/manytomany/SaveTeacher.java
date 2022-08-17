package com.ty.manytomany;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class SaveTeacher {
	
	public static void main(String[] args) 
	{
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		
		EntityManager  entityManager =  entityManagerFactory.createEntityManager();
		
		EntityTransaction entityTransaction =  entityManager.getTransaction();
		
		Teacher teacher =  new Teacher();
		
		teacher.setAge(34);
		teacher.setName("RamKrishna");
		
		Subject subject =  new Subject();
		
		subject.setSname("Maths");
		subject.setSdays(35);
		
		Subject subject2 =  new Subject();
		
		subject2.setSname("CS");
		subject2.setSdays(46);
		
		Subject subject3 =  new Subject();
		
		subject3.setSname("EC");
		subject3.setSdays(38);
		
		List<Subject> al  = new ArrayList<Subject>();
		
		al.add(subject);
		al.add(subject2);
		al.add(subject3);
		
		teacher.setSubject(al);
		

	
		Teacher teacher1 =  new Teacher();
		
		teacher1.setAge(35);
		teacher1.setName("Rama");
		
		Subject sub =  new Subject();
		
		sub.setSname("Maths");
		sub.setSdays(35);
		
		Subject sub1 =  new Subject();
		
		sub1.setSname("CS");
		sub1.setSdays(46);
		
		List<Subject> alist  = new ArrayList<Subject>();
		
		alist.add(sub);
		alist.add(sub1);
		
		teacher1.setSubject(alist);
		
		Teacher teacher2 =  new Teacher();
		
		teacher2.setAge(36);
		teacher2.setName("Krishna");
		

		Subject subb =  new Subject();
		
		subb.setSname("Kannada");
		subb.setSdays(35);
		
		Subject subb1 =  new Subject();
		
		subb1.setSname("BioLogy");
		subb1.setSdays(46);
		
		
		List<Subject> alist1  = new ArrayList<Subject>();
		
		alist1.add(subb);
		alist1.add(subb1);
		
		teacher2.setSubject(alist1);
		
		

		entityTransaction.begin();
		
		entityManager.persist(teacher);
		entityManager.persist(teacher1);
		entityManager.persist(teacher2);
		entityManager.persist(subject);
		entityManager.persist(subject2);
		entityManager.persist(subject3);
		entityManager.persist(sub);
		entityManager.persist(sub1);
		entityManager.persist(subb);
		entityManager.persist(subb1);
		entityTransaction.commit();
		
		System.out.println("Data Saved");
		
		
		
		
	
	}

}
