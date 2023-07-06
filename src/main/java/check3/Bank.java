package check3;

import java.util.ArrayList;
import java.util.List;

public class Bank {
    private List<String> customers;
    Bank(){
        this.customers = new ArrayList<>();
    }

    public void addCustomer(String customer){
        this.customers.add(customer);
    }

    public List printCustomers() {
        return this.customers;
    }
}
