package org.example.kafka.consumer;

import lombok.extern.slf4j.Slf4j;
import org.example.kafka.consumer.evento.ConsumidorEvento;

@Slf4j
public class AplicacaoConsumer {

    public static void main(String[] args) {
        AplicacaoConsumer aplicacao = new AplicacaoConsumer();
        aplicacao.iniciar();
    }

    public void iniciar() {
        log.info("Iniciando a aplicação");
        ConsumidorEvento consumidor = new ConsumidorEvento();
        consumidor.executar();
    }

}
