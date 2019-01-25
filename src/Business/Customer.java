/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

/**
 *
 * @author Ami Gandhi
 */
public class Customer {
    
    private String _customerName;
    private int contactNo;
    private String addr;
    private int customerId;
    private static int count = 0;

    public Customer() {
        
        count ++;
        customerId = count;
    }

    public String getCustomerName() {
        return _customerName;
    }

    public void setCustomerName(String _customerName) {
        this._customerName = _customerName;
    }

    public int getContactNo() {
        return contactNo;
    }

    public void setContactNo(int contactNo) {
        this.contactNo = contactNo;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    
    
}
