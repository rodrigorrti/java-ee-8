package cdi;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.time.LocalDateTime;

@SessionScoped
public class SessionBean implements Serializable {

    public static int contador;

    public SessionBean() {
        System.out.println("RequestBean - Construtor: " + LocalDateTime.now());
        contador++;
    }

    public String imprimeContador (){
        return String.valueOf(contador);
    }

    @PostConstruct
    private void innit (){
        System.out.println("SessionBean - PostConstruct: " + LocalDateTime.now());
    }

    @PreDestroy
    private void end (){
        System.out.println("SessionBean - PreDestroy: " + LocalDateTime.now());
    }
}
