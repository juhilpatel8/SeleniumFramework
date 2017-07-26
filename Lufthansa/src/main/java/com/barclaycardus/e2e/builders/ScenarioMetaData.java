package com.barclaycardus.e2e.builders;

import org.springframework.stereotype.Component;

/**
 * Created by Juhil on 7/23/2017.
 */
@Component
public class ScenarioMetaData {
    private String  id;

    private String scenarioName;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getScenarioName() {
        return scenarioName;
    }

    public void setScenarioName(String scenarioName) {
        this.scenarioName = scenarioName;
    }

}
