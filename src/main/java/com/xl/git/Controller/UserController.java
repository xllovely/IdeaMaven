package com.xl.git.Controller;

import com.xl.git.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * fileName:UserController
 * description:
 * author:zz
 * createTime:2019/3/2 16:44
 */
@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    /**
     * user list
     * @return
     */
    @ResponseBody
    @RequestMapping("/list")
    public Object list(){
        System.out.print(11111);
        System.out.print(22222);
        System.out.print(3333);
        System.out.print(44444);
        return userService.getUserList();
    }
}
