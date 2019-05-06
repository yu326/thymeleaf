package com.thymeleaf.demo.web;

import com.thymeleaf.demo.entity.User;
import com.thymeleaf.demo.entity.UserEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by yu
 * on 2019/5/6.
 */
@Controller
public class IndexController {

    /**
     * thymeleaf layout展示用
     *
     * @return
     */
    @RequestMapping("/layout")
    public String layout() {
        return "thymeleaf/index";
    }

    /**
     * thymeleaf 展示数据用
     *
     * @param map
     * @return
     */
    @RequestMapping("/")
    public String index(ModelMap map) {
        //构造user.html需要数据
        UserEntity user = new UserEntity();
        user.setId(1);
        user.setName("yu");
        user.setDesc("<h1>A bored man</h1>");
        user.setDate(new Date());

        //构造user.html需要数据
        UserEntity user1 = new UserEntity();
        user1.setId(2);
        user1.setName("xi");
        user1.setDesc("A beautiful woman");
        user1.setDate(new Date());

        //构造user.html需要数据
        UserEntity user2 = new UserEntity();
        user2.setId(3);
        user2.setName("xue");
        user2.setDesc("the Milky Way");
        user2.setDate(new Date());

        List<UserEntity> userList = new ArrayList<>();
        userList.add(user);
        userList.add(user1);
        userList.add(user2);

        map.addAttribute("userInfo", user);
        map.addAttribute("userList", userList);
        map.addAttribute("userEntity", new UserEntity());

        return "thymeleaf/user";
    }

    /**
     *
     * @param map
     * @return
     */
    @ResponseBody
    @RequestMapping("/addUser")
    public String addUser(@ModelAttribute UserEntity userEntity, ModelMap map) {
        StringBuffer response = new StringBuffer();
        response.append("添加用户信息: ");
        response.append(userEntity.getId());
        response.append("-");
        response.append(userEntity.getName());
        response.append("-");
        response.append(userEntity.getDesc());
        return response.toString();
    }

}
