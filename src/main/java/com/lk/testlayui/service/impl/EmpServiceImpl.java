package com.lk.testlayui.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lk.testlayui.pojo.Emp;
import com.lk.testlayui.service.EmpService;
import com.lk.testlayui.mapper.EmpMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
* @author lenovo
* @description 针对表【t_emp】的数据库操作Service实现
* @createDate 2022-05-08 19:37:17
*/
@Service
public class EmpServiceImpl extends ServiceImpl<EmpMapper, Emp>
    implements EmpService{

    @Autowired
    EmpMapper empMapper;

    @Override
    public List<Emp> queryDept(Integer deptId) {
        QueryWrapper queryWrapper=new QueryWrapper();
        queryWrapper.eq("emp_dept", deptId);
        List list = empMapper.selectList(queryWrapper);
        return list;
    }
}




