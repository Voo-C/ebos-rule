package cn.edu.bjtu.ebosrule.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Document
public class Rule {
    @Id
    private String ruleId;
    private String ruleName;

    private String ruleDescribe;
    private Date ruleCreateTime;

    private int ruleParaThreshold;
    private String rulePara;
    private String ruleToDevice;
    private String ruleToFunction;
    private String ruleJudge;
    private int ruleStatus;
    private String ruleExecute;

    private String service;
    private String device;
    private String scenario;

    public String getService() {
        return service;
    }
    public String getDevice() { return device; }
    public String getScenario() { return scenario; }

    public void setService(String service) {
        this.service = service;
    }

    public String getRuleId() {
        return ruleId;
    }

    public void setRuleId(String ruleId) {
        this.ruleId = ruleId;
    }

    public String getRuleName() {
        return ruleName;
    }

    public void setRuleName(String ruleName) {
        this.ruleName = ruleName;
    }

    public int getRuleParaThreshold() {
        return ruleParaThreshold;
    }

    public void setRuleParaThreshold(int ruleParaThreshold) {
        this.ruleParaThreshold = ruleParaThreshold;
    }

    public String getRulePara() {
        return rulePara;
    }

    public void setRulePara(String rulePara) {
        this.rulePara = rulePara;
    }

    public String getRuleToDevice() {
        return ruleToDevice;
    }

    public void setRuleToDevice(String ruleToDevice) {
        this.ruleToDevice = ruleToDevice;
    }

    public String getRuleToFunction() {
        return ruleToFunction;
    }

    public void setRuleToFunction(String ruleToFunction) {
        this.ruleToFunction = ruleToFunction;
    }

    public String getRuleJudge() { return ruleJudge; }

    public void setRuleJudge(String ruleJudge) {this.ruleJudge = ruleJudge; }

    public int getRuleStatus() { return ruleStatus; }

    public void setRuleExecute(String ruleExecute) {this.ruleExecute = ruleExecute; }

    public String getRuleExecute() { return ruleExecute; }

    public void setRuleStatus(int ruleStatus) {this.ruleStatus = ruleStatus; }

    public String getRuleDescribe() {
        return ruleDescribe;
    }

    public void setRuleDescribe(String ruleDescribe) {
        this.ruleDescribe = ruleDescribe;
    }

    public Date getRuleCreateTime() {
        return ruleCreateTime;
    }

    public void setRuleCreateTime(Date ruleCreateTime) {
        this.ruleCreateTime = ruleCreateTime;
    }

}
