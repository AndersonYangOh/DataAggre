package com.iiot.dao;

import com.iiot.domain.IiotProject;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.type.JdbcType;
import org.ku8eye.domain.Ku8Project;

public interface IiotProjectMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table iiot_project
     *
     * @mbg.generated Thu Jul 18 14:46:21 CST 2019
     */
    @Delete({
        "delete from iiot_project",
        "where ID = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);
    
    @Delete({
        "delete from iiot_project",
        "where PROJECT_ID = #{projectId,jdbcType=VARCHAR}"
    })
    int deleteByProjectId(String projectId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table iiot_project
     *
     * @mbg.generated Thu Jul 18 14:46:21 CST 2019
     */
    @Insert({
        "insert into iiot_project (ID, TENANT_ID, ",
        "OWNER, NAME, ICON_URL, ",
        "VERSION, RES_PART, APP_TYPE, ",
        "ZONE_ID, CLUSTER_ID, ",
        "RES_PARTION_ID, STATUS, ",
        "PROGRESS, NOTE, ",
        "LAST_UPDATED, PROJECT_ID, ",
        "JSON_SPEC, PREV_JSON_SPEC)",
        "values (#{id,jdbcType=INTEGER}, #{tenantId,jdbcType=INTEGER}, ",
        "#{owner,jdbcType=VARCHAR}, #{name,jdbcType=VARCHAR}, #{iconUrl,jdbcType=VARCHAR}, ",
        "#{version,jdbcType=CHAR}, #{resPart,jdbcType=VARCHAR}, #{appType,jdbcType=TINYINT}, ",
        "#{zoneId,jdbcType=INTEGER}, #{clusterId,jdbcType=INTEGER}, ",
        "#{resPartionId,jdbcType=INTEGER}, #{status,jdbcType=TINYINT}, ",
        "#{progress,jdbcType=INTEGER}, #{note,jdbcType=VARCHAR}, ",
        "#{lastUpdated,jdbcType=TIMESTAMP}, #{projectId,jdbcType=VARCHAR}, ",
        "#{jsonSpec,jdbcType=LONGVARCHAR}, #{prevJsonSpec,jdbcType=LONGVARCHAR})"
    })
    int insert(IiotProject record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table iiot_project
     *
     * @mbg.generated Thu Jul 18 14:46:21 CST 2019
     */
    @Select({
        "select",
        "ID, TENANT_ID, OWNER, NAME, ICON_URL, VERSION, RES_PART, APP_TYPE, ZONE_ID, ",
        "CLUSTER_ID, RES_PARTION_ID, STATUS, PROGRESS, NOTE, LAST_UPDATED, PROJECT_ID, ",
        "JSON_SPEC, PREV_JSON_SPEC",
        "from iiot_project",
        "where ID = #{id,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="ID", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="TENANT_ID", property="tenantId", jdbcType=JdbcType.INTEGER),
        @Result(column="OWNER", property="owner", jdbcType=JdbcType.VARCHAR),
        @Result(column="NAME", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="ICON_URL", property="iconUrl", jdbcType=JdbcType.VARCHAR),
        @Result(column="VERSION", property="version", jdbcType=JdbcType.CHAR),
        @Result(column="RES_PART", property="resPart", jdbcType=JdbcType.VARCHAR),
        @Result(column="APP_TYPE", property="appType", jdbcType=JdbcType.TINYINT),
        @Result(column="ZONE_ID", property="zoneId", jdbcType=JdbcType.INTEGER),
        @Result(column="CLUSTER_ID", property="clusterId", jdbcType=JdbcType.INTEGER),
        @Result(column="RES_PARTION_ID", property="resPartionId", jdbcType=JdbcType.INTEGER),
        @Result(column="STATUS", property="status", jdbcType=JdbcType.TINYINT),
        @Result(column="PROGRESS", property="progress", jdbcType=JdbcType.INTEGER),
        @Result(column="NOTE", property="note", jdbcType=JdbcType.VARCHAR),
        @Result(column="LAST_UPDATED", property="lastUpdated", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="PROJECT_ID", property="projectId", jdbcType=JdbcType.VARCHAR),
        @Result(column="JSON_SPEC", property="jsonSpec", jdbcType=JdbcType.LONGVARCHAR),
        @Result(column="PREV_JSON_SPEC", property="prevJsonSpec", jdbcType=JdbcType.LONGVARCHAR)
    })
    IiotProject selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table iiot_project
     *
     * @mbg.generated Thu Jul 18 14:46:21 CST 2019
     */
    @Select({
        "select",
        "ID, TENANT_ID, OWNER, NAME, ICON_URL, VERSION, RES_PART, APP_TYPE, ZONE_ID, ",
        "CLUSTER_ID, RES_PARTION_ID, STATUS, PROGRESS, NOTE, LAST_UPDATED, PROJECT_ID, ",
        "JSON_SPEC, PREV_JSON_SPEC",
        "from iiot_project"
    })
    @Results({
        @Result(column="ID", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="TENANT_ID", property="tenantId", jdbcType=JdbcType.INTEGER),
        @Result(column="OWNER", property="owner", jdbcType=JdbcType.VARCHAR),
        @Result(column="NAME", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="ICON_URL", property="iconUrl", jdbcType=JdbcType.VARCHAR),
        @Result(column="VERSION", property="version", jdbcType=JdbcType.CHAR),
        @Result(column="RES_PART", property="resPart", jdbcType=JdbcType.VARCHAR),
        @Result(column="APP_TYPE", property="appType", jdbcType=JdbcType.TINYINT),
        @Result(column="ZONE_ID", property="zoneId", jdbcType=JdbcType.INTEGER),
        @Result(column="CLUSTER_ID", property="clusterId", jdbcType=JdbcType.INTEGER),
        @Result(column="RES_PARTION_ID", property="resPartionId", jdbcType=JdbcType.INTEGER),
        @Result(column="STATUS", property="status", jdbcType=JdbcType.TINYINT),
        @Result(column="PROGRESS", property="progress", jdbcType=JdbcType.INTEGER),
        @Result(column="NOTE", property="note", jdbcType=JdbcType.VARCHAR),
        @Result(column="LAST_UPDATED", property="lastUpdated", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="PROJECT_ID", property="projectId", jdbcType=JdbcType.VARCHAR),
        @Result(column="JSON_SPEC", property="jsonSpec", jdbcType=JdbcType.LONGVARCHAR),
        @Result(column="PREV_JSON_SPEC", property="prevJsonSpec", jdbcType=JdbcType.LONGVARCHAR)
    })
    List<IiotProject> selectAll();
    
    @Select({
        "select",
        "ID, TENANT_ID, OWNER, NAME, ICON_URL, VERSION, RES_PART, APP_TYPE, ZONE_ID, ",
        "CLUSTER_ID, RES_PARTION_ID, STATUS, PROGRESS, NOTE, LAST_UPDATED, PROJECT_ID, ",
        "JSON_SPEC, PREV_JSON_SPEC",
        "from iiot_project where PROJECT_ID = #{projectId,jdbcType=VARCHAR}"
    })
    @Results({
        @Result(column="ID", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="TENANT_ID", property="tenantId", jdbcType=JdbcType.INTEGER),
        @Result(column="OWNER", property="owner", jdbcType=JdbcType.VARCHAR),
        @Result(column="NAME", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="ICON_URL", property="iconUrl", jdbcType=JdbcType.VARCHAR),
        @Result(column="VERSION", property="version", jdbcType=JdbcType.CHAR),
        @Result(column="RES_PART", property="resPart", jdbcType=JdbcType.VARCHAR),
        @Result(column="APP_TYPE", property="appType", jdbcType=JdbcType.TINYINT),
        @Result(column="ZONE_ID", property="zoneId", jdbcType=JdbcType.INTEGER),
        @Result(column="CLUSTER_ID", property="clusterId", jdbcType=JdbcType.INTEGER),
        @Result(column="RES_PARTION_ID", property="resPartionId", jdbcType=JdbcType.INTEGER),
        @Result(column="STATUS", property="status", jdbcType=JdbcType.TINYINT),
        @Result(column="PROGRESS", property="progress", jdbcType=JdbcType.INTEGER),
        @Result(column="NOTE", property="note", jdbcType=JdbcType.VARCHAR),
        @Result(column="LAST_UPDATED", property="lastUpdated", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="PROJECT_ID", property="projectId", jdbcType=JdbcType.VARCHAR),
        @Result(column="JSON_SPEC", property="jsonSpec", jdbcType=JdbcType.LONGVARCHAR),
        @Result(column="PREV_JSON_SPEC", property="prevJsonSpec", jdbcType=JdbcType.LONGVARCHAR)
    })
    IiotProject selectByProjectId(String projectId);
    
    @Select({
        "select",
        "ID, TENANT_ID, OWNER, NAME, ICON_URL, VERSION, RES_PART, APP_TYPE, ZONE_ID, ",
        "CLUSTER_ID, RES_PARTION_ID, STATUS, PROGRESS, NOTE, LAST_UPDATED, PROJECT_ID, ",
        "JSON_SPEC, PREV_JSON_SPEC",
        "from iiot_project where OWNER = #{owner,jdbcType=VARCHAR}"
    })
    @Results({
        @Result(column="ID", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="TENANT_ID", property="tenantId", jdbcType=JdbcType.INTEGER),
        @Result(column="OWNER", property="owner", jdbcType=JdbcType.VARCHAR),
        @Result(column="NAME", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="ICON_URL", property="iconUrl", jdbcType=JdbcType.VARCHAR),
        @Result(column="VERSION", property="version", jdbcType=JdbcType.CHAR),
        @Result(column="RES_PART", property="resPart", jdbcType=JdbcType.VARCHAR),
        @Result(column="APP_TYPE", property="appType", jdbcType=JdbcType.TINYINT),
        @Result(column="ZONE_ID", property="zoneId", jdbcType=JdbcType.INTEGER),
        @Result(column="CLUSTER_ID", property="clusterId", jdbcType=JdbcType.INTEGER),
        @Result(column="RES_PARTION_ID", property="resPartionId", jdbcType=JdbcType.INTEGER),
        @Result(column="STATUS", property="status", jdbcType=JdbcType.TINYINT),
        @Result(column="PROGRESS", property="progress", jdbcType=JdbcType.INTEGER),
        @Result(column="NOTE", property="note", jdbcType=JdbcType.VARCHAR),
        @Result(column="LAST_UPDATED", property="lastUpdated", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="PROJECT_ID", property="projectId", jdbcType=JdbcType.VARCHAR),
        @Result(column="JSON_SPEC", property="jsonSpec", jdbcType=JdbcType.LONGVARCHAR),
        @Result(column="PREV_JSON_SPEC", property="prevJsonSpec", jdbcType=JdbcType.LONGVARCHAR)
    })
    List<IiotProject> selectByOwner(String owner);
    
    @Select({
        "select",
        "NAME, PROJECT_ID",
        "from iiot_project where OWNER = #{owner,jdbcType=VARCHAR}"
    })
    @Results({
    	@Result(column="PROJECT_ID", property="projectId", jdbcType=JdbcType.VARCHAR),
        @Result(column="NAME", property="name", jdbcType=JdbcType.VARCHAR),
    })
	List<IiotProject> selectNamesAndProjectIdByOwner(String owner);
    
    @Select({
        "select",
        "ID, TENANT_ID, OWNER, NAME, ICON_URL, VERSION, RES_PART, APP_TYPE, ZONE_ID, ",
        "CLUSTER_ID, RES_PARTION_ID, STATUS, PROGRESS, NOTE, LAST_UPDATED, PROJECT_ID, ",
        "JSON_SPEC, PREV_JSON_SPEC",
        "from iiot_project where ZONE_ID = #{zoneid,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="ID", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="TENANT_ID", property="tenantId", jdbcType=JdbcType.INTEGER),
        @Result(column="OWNER", property="owner", jdbcType=JdbcType.VARCHAR),
        @Result(column="NAME", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="ICON_URL", property="iconUrl", jdbcType=JdbcType.VARCHAR),
        @Result(column="VERSION", property="version", jdbcType=JdbcType.CHAR),
        @Result(column="RES_PART", property="resPart", jdbcType=JdbcType.VARCHAR),
        @Result(column="APP_TYPE", property="appType", jdbcType=JdbcType.TINYINT),
        @Result(column="ZONE_ID", property="zoneId", jdbcType=JdbcType.INTEGER),
        @Result(column="CLUSTER_ID", property="clusterId", jdbcType=JdbcType.INTEGER),
        @Result(column="RES_PARTION_ID", property="resPartionId", jdbcType=JdbcType.INTEGER),
        @Result(column="STATUS", property="status", jdbcType=JdbcType.TINYINT),
        @Result(column="PROGRESS", property="progress", jdbcType=JdbcType.INTEGER),
        @Result(column="NOTE", property="note", jdbcType=JdbcType.VARCHAR),
        @Result(column="LAST_UPDATED", property="lastUpdated", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="PROJECT_ID", property="projectId", jdbcType=JdbcType.VARCHAR),
        @Result(column="JSON_SPEC", property="jsonSpec", jdbcType=JdbcType.LONGVARCHAR),
        @Result(column="PREV_JSON_SPEC", property="prevJsonSpec", jdbcType=JdbcType.LONGVARCHAR)
    })
    List<IiotProject> selectAllZoneId(int zoneid);
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table iiot_project
     *
     * @mbg.generated Thu Jul 18 14:46:21 CST 2019
     */
    @Update({
        "update iiot_project",
        "set TENANT_ID = #{tenantId,jdbcType=INTEGER},",
          "OWNER = #{owner,jdbcType=VARCHAR},",
          "NAME = #{name,jdbcType=VARCHAR},",
          "ICON_URL = #{iconUrl,jdbcType=VARCHAR},",
          "VERSION = #{version,jdbcType=CHAR},",
          "RES_PART = #{resPart,jdbcType=VARCHAR},",
          "APP_TYPE = #{appType,jdbcType=TINYINT},",
          "ZONE_ID = #{zoneId,jdbcType=INTEGER},",
          "CLUSTER_ID = #{clusterId,jdbcType=INTEGER},",
          "RES_PARTION_ID = #{resPartionId,jdbcType=INTEGER},",
          "STATUS = #{status,jdbcType=TINYINT},",
          "PROGRESS = #{progress,jdbcType=INTEGER},",
          "NOTE = #{note,jdbcType=VARCHAR},",
          "LAST_UPDATED = #{lastUpdated,jdbcType=TIMESTAMP},",
          "PROJECT_ID = #{projectId,jdbcType=VARCHAR},",
          "JSON_SPEC = #{jsonSpec,jdbcType=LONGVARCHAR},",
          "PREV_JSON_SPEC = #{prevJsonSpec,jdbcType=LONGVARCHAR}",
        "where ID = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(IiotProject record);

    @Update({
        "update iiot_project",
        "set JSON_SPEC = #{jsonSpec,jdbcType=LONGVARCHAR},",
          "PREV_JSON_SPEC = #{prevJsonSpec,jdbcType=LONGVARCHAR}",
        "where ID = #{id,jdbcType=INTEGER}"
    })
    int updateJSON(@Param("id")Integer id, @Param("jsonSpec")String jsonSpec, @Param("prevJsonSpec")String prevJsonSpec);


}
