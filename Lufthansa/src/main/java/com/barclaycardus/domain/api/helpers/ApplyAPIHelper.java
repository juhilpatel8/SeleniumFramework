package com.barclaycardus.domain.api.helpers;

import com.barclaycardus.domain.abstracts.AbstractsApplyApiHelper;
import com.barclaycardus.e2e.builders.LoanApplicantBuilder;
import org.springframework.stereotype.Component;

/**
 * Created by Juhil on 7/31/2016.
 */
@Component
public class ApplyAPIHelper extends AbstractsApplyApiHelper{

    @Override
    public void submitALoanApplication(LoanApplicantBuilder loanApplicantBuilder) throws Throwable {
        System.out.println("Apply API");
    }
}
