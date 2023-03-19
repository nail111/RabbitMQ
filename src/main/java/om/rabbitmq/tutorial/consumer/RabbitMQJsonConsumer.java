package om.rabbitmq.tutorial.consumer;

import om.rabbitmq.tutorial.dto.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

@Service
public class RabbitMQJsonConsumer {
    private static final Logger LOGGER = LoggerFactory.getLogger(RabbitMQJsonConsumer.class);

    @RabbitListener(queues = "${rabbitmq.queue.jsonName}")
    public void consumeJson(User user) {
        LOGGER.info(String.format("Receive a JSON message from user: %s", user.toString()));
    }
}
