package com.barclaycardus.domain.ui.helpers;

import com.barclaycardus.domain.interfaces.Apply;
import com.barclaycardus.e2e.builders.LoanApplicant;
import com.barclaycardus.e2e.builders.LoanApplicantBuilder;
import com.barclaycardus.e2e.ui.pages.LoanCalculatorPage;
import com.barclaycardus.e2e.ui.pages.LoanEstimationPage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * Created by Juhil on 7/30/2016.
 */

@Component
public class ApplyUIHelper implements Apply {

  //  @Autowired
  //  LooanApplicantViewHelper loanApplicationViewHelper;

    @Override
    public void submitALoanApplication(LoanApplicantBuilder loanApplicantBuilder) throws Throwable {
        LoanApplicant loanApplicant=loanApplicantBuilder.buildLoanApplicant();
        //String ssn=loanApplicationViewHelper.getSSN();
        loanApplicant.setSsn("325001238");
        LoanEstimationPage loanEstimationPage=new LoanEstimationPage().init();
        LoanCalculatorPage loanCalculatorPage=loanEstimationPage.startwithConsumerLoans(loanApplicant.getMoneyNeeded());
        loanCalculatorPage.init();
    }
}
