package com.barclaycardus.e2e.builders;

/**
 * Created by Juhil on 3/27/2016.
 */
public enum ShopingCartApplicantType {
    POSITIVE_ACTOR("POSITIVE_ACTOR"),
    NEGATIVE_ACTOR("NEGATIVE_ACTOR");

    private final String value;
    ShopingCartApplicantType(String v) {
        value=v;
    }
    public static ShopingCartApplicantType fromValue(String v)
    {
        for(ShopingCartApplicantType c: ShopingCartApplicantType.values())
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
