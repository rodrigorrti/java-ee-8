package cdi;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.enterprise.context.ApplicationScoped;
import java.io.Serializable;
import java.time.LocalDateTime;

@ApplicationScoped
public class ApplicationBean implements Serializable {

    public static int contador;

    public ApplicationBean() {
        contador++;
        System.out.println("ApplicationBean - Construtor: " + LocalDateTime.now());
    }

    public String imprimeContador (){
        return String.valueOf(contador);
    }

    @PostConstruct
    private void innit (){
        System.out.println("ApplicationBean - PostConstruct: " + LocalDateTime.now());
    }

    @PreDestroy
    private void end (){
        System.out.println("ApplicationBean - PreDestroy: " + LocalDateTime.now());
    }

}
