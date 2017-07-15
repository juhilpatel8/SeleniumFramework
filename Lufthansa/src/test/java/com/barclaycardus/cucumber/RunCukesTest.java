package com.barclaycardus.cucumber;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

/**
 * Created by Juhil on 3/20/2016.
 */
@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty",
        "json:target/cucumber/cucumber.json",
        "html:target/cucumber"},
tags={"~@wip","~@manual"},
features = "classpath:features")
//src/test/resources/

//https://github.com/jamesladd/maven-cuke4duke-jump-start
//https://github.com/ZsoltFabok/cucumber-jvm-post
public class RunCukesTest {

}
