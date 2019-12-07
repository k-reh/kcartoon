package com.kcartoon.user.controller;

import com.kcartoon.service.UserService;
import com.kcartoon.bean.UmsMember;
import com.kcartoon.bean.UmsMemberReceiveAddress;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class UserController {

    @Autowired
    UserService userService;

    //管理员专用，获取ums_member表里所有的数据
    @RequestMapping("getAllUser")
    @ResponseBody
    public List<UmsMember> getAllUser() {
        List<UmsMember> umsMemberlist = userService.getAllUser();
        return umsMemberlist;
    }

    //根据id获得收货地址
    @RequestMapping("getReceiveAddressByMemberId")
    @ResponseBody
    public List<UmsMemberReceiveAddress> getReceiveAddressByMemberId(@RequestParam("memberId") String memberId){
        List<UmsMemberReceiveAddress> umsMemberReceiveAddressList = userService.getReceiveAddressByMemberId(memberId);
        return umsMemberReceiveAddressList;
    }



    @RequestMapping("index")
    @ResponseBody
    public String index() {
        return "success";
    }
}
