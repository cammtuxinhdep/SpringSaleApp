/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.vmct.formatters;

import com.vmct.pojo.Category;
import java.text.ParseException;
import java.util.Locale;
import org.springframework.context.annotation.Bean;
import org.springframework.format.Formatter;

/**
 *
 * @author HP
 */
public class CategoryFormatter implements Formatter<Category> {

    // Phương thức đổ dữ liệu từ server về
    @Override
    public String print(Category c, Locale locale) {
        return String.valueOf(c.getId());
    }

    // Đóng gói thành đối tượng
    @Override
    public Category parse(String cateId, Locale locale) throws ParseException {
        Category c = new Category(Integer.parseInt(cateId));
        return c;
    }
}
