package com.lk.testlayui.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * ClassName:LayUiDemo
 * Package:com.lk.testlayui.controller.pageController
 * Description:
 *  页面跳转
 * @date:2022/5/8 10:38
 * @author:LiaoKe
 */
@Controller
public class pageController {

    @GetMapping("/dept")
    public String dept(){
        return "page/dept";
    }


    @GetMapping("/addEmpPage")
    public String add(){
        return "/page/insertEmp";
    }

}
