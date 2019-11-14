package service;

import model.Customer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CustomerServiceImpl implements CustomerService {
    private static Map<Integer, Customer> customerMap;
    static {
        customerMap = new HashMap<>();
        customerMap.put(1,new Customer(1,"Hoàng","hoang@gmail.com","La Tien village"));
        customerMap.put(2,new Customer(2,"Qúy","laohac@gmail.com","Vu Dai village"));
        customerMap.put(3,new Customer(3,"Đức","onggiao@gmail.com","Vinh Tuy bridge"));
        customerMap.put(4,new Customer(4,"Hậu","cauvang@gmail.com","Lao Hac homestays"));
        customerMap.put(5,new Customer(5,"Dư","sieunhan@gmail.com","JAV"));
        customerMap.put(6,new Customer(6,"B_Tùng","ngayto@gmail.com","KFC"));
        customerMap.put(7,new Customer(7,"N_Tùng","carot@gmail.com","Hoa Qua Son garden"));
        customerMap.put(8,new Customer(8,"Nam_HD","nam1900@gmail.com","1900 Club"));
        customerMap.put(9,new Customer(9,"Hiếu","hieuvoimaymu@gmail.com","Ngọn Cỏ Ven Đường"));
        customerMap.put(10,new Customer(10,"Bách","thongchotBRT@gmail.com","500k nhé em"));
        customerMap.put(11,new Customer(11,"Châu","mattrinhroi@gmail.com","Lớp Chọn C0919H1 hân hạnh tài trợ"));

    }

    @Override
    public List<Customer> findAll() {
        return new ArrayList<>(customerMap.values());
    }

    @Override
    public void save(Customer customer) {
        customerMap.put(customer.getId(),customer);
    }

    @Override
    public Customer findById(int id) {
        return customerMap.get(id);
    }

    @Override
    public void update(int id, Customer customer) {
        customerMap.put(id,customer);
    }

    @Override
    public void remove(int id) {
        customerMap.remove(id);
    }
}
