package com.barclaycardus.cucumber.builders;

import com.barclaycardus.e2e.builders.LoanApplicantType;
import com.barclaycardus.e2e.builders.ShopingCartApplicantType;
import com.barclaycardus.e2e.builders.ShoppingCartApplicantBuilder;
import com.barclaycardus.e2e.utils.CobaltTestUtils;
import com.barclaycardus.e2e.utils.JsonFileReader;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * Created by Juhil on 7/28/2017.
 */

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class BuildShoppingCartAccount {

    private static final Logger log=org.slf4j.LoggerFactory.getLogger(BuildShoppingCartAccount.class);

    public static final String SHOPPINGCART="shoppingcart";

    JsonFileReader jsonFileReader=new JsonFileReader();


    public void buildEmailIdJson(ShoppingCartApplicantBuilder shoppingCartApplicantBuilder)
    {
        String addEmailJson=jsonFileReader.readFile("submitApplication",SHOPPINGCART);
        shoppingCartApplicantBuilder.getApplicant().setEmailAddress(CobaltTestUtils.getRandomEmailID());

        shoppingCartApplicantBuilder.setEmailIdJson(addEmailJson);
    }

    public void buildCreateAccountJson(ShoppingCartApplicantBuilder shoppingCartApplicantBuilder)
    {
        String addCreateAccountJson=jsonFileReader.readFile("submitApplication",SHOPPINGCART);

        if(ShopingCartApplicantType.POSITIVE_ACTOR ==shoppingCartApplicantBuilder.getApplicantType()) {

            addCreateAccountJson=addCreateAccountJson.replace("{{firstName}}",shoppingCartApplicantBuilder.getApplicant().getFirstName());
            addCreateAccountJson=addCreateAccountJson.replace("{{lastName}}",shoppingCartApplicantBuilder.getApplicant().getLastName());
            addCreateAccountJson=addCreateAccountJson.replace("{{primaryEmail}}",shoppingCartApplicantBuilder.getApplicant().getEmailAddress());
            addCreateAccountJson=addCreateAccountJson.replace("{{password}}",shoppingCartApplicantBuilder.getApplicant().getPassword());
        }

        shoppingCartApplicantBuilder.setCreateAnAccountJson(addCreateAccountJson);
    }

}
