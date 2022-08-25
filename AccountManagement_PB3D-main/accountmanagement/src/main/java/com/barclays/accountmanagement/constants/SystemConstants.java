package com.barclays.accountmanagement.constants;

public interface SystemConstants {
  public static final String GET_ACCOUNTS_BY_CUSTOMERID = "/accounts/customer/{Customer_Id}";
  public static final String CREATE_ONLINE_ACCOUNT = "api/manager/create-customer";
  public static final String CREATE_SAVING_ACCOUNT = "api/manager/create-account";
  public static final String VERIFY_PANCARD = "api/manager/verify-pancard";
  public static final String VERIFY_USER_CREDENTIAL= "api/user/user-login";
  public static final String UPDATE_USER_CREDENTIALS = "api/user/update-user-credentials";
}
