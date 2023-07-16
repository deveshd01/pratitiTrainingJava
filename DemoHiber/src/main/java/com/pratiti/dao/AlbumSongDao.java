package com.pratiti.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.pratiti.entity.Album;
import com.pratiti.entity.Song;

public class AlbumSongDao {

	public void save(Object obj) {
		EntityManagerFactory emf = null;
		try {
			emf = Persistence.createEntityManagerFactory("hibernate-demo");
			EntityManager em = emf.createEntityManager();
			em.getTransaction().begin();
			em.merge(obj); // used for BOTH update & insert
			em.getTransaction().commit();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			emf.close();
		}
	}

	@SuppressWarnings("unchecked")
	public Object fetchById(Class cl, int id) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("hibernate-demo");
		EntityManager em = emf.createEntityManager();

		return em.find(cl, id);
	}

//	public <E> E fetchByIdV2(Class<E> cl, int id)
	public <Devesh> Devesh fetchByIdV2(Class<Devesh> cl, int id) { // using generics
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("hibernate-demo");
		EntityManager em = emf.createEntityManager();

		return em.find(cl, id);
	}

	public List<Song> fetchSongSungBy(String artist) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("hibernate-demo");
		EntityManager em = emf.createEntityManager();

		try {
			String ql = "select s from Song s where s.artist = :temp";
			Query q = em.createQuery(ql);
			q.setParameter("temp", artist); // If we want to edit query as per user
			List<Song> list = q.getResultList();
			return list;

		} finally {
			emf.close();
		}

	}

	public List<Album> fetchAlbumByArtist(String artist) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("hibernate-demo");
		EntityManager em = emf.createEntityManager();

		try {
			String ql = "select a from Song s join s.album a where s.artist = :temp";
			Query q = em.createQuery(ql);
			q.setParameter("temp", artist);
			List<Album> list = q.getResultList();
			return list;

		} finally {
			emf.close();
		}

	}

}
