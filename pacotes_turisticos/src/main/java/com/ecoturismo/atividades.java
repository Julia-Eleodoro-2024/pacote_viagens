package com.ecoturismo;

public class atividades {
  private String nome;
  private int duracaoEmHoras;
  private String descricao;

  
  @Override
public String toString() {
    return "atividades [nome=" + nome + ", duracaoEmHoras=" + duracaoEmHoras + ", descricao=" + descricao + "]";
}

@Override
public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((nome == null) ? 0 : nome.hashCode());
    result = prime * result + duracaoEmHoras;
    result = prime * result + ((descricao == null) ? 0 : descricao.hashCode());
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
    atividades other = (atividades) obj;
    if (nome == null) {
        if (other.nome != null)
            return false;
    } else if (!nome.equals(other.nome))
        return false;
    if (duracaoEmHoras != other.duracaoEmHoras)
        return false;
    if (descricao == null) {
        if (other.descricao != null)
            return false;
    } else if (!descricao.equals(other.descricao))
        return false;
    return true;
}

public atividades(String nome, int duracaoEmHoras, String descricao) {
    this.nome = nome;
    this.duracaoEmHoras = duracaoEmHoras;
    this.descricao = descricao;
}

public atividades() {
}

public void exibirInformacoes(){

  }

  public void definirDescricao(){

  }

  public void calcularDuracaoTotal(){

  }

public String getNome() {
    return nome;
}

public void setNome(String nome) {
    this.nome = nome;
}

public int getDuracaoEmHoras() {
    return duracaoEmHoras;
}

public void setDuracaoEmHoras(int duracaoEmHoras) {
    this.duracaoEmHoras = duracaoEmHoras;
}

public String getDescricao() {
    return descricao;
}

public void setDescricao(String descricao) {
    this.descricao = descricao;
}

}
