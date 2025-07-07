package com.vmct.repositories.impl;

///*
// * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
// * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
// */
//package com.vmct.respository.impl;
//
//import com.vmct.hibernatedemo.HibernateUtils;
//import com.vmct.pojo.Cart;
//import com.vmct.pojo.OrderDetail;
//import com.vmct.pojo.SaleOrder;
//import java.util.Date;
//import java.util.List;
//import org.hibernate.Session;
//
///**
// *
// * @author HP
// */
//public class ReceiptRepositoryImpl {
//
//    public void addReceipt(List<Cart> carts) {
//        if (carts != null) {
//            try (Session s = HibernateUtils.getFACTORY().openSession()) {
//                SaleOrder order = new SaleOrder();
//                order.setUserId(new UserRepositoryImpl().getUserByUsername("dhthanh"));
//                order.setCreatedDate(new Date());
//                s.persist(order);
//                
//                for (var x:carts) {
//                    OrderDetail d = new OrderDetail();
//                    d.setQuantity(x.getQuantity());
//                    d.setUnitPrice(x.getPrice());
//                    d.setProductId(new ProductRespositoryImpl().getProductById(x.getId()));
//                    d.setOrderId(order);
//                    
//                    s.persist(d);
//                }
//            }
//        }
//    }
//}
