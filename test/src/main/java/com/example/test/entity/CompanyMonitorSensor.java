package com.example.test.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

@Data
public class CompanyMonitorSensor {
    //创建字段
    @TableId(value = "id")
    private int id;
    private String companyCode;
    private int monitorType;
    private String sysName;
    private int equipmentTypeId;
    private String equipmentTypeName;
    private int sensorTypeId;
    private String sensorTypeName;
    private int technologyTypeId;
    private String technologyTypeName;
    private String department;
    private String sensorCode;
    private String location;
    private String storageMaterial;
    private BigDecimal levelAlArmHigh;
    private BigDecimal secondaryAlarmHigh;
    private BigDecimal levelAlarmLow;
    private BigDecimal secondaryAlarmLow;
    private int operateId;
    private String operateUsername;
    private Date createTime;
    private Date updateTime;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCompanyCode() {
        return companyCode;
    }

    public void setCompanyCode(String companyCode) {
        this.companyCode = companyCode;
    }

    public int MonitorType() {
        return monitorType;
    }

    public void setMonitorType(int monitorType) {
        this.monitorType = monitorType;
    }

    public String getSysName() {
        return sysName;
    }

    public void setSysName(String sysName) {
        this.sysName = sysName;
    }

    public int getEquipmentTypeId() {
        return equipmentTypeId;
    }

    public void setEquipmentTypeId(int equipmentTypeId) {
        this.equipmentTypeId = equipmentTypeId;
    }

    public String getEquipmentTypeName() {
        return equipmentTypeName;
    }

    public void setEquipmentTypeName(String equipmentTypeName) {
        this.equipmentTypeName = equipmentTypeName;
    }

    public int getSensorTypeId() {
        return sensorTypeId;
    }

    public void setSensorTypeId(int sensorTypeId) {
        this.sensorTypeId = sensorTypeId;
    }

    public String getSensorTypeName() {
        return sensorTypeName;
    }

    public void setSensorTypeName(String sensorTypeName) {
        this.sensorTypeName = sensorTypeName;
    }

    public int getTechnologyTypeId() {
        return technologyTypeId;
    }

    public void setTechnologyTypeId(int techologyTypeId) {
        this.technologyTypeId = techologyTypeId;
    }

    public String getTechnologyTypeName() {
        return technologyTypeName;
    }

    public void setTechnologyTypeName(String technologyTypeName) {
        this.technologyTypeName = technologyTypeName;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getSensorCode() {
        return sensorCode;
    }

    public void setSensorCode(String sensorCode) {
        this.sensorCode = sensorCode;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getStorageMaterial() {
        return storageMaterial;
    }

    public void setStorageMaterial(String storageMaterial) {
        this.storageMaterial = storageMaterial;
    }

    public BigDecimal getLevelAlArmHigh() {
        return levelAlArmHigh;
    }

    public void setLevelAlArmHigh(BigDecimal levelAlArmHigh) {
        this.levelAlArmHigh = levelAlArmHigh;
    }

    public BigDecimal getSecondaryAlarmHigh() {
        return secondaryAlarmHigh;
    }

    public void setSecondaryAlarmHigh(BigDecimal secondaryAlarmHigh) {
        this.secondaryAlarmHigh = secondaryAlarmHigh;
    }

    public BigDecimal getLevelAlarmLow() {
        return levelAlarmLow;
    }

    public void setLevelAlarmLow(BigDecimal levelAlarmLow) {
        this.levelAlarmLow = levelAlarmLow;
    }

    public BigDecimal getSecondaryAlarmLow() {
        return secondaryAlarmLow;
    }

    public void setSecondaryAlarmLow(BigDecimal secondaryAlarmLow) {
        this.secondaryAlarmLow = secondaryAlarmLow;
    }

    public int getOperateId() {
        return operateId;
    }

    public void setOperateId(int operateId) {
        this.operateId = operateId;
    }

    public String getOperateUsername() {
        return operateUsername;
    }

    public void setOperateUsername(String operateUsername) {
        this.operateUsername = operateUsername;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}
