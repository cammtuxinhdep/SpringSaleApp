/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.vmct.respository.impl;

import com.vmct.hibernatedemo.HibernateUtils;
import com.vmct.pojo.Category;
import jakarta.persistence.Query;
import java.util.List;
import org.hibernate.Session;

/**
 *
 * @author admin
 */
public class CategoryRespositoryImpl {
    public List<Category> getCates() {
        try(Session s = HibernateUtils.getFACTORY().openSession()) {
            Query q = s.createQuery("FROM Category", Category.class); // ten lop khong phai ten bang
            return q.getResultList();
        }
    }
}
