/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.vmct.hibernatedemo;

import com.vmct.repository.impl.CategoryRepositoryImpl;
import com.vmct.repository.impl.ProductRepositoryImpl;
import com.vmct.repository.impl.StatsRepositoryImpl;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author admin
 */
public class HibernateDemo {

    public static void main(String[] args) {
//        CategoryRespositoryImpl s = new CategoryRespositoryImpl();
//        s.getCates().forEach(c -> System.out.println(c.getName()));
//        Map<String, String> params = new HashMap<>();
//        params.put("page","1");
//
//        ProductRespositoryImpl s = new ProductRespositoryImpl();
//        s.getProducts(params).forEach(p -> System.out.printf("%d - %s - %.1f\n", p.getId(), p.getName(), p.getPrice()));
        StatsRepositoryImpl s = new StatsRepositoryImpl();
        s.statsRevenueByProduct().forEach(o -> System.out.printf("%d - %s: %d\n", o[0], o[1], o[2]));
        s.statsRevenueByTime("QUARTER", 2020).forEach(o -> System.out.printf("%d : %d\n", o[0], o[1]));
    }
}
