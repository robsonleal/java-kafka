package org.example.kafka.producer;

import lombok.extern.slf4j.Slf4j;
import org.example.kafka.producer.eventos.ProdutorEvento;

@Slf4j
public class AplicacaoProducer {

    public static void main(String[] args) {
        AplicacaoProducer aplicacao = new AplicacaoProducer();
        aplicacao.iniciar();
    }

    public void iniciar() {
        log.info("Iniciando a aplicação");
        ProdutorEvento produtor = new ProdutorEvento();
        produtor.executar();
    }

}
