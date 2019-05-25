package com.example.demo.Termal.dao;

import com.example.demo.Termal.bean.Emp;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by zhoutaimin on 2019/5/24.
 */
public interface IEmpDao extends JpaRepository<Emp,Integer> {

    Emp save(Emp emp);
    List<Emp> findByename(String ename);

}
