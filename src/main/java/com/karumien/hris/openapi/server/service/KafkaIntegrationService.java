package com.karumien.hris.openapi.server.service;

import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import com.karumien.hris.openapi.model.hris.CustomResponse;
import lombok.extern.slf4j.Slf4j;


/**
 * @author Ondrej Havelka
 */
@Service
@Slf4j
public class KafkaIntegrationService {

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    @Value("${hris.kafka.topic}")
    private String kafkaTopic;

    public void send(CustomResponse message) {
        JSONObject kafkaMessage = new JSONObject(message);
        // TODO: OHA - when kafka, unbox
        //kafkaTemplate.send(kafkaTopic, kafkaMessage.toString(4));
        log.info("Sending kafka message");
    }
}
