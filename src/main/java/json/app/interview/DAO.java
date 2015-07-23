package json.app.interview;

import java.util.ArrayList;
import java.util.List;

import javafx.beans.binding.StringBinding;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;







import javax.persistence.Query;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class DAO {
	
	@PersistenceContext
	EntityManager em;
	
	@SuppressWarnings("unchecked")
	public List<TabelaTestowa> findAll() {
		String stringQuery = "SELECT c FROM TabelaTestowa c";
		Query query = em.createQuery(stringQuery);
		return query.getResultList();
	}

	@SuppressWarnings("unchecked")
	public List<TabelaTestowa> find(long s) {

		return em.createQuery(
				"SELECT c FROM TabelaTestowa c where c.id = :szukane")
				.setParameter("szukane",s)
				.getResultList();
				
	}
	
	@SuppressWarnings("unchecked")
	public List<TabelaTestowa> findSth() {
		
		return em.createQuery(
				"select c from TabelaTestowa c where c.id=2")
				.getResultList();
		
        
				
	}
	
	@SuppressWarnings("unchecked")
	public List<TabelaTestowa> ColumnRepeat(String dataFromController) {
		
		StringBuilder stringBuilder=new StringBuilder();
		stringBuilder.append("SELECT DISTINCT c.").append(dataFromController).append(" FROM TabelaTestowa c");
		List<String> distinct=em.createQuery(stringBuilder.toString())
				.getResultList();
		
		List<String> StringThatAppearsOnce=new ArrayList<String>();
		
		StringBuilder stringBuilder2=new StringBuilder();
		for(int i=0;i<distinct.size();i++)
		{
		stringBuilder2.append("select count(c.").append(dataFromController).append(") from TabelaTestowa c where c.")
		.append(dataFromController).append("='")
		.append(distinct.get(i)).append("'");
	
		long k=(Long) em.createQuery(stringBuilder2.toString()).getSingleResult();
		if(k==1)
		{
			StringThatAppearsOnce.add(distinct.get(i));
		}
		stringBuilder2.delete(0,stringBuilder2.length());
		}
				
		StringBuilder stringBuilder3=new StringBuilder();
		stringBuilder3.append("Select c from TabelaTestowa c where c.").append(dataFromController).append("='");
		for(int i=0;i<StringThatAppearsOnce.size();i++)
		{
			
			if(i==StringThatAppearsOnce.size()-1){
				stringBuilder3.append(StringThatAppearsOnce.get(i)).append("'");
				}
				else
				stringBuilder3.append(StringThatAppearsOnce.get(i)).append("' OR ").append(dataFromController).append(" ='");
				
			
		}
		
		
		
		return em.createQuery(stringBuilder3.toString())
				.getResultList();
		
        
				
	}
	@SuppressWarnings("unchecked")
	public List<TabelaTestowa> ColumnUnique (String dataFromController) {
		
		StringBuilder stringBuilder=new StringBuilder();
		stringBuilder.append("SELECT DISTINCT c.").append(dataFromController).append(" FROM TabelaTestowa c");
		List<String> distinct=em.createQuery(stringBuilder.toString())
				.getResultList();
		
		List<String> StringThatAppearsOnce=new ArrayList<String>();
		
		StringBuilder stringBuilder2=new StringBuilder();
		for(int i=0;i<distinct.size();i++)
		{
		stringBuilder2.append("select count(c.").append(dataFromController).append(") from TabelaTestowa c where c.")
		.append(dataFromController).append("='")
		.append(distinct.get(i)).append("'");
	
		long k=(Long) em.createQuery(stringBuilder2.toString()).getSingleResult();
		if(k>1)
		{
			StringThatAppearsOnce.add(distinct.get(i));
		}
		stringBuilder2.delete(0,stringBuilder2.length());
		}
				
		StringBuilder stringBuilder3=new StringBuilder();
		stringBuilder3.append("Select c from TabelaTestowa c where c.").append(dataFromController).append("='");
		for(int i=0;i<StringThatAppearsOnce.size();i++)
		{
			
			if(i==StringThatAppearsOnce.size()-1){
				stringBuilder3.append(StringThatAppearsOnce.get(i)).append("'");
				}
				else
				stringBuilder3.append(StringThatAppearsOnce.get(i)).append("' OR ").append(dataFromController).append(" ='");
				
			
		}
		
		
		
		return em.createQuery(stringBuilder3.toString())
				.getResultList();
		
  	
	}

	@SuppressWarnings("unchecked")
	public List<TabelaTestowa> ColumnFourRepeat(String dataFromController) {
		
		StringBuilder stringBuilder=new StringBuilder();
		stringBuilder.append("SELECT DISTINCT c.").append(dataFromController).append(" FROM TabelaTestowa c");
		List<Long> distinct=em.createQuery(stringBuilder.toString())
				.getResultList();
		
		List<Long> StringThatAppearsOnce=new ArrayList<Long>();
		
		StringBuilder stringBuilder2=new StringBuilder();
		for(int i=0;i<distinct.size();i++)
		{
		stringBuilder2.append("select count(c.").append(dataFromController).append(") from TabelaTestowa c where c.")
		.append(dataFromController).append("='")
		.append(distinct.get(i)).append("'");
	
		long k=(Long) em.createQuery(stringBuilder2.toString()).getSingleResult();
		if(k>1)
		{
			StringThatAppearsOnce.add(distinct.get(i));
		}
		stringBuilder2.delete(0,stringBuilder2.length());
		}
				
		StringBuilder stringBuilder3=new StringBuilder();
		stringBuilder3.append("Select c from TabelaTestowa c where c.").append(dataFromController).append("='");
		for(int i=0;i<StringThatAppearsOnce.size();i++)
		{
			
			if(i==StringThatAppearsOnce.size()-1){
				stringBuilder3.append(StringThatAppearsOnce.get(i)).append("'");
				}
				else
				stringBuilder3.append(StringThatAppearsOnce.get(i)).append("' OR ").append(dataFromController).append(" ='");
				
			
		}
		
		
		
		return em.createQuery(stringBuilder3.toString())
				.getResultList();
		
  	
	}
	
	@SuppressWarnings("unchecked")
	public List<TabelaTestowa> ColumnFourUnique(String dataFromController) {
		
		StringBuilder stringBuilder=new StringBuilder();
		stringBuilder.append("SELECT DISTINCT c.").append(dataFromController).append(" FROM TabelaTestowa c");
		List<Long> distinct=em.createQuery(stringBuilder.toString())
				.getResultList();
		
		List<Long> StringThatAppearsOnce=new ArrayList<Long>();
		
		StringBuilder stringBuilder2=new StringBuilder();
		for(int i=0;i<distinct.size();i++)
		{
		stringBuilder2.append("select count(c.").append(dataFromController).append(") from TabelaTestowa c where c.")
		.append(dataFromController).append("='")
		.append(distinct.get(i)).append("'");
	
		long k=(Long) em.createQuery(stringBuilder2.toString()).getSingleResult();
		if(k==1)
		{
			StringThatAppearsOnce.add(distinct.get(i));
		}
		stringBuilder2.delete(0,stringBuilder2.length());
		}
				
		StringBuilder stringBuilder3=new StringBuilder();
		stringBuilder3.append("Select c from TabelaTestowa c where c.").append(dataFromController).append("='");
		for(int i=0;i<StringThatAppearsOnce.size();i++)
		{
			
			if(i==StringThatAppearsOnce.size()-1){
				stringBuilder3.append(StringThatAppearsOnce.get(i)).append("'");
				}
				else
				stringBuilder3.append(StringThatAppearsOnce.get(i)).append("' OR ").append(dataFromController).append(" ='");
				
			
		}
		
		
		
		return em.createQuery(stringBuilder3.toString())
				.getResultList();
		
  	
	}
}
