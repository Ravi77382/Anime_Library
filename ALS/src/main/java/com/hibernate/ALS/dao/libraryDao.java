package com.hibernate.ALS.dao;
import org.hibernate.Session;
import org.hibernate.Transaction;
import com.hibernate.ALS.model.library;
import com.hibernate.ALS.util.animeUtil;
public class libraryDao
{
	public void saveAnime(library lib)
	{
		Transaction transaction=null;
		try(Session session=animeUtil.getSessionFactory().openSession())
		{
			transaction = session.beginTransaction();
			session.save(lib);
			transaction.commit();
		}
		catch(Exception e)
		{
			if(transaction!=null)
			{
				transaction.rollback();
			}
		}
	}
	public void updateAnime(library lib)
	{
		Transaction transaction=null;
		try(Session session=animeUtil.getSessionFactory().openSession())
		{
			transaction = session.beginTransaction();
			session.saveOrUpdate(lib);
			transaction.commit();
		}
		catch(Exception e)
		{
			if(transaction!=null)
			{
				transaction.rollback();
			}
		}
	}
	public void deleteAnime(long id)
	{
		Transaction transaction=null;
		try(Session session=animeUtil.getSessionFactory().openSession())
		{
			transaction = session.beginTransaction();
			library lib =session.get(library.class, id);
			session.delete(lib);
			transaction.commit();
		}
		catch(Exception e)
		{
			if(transaction!=null)
			{
				transaction.rollback();
			}
		}
	}
	public void getAnimeById(long id)
	{
		Transaction transaction=null;
		try(Session session=animeUtil.getSessionFactory().openSession())
		{
			transaction = session.beginTransaction();
			library lib =session.get(library.class, id);
			System.out.println(lib);
			transaction.commit();
		}
		catch(Exception e)
		{
			if(transaction!=null)
			{
				transaction.rollback();
			}
		}
	}
}