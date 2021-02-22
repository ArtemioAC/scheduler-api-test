package com.identifix.schedulertestapi.controller

import com.identifix.schedulertestapi.model.Oem
import groovy.util.logging.Slf4j
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
@RequestMapping('run')
class TestController {
    @PostMapping('/oem')
    ResponseEntity ftpFetch(@RequestBody Oem oem) {
        log.info("Se recibio un mensaje con : " + oem)
        new ResponseEntity<Object>('true', HttpStatus.ACCEPTED)
    }
}
