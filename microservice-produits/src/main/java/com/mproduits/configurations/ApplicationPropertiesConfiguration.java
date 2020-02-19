package com.mproduits.configurations;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("mes-configs")
public class ApplicationPropertiesConfiguration {

    private int limiteDeProduits;

    public int getLimiteDeProduits() {
        return limiteDeProduits;
    }

    public void setLimiteDeProduits(int limiteDeProduits) {
        this.limiteDeProduits = limiteDeProduits;
    }
}
