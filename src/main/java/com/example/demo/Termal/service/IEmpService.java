package com.example.demo.Termal.service;

import com.example.demo.Termal.bean.Emp;

import java.util.List;

/**
 * Created by zhoutaimin on 2019/5/24.
 */
public interface IEmpService {
    /**
     * 查询所有
     * @return
     */
    List queryEmpAll();

    Emp save(Emp emp);

    List<Emp> findByename(String ename);

}
