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
import struts2.test.beans.User;

/**
 *
 * @author rouna
 */
public class UserActionTest {
    
    public UserActionTest() {
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
     * Test of registerUser method, of class UserAction.
     */
    @Test
    public void testRegisterUser() throws Exception {
        System.out.println("registerUser");
        UserAction instance = new UserAction();
        String expResult = "";
        String result = instance.registerUser();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getUserDetails method, of class UserAction.
     */
    @Test
    public void testGetUserDetails() throws Exception {
        System.out.println("getUserDetails");
        UserAction instance = new UserAction();
        String expResult = "";
        String result = instance.getUserDetails();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of userUpdateAction method, of class UserAction.
     */
    @Test
    public void testUserUpdateAction() throws Exception {
        System.out.println("userUpdateAction");
        UserAction instance = new UserAction();
        String expResult = "";
        String result = instance.userUpdateAction();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteUserAction method, of class UserAction.
     */
    @Test
    public void testDeleteUserAction() {
        System.out.println("deleteUserAction");
        UserAction instance = new UserAction();
        String expResult = "";
        String result = instance.deleteUserAction();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getUserName method, of class UserAction.
     */
    @Test
    public void testGetUserName() {
        System.out.println("getUserName");
        UserAction instance = new UserAction();
        String expResult = "";
        String result = instance.getUserName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setUserName method, of class UserAction.
     */
    @Test
    public void testSetUserName() {
        System.out.println("setUserName");
        String userName = "";
        UserAction instance = new UserAction();
        instance.setUserName(userName);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPassword method, of class UserAction.
     */
    @Test
    public void testGetPassword() {
        System.out.println("getPassword");
        UserAction instance = new UserAction();
        String expResult = "";
        String result = instance.getPassword();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPassword method, of class UserAction.
     */
    @Test
    public void testSetPassword() {
        System.out.println("setPassword");
        String password = "";
        UserAction instance = new UserAction();
        instance.setPassword(password);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFirstName method, of class UserAction.
     */
    @Test
    public void testGetFirstName() {
        System.out.println("getFirstName");
        UserAction instance = new UserAction();
        String expResult = "";
        String result = instance.getFirstName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setFirstName method, of class UserAction.
     */
    @Test
    public void testSetFirstName() {
        System.out.println("setFirstName");
        String firstName = "";
        UserAction instance = new UserAction();
        instance.setFirstName(firstName);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLastName method, of class UserAction.
     */
    @Test
    public void testGetLastName() {
        System.out.println("getLastName");
        UserAction instance = new UserAction();
        String expResult = "";
        String result = instance.getLastName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setLastName method, of class UserAction.
     */
    @Test
    public void testSetLastName() {
        System.out.println("setLastName");
        String lastName = "";
        UserAction instance = new UserAction();
        instance.setLastName(lastName);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEmail method, of class UserAction.
     */
    @Test
    public void testGetEmail() {
        System.out.println("getEmail");
        UserAction instance = new UserAction();
        String expResult = "";
        String result = instance.getEmail();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEmail method, of class UserAction.
     */
    @Test
    public void testSetEmail() {
        System.out.println("setEmail");
        String email = "";
        UserAction instance = new UserAction();
        instance.setEmail(email);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPhoneNumber method, of class UserAction.
     */
    @Test
    public void testGetPhoneNumber() {
        System.out.println("getPhoneNumber");
        UserAction instance = new UserAction();
        String expResult = "";
        String result = instance.getPhoneNumber();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPhoneNumber method, of class UserAction.
     */
    @Test
    public void testSetPhoneNumber() {
        System.out.println("setPhoneNumber");
        String phoneNumber = "";
        UserAction instance = new UserAction();
        instance.setPhoneNumber(phoneNumber);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isValidUser method, of class UserAction.
     */
    @Test
    public void testIsValidUser() {
        System.out.println("isValidUser");
        UserAction instance = new UserAction();
        boolean expResult = false;
        boolean result = instance.isValidUser();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setValidUser method, of class UserAction.
     */
    @Test
    public void testSetValidUser() {
        System.out.println("setValidUser");
        boolean validUser = false;
        UserAction instance = new UserAction();
        instance.setValidUser(validUser);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isStatus method, of class UserAction.
     */
    @Test
    public void testIsStatus() {
        System.out.println("isStatus");
        UserAction instance = new UserAction();
        boolean expResult = false;
        boolean result = instance.isStatus();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setStatus method, of class UserAction.
     */
    @Test
    public void testSetStatus() {
        System.out.println("setStatus");
        boolean status = false;
        UserAction instance = new UserAction();
        instance.setStatus(status);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMsg method, of class UserAction.
     */
    @Test
    public void testGetMsg() {
        System.out.println("getMsg");
        UserAction instance = new UserAction();
        String expResult = "";
        String result = instance.getMsg();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setMsg method, of class UserAction.
     */
    @Test
    public void testSetMsg() {
        System.out.println("setMsg");
        String msg = "";
        UserAction instance = new UserAction();
        instance.setMsg(msg);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRow method, of class UserAction.
     */
    @Test
    public void testGetRow() {
        System.out.println("getRow");
        UserAction instance = new UserAction();
        int expResult = 0;
        int result = instance.getRow();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setRow method, of class UserAction.
     */
    @Test
    public void testSetRow() {
        System.out.println("setRow");
        int row = 0;
        UserAction instance = new UserAction();
        instance.setRow(row);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isNoData method, of class UserAction.
     */
    @Test
    public void testIsNoData() {
        System.out.println("isNoData");
        UserAction instance = new UserAction();
        boolean expResult = false;
        boolean result = instance.isNoData();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNoData method, of class UserAction.
     */
    @Test
    public void testSetNoData() {
        System.out.println("setNoData");
        boolean noData = false;
        UserAction instance = new UserAction();
        instance.setNoData(noData);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getUserList method, of class UserAction.
     */
    @Test
    public void testGetUserList() {
        System.out.println("getUserList");
        UserAction instance = new UserAction();
        List<User> expResult = null;
        List<User> result = instance.getUserList();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setUserList method, of class UserAction.
     */
    @Test
    public void testSetUserList() {
        System.out.println("setUserList");
        List<User> userList = null;
        UserAction instance = new UserAction();
        instance.setUserList(userList);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSubmitType method, of class UserAction.
     */
    @Test
    public void testGetSubmitType() {
        System.out.println("getSubmitType");
        UserAction instance = new UserAction();
        String expResult = "";
        String result = instance.getSubmitType();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setSubmitType method, of class UserAction.
     */
    @Test
    public void testSetSubmitType() {
        System.out.println("setSubmitType");
        String submitType = "";
        UserAction instance = new UserAction();
        instance.setSubmitType(submitType);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
