package com.portal.api.message;

import com.portal.api.dto.CarPostDTO;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Component
public class KafkaProducerMessage {

    private final String KAFKA_TOPIC = "car-post-topic";
    private final KafkaTemplate<String, CarPostDTO> kafkaTemplate;

    public KafkaProducerMessage(KafkaTemplate<String, CarPostDTO> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    public void sendMessage(CarPostDTO carPostDTO){
        kafkaTemplate.send(KAFKA_TOPIC, carPostDTO);
    }
}
