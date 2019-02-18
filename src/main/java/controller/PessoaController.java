package controller;

import modelo.Pessoa;

import javax.annotation.PostConstruct;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@SessionScoped
@Named
public class PessoaController implements Serializable {
    private Pessoa pessoaForm;
    private List<Pessoa> pessoas;// = new ArrayList<>();
    private Pessoa pessoaSelecionada;

    @PostConstruct
    private void innit (){
        pessoaForm = new Pessoa();
        pessoas = new ArrayList<>();
    }

    public void cadastrar(){
        pessoas.add(pessoaForm);
        limpar();
    }

    public void limpar(){
        this.pessoaForm = new Pessoa();
    }

    public void excluir(){
        this.pessoas.remove(pessoaForm);
    }

    public void aoSelecionar(){
        this.pessoaForm = pessoaSelecionada;
    }

    public void aoDesselecionar(){
        limpar();
    }

    public List<Pessoa> getPessoas() {
        return pessoas;
    }
    public void setPessoas(List<Pessoa> pessoas) {
        this.pessoas = pessoas;
    }

    public Pessoa getPessoaSelecionada() {
        return pessoaSelecionada;
    }

    public void setPessoaSelecionada(Pessoa pessoaSelecionada) {
        this.pessoaSelecionada = pessoaSelecionada;
    }

    public Pessoa getPessoaForm() {
        return pessoaForm;
    }

    public void setPessoaForm(Pessoa pessoaForm) {
        this.pessoaForm = pessoaForm;
    }
}
