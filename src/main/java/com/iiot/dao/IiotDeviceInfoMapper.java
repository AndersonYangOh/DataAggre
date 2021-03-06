package com.iiot.dao;

import com.iiot.domain.IiotDeviceInfo;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.type.JdbcType;

public interface IiotDeviceInfoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table iiot_device_info
     *
     * @mbg.generated Fri Aug 09 11:46:57 CST 2019
     */
    @Delete({
        "delete from iiot_device_info",
        "where ID = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table iiot_device_info
     *
     * @mbg.generated Fri Aug 09 11:46:57 CST 2019
     */
    @Insert({
        "insert into iiot_device_info (ID, DEVICE_ENCODE, ",
        "DEVICE_NAME, TOPIC_NANME, ",
        "DEVICE_STATUS_CODE, NODE_IP, ",
        "HOSTNAME, DESCRIPTION, ",
        "CREATER, CREATE_TIME, ",
        "MODIFIER, MODIFIER_TIME, ",
        "TIMESTAMP, VNO, ",
        "REMARK)",
        "values (#{id,jdbcType=INTEGER}, #{deviceEncode,jdbcType=VARCHAR}, ",
        "#{deviceName,jdbcType=VARCHAR}, #{topicNanme,jdbcType=VARCHAR}, ",
        "#{deviceStatusCode,jdbcType=CHAR}, #{nodeIp,jdbcType=VARCHAR}, ",
        "#{hostname,jdbcType=VARCHAR}, #{description,jdbcType=VARCHAR}, ",
        "#{creater,jdbcType=VARCHAR}, #{createTime,jdbcType=TIMESTAMP}, ",
        "#{modifier,jdbcType=VARCHAR}, #{modifierTime,jdbcType=TIMESTAMP}, ",
        "now(), 1, ",
        "#{remark,jdbcType=VARCHAR})"
    })
    int insert(IiotDeviceInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table iiot_device_info
     *
     * @mbg.generated Fri Aug 09 11:46:57 CST 2019
     */
    @Select({
        "select",
        "ID, DEVICE_ENCODE, DEVICE_NAME, TOPIC_NANME, DEVICE_STATUS_CODE, NODE_IP, HOSTNAME, ",
        "DESCRIPTION, CREATER, CREATE_TIME, MODIFIER, MODIFIER_TIME, TIMESTAMP, VNO, ",
        "REMARK",
        "from iiot_device_info",
        "where ID = #{id,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="ID", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="DEVICE_ENCODE", property="deviceEncode", jdbcType=JdbcType.VARCHAR),
        @Result(column="DEVICE_NAME", property="deviceName", jdbcType=JdbcType.VARCHAR),
        @Result(column="TOPIC_NANME", property="topicNanme", jdbcType=JdbcType.VARCHAR),
        @Result(column="DEVICE_STATUS_CODE", property="deviceStatusCode", jdbcType=JdbcType.CHAR),
        @Result(column="NODE_IP", property="nodeIp", jdbcType=JdbcType.VARCHAR),
        @Result(column="HOSTNAME", property="hostname", jdbcType=JdbcType.VARCHAR),
        @Result(column="DESCRIPTION", property="description", jdbcType=JdbcType.VARCHAR),
        @Result(column="CREATER", property="creater", jdbcType=JdbcType.VARCHAR),
        @Result(column="CREATE_TIME", property="createTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="MODIFIER", property="modifier", jdbcType=JdbcType.VARCHAR),
        @Result(column="MODIFIER_TIME", property="modifierTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="TIMESTAMP", property="timestamp", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="VNO", property="vno", jdbcType=JdbcType.INTEGER),
        @Result(column="REMARK", property="remark", jdbcType=JdbcType.VARCHAR)
    })
    IiotDeviceInfo selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table iiot_device_info
     *
     * @mbg.generated Fri Aug 09 11:46:57 CST 2019
     */
    @Select({
        "select",
        "ID, DEVICE_ENCODE, DEVICE_NAME, TOPIC_NANME, DEVICE_STATUS_CODE, NODE_IP, HOSTNAME, ",
        "DESCRIPTION, CREATER, CREATE_TIME, MODIFIER, MODIFIER_TIME, TIMESTAMP, VNO, ",
        "REMARK",
        "from iiot_device_info ORDER BY CREATE_TIME desc"
    })
    @Results({
        @Result(column="ID", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="DEVICE_ENCODE", property="deviceEncode", jdbcType=JdbcType.VARCHAR),
        @Result(column="DEVICE_NAME", property="deviceName", jdbcType=JdbcType.VARCHAR),
        @Result(column="TOPIC_NANME", property="topicNanme", jdbcType=JdbcType.VARCHAR),
        @Result(column="DEVICE_STATUS_CODE", property="deviceStatusCode", jdbcType=JdbcType.CHAR),
        @Result(column="NODE_IP", property="nodeIp", jdbcType=JdbcType.VARCHAR),
        @Result(column="HOSTNAME", property="hostname", jdbcType=JdbcType.VARCHAR),
        @Result(column="DESCRIPTION", property="description", jdbcType=JdbcType.VARCHAR),
        @Result(column="CREATER", property="creater", jdbcType=JdbcType.VARCHAR),
        @Result(column="CREATE_TIME", property="createTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="MODIFIER", property="modifier", jdbcType=JdbcType.VARCHAR),
        @Result(column="MODIFIER_TIME", property="modifierTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="TIMESTAMP", property="timestamp", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="VNO", property="vno", jdbcType=JdbcType.INTEGER),
        @Result(column="REMARK", property="remark", jdbcType=JdbcType.VARCHAR)
    })
    List<IiotDeviceInfo> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table iiot_device_info
     *
     * @mbg.generated Fri Aug 09 11:46:57 CST 2019
     */
    @Update({
        "update iiot_device_info",
        "set DEVICE_ENCODE = #{deviceEncode,jdbcType=VARCHAR},",
          "DEVICE_NAME = #{deviceName,jdbcType=VARCHAR},",
          "TOPIC_NANME = #{topicNanme,jdbcType=VARCHAR},",
          "DEVICE_STATUS_CODE = #{deviceStatusCode,jdbcType=CHAR},",
          "NODE_IP = #{nodeIp,jdbcType=VARCHAR},",
          "HOSTNAME = #{hostname,jdbcType=VARCHAR},",
          "DESCRIPTION = #{description,jdbcType=VARCHAR},",
          "CREATER = #{creater,jdbcType=VARCHAR},",
          "CREATE_TIME = #{createTime,jdbcType=TIMESTAMP},",
          "MODIFIER = #{modifier,jdbcType=VARCHAR},",
          "MODIFIER_TIME = #{modifierTime,jdbcType=TIMESTAMP},",
          "TIMESTAMP = now(),",
          "VNO = VNO+1 ,",
          "REMARK = #{remark,jdbcType=VARCHAR}",
        "where ID = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(IiotDeviceInfo record);
}