package com.ecoturismo;

public class clientes {
  private String nome;
  private int idade;
  private String email;

  
  @Override
public String toString() {
    return "clientes [nome=" + nome + ", idade=" + idade + ", email=" + email + "]";
}

@Override
public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((nome == null) ? 0 : nome.hashCode());
    result = prime * result + idade;
    result = prime * result + ((email == null) ? 0 : email.hashCode());
    return result;
}

@Override
public boolean equals(Object obj) {
    if (this == obj)
        return true;
    if (obj == null)
        return false;
    if (getClass() != obj.getClass())
        return false;
    clientes other = (clientes) obj;
    if (nome == null) {
        if (other.nome != null)
            return false;
    } else if (!nome.equals(other.nome))
        return false;
    if (idade != other.idade)
        return false;
    if (email == null) {
        if (other.email != null)
            return false;
    } else if (!email.equals(other.email))
        return false;
    return true;
}

public clientes(String nome, int idade, String email) {
    this.nome = nome;
    this.idade = idade;
    this.email = email;
}

public clientes() {
}

public void fazerReserva(){

  }
 
  public void atualizarEmail(){

  }

  public void exibirDetalhes(){

  }

public String getNome() {
    return nome;
}

public void setNome(String nome) {
    this.nome = nome;
}

public int getIdade() {
    return idade;
}

public void setIdade(int idade) {
    this.idade = idade;
}

public String getEmail() {
    return email;
}

public void setEmail(String email) {
    this.email = email;
}

}
