package com.lk.testlayui.mapper;

import com.lk.testlayui.pojo.Emp;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
* @author lenovo
* @description 针对表【t_emp】的数据库操作Mapper
* @createDate 2022-05-08 19:37:17
* @Entity com.lk.testlayui.pojo.Emp
*/
@Mapper
public interface EmpMapper extends BaseMapper<Emp> {



}




