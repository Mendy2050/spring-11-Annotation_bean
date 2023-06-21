package com.itheima.service.impl;

import com.itheima.service.BookService;
import org.springframework.stereotype.Component;

/**
 * @author Mendy
 * @create 2023-06-21 15:37
 */

@Component()
public class BookServiceImpl implements BookService {
    public void save() {
        System.out.println("book service save ...");
    }
}

