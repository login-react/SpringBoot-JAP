package com.example.demo.Termal.Impl;

import com.example.demo.Termal.bean.Emp;
import com.example.demo.Termal.dao.IEmpDao;
import com.example.demo.Termal.service.IEmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by zhoutaimin on 2019/5/24.
 */

@Service
public class EmpServiceImpl implements IEmpService {

    @Autowired
    private IEmpDao iEmpDao;

    @Override
    public List queryEmpAll() {
        return iEmpDao.findAll();
    }

    @Override
    public Emp save(Emp emp) {
        return iEmpDao.save(emp);
    }

    @Override
    public List<Emp> findByename(String ename) {
        return iEmpDao.findByename(ename);
    }
}
