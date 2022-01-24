/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package struts2.test.actions;

import com.opensymphony.xwork2.ActionSupport;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import struts2.test.beans.User;
import struts2.test.core.ConnectionManager;
import struts2.test.dao.Admin;

/**
 *
 * @author rounak
 */
public class UserAction extends ActionSupport{

    private String userName;
    private String password;
    private String firstName;
    private String lastName;
    private String email;
    private String phoneNumber;
    private boolean validUser;
    private boolean status;

    private List<User> userList = null;

    private static final long serialVersionUID = 6329394260276112660L;
    ResultSet rs = null;
    PreparedStatement ps = null;

    private boolean noData = false;

    private String msg = "";
    private int row = 0;
    private String submitType;

    Connection con = null;

    public String registerUser() throws Exception {
        try {
            con = ConnectionManager.getConnection();
            String sql = "INSERT INTO users VALUES (?,?,?,?,?,?,?)";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, userName);
            ps.setString(2, password);
            ps.setString(3, firstName);
            ps.setString(4, lastName);
            ps.setString(5, email);
            ps.setString(6, phoneNumber);
            ps.setInt(7, 1);
            System.out.println("SQL for insert=" + ps);
            setRow(ps.executeUpdate());
            if (getRow() > 0) {
                setMsg("Registration Successfull");
            } else {
                setMsg("Some error");
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (con != null) {
                con.close();
            }
        }
        return "REGISTER";
    }

    public String getUserDetails() throws Exception {
        List<User> userListobj = new ArrayList<>();
        try {
            String sql = "SELECT userName, password, firstName, lastName, email, phoneNumber FROM users;";
            con = ConnectionManager.getConnection();
            System.out.println("Connection is " + con);
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                User user = new User();

                user.setUserName(rs.getString("userName"));
                user.setPassword(rs.getString("password"));
                user.setFirstName(rs.getString("firstName"));
                user.setLastName(rs.getString("lastName"));
                user.setEmail(rs.getString("email"));
                user.setPhoneNumber(rs.getString("phoneNumber"));

                userListobj.add(user);
            }
            setUserList(new ArrayList<>());
            setUserList(userListobj);
            if (!userList.isEmpty()) {
                setNoData(false);
                System.out.println("Users retrieve = " + getUserList().size());
                System.out.println("setting nodata=false");
            } else {
                setNoData(true);
            }

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        } finally {
            if (con != null) {
                con.close();
            }
        }
        return "REPORT";

    }

    public String userUpdateAction() throws Exception {
         Admin dao = new Admin();

        try {
            if (getSubmitType().equals("updatedata")) {
                User user = dao.fetchUserDetails(userName.trim());
                if (user != null) {
                    userName = user.getUserName();
                    password = user.getPassword();
                    firstName = user.getFirstName();
                    lastName = user.getLastName();
                    email = user.getEmail();
                    phoneNumber = user.getPhoneNumber();
                }
            } else {
                int i = dao.updateUserDetails(userName, password, firstName, lastName,
                        email, phoneNumber);
                if (i > 0) {
                    msg = "Record Updated Successfuly";
                } else {
                    msg = "error";
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return "UPDATE";
    }

    

    
    
    public String deleteUserAction() {

    Admin dao = new Admin();
        try {
            int isDeleted = dao.deleteUserDetails(userName);
            if (isDeleted > 0) {
                msg = "Record deleted successfully";
            } else {
                msg = "Some error";
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "DELETE";
    }

    /**
     * @return the userName
     */
    public String getUserName() {
        return userName;
    }

    /**
     * @param userName the userName to set
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * @return the firstName
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * @param firstName the firstName to set
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * @return the lastName
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * @param lastName the lastName to set
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the phoneNumber
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * @param phoneNumber the phoneNumber to set
     */
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    /**
     * @return the validUser
     */
    public boolean isValidUser() {
        return validUser;
    }

    /**
     * @param validUser the validUser to set
     */
    public void setValidUser(boolean validUser) {
        this.validUser = validUser;
    }

    /**
     * @return the status
     */
    public boolean isStatus() {
        return status;
    }

    /**
     * @param status the status to set
     */
    public void setStatus(boolean status) {
        this.status = status;
    }

    /**
     * @return the msg
     */
    public String getMsg() {
        return msg;
    }

    /**
     * @param msg the msg to set
     */
    public void setMsg(String msg) {
        this.msg = msg;
    }

    /**
     * @return the row
     */
    public int getRow() {
        return row;
    }

    /**
     * @param row the row to set
     */
    public void setRow(int row) {
        this.row = row;
    }

    /**
     * @return the noData
     */
    public boolean isNoData() {
        return noData;
    }

    /**
     * @param noData the noData to set
     */
    public void setNoData(boolean noData) {
        this.noData = noData;
    }

    /**
     * @return the userList
     */
    public List<User> getUserList() {
        return userList;
    }

    /**
     * @param userList the userList to set
     */
    public void setUserList(List<User> userList) {
        this.userList = userList;
    }

    /**
     * @return the submitType
     */
    public String getSubmitType() {
        return submitType;
    }

    /**
     * @param submitType the submitType to set
     */
    public void setSubmitType(String submitType) {
        this.submitType = submitType;
    }
}
