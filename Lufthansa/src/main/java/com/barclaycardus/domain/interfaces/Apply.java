package com.barclaycardus.domain.interfaces;

import com.barclaycardus.e2e.builders.LoanApplicantBuilder;

/**
 * Created by Juhil on 3/20/2016.
 */
public interface Apply {
     void submitALoanApplication(LoanApplicantBuilder loanApplicantBuilder) throws Throwable;
}
