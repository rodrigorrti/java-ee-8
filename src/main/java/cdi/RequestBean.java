package cdi;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.enterprise.context.RequestScoped;
import java.io.Serializable;
import java.time.LocalDateTime;

@RequestScoped
public class RequestBean implements Serializable {

    public static int contador;

    public RequestBean() {
        System.out.println("RequestBean - Construtor: " + LocalDateTime.now());
        contador++;
    }

    public String imprimeContador (){
        return String.valueOf(contador);
    }

    @PostConstruct
    private void innit (){
        System.out.println("RequestBean - PostConstruct: " + LocalDateTime.now());
    }

    @PreDestroy
    private void end (){
        System.out.println("RequestBean - PreDestroy: " + LocalDateTime.now());
    }
}
