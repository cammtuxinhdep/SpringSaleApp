package com.vmct.repositories.impl;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import com.vmct.pojo.Cart;
import com.vmct.pojo.OrderDetail;
import com.vmct.pojo.SaleOrder;
import com.vmct.repositories.ProductRepository;
import com.vmct.repositories.ReceiptRepository;
import com.vmct.repositories.UserRepository;
import java.util.Date;
import java.util.List;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author HP
 */
@Repository
@Transactional
public class ReceiptRepositoryImpl implements ReceiptRepository {

    @Autowired
    private LocalSessionFactoryBean factory;

    @Autowired
    private UserRepository userRepo;
    
    @Autowired
    private ProductRepository productRepo;
    
    @Override
    public void addReceipt(List<Cart> carts) {
        if (carts != null) {
            Session s = this.factory.getObject().getCurrentSession();
            SaleOrder order = new SaleOrder();
            order.setUserId(this.userRepo.getUserByUsername("dhthanh"));
            order.setCreatedDate(new Date());
            s.persist(order);

            for (var x : carts) {
                OrderDetail d = new OrderDetail();
                d.setQuantity(x.getQuantity());
                d.setUnitPrice(x.getPrice());
                d.setProductId(this.productRepo.getProductById(x.getId()));
                d.setOrderId(order);

                s.persist(d);
            }
        }
    }
}
