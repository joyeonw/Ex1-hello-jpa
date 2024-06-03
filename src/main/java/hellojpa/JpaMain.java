package hellojpa;

import java.util.List;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class JpaMain {

    public static void main(String[] args) {
    	EntityManagerFactory emf = Persistence.createEntityManagerFactory("hello");
        EntityManager em = emf.createEntityManager();
        
        EntityTransaction tx = em.getTransaction();
        tx.begin();

//        try {
//        	// 비영속
//        	Member member = new Member();
//        	member.setId(104L);
//        	member.setName("HelloC104");
////        	
//        	em.persist(member);
//        	 tx.commit();
//        	Member findMember = em.find(Member.class, 102L);
//        	System.out.println("findMember.id = " + findMember.getId());
//        	System.out.println("findMember.name = " + findMember.getName());
//        	findMember.setName("HelloJPA");
//        	
//        	List<Member> result = em.createQuery("select m from Member as m", Member.class)
//        			.setFirstResult(5)
//        			.setMaxResults(8)
//        			.getResultList();
//        	
//        	for (Member member : result) {
//        		System.out.println("member.name = " + member.getName() );
//        	}
//        	
//        	System.out.println("findMember.id = " + findMember.getId());
//        	System.out.println("findMember.name = " + findMember.getName());
//        
//        	// 영속
//        	Member member = em.find(Member.class, 150L);
//        	member.setName("zzzzzzz");
////        	
//       	System.out.println("==============================");
//        	
//        	Member member = em.find(Member.class, 150L);
//        	member.setName("ddddd");
//        	
//        	em.detach(member);
        	
//            tx.commit();
        try {
        	
        	// 저장
        	Team team = new Team();
        	team.setName("TeamB");
//        	team.getMembers().add(member);
        	em.persist(team);
        	
        	
        	Member member = new Member();
        	member.setUsername("member2");
        	member.setTeam(team);
        	em.persist(member);
 
        	
        	em.flush();
        	em.clear();
        	
        	tx.commit();
		} catch (Exception e) {
			tx.rollback();
		} finally {
			em.close();
		}
        	
        emf.close();
    }
}
