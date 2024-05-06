package com.ecoturismo;

public class guias {
  private String nome;
  private int idade;
  private String idiomas;


  @Override
public String toString() {
    return "guias [nome=" + nome + ", idade=" + idade + ", idiomas=" + idiomas + "]";
}

@Override
public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((nome == null) ? 0 : nome.hashCode());
    result = prime * result + idade;
    result = prime * result + ((idiomas == null) ? 0 : idiomas.hashCode());
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
    guias other = (guias) obj;
    if (nome == null) {
        if (other.nome != null)
            return false;
    } else if (!nome.equals(other.nome))
        return false;
    if (idade != other.idade)
        return false;
    if (idiomas == null) {
        if (other.idiomas != null)
            return false;
    } else if (!idiomas.equals(other.idiomas))
        return false;
    return true;
}

public guias(String nome, int idade, String idiomas) {
    this.nome = nome;
    this.idade = idade;
    this.idiomas = idiomas;
}

public guias() {
}

public void realizarTour(){

  }
   
  public void acionarIdioma(){

  }

  public void removerIdioma(){

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

public String getIdiomas() {
    return idiomas;
}

public void setIdiomas(String idiomas) {
    this.idiomas = idiomas;
}

}
