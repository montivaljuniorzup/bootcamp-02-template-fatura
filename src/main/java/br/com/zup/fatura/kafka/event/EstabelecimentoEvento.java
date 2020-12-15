package br.com.zup.fatura.kafka.event;

import br.com.zup.fatura.model.Estabelecimento;

public class EstabelecimentoEvento {

    private String nome;
    private String cidade;
    private String endereco;

    @Deprecated
    public EstabelecimentoEvento() {
    }

    public EstabelecimentoEvento(String nome, String cidade, String endereco) {
        this.nome = nome;
        this.cidade = cidade;
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public String getCidade() {
        return cidade;
    }

    public String getEndereco() {
        return endereco;
    }

    public Estabelecimento toModel() {
        return new Estabelecimento(this.nome, this.cidade, this.endereco);
    }
}
