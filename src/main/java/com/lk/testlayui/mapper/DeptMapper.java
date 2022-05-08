package com.lk.testlayui.mapper;

import com.lk.testlayui.pojo.Dept;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.lk.testlayui.pojo.Emp;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

/**
* @author lenovo
* @description 针对表【t_dept】的数据库操作Mapper
* @createDate 2022-05-08 19:36:28
* @Entity com.lk.testlayui.pojo.Dept
*/
@Mapper
public interface DeptMapper extends BaseMapper<Dept> {

}




