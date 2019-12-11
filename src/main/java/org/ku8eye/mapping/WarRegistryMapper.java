package org.ku8eye.mapping;

import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.type.JdbcType;
import org.ku8eye.domain.WarRegistry;

public interface WarRegistryMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table war_registry
     *
     * @mbg.generated Wed Jun 28 15:45:40 CST 2017
     */
    @Delete({
        "delete from war_registry",
        "where id = #{id,jdbcType=TINYINT}"
    })
    int deleteByPrimaryKey(Byte id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table war_registry
     *
     * @mbg.generated Wed Jun 28 15:45:40 CST 2017
     */
    @Insert({
        "insert into war_registry (id, title, ",
        "date, user, extension, ",
        "mark, location)",
        "values (#{id,jdbcType=TINYINT}, #{title,jdbcType=VARCHAR}, ",
        "#{date,jdbcType=TIMESTAMP}, #{user,jdbcType=VARCHAR}, #{extension,jdbcType=VARCHAR}, ",
        "#{mark,jdbcType=VARCHAR}, #{location,jdbcType=VARCHAR})"
    })
    int insert(WarRegistry record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table war_registry
     *
     * @mbg.generated Wed Jun 28 15:45:40 CST 2017
     */
    @Select({
        "select",
        "id, title, date, user, extension, mark, location",
        "from war_registry",
        "where id = #{id,jdbcType=TINYINT}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.TINYINT, id=true),
        @Result(column="title", property="title", jdbcType=JdbcType.VARCHAR),
        @Result(column="date", property="date", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="user", property="user", jdbcType=JdbcType.VARCHAR),
        @Result(column="extension", property="extension", jdbcType=JdbcType.VARCHAR),
        @Result(column="mark", property="mark", jdbcType=JdbcType.VARCHAR),
        @Result(column="location", property="location", jdbcType=JdbcType.VARCHAR)
    })
    WarRegistry selectByPrimaryKey(Byte id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table war_registry
     *
     * @mbg.generated Wed Jun 28 15:45:40 CST 2017
     */
    @Select({
        "select",
        "id, title, date, user, extension, mark, location",
        "from war_registry"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.TINYINT, id=true),
        @Result(column="title", property="title", jdbcType=JdbcType.VARCHAR),
        @Result(column="date", property="date", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="user", property="user", jdbcType=JdbcType.VARCHAR),
        @Result(column="extension", property="extension", jdbcType=JdbcType.VARCHAR),
        @Result(column="mark", property="mark", jdbcType=JdbcType.VARCHAR),
        @Result(column="location", property="location", jdbcType=JdbcType.VARCHAR)
    })
    List<WarRegistry> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table war_registry
     *
     * @mbg.generated Wed Jun 28 15:45:40 CST 2017
     */
    @Update({
        "update war_registry",
        "set title = #{title,jdbcType=VARCHAR},",
          "date = #{date,jdbcType=TIMESTAMP},",
          "user = #{user,jdbcType=VARCHAR},",
          "extension = #{extension,jdbcType=VARCHAR},",
          "mark = #{mark,jdbcType=VARCHAR},",
          "location = #{location,jdbcType=VARCHAR}",
        "where id = #{id,jdbcType=TINYINT}"
    })
    int updateByPrimaryKey(WarRegistry record);
}