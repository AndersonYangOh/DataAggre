package org.ku8eye.domain;

public class MonitorScheduleRule {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column monitor_schedule_rule.id
     *
     * @mbg.generated Wed Nov 30 11:40:50 CST 2016
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column monitor_schedule_rule.cluster_id
     *
     * @mbg.generated Wed Nov 30 11:40:50 CST 2016
     */
    private String clusterId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column monitor_schedule_rule.app_id
     *
     * @mbg.generated Wed Nov 30 11:40:50 CST 2016
     */
    private String appId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column monitor_schedule_rule.counter_name
     *
     * @mbg.generated Wed Nov 30 11:40:50 CST 2016
     */
    private String counterName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column monitor_schedule_rule.condition_type
     *
     * @mbg.generated Wed Nov 30 11:40:50 CST 2016
     */
    private Integer conditionType;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column monitor_schedule_rule.condition_value
     *
     * @mbg.generated Wed Nov 30 11:40:50 CST 2016
     */
    private Integer conditionValue;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column monitor_schedule_rule.span
     *
     * @mbg.generated Wed Nov 30 11:40:50 CST 2016
     */
    private Integer span;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column monitor_schedule_rule.rule_type
     *
     * @mbg.generated Wed Nov 30 11:40:50 CST 2016
     */
    private Integer ruleType;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column monitor_schedule_rule.rule_name
     *
     * @mbg.generated Wed Nov 30 11:40:50 CST 2016
     */
    private String ruleName;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column monitor_schedule_rule.id
     *
     * @return the value of monitor_schedule_rule.id
     *
     * @mbg.generated Wed Nov 30 11:40:50 CST 2016
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column monitor_schedule_rule.id
     *
     * @param id the value for monitor_schedule_rule.id
     *
     * @mbg.generated Wed Nov 30 11:40:50 CST 2016
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column monitor_schedule_rule.cluster_id
     *
     * @return the value of monitor_schedule_rule.cluster_id
     *
     * @mbg.generated Wed Nov 30 11:40:50 CST 2016
     */
    public String getClusterId() {
        return clusterId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column monitor_schedule_rule.cluster_id
     *
     * @param clusterId the value for monitor_schedule_rule.cluster_id
     *
     * @mbg.generated Wed Nov 30 11:40:50 CST 2016
     */
    public void setClusterId(String clusterId) {
        this.clusterId = clusterId == null ? null : clusterId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column monitor_schedule_rule.app_id
     *
     * @return the value of monitor_schedule_rule.app_id
     *
     * @mbg.generated Wed Nov 30 11:40:50 CST 2016
     */
    public String getAppId() {
        return appId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column monitor_schedule_rule.app_id
     *
     * @param appId the value for monitor_schedule_rule.app_id
     *
     * @mbg.generated Wed Nov 30 11:40:50 CST 2016
     */
    public void setAppId(String appId) {
        this.appId = appId == null ? null : appId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column monitor_schedule_rule.counter_name
     *
     * @return the value of monitor_schedule_rule.counter_name
     *
     * @mbg.generated Wed Nov 30 11:40:50 CST 2016
     */
    public String getCounterName() {
        return counterName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column monitor_schedule_rule.counter_name
     *
     * @param counterName the value for monitor_schedule_rule.counter_name
     *
     * @mbg.generated Wed Nov 30 11:40:50 CST 2016
     */
    public void setCounterName(String counterName) {
        this.counterName = counterName == null ? null : counterName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column monitor_schedule_rule.condition_type
     *
     * @return the value of monitor_schedule_rule.condition_type
     *
     * @mbg.generated Wed Nov 30 11:40:50 CST 2016
     */
    public Integer getConditionType() {
        return conditionType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column monitor_schedule_rule.condition_type
     *
     * @param conditionType the value for monitor_schedule_rule.condition_type
     *
     * @mbg.generated Wed Nov 30 11:40:50 CST 2016
     */
    public void setConditionType(Integer conditionType) {
        this.conditionType = conditionType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column monitor_schedule_rule.condition_value
     *
     * @return the value of monitor_schedule_rule.condition_value
     *
     * @mbg.generated Wed Nov 30 11:40:50 CST 2016
     */
    public Integer getConditionValue() {
        return conditionValue;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column monitor_schedule_rule.condition_value
     *
     * @param conditionValue the value for monitor_schedule_rule.condition_value
     *
     * @mbg.generated Wed Nov 30 11:40:50 CST 2016
     */
    public void setConditionValue(Integer conditionValue) {
        this.conditionValue = conditionValue;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column monitor_schedule_rule.span
     *
     * @return the value of monitor_schedule_rule.span
     *
     * @mbg.generated Wed Nov 30 11:40:50 CST 2016
     */
    public Integer getSpan() {
        return span;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column monitor_schedule_rule.span
     *
     * @param span the value for monitor_schedule_rule.span
     *
     * @mbg.generated Wed Nov 30 11:40:50 CST 2016
     */
    public void setSpan(Integer span) {
        this.span = span;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column monitor_schedule_rule.rule_type
     *
     * @return the value of monitor_schedule_rule.rule_type
     *
     * @mbg.generated Wed Nov 30 11:40:50 CST 2016
     */
    public Integer getRuleType() {
        return ruleType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column monitor_schedule_rule.rule_type
     *
     * @param ruleType the value for monitor_schedule_rule.rule_type
     *
     * @mbg.generated Wed Nov 30 11:40:50 CST 2016
     */
    public void setRuleType(Integer ruleType) {
        this.ruleType = ruleType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column monitor_schedule_rule.rule_name
     *
     * @return the value of monitor_schedule_rule.rule_name
     *
     * @mbg.generated Wed Nov 30 11:40:50 CST 2016
     */
    public String getRuleName() {
        return ruleName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column monitor_schedule_rule.rule_name
     *
     * @param ruleName the value for monitor_schedule_rule.rule_name
     *
     * @mbg.generated Wed Nov 30 11:40:50 CST 2016
     */
    public void setRuleName(String ruleName) {
        this.ruleName = ruleName == null ? null : ruleName.trim();
    }
}