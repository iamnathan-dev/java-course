package com.nathancodes;

public class constants {
    public static void main(String[] arg) {
        final String USER_NAME = "Nathaniel Joseph";
        final int AGE = 21;
        final boolean IS_EMPLOYED = true;

        System.out.println( "Hi, my name is " + USER_NAME + ". I am " + AGE + " years old." );

        boolean hasHighIncome = true;
        boolean hasGoodCredit = true;
        boolean hasCriminalRecord = false;

        boolean isEligible = (hasHighIncome || hasGoodCredit) && !hasCriminalRecord;

        System.out.println(isEligible);


        if (IS_EMPLOYED) {
            System.out.println(USER_NAME + " is employed");
        } else  {
            System.out.println(USER_NAME + " is jobless");
        }

//        switch
        String status = isEligible ? "eligible" : "not eligible";;

        switch (status) {
            case "eligible":
                System.out.println(USER_NAME + " is eligible for the loan");
                break;
            case "not eligible":
                System.out.println(USER_NAME + " is not eligible for the loan");
                break;
            default:
                System.out.println(USER_NAME + " is still under verification process");
        }

        for (int i = 0; i < 5; i++) {
            System.out.println(AGE + i);
        }
    }
}
