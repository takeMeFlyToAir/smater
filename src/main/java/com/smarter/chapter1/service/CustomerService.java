package com.smarter.chapter1.service;

import com.smarter.chapter1.helper.DatabaseHelper;
import com.smarter.chapter1.model.Customer;
import com.smarter.chapter1.util.PropsUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Properties;

/**
 * Created by sjgtw-zzr on 2017/10/17.
 * customer 服务类
 */
public class CustomerService {

    private static final Logger logger= LoggerFactory.getLogger(CustomerService.class);

    /**
     * 获取客户列表
     * @param keyword
     * @return
     */
    public List<Customer> getCustomerList(String keyword){
        String sql = "select * from customer";
        return DatabaseHelper.queryEntityList(Customer.class,sql);
    }

    /**
     * 获取客户
     * @param id
     * @return
     */
    public Customer getCustomer(Long id){
        //TODO
        return null;
    }

    /**
     * 创建客户
     * @param fieldMap
     * @return
     */
    public boolean createCustomer(Map<String,Object> fieldMap){
        return DatabaseHelper.insertEntity(Customer.class,fieldMap);
    }

    /**
     * 更新用户
     * @param id
     * @param fieldMap
     * @return
     */
    public boolean updateCustomer(Long id,Map<String,Object> fieldMap){
       return DatabaseHelper.updateEntity(Customer.class,id,fieldMap);
    }

    /**
     * 删除客户
     * @param id
     * @return
     */
    public boolean deleteCustomer(Long id){
        return DatabaseHelper.deleteEntity(Customer.class,id);
    }

}
