/*
package com.barclaycardus.cucumber;

import com.barclaycardus.e2e.exception.MonteBeanCreationException;
import com.barclaycardus.e2e.ui.monte.screenrecorder.RecordScript;
import com.barclaycardus.e2e.utils.Constants;
import com.barclaycardus.e2e.utils.CucumberUtils;
import com.barclaycardus.e2e.utils.JourneyEnum;
import cucumber.api.Scenario;
import org.apache.commons.configuration.ConfigurationException;
import cucumber.api.java.After;
import cucumber.api.java.Before;

import org.apache.commons.lang.RandomStringUtils;
import org.monte.screenrecorder.ScreenRecorder;
import org.slf4j.Logger;

import java.io.IOException;
import java.util.UUID;
import java.util.Date;

/**
 * Created by Juhil on 7/23/2017.
 */
//extends ConsumerLendingSteps

/**
public class CucumberHooks extends ConsumerLendingSteps {

    private static final Logger log = org.slf4j.LoggerFactory.getLogger(CucumberHooks.class);
    RecordScript recordScript = new RecordScript();

    /**
     * This method will capture screen shot and embed the screen shot for all the failed scenrios
     * This code shoudl be present in all the step defs which embeds the screensot to failed scenrios
     */

/**
    @After
    public void tearDown(Scenario scenario) {
        if (JourneyEnum.USER.name().equalsIgnoreCase(CucumberUtils.getJourneyType())) {
            //take a screenshot
//            byte[] screenshot = null;
//            try {
////               screenshot=captureScreen(getUiDriver());
//
//            } catch (Exception e) {
//
//            }

        }
    }

    @Before
    public void startFeature(Scenario scenario) {
//        getScenarioMetadata().setId(UUID.randomUUID().toString());
//        getScenarioMetadata().setScenarioName(scenario.getName());

        String traceId = "UI_JOURNEY" + RandomStringUtils.randomAlphanumeric(10).toUpperCase() + "_" + (new Date(System.currentTimeMillis()));
        System.setProperty(Constants.SCHEMA_FOLDER, traceId);

        if ((JourneyEnum.USER.name().equalsIgnoreCase(CucumberUtils.getJourneyType())) && !"linux".equalsIgnoreCase(System.getProperty("os.name"))) {
            ScreenRecorder screenRecorder = null;
            try {
                recordScript.setMovieFileName(scenario.getName());
                screenRecorder=recordScript.getScreenRecorderInstance();
                screenRecorder.start();

            } catch (MonteBeanCreationException e) {
                log.error("Unable to start video recording..." + e.getMessage());
            } catch (IOException e) {
                log.error("Unable to start video recording..." + e.getMessage());

            }

        }
    }

}

**/