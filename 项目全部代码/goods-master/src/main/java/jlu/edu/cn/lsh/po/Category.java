package jlu.edu.cn.lsh.po;

public class Category {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column category.cid
     *
     * @mbggenerated Tue Aug 28 16:08:01 CST 2018
     */
    private String cid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column category.cname
     *
     * @mbggenerated Tue Aug 28 16:08:01 CST 2018
     */
    private String cname;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column category.pid
     *
     * @mbggenerated Tue Aug 28 16:08:01 CST 2018
     */
    private String pid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column category.desc
     *
     * @mbggenerated Tue Aug 28 16:08:01 CST 2018
     */
    private String desc;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column category.orderBy
     *
     * @mbggenerated Tue Aug 28 16:08:01 CST 2018
     */
    private Integer orderby;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column category.cid
     *
     * @return the value of category.cid
     *
     * @mbggenerated Tue Aug 28 16:08:01 CST 2018
     */
    public String getCid() {
        return cid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column category.cid
     *
     * @param cid the value for category.cid
     *
     * @mbggenerated Tue Aug 28 16:08:01 CST 2018
     */
    public void setCid(String cid) {
        this.cid = cid == null ? null : cid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column category.cname
     *
     * @return the value of category.cname
     *
     * @mbggenerated Tue Aug 28 16:08:01 CST 2018
     */
    public String getCname() {
        return cname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column category.cname
     *
     * @param cname the value for category.cname
     *
     * @mbggenerated Tue Aug 28 16:08:01 CST 2018
     */
    public void setCname(String cname) {
        this.cname = cname == null ? null : cname.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column category.pid
     *
     * @return the value of category.pid
     *
     * @mbggenerated Tue Aug 28 16:08:01 CST 2018
     */
    public String getPid() {
        return pid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column category.pid
     *
     * @param pid the value for category.pid
     *
     * @mbggenerated Tue Aug 28 16:08:01 CST 2018
     */
    public void setPid(String pid) {
        this.pid = pid == null ? null : pid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column category.desc
     *
     * @return the value of category.desc
     *
     * @mbggenerated Tue Aug 28 16:08:01 CST 2018
     */
    public String getDesc() {
        return desc;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column category.desc
     *
     * @param desc the value for category.desc
     *
     * @mbggenerated Tue Aug 28 16:08:01 CST 2018
     */
    public void setDesc(String desc) {
        this.desc = desc == null ? null : desc.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column category.orderBy
     *
     * @return the value of category.orderBy
     *
     * @mbggenerated Tue Aug 28 16:08:01 CST 2018
     */
    public Integer getOrderby() {
        return orderby;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column category.orderBy
     *
     * @param orderby the value for category.orderBy
     *
     * @mbggenerated Tue Aug 28 16:08:01 CST 2018
     */
    public void setOrderby(Integer orderby) {
        this.orderby = orderby;
    }
}