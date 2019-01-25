/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.ArrayList;

/**
 *
 * @author Ami Gandhi
 */
public class CustomerDirectory {
    
    private ArrayList<Customer> customerDirectory;

    public ArrayList<Customer> getCustomerDirectory() {
        return customerDirectory;
    }

    public void setCustomerDirectory(ArrayList<Customer> customerDirectory) {
        this.customerDirectory = customerDirectory;
    }
    
     public CustomerDirectory(){
        customerDirectory = new ArrayList<Customer>();
    }
     
      public Customer addCustomer(){
        
        Customer cs = new Customer();
        customerDirectory.add(cs);
        return cs;
                
    }
    
}
