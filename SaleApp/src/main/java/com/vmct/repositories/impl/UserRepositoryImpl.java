package com.vmct.repositories.impl;

///*
// * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
// * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
// */
//package com.vmct.respository.impl;
//
//import com.vmct.hibernatedemo.HibernateUtils;
//import com.vmct.pojo.User;
//import jakarta.persistence.Query;
//import org.hibernate.Session;
//
///**
// *
// * @author HP
// */
//public class UserRepositoryImpl {
//    public User getUserByUsername(String username) {
//        try (Session s = HibernateUtils.getFACTORY().openSession()) {
//            Query q = s.createQuery("User.findByUsername", User.class);
//            q.setParameter("username", username);
//            
//            return (User) q.getSingleResult();
//        }
//    }
//}
