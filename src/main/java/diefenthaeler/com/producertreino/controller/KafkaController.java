package diefenthaeler.com.producertreino.controller;

import diefenthaeler.com.producertreino.broker.producer.TopicProducer;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/kafka")
public class KafkaController {

    private final TopicProducer topicProducer;

    @GetMapping("/send")
    public void send() {
        topicProducer.send("Mensagem de teste enviada ao topico!");
    }
}
