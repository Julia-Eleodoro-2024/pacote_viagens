package com.ecoturismo;

public class destinos {
    private String hospedagem;
    private String pais;
    private String cidade;

    @Override
    public String toString() {
        return "destinos [hospedagem=" + hospedagem + ", pais=" + pais + ", cidade=" + cidade + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((hospedagem == null) ? 0 : hospedagem.hashCode());
        result = prime * result + ((pais == null) ? 0 : pais.hashCode());
        result = prime * result + ((cidade == null) ? 0 : cidade.hashCode());
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
        destinos other = (destinos) obj;
        if (hospedagem == null) {
            if (other.hospedagem != null)
                return false;
        } else if (!hospedagem.equals(other.hospedagem))
            return false;
        if (pais == null) {
            if (other.pais != null)
                return false;
        } else if (!pais.equals(other.pais))
            return false;
        if (cidade == null) {
            if (other.cidade != null)
                return false;
        } else if (!cidade.equals(other.cidade))
            return false;
        return true;
    }

    public destinos(String hospedagem, String pais, String cidade) {
        this.hospedagem = hospedagem;
        this.pais = pais;
        this.cidade = cidade;
    }

    public destinos() {
    }

    public void descricaoo() {

    }

  public void alterarNome(){

  }

  public void alterarLocalizacao(){

  }

public String getHospedagem() {
    return hospedagem;
}

public void setHospedagem(String hospedagem) {
    this.hospedagem = hospedagem;
}

public String getPais() {
    return pais;
}

public void setPais(String pais) {
    this.pais = pais;
}

public String getCidade() {
    return cidade;
}

public void setCidade(String cidade) {
    this.cidade = cidade;
}

}
