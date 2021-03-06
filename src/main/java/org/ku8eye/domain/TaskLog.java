package org.ku8eye.domain;

import java.util.Date;

public class TaskLog {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column task_log.ID
     *
     * @mbggenerated
     */
    private String id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column task_log.TASK_ID
     *
     * @mbggenerated
     */
    private Integer jobId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column task_log.START_TIME
     *
     * @mbggenerated
     */
    private Date startTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column task_log.END_TIME
     *
     * @mbggenerated
     */
    private Date endTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column task_log.STATUS
     * 任务运行状态1-正在运行，2-正常结束，-1-异常结束
     * @mbggenerated
     */
    private Byte status;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column task_log.HINT
     *
     * @mbggenerated
     */
    private String hint;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column task_log.LAST_UPDATED
     *
     * @mbggenerated
     */
    private Date lastUpdated;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column task_log.ID
     *
     * @return the value of task_log.ID
     *
     * @mbggenerated
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column task_log.ID
     *
     * @param id the value for task_log.ID
     *
     * @mbggenerated
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column task_log.TASK_ID
     *
     * @return the value of task_log.TASK_ID
     *
     * @mbggenerated
     */
    public Integer getJobId() {
        return jobId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column task_log.TASK_ID
     *
     * @param taskId the value for task_log.TASK_ID
     *
     * @mbggenerated
     */
    public void setJobId(Integer jobId) {
        this.jobId = jobId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column task_log.START_TIME
     *
     * @return the value of task_log.START_TIME
     *
     * @mbggenerated
     */
    public Date getStartTime() {
        return startTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column task_log.START_TIME
     *
     * @param startTime the value for task_log.START_TIME
     *
     * @mbggenerated
     */
    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column task_log.END_TIME
     *
     * @return the value of task_log.END_TIME
     *
     * @mbggenerated
     */
    public Date getEndTime() {
        return endTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column task_log.END_TIME
     *
     * @param endTime the value for task_log.END_TIME
     *
     * @mbggenerated
     */
    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column task_log.STATUS
     *
     * @return the value of task_log.STATUS
     *
     * @mbggenerated
     */
    public Byte getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column task_log.STATUS
     *
     * @param status the value for task_log.STATUS
     *
     * @mbggenerated
     */
    public void setStatus(Byte status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column task_log.HINT
     *
     * @return the value of task_log.HINT
     *
     * @mbggenerated
     */
    public String getHint() {
        return hint;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column task_log.HINT
     *
     * @param hint the value for task_log.HINT
     *
     * @mbggenerated
     */
    public void setHint(String hint) {
        this.hint = hint;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column task_log.LAST_UPDATED
     *
     * @return the value of task_log.LAST_UPDATED
     *
     * @mbggenerated
     */
    public Date getLastUpdated() {
        return lastUpdated;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column task_log.LAST_UPDATED
     *
     * @param lastUpdated the value for task_log.LAST_UPDATED
     *
     * @mbggenerated
     */
    public void setLastUpdated(Date lastUpdated) {
        this.lastUpdated = lastUpdated;
    }
}