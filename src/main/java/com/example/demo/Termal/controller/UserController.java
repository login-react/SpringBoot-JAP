package com.example.demo.Termal.controller;

import com.example.demo.Termal.bean.Emp;
import com.example.demo.Termal.service.IEmpService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by zhoutaimin on 2019/5/24.
 */
@RestController
@RequestMapping("/api/user")
@Api(value = "用户接口", consumes = "application/json")

public class UserController {

    @Autowired
    private IEmpService iEmpService;

    @ApiOperation(value="获取用户列表", notes="获取用户列表")
    @RequestMapping("/query")
//    @ApiImplicitParams({@ApiImplicitParam(name = "ename",value = "请求名称",required = true,dataType = "String")})
    public List queryEmpAll(){
        List<Emp> list = iEmpService.queryEmpAll();
        for(Emp emp:list){
            System.out.println(emp.getEname());
        }
            return list;
    }

    @ApiOperation(value="根据某个名称查询", notes="根据某个名称查询")
//    @ApiImplicitParams({@ApiImplicitParam(name = "ename",value = "请求名称",dataType = "String")})
    @GetMapping("/findByename")
    public List findByename(@RequestParam  String ename){
       List<Emp> list = iEmpService.findByename(ename);
        return list;
    }

    @ApiOperation(value="新增", notes="新增用户")
    @RequestMapping("/addUser")
    public List<Emp> saveEmp(@RequestBody Emp emps){
        List<Emp> list = new ArrayList<Emp>();
        Emp emp = new Emp();
        emp.setEname(emps.getEname());
        emp.setSex(emps.getSex());
        emp.setHire(new Date());
        list.add(emp);
        for(Emp empSave :list){
            iEmpService.save(empSave);
        }
        return list;
    }
}
