package com.smart.chapter.controller;

import com.smart.chapter.model.Customer;
import com.smart.chapter.service.CustomerService;
import com.smart.framework.annotation.Action;
import com.smart.framework.annotation.Controller;
import com.smart.framework.annotation.Inject;
import com.smart.framework.bean.Param;
import com.smart.framework.bean.View;

import java.util.List;

/**
 * handle request from client
 * @author TommyYear
 * @date 2018/11/3
 * @time 1:38 PM
 */
@Controller
public class CustomerController {
    @Inject
    private CustomerService customerService;

    /**
     * 进入 客户列表 界面
     */
    @Action("get:/customer")
    public View index(Param param) {
        List<Customer> customerList = customerService.getCustomerList();
        return new View("customer.jsp").addModel("customerList", customerList);
    }


}
