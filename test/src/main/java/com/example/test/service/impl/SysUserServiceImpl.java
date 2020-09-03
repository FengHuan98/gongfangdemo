package com.example.test.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.test.entity.CompanyMonitorSensor;
import com.example.test.mapper.SysUserMapper;
import com.example.test.service.SysUserService;
import org.springframework.stereotype.Service;

@Service
public class SysUserServiceImpl extends ServiceImpl<SysUserMapper, CompanyMonitorSensor> implements SysUserService {

}