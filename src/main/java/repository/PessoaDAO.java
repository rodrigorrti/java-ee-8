package repository;

import modelo.Pessoa;

import javax.enterprise.context.ApplicationScoped;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.io.Serializable;
import java.util.List;

@ApplicationScoped
public class PessoaDAO implements Serializable {

    @PersistenceContext
    private EntityManager em;

    @Transactional
    public void salvar(Pessoa p){
        em.persist(p);
        System.out.println("Salvando 1");
        System.out.println("Salvando 2");
        System.out.println("Salvando 3");
        System.out.println("Salvando 4");
    }

    public List<Pessoa> consultar(){
        return em.createQuery("select p from Pessoa p",Pessoa.class).getResultList();
    }

    @Transactional
    public void remover(Pessoa p){
        //p = em.find(Pessoa.class,p.getId());
        //em.remove(p);
        em.remove(em.contains(p) ? p : em.merge(p));
    }

    @Transactional
    public void editar(Pessoa p){
        //Pessoa p1 = em.find(Pessoa.class,p.getId());
        //p1 = p;
        em.merge(p);
    }
}
