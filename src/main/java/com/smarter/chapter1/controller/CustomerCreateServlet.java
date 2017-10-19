package com.smarter.chapter1.controller;

import com.smarter.chapter1.model.Customer;
import com.smarter.chapter1.service.CustomerService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * Created by sjgtw-zzr on 2017/10/17.
 */
@WebServlet("/customer_create")
public class CustomerCreateServlet extends HttpServlet {

    private CustomerService customerService;
    @Override
    public void init() throws ServletException {
        customerService = new CustomerService();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Customer> customerList = customerService.getCustomerList("");
        req.setAttribute("customerList",customerList);
        req.getRequestDispatcher("/WEB-INF/jsp/customer/customer.jsp").forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //TODO
    }
}
