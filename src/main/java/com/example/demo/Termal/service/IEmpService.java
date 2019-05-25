package com.example.demo.Termal.service;

import com.example.demo.Termal.bean.Emp;

import java.util.List;

/**
 * Created by zhoutaimin on 2019/5/24.
 */
public interface IEmpService {
    List queryEmpAll();

    Emp save(Emp emp);

    List<Emp> findByename(String ename);

}
