package diefenthaeler.com.producertreino.controller;

import diefenthaeler.com.producertreino.broker.producer.TopicProducer;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/kafka")
public class KafkaController {

    private final TopicProducer topicProducer;

    @GetMapping("/send")
    public void send() {
        topicProducer.send("Mensagem de teste enviada ao topico!");
    }

    @PostMapping("/send")
    public ResponseEntity<Void> create(@RequestBody String message){
        topicProducer.send(message);
        return ResponseEntity.ok().build();
    }
}
