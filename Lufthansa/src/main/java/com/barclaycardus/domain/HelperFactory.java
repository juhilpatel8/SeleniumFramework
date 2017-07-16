package com.barclaycardus.domain;

import com.barclaycardus.domain.interfaces.Apply;
import com.barclaycardus.domain.interfaces.ShoppingCart;
import com.barclaycardus.domain.ui.helpers.ApplyUIHelper;
import com.barclaycardus.e2e.utils.CucumberUtils;
import com.barclaycardus.e2e.utils.JourneyEnum;
import org.junit.Assert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * Created by Juhil on 3/27/2016.
 */
@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class HelperFactory {

    @Autowired
    @Qualifier(value = "applyAPIHelper")
    Apply applyAPIHelper;

    @Autowired
    @Qualifier(value = "applyUIHelper")
    Apply applyUIHelper;


    @Autowired
    @Qualifier(value = "shoppingCartAPIHelper")
    ShoppingCart shoppingCartAPIHelper;

    @Autowired
    @Qualifier(value = "shoppingCartUIHelper")
    ShoppingCart shoppingCartUIHelper;

    private HelperFactory()
    {

    }

    public Apply getApplyHelper()
    {
        System.out.println("Journey:"+CucumberUtils.getJourneyType());
        if(JourneyEnum.API.name().equalsIgnoreCase(CucumberUtils.getJourneyType()))
        {
            return applyAPIHelper;
        }
        else if(JourneyEnum.USER.name().equalsIgnoreCase(CucumberUtils.getJourneyType()))
        {
            return applyUIHelper;
          //  return new ApplyUIHelper();
        }
        else
        {
            Assert.fail("Invalid JourneyType");
            return null;
        }
    }
    public ShoppingCart getShoppingCartHelper()
    {
        System.out.println("Journey:"+CucumberUtils.getJourneyType());
        if(JourneyEnum.API.name().equalsIgnoreCase(CucumberUtils.getJourneyType()))
        {
            return shoppingCartUIHelper;
        }
        else if(JourneyEnum.USER.name().equalsIgnoreCase(CucumberUtils.getJourneyType()))
        {
            return shoppingCartUIHelper;
            //  return new ApplyUIHelper();
        }
        else
        {
            Assert.fail("Invalid JourneyType");
            return null;
        }
    }




}
