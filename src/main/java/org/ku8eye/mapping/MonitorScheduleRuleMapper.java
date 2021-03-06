package org.ku8eye.mapping;

import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.type.JdbcType;
import org.ku8eye.domain.MonitorScheduleRule;

public interface MonitorScheduleRuleMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table monitor_schedule_rule
     *
     * @mbg.generated Wed Nov 30 11:40:50 CST 2016
     */
    @Delete({
        "delete from monitor_schedule_rule",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table monitor_schedule_rule
     *
     * @mbg.generated Wed Nov 30 11:40:50 CST 2016
     */
    @Insert({
        "insert into monitor_schedule_rule (id, cluster_id, ",
        "app_id, counter_name, ",
        "condition_type, condition_value, ",
        "span, rule_type, ",
        "rule_name)",
        "values (#{id,jdbcType=INTEGER}, #{clusterId,jdbcType=VARCHAR}, ",
        "#{appId,jdbcType=VARCHAR}, #{counterName,jdbcType=VARCHAR}, ",
        "#{conditionType,jdbcType=INTEGER}, #{conditionValue,jdbcType=INTEGER}, ",
        "#{span,jdbcType=INTEGER}, #{ruleType,jdbcType=INTEGER}, ",
        "#{ruleName,jdbcType=VARCHAR})"
    })
    int insert(MonitorScheduleRule record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table monitor_schedule_rule
     *
     * @mbg.generated Wed Nov 30 11:40:50 CST 2016
     */
    @Select({
        "select",
        "id, cluster_id, app_id, counter_name, condition_type, condition_value, span, ",
        "rule_type, rule_name",
        "from monitor_schedule_rule",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="cluster_id", property="clusterId", jdbcType=JdbcType.VARCHAR),
        @Result(column="app_id", property="appId", jdbcType=JdbcType.VARCHAR),
        @Result(column="counter_name", property="counterName", jdbcType=JdbcType.VARCHAR),
        @Result(column="condition_type", property="conditionType", jdbcType=JdbcType.INTEGER),
        @Result(column="condition_value", property="conditionValue", jdbcType=JdbcType.INTEGER),
        @Result(column="span", property="span", jdbcType=JdbcType.INTEGER),
        @Result(column="rule_type", property="ruleType", jdbcType=JdbcType.INTEGER),
        @Result(column="rule_name", property="ruleName", jdbcType=JdbcType.VARCHAR)
    })
    MonitorScheduleRule selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table monitor_schedule_rule
     *
     * @mbg.generated Wed Nov 30 11:40:50 CST 2016
     */
    @Select({
        "select",
        "id, cluster_id, app_id, counter_name, condition_type, condition_value, span, ",
        "rule_type, rule_name",
        "from monitor_schedule_rule"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="cluster_id", property="clusterId", jdbcType=JdbcType.VARCHAR),
        @Result(column="app_id", property="appId", jdbcType=JdbcType.VARCHAR),
        @Result(column="counter_name", property="counterName", jdbcType=JdbcType.VARCHAR),
        @Result(column="condition_type", property="conditionType", jdbcType=JdbcType.INTEGER),
        @Result(column="condition_value", property="conditionValue", jdbcType=JdbcType.INTEGER),
        @Result(column="span", property="span", jdbcType=JdbcType.INTEGER),
        @Result(column="rule_type", property="ruleType", jdbcType=JdbcType.INTEGER),
        @Result(column="rule_name", property="ruleName", jdbcType=JdbcType.VARCHAR)
    })
    List<MonitorScheduleRule> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table monitor_schedule_rule
     *
     * @mbg.generated Wed Nov 30 11:40:50 CST 2016
     */
    @Update({
        "update monitor_schedule_rule",
        "set cluster_id = #{clusterId,jdbcType=VARCHAR},",
          "app_id = #{appId,jdbcType=VARCHAR},",
          "counter_name = #{counterName,jdbcType=VARCHAR},",
          "condition_type = #{conditionType,jdbcType=INTEGER},",
          "condition_value = #{conditionValue,jdbcType=INTEGER},",
          "span = #{span,jdbcType=INTEGER},",
          "rule_type = #{ruleType,jdbcType=INTEGER},",
          "rule_name = #{ruleName,jdbcType=VARCHAR}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(MonitorScheduleRule record);
}