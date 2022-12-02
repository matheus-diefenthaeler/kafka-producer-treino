package diefenthaeler.com.producertreino.broker.producer;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class TopicProducer {

    @Value("${topic.name}")
    private String topicName;

    private final KafkaTemplate<String, String> kafkaTemplate;

    public void send(String message) {
        log.info("Payload enviado: {}", message);
        kafkaTemplate.send(topicName, message);
    }
}
