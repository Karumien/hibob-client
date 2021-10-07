package com.karumien.hris.openapi.server.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import com.karumien.hris.openapi.mapper.ReplacerMapper;
import com.karumien.hris.openapi.model.hris.CustomRequest;
import com.karumien.hris.openapi.model.hris.CustomResponse;
import com.karumien.hris.openapi.server.service.KafkaIntegrationService;
import lombok.extern.slf4j.Slf4j;


/**
 * @author Ondrej Havelka
 */
@RestController
@Slf4j
public class ReplacerController implements CustomApi {

    @Autowired
    private KafkaIntegrationService kafkaIntegrationService;

    @Override
    public ResponseEntity<CustomResponse> replace(@Valid CustomRequest customRequest) {
        CustomResponse customResponse = ReplacerMapper.REPLACER_MAPPER.customRequestToCustomResponse(customRequest);
        log.info(customResponse.toString());
        kafkaIntegrationService.send(customResponse);
        log.info("Message sent");
        return ResponseEntity.status(200).body(customResponse);
    }
}
