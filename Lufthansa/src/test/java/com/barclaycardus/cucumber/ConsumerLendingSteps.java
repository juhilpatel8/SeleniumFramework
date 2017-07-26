package com.barclaycardus.cucumber;
import com.barclaycardus.domain.HelperFactory;
import com.barclaycardus.domain.interfaces.Apply;
import com.barclaycardus.domain.interfaces.ShoppingCart;
import com.barclaycardus.e2e.builders.LoanApplicantBuilder;
import com.barclaycardus.e2e.builders.ScenarioMetaData;
import com.barclaycardus.e2e.builders.ShoppingCartApplicantBuilder;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.IntegrationTest;
import org.springframework.boot.test.SpringApplicationContextLoader;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by Juhil on 4/16/2016.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {com.barclaycardus.cucumber.Application.class},loader = SpringApplicationContextLoader.class)
@IntegrationTest
@ComponentScan(value = "com.barclaycardus")
public abstract class ConsumerLendingSteps {

    @Autowired
    protected LoanApplicantBuilder applicantBuilder;//=new LoanApplicantBuilder();

    @Autowired
    protected ShoppingCartApplicantBuilder shopingcartapplicantBuilder;//=new LoanApplicantBuilder();

    @Autowired
    HelperFactory helperFactory;

    public ScenarioMetaData getScenarioMetadata() {
        return scenarioMetadata;
    }

    public void setScenarioMetadata(ScenarioMetaData scenarioMetadata) {
        this.scenarioMetadata = scenarioMetadata;
    }

    @Autowired
    private ScenarioMetaData scenarioMetadata;

    public Apply getApplyHelper()
    {
        return helperFactory.getApplyHelper();
    }

    public ShoppingCart getShoppingCartHelper()
    {
        return helperFactory.getShoppingCartHelper();
    }


}
