package com.ty.manytomany;


	
	
	import java.util.ArrayList;
	import java.util.List;

	import javax.persistence.EntityManager;
	import javax.persistence.EntityManagerFactory;
	import javax.persistence.EntityTransaction;
	import javax.persistence.Persistence;

	public class SaveCourse {
		public static void main(String[] args) {
			
			EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
			EntityManager entityManager = entityManagerFactory.createEntityManager();
			EntityTransaction entityTransaction = entityManager.getTransaction();
			
			Course course =  new Course();
			course.setName("JAVA");
			course.setCost(3499);
			
			Student student =  new Student();
			student.setName("Sann");
			student.setAge(22);
			
			Student student1 =  new Student();
			student1.setName("pavan");
			student1.setAge(25);
			
			Student student2 =  new Student();
			student2.setName("karthick");
			student2.setAge(24);
			
			
			
			List<Student> al = new ArrayList<Student>();
			al.add(student);
			al.add(student1);
			al.add(student2);
			
		course.setStudent(al);
		
		entityTransaction.begin();
		
		entityManager.persist(course);
		entityManager.persist(student);
		entityManager.persist(student1);
		entityManager.persist(student2);
		
		entityTransaction.commit();


			System.out.println("Data Saved");
		
		}
		
		

	}
	

