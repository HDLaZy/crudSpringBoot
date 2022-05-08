package com.lk.testlayui.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lk.testlayui.pojo.Dept;
import com.lk.testlayui.service.DeptService;
import com.lk.testlayui.mapper.DeptMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
* @author lenovo
* @description 针对表【t_dept】的数据库操作Service实现
* @createDate 2022-05-08 19:36:28
*/
@Service
public class DeptServiceImpl extends ServiceImpl<DeptMapper, Dept>
    implements DeptService{

    @Autowired
    private DeptMapper deptMapper;

    @Override
    public Integer getDeptIdByName(String name) {
        QueryWrapper queryWrapper=new QueryWrapper();
        queryWrapper.select("dept_id").eq("dept_name", name);
        Dept dept = deptMapper.selectOne(queryWrapper);
        return dept.getDeptId();
    }
}




