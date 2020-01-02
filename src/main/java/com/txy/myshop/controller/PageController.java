package com.txy.myshop.controller;
/**
 * Project Name: myshop.
 * Package Name: com.txy.myshop.controller.
 * File Name: PageController
 * Copyright (c) 2020, 南京天芯云数据服务有限公司.
 */

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *
 * Class Name: PageController
 * FQDN：com.txy.myshop.controller.PageController
 * Author: 阿辉
 * Date: 2020/1/2 16:52
 * Description:
 *
 */
@Controller
public class PageController {

    @GetMapping("/login")
    public String getLogin(){
        return "login.html";
    }
}
