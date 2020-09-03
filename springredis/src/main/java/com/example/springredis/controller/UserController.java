package com.example.springredis.controller;

import com.example.springredis.entity.User;
import com.example.springredis.service.Impl.UserServiceImpl;
import com.example.springredis.util.RedisUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author lenovo
 */
@RestController
public class UserController {

    @Autowired
    private UserServiceImpl userService;
    //RedisTemplate redisTemplate;

    @Autowired
    private RedisUtil redisUtil;

    @GetMapping("/insert")
    public String insert(@RequestParam("name") String name,@RequestParam("age") int age){
        int result=userService.insertUser(name,age);
        if(result>=1){
            return "添加成功";
        }else{
            return "添加失败";
        }
    }

    @GetMapping("/delete")
    public String delete(@RequestParam("id")int id){
        int result=userService.deleteById(id);
        if(result>=1){
            return "删除成功";
        }else{
            return "删除失败";
        }
    }

    @GetMapping("/update")
    public String update(@RequestParam("id")int id,@RequestParam("name")String name,@RequestParam("age")int age){
        int result=userService.updateUser(id, name, age);
        if(result>=1){
            return "修改成功";
        }else{
            return "修改失败";
        }
    }

    /**
     * 删除数据库中数据
     * @param user
     * @return
     */
    @PostMapping("/save")
    public User save(User user){
        return userService.save(user);
    }
    @DeleteMapping("/deleteById")
    public String deleteById(int id){
        int result=userService.delete(id);
        if(result>=1){
            return "删除成功";
        }else{
            return "删除失败";
        }
    }

    /**
     * 修改数据库
     * @param user
     * @return
     */
    @PutMapping("/updateById")
    public User updateById(User user){
        return userService.update(user);
    }

    /**
     * 查看redis缓存
     * @return
     */
    @GetMapping("/redisAll")
    public List<User> RedisAll(){
        redisUtil.set("all", userService.findAll().toString());
        return userService.findAll();
    }
}
