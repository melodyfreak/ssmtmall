

package com.ykjb.tmall.service;

import com.ykjb.tmall.pojo.Product;
import com.ykjb.tmall.pojo.PropertyValue;

import java.util.List;

public interface PropertyValueService {
    void init(Product p);
    void update(PropertyValue pv);

    PropertyValue get(int ptid, int pid);
    List<PropertyValue> list(int pid);
}

