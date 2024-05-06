package com.ecoturismo;

public class pacotes {
  private int valor;
  private int diarias;
  private String destino;

  @Override
public String toString() {
    return "pacotes [valor=" + valor + ", diarias=" + diarias + ", destino=" + destino + "]";
}

@Override
public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + valor;
    result = prime * result + diarias;
    result = prime * result + ((destino == null) ? 0 : destino.hashCode());
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
    pacotes other = (pacotes) obj;
    if (valor != other.valor)
        return false;
    if (diarias != other.diarias)
        return false;
    if (destino == null) {
        if (other.destino != null)
            return false;
    } else if (!destino.equals(other.destino))
        return false;
    return true;
}

public pacotes(int valor, int diarias, String destino) {
    this.valor = valor;
    this.diarias = diarias;
    this.destino = destino;
}

public pacotes() {
}

public void aplicarDesconto(){

  }
 
  public void definirDestino(){

  }

  public void calcularPrecoPorPessoa(){

  }

public int getValor() {
    return valor;
}

public void setValor(int valor) {
    this.valor = valor;
}

public int getDiarias() {
    return diarias;
}

public void setDiarias(int diarias) {
    this.diarias = diarias;
}

public String getDestino() {
    return destino;
}

public void setDestino(String destino) {
    this.destino = destino;
}
}
