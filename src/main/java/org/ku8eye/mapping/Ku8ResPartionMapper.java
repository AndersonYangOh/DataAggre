package org.ku8eye.mapping;

import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.type.JdbcType;
import org.ku8eye.domain.Ku8ResPartion;

public interface Ku8ResPartionMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ku8_res_partion
     *
     * @mbggenerated
     */
    @Delete({
        "delete from ku8_res_partion",
        "where ID = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ku8_res_partion
     *
     * @mbggenerated
     */
    @Insert({
        "insert into ku8_res_partion (ID, CLUSTER_ID, ",
        "NAMESPACE, POD_LIMIT, ",
        "CPU_LIMIT, MEMORY_LIMIT, ",
        "RC_LIMIT, SERVICE_LIMIT, ",
        "PV_LIMIT, NOTE, LAST_UPDATED)",
        "values (#{id,jdbcType=INTEGER}, #{clusterId,jdbcType=INTEGER}, ",
        "#{namespace,jdbcType=CHAR}, #{podLimit,jdbcType=INTEGER}, ",
        "#{cpuLimit,jdbcType=INTEGER}, #{memoryLimit,jdbcType=INTEGER}, ",
        "#{rcLimit,jdbcType=INTEGER}, #{serviceLimit,jdbcType=INTEGER}, ",
        "#{pvLimit,jdbcType=INTEGER}, #{note,jdbcType=VARCHAR}, #{lastUpdated,jdbcType=TIMESTAMP})"
    })
    int insert(Ku8ResPartion record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ku8_res_partion
     *
     * @mbggenerated
     */
    @Select({
        "select",
        "ID, CLUSTER_ID, NAMESPACE, POD_LIMIT, CPU_LIMIT, MEMORY_LIMIT, RC_LIMIT, SERVICE_LIMIT, ",
        "PV_LIMIT, NOTE, LAST_UPDATED",
        "from ku8_res_partion",
        "where ID = #{id,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="ID", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="CLUSTER_ID", property="clusterId", jdbcType=JdbcType.INTEGER),
        @Result(column="NAMESPACE", property="namespace", jdbcType=JdbcType.CHAR),
        @Result(column="POD_LIMIT", property="podLimit", jdbcType=JdbcType.INTEGER),
        @Result(column="CPU_LIMIT", property="cpuLimit", jdbcType=JdbcType.INTEGER),
        @Result(column="MEMORY_LIMIT", property="memoryLimit", jdbcType=JdbcType.INTEGER),
        @Result(column="RC_LIMIT", property="rcLimit", jdbcType=JdbcType.INTEGER),
        @Result(column="SERVICE_LIMIT", property="serviceLimit", jdbcType=JdbcType.INTEGER),
        @Result(column="PV_LIMIT", property="pvLimit", jdbcType=JdbcType.INTEGER),
        @Result(column="NOTE", property="note", jdbcType=JdbcType.VARCHAR),
        @Result(column="LAST_UPDATED", property="lastUpdated", jdbcType=JdbcType.TIMESTAMP)
    })
    Ku8ResPartion selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ku8_res_partion
     *
     * @mbggenerated
     */
    @Select({
        "select",
        "ID, CLUSTER_ID, NAMESPACE, POD_LIMIT, CPU_LIMIT, MEMORY_LIMIT, RC_LIMIT, SERVICE_LIMIT, ",
        "PV_LIMIT, NOTE, LAST_UPDATED",
        "from ku8_res_partion"
    })
    @Results({
        @Result(column="ID", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="CLUSTER_ID", property="clusterId", jdbcType=JdbcType.INTEGER),
        @Result(column="NAMESPACE", property="namespace", jdbcType=JdbcType.CHAR),
        @Result(column="POD_LIMIT", property="podLimit", jdbcType=JdbcType.INTEGER),
        @Result(column="CPU_LIMIT", property="cpuLimit", jdbcType=JdbcType.INTEGER),
        @Result(column="MEMORY_LIMIT", property="memoryLimit", jdbcType=JdbcType.INTEGER),
        @Result(column="RC_LIMIT", property="rcLimit", jdbcType=JdbcType.INTEGER),
        @Result(column="SERVICE_LIMIT", property="serviceLimit", jdbcType=JdbcType.INTEGER),
        @Result(column="PV_LIMIT", property="pvLimit", jdbcType=JdbcType.INTEGER),
        @Result(column="NOTE", property="note", jdbcType=JdbcType.VARCHAR),
        @Result(column="LAST_UPDATED", property="lastUpdated", jdbcType=JdbcType.TIMESTAMP)
    })
    List<Ku8ResPartion> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ku8_res_partion
     *
     * @mbggenerated
     */
    @Update({
        "update ku8_res_partion",
        "set CLUSTER_ID = #{clusterId,jdbcType=INTEGER},",
          "NAMESPACE = #{namespace,jdbcType=CHAR},",
          "POD_LIMIT = #{podLimit,jdbcType=INTEGER},",
          "CPU_LIMIT = #{cpuLimit,jdbcType=INTEGER},",
          "MEMORY_LIMIT = #{memoryLimit,jdbcType=INTEGER},",
          "RC_LIMIT = #{rcLimit,jdbcType=INTEGER},",
          "SERVICE_LIMIT = #{serviceLimit,jdbcType=INTEGER},",
          "PV_LIMIT = #{pvLimit,jdbcType=INTEGER},",
          "NOTE = #{note,jdbcType=VARCHAR},",
          "LAST_UPDATED = #{lastUpdated,jdbcType=TIMESTAMP}",
        "where ID = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(Ku8ResPartion record);
}