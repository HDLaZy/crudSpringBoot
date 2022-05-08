package com.lk.testlayui.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.conditions.query.QueryChainWrapper;
import com.lk.testlayui.pojo.Dept;
import com.lk.testlayui.pojo.Emp;
import com.lk.testlayui.service.DeptService;
import com.lk.testlayui.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * ClassName:EmpController
 * Package:com.lk.testlayui.controller
 * Description:
 *
 * @date:2022/5/8 20:55
 * @author:LiaoKe
 */
@Controller
public class EmpController {

    @Autowired
    private EmpService empServiceImpl;

    @Autowired
    private DeptService deptServiceImpl;



    /**
     * 显示部门员工
     * @param model
     * @return
     */
    @GetMapping("/emps/{deptId}")
    public String getEmpByDept(Model model, @PathVariable("deptId") Integer deptId){

        List<Emp> emps = empServiceImpl.queryDept(deptId);

        model.addAttribute("emps", emps);

        return "/page/emp";
    }

    @GetMapping("/delEmp/{empId}/{deptId}")
    public String delEmpById(@PathVariable("empId")Integer empId,@PathVariable("deptId") Integer deptId){

        empServiceImpl.removeById(empId);

        return "redirect:/emps/"+deptId;
    }


    @PostMapping("/saveEmp")
    public String saveEmp(@RequestParam("name") String name,
                          @RequestParam("salary") BigDecimal salary,
                          @RequestParam("city") String city,
                          @RequestParam("dept") String dept
                          ){
        Emp emp=new Emp();
        emp.setEmpName(name);
        emp.setEmpSalary(salary);
        emp.setEmpSpace(city);
        Integer deptIdByName = deptServiceImpl.getDeptIdByName(dept);
        emp.setEmpDept(deptIdByName);

        empServiceImpl.save(emp);
        return "redirect:/emps/"+deptIdByName;
    }


    @GetMapping("/upPage/{empId}")
    public String up(@PathVariable("empId") Integer empId,Model model){
        Emp emp = empServiceImpl.getById(empId);
        Dept dept = deptServiceImpl.getById(emp.getEmpDept());
        model.addAttribute("dept", dept.getDeptName());
        model.addAttribute("emp", emp);
        return "/page/insertEmp";
    }

}
