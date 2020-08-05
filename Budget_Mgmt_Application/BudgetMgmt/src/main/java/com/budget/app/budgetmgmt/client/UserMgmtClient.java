package com.budget.app.budgetmgmt.client;

import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(name = "budget-usermgmt",decode404 = true)
public interface UserMgmtClient {

}
