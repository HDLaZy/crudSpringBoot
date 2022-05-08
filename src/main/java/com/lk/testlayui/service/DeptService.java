package com.lk.testlayui.service;

import com.lk.testlayui.pojo.Dept;
import com.baomidou.mybatisplus.extension.service.IService;

/**
* @author lenovo
* @description 针对表【t_dept】的数据库操作Service
* @createDate 2022-05-08 19:36:28
*/
public interface DeptService extends IService<Dept> {

    Integer getDeptIdByName(String name);

}
