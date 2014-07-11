package ru.arthur.model.dao;

import org.hibernate.Criteria;
import org.hibernate.Session;
import ru.arthur.entities.Article;
import ru.arthur.model.HibernateUtil;

import java.util.List;

/**
 * Created by salimhanov on 11.07.2014.
 */
public class ArticleDAOImpl implements ArticleDAO{

    @Override
    public List<Article> getArticle(){

        List<Article> result = null;
//Создаем сессию, она нужна для использования транзакций
        Session session = HibernateUtil.getSessionFactory().openSession();
        try {
            session.beginTransaction().begin();
//Criteria используется  для запроса с целью получения данных из БД
            Criteria criteria = session.createCriteria(Article.class);

            result = (List<Article>) criteria.list();

            session.getTransaction().commit();
        } catch (Exception e) {

            e.printStackTrace();
        }finally {
            if (session != null) session.close();
        }
        return result;
    }


    public void addItemToArticle(Article article) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        try {
            session.beginTransaction().begin();
            session.save(article);
            session.getTransaction().commit();
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            if (session != null) {
                session.close();
            }
        }
    }

    public void deleteItemFromArticle(String id) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        try {
            session.beginTransaction().begin();
            Article itemDelete = (Article) session.get(Article.class, id);
            session.delete(itemDelete);

            session.getTransaction().commit();
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            if (session != null) {
                session.close();
            }
        }
    }

    public void deleteAllItemToArticle(List<Integer> idAllItemsInArticle) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        try {
            session.beginTransaction().begin();
            for(Integer id:idAllItemsInArticle){
                Article itemDelete = (Article) session.get(Article.class, id);
                session.delete(itemDelete);
            }
            session.getTransaction().commit();
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            if (session != null) {
                session.close();
            }
        }
    }






}
