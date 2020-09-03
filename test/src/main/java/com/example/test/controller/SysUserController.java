package com.example.test.controller;

import com.example.test.entity.CompanyMonitorSensor;
import com.example.test.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Date;

@RestController
public class SysUserController {

    @Autowired
    private SysUserService sysUserService;

    /**
     * 增加数据
     * @param companyMonitorSensor
     * @return
     */
    @PostMapping("/addUser")
    public String addUser(CompanyMonitorSensor companyMonitorSensor){
        companyMonitorSensor.setCreateTime(new Date());
        companyMonitorSensor.setUpdateTime(new Date());
        return sysUserService.save(companyMonitorSensor)?"保存成功":"保存失败";
    }

}
