/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package struts2.test.actions;

import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import struts2.test.beans.Product;

/**
 *
 * @author rouna
 */
public class ProductActionTest {
    
    public ProductActionTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of productRegisterAction method, of class ProductAction.
     */
    @Test
    public void testProductRegisterAction() throws Exception {
        System.out.println("productRegisterAction");
        ProductAction instance = new ProductAction();
        String expResult = "";
        String result = instance.productRegisterAction();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of productReportAction method, of class ProductAction.
     */
    @Test
    public void testProductReportAction() {
        System.out.println("productReportAction");
        ProductAction instance = new ProductAction();
        String expResult = "";
        String result = instance.productReportAction();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of productUpdateAction method, of class ProductAction.
     */
    @Test
    public void testProductUpdateAction() {
        System.out.println("productUpdateAction");
        ProductAction instance = new ProductAction();
        String expResult = "";
        String result = instance.productUpdateAction();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of productDeleteAction method, of class ProductAction.
     */
    @Test
    public void testProductDeleteAction() {
        System.out.println("productDeleteAction");
        ProductAction instance = new ProductAction();
        String expResult = "";
        String result = instance.productDeleteAction();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getProductList method, of class ProductAction.
     */
    @Test
    public void testGetProductList() {
        System.out.println("getProductList");
        ProductAction instance = new ProductAction();
        List<Product> expResult = null;
        List<Product> result = instance.getProductList();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setProductList method, of class ProductAction.
     */
    @Test
    public void testSetProductList() {
        System.out.println("setProductList");
        List<Product> productList = null;
        ProductAction instance = new ProductAction();
        instance.setProductList(productList);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isNoData method, of class ProductAction.
     */
    @Test
    public void testIsNoData() {
        System.out.println("isNoData");
        ProductAction instance = new ProductAction();
        boolean expResult = false;
        boolean result = instance.isNoData();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNoData method, of class ProductAction.
     */
    @Test
    public void testSetNoData() {
        System.out.println("setNoData");
        boolean noData = false;
        ProductAction instance = new ProductAction();
        instance.setNoData(noData);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getProductId method, of class ProductAction.
     */
    @Test
    public void testGetProductId() {
        System.out.println("getProductId");
        ProductAction instance = new ProductAction();
        int expResult = 0;
        int result = instance.getProductId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setProductId method, of class ProductAction.
     */
    @Test
    public void testSetProductId() {
        System.out.println("setProductId");
        int productId = 0;
        ProductAction instance = new ProductAction();
        instance.setProductId(productId);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getProductName method, of class ProductAction.
     */
    @Test
    public void testGetProductName() {
        System.out.println("getProductName");
        ProductAction instance = new ProductAction();
        String expResult = "";
        String result = instance.getProductName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getProductMake method, of class ProductAction.
     */
    @Test
    public void testGetProductMake() {
        System.out.println("getProductMake");
        ProductAction instance = new ProductAction();
        String expResult = "";
        String result = instance.getProductMake();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setProductMake method, of class ProductAction.
     */
    @Test
    public void testSetProductMake() {
        System.out.println("setProductMake");
        String productMake = "";
        ProductAction instance = new ProductAction();
        instance.setProductMake(productMake);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPrice method, of class ProductAction.
     */
    @Test
    public void testGetPrice() {
        System.out.println("getPrice");
        ProductAction instance = new ProductAction();
        double expResult = 0.0;
        double result = instance.getPrice();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPrice method, of class ProductAction.
     */
    @Test
    public void testSetPrice() {
        System.out.println("setPrice");
        double price = 0.0;
        ProductAction instance = new ProductAction();
        instance.setPrice(price);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAvailability method, of class ProductAction.
     */
    @Test
    public void testGetAvailability() {
        System.out.println("getAvailability");
        ProductAction instance = new ProductAction();
        int expResult = 0;
        int result = instance.getAvailability();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setAvailability method, of class ProductAction.
     */
    @Test
    public void testSetAvailability() {
        System.out.println("setAvailability");
        int availability = 0;
        ProductAction instance = new ProductAction();
        instance.setAvailability(availability);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMsg method, of class ProductAction.
     */
    @Test
    public void testGetMsg() {
        System.out.println("getMsg");
        ProductAction instance = new ProductAction();
        String expResult = "";
        String result = instance.getMsg();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setMsg method, of class ProductAction.
     */
    @Test
    public void testSetMsg() {
        System.out.println("setMsg");
        String msg = "";
        ProductAction instance = new ProductAction();
        instance.setMsg(msg);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSubmitType method, of class ProductAction.
     */
    @Test
    public void testGetSubmitType() {
        System.out.println("getSubmitType");
        ProductAction instance = new ProductAction();
        String expResult = "";
        String result = instance.getSubmitType();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setSubmitType method, of class ProductAction.
     */
    @Test
    public void testSetSubmitType() {
        System.out.println("setSubmitType");
        String submitType = "";
        ProductAction instance = new ProductAction();
        instance.setSubmitType(submitType);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setProductName method, of class ProductAction.
     */
    @Test
    public void testSetProductName() {
        System.out.println("setProductName");
        String productName = "";
        ProductAction instance = new ProductAction();
        instance.setProductName(productName);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCtr method, of class ProductAction.
     */
    @Test
    public void testGetCtr() {
        System.out.println("getCtr");
        ProductAction instance = new ProductAction();
        int expResult = 0;
        int result = instance.getCtr();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCtr method, of class ProductAction.
     */
    @Test
    public void testSetCtr() {
        System.out.println("setCtr");
        int ctr = 0;
        ProductAction instance = new ProductAction();
        instance.setCtr(ctr);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
