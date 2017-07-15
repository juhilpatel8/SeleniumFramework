package com.barclaycardus.e2e.builders;

/**
 * Created by Juhil on 3/27/2016.
 */
public enum LoanApplicantType {
    AUTOAPPROVE_ACTOR("AUTOAPPROVE_ACTOR"),
    VERID_ACTOR("VERID_ACTOR"),
    AUTODECLINE_ACTOR("AUTODECLINE_ACTOR"),
    AGENTCONVERSATION_ACTOR("AGENTCONVERSATION_ACTOR"),
    NEG_FILE_ACTOR("NEG_FILE_ACTOR"),
    POWER_CURVE_ACTOR("POWER_CURVE_ACTOR");

    private final String value;
    LoanApplicantType(String v) {
        value=v;
    }
    public static LoanApplicantType fromValue(String v)
    {
        for(LoanApplicantType c:LoanApplicantType.values())
        {
            if(c.value.equals(v))
            {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }
    public  String value()
    {
        return value;
    }
}
