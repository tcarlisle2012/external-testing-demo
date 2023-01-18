package com.gfs.gordonnow.externaltestingdemo;

import com.gfs.gordonnow.externaltestingdemo.api.DeliveryEtasApi;
import com.gfs.gordonnow.externaltestingdemo.model.DetailedDeliveryEtaDto;
import jakarta.annotation.PostConstruct;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.time.OffsetDateTime;

@Slf4j
@Service
public class DeliveryETATestService {

    @PostConstruct
    public void runTests() {
        log.info("Running Delivery Eta Tests");
        getDeliveryEta();
    }

    private void getDeliveryEta() {
        log.info("running getDeliveryEta()");
        DeliveryEtasApi api = new DeliveryEtasApi();
        DetailedDeliveryEtaDto result = api.get1(
                "999900002",
                OffsetDateTime.now(),
                "1000",
                "10",
                "10",
                null
        ).block();

        assert(result != null);
        log.debug("getDeliveryEta result: " + result);
    }
}
