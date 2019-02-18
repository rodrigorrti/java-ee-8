package modelo;

public class Pessoa {
    private String nome;
    private String cpf;
    private String endereco;
    private String telefone;


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Pessoa pessoa = (Pessoa) o;

        if (nome != null ? !nome.equals(pessoa.nome) : pessoa.nome != null) return false;
        if (cpf != null ? !cpf.equals(pessoa.cpf) : pessoa.cpf != null) return false;
        if (endereco != null ? !endereco.equals(pessoa.endereco) : pessoa.endereco != null) return false;
        return telefone != null ? telefone.equals(pessoa.telefone) : pessoa.telefone == null;
    }

    @Override
    public int hashCode() {
        int result = nome != null ? nome.hashCode() : 0;
        result = 31 * result + (cpf != null ? cpf.hashCode() : 0);
        result = 31 * result + (endereco != null ? endereco.hashCode() : 0);
        result = 31 * result + (telefone != null ? telefone.hashCode() : 0);
        return result;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
}
