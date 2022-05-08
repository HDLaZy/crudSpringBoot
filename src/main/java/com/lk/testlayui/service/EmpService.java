package com.lk.testlayui.service;

import com.lk.testlayui.pojo.Emp;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
* @author lenovo
* @description 针对表【t_emp】的数据库操作Service
* @createDate 2022-05-08 19:37:17
*/
public interface EmpService extends IService<Emp> {


    List<Emp> queryDept(Integer deptId);

}
