package com.smarter.chapter1.test;

import com.smarter.chapter1.helper.DatabaseHelper;
import com.smarter.chapter1.model.Customer;
import com.smarter.chapter1.service.CustomerService;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by sjgtw-zzr on 2017/10/17.
 * CustomerService 单元测试
 */
public class CustomerServiceTest {
    private CustomerService customerService;

    public CustomerServiceTest(){
        customerService = new CustomerService();
    }

    @Before
    public void init()throws Exception{
        DatabaseHelper.executeSqlFile("sql/customer_init.sql");
    }

    @Test
    public void getCustomerListTest() throws Exception{
        List<Customer> customerList = customerService.getCustomerList("");
        for (Customer customer : customerList){
            System.out.println(customer);
        }
        Assert.assertEquals(2,customerList.size());
    }

    @Test
    public void getCustomerTest(){
        Long id = 1L;
        Customer customer = customerService.getCustomer(id);
        Assert.assertNotNull(customer);
    }

    @Test
    public void createCustomerTest() throws Exception{
        Map<String,Object> fieldMap = new HashMap<>();
        fieldMap.put("name","customer3");
        fieldMap.put("contact","zzr");
        fieldMap.put("telephone","18911942674");
        boolean result = customerService.createCustomer(fieldMap);
        Assert.assertTrue(result);
    }

    @Test
    public void updateCustomerTest() throws Exception{
        Long id = 1L;
        Map<String,Object> fieldMap = new HashMap<>();
        fieldMap.put("contact","Eric");
        boolean result = customerService.updateCustomer(id,fieldMap);
        Assert.assertTrue(result);
    }

    @Test
    public void deleteCustomerTest() throws Exception{
        Long id = 1L;
        boolean result = customerService.deleteCustomer(id);
        Assert.assertTrue(result);
    }

}
