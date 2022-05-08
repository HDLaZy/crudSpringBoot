package com.lk.testlayui.controller;

import com.lk.testlayui.pojo.Dept;
import com.lk.testlayui.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


import java.util.List;

/**
 * ClassName:DeptController
 * Package:com.lk.testlayui.controller
 * Description:
 *  部门操作
 * @date:2022/5/8 19:41
 * @author:LiaoKe
 */
@Controller
public class DeptController {
    @Autowired
    private DeptService deptServiceImpl;


    /**
     * 显示所有的部门
     * @param model
     * @return
     */
    @GetMapping("/")
    public String getAllDept(Model model) {

        List<Dept> list = deptServiceImpl.list();

        model.addAttribute("depts",list);

        return "/page/dept";
    }

    /**
     * 删除部门
     * @param deptId
     * @return
     */
    @GetMapping("/delDept/{deptId}")
    public String delDeptById(@PathVariable("deptId") Integer deptId){

        boolean b = deptServiceImpl.removeById(deptId);

        return "redirect:/";
    }


}
