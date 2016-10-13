package org.jedis.web.controller;

import org.jedis.entity.User;
import org.jedis.web.controller.base.BaseController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * Created by Nastuki on 2016/10/9.
 */
@Controller
@RequestMapping("/user")
public class UserController extends BaseController {

    private final static Logger logger = LoggerFactory.getLogger(UserController.class);

    @RequestMapping("/load")
    public String load(Model model){

        List<User> user = this.getUserService().getUserAlll();

        model.addAttribute("user",user);
        return "user/userPage";
    }

    @RequestMapping("/login")
    public String login(Model model){

        return "login/login";
    }

    @RequestMapping("/loginConfirm")
    public String loginConfirm(Model model){
        return "common/home";
    }

    @RequestMapping("/skipPage")
    public String skipPage(Model model){
        return "user/skipPage";
    }

}
