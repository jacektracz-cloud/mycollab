/*Domain class of table m_prj_version*/
package com.mycollab.module.project.domain;

import com.mycollab.core.arguments.ValuedBean;
import com.mycollab.db.metadata.Column;
import com.mycollab.db.metadata.Table;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.ibatis.type.Alias;
import org.hibernate.validator.constraints.Length;

@SuppressWarnings("ucd")
@Table("m_prj_version")
@Alias("Version")
public class Version extends ValuedBean {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_prj_version.id
     *
     * @mbg.generated Mon Apr 08 15:53:02 CDT 2019
     */
    @Column("id")
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_prj_version.projectId
     *
     * @mbg.generated Mon Apr 08 15:53:02 CDT 2019
     */
    @NotNull
    @Column("projectId")
    private Integer projectid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_prj_version.duedate
     *
     * @mbg.generated Mon Apr 08 15:53:02 CDT 2019
     */
    @Column("duedate")
    private LocalDate duedate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_prj_version.name
     *
     * @mbg.generated Mon Apr 08 15:53:02 CDT 2019
     */
    @NotEmpty
    @Length(max=255, message="Field value is too long")
    @Column("name")
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_prj_version.createdUser
     *
     * @mbg.generated Mon Apr 08 15:53:02 CDT 2019
     */
    @Length(max=45, message="Field value is too long")
    @Column("createdUser")
    private String createduser;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_prj_version.sAccountId
     *
     * @mbg.generated Mon Apr 08 15:53:02 CDT 2019
     */
    @NotNull
    @Column("sAccountId")
    private Integer saccountid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_prj_version.lastUpdatedTime
     *
     * @mbg.generated Mon Apr 08 15:53:02 CDT 2019
     */
    @Column("lastUpdatedTime")
    private LocalDateTime lastupdatedtime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_prj_version.createdTime
     *
     * @mbg.generated Mon Apr 08 15:53:02 CDT 2019
     */
    @Column("createdTime")
    private LocalDateTime createdtime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_prj_version.status
     *
     * @mbg.generated Mon Apr 08 15:53:02 CDT 2019
     */
    @Length(max=45, message="Field value is too long")
    @Column("status")
    private String status;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_prj_version.prjKey
     *
     * @mbg.generated Mon Apr 08 15:53:02 CDT 2019
     */
    @Column("prjKey")
    private Integer prjkey;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_prj_version.description
     *
     * @mbg.generated Mon Apr 08 15:53:02 CDT 2019
     */
    @Length(max=16777215, message="Field value is too long")
    @Column("description")
    private String description;

    private static final long serialVersionUID = 1;

    public final boolean equals(Object obj) {
        if (obj == null) { return false;}
        if (obj == this) { return true;}
        if (!obj.getClass().isAssignableFrom(getClass())) { return false;}
        Version item = (Version)obj;
        return new EqualsBuilder().append(id, item.id).build();
    }

    public final int hashCode() {
        return new HashCodeBuilder(1799, 1053).append(id).build();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_prj_version.id
     *
     * @return the value of m_prj_version.id
     *
     * @mbg.generated Mon Apr 08 15:53:02 CDT 2019
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_prj_version
     *
     * @mbg.generated Mon Apr 08 15:53:02 CDT 2019
     */
    public Version withId(Integer id) {
        this.setId(id);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_prj_version.id
     *
     * @param id the value for m_prj_version.id
     *
     * @mbg.generated Mon Apr 08 15:53:02 CDT 2019
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_prj_version.projectId
     *
     * @return the value of m_prj_version.projectId
     *
     * @mbg.generated Mon Apr 08 15:53:02 CDT 2019
     */
    public Integer getProjectid() {
        return projectid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_prj_version
     *
     * @mbg.generated Mon Apr 08 15:53:02 CDT 2019
     */
    public Version withProjectid(Integer projectid) {
        this.setProjectid(projectid);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_prj_version.projectId
     *
     * @param projectid the value for m_prj_version.projectId
     *
     * @mbg.generated Mon Apr 08 15:53:02 CDT 2019
     */
    public void setProjectid(Integer projectid) {
        this.projectid = projectid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_prj_version.duedate
     *
     * @return the value of m_prj_version.duedate
     *
     * @mbg.generated Mon Apr 08 15:53:02 CDT 2019
     */
    public LocalDate getDuedate() {
        return duedate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_prj_version
     *
     * @mbg.generated Mon Apr 08 15:53:02 CDT 2019
     */
    public Version withDuedate(LocalDate duedate) {
        this.setDuedate(duedate);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_prj_version.duedate
     *
     * @param duedate the value for m_prj_version.duedate
     *
     * @mbg.generated Mon Apr 08 15:53:02 CDT 2019
     */
    public void setDuedate(LocalDate duedate) {
        this.duedate = duedate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_prj_version.name
     *
     * @return the value of m_prj_version.name
     *
     * @mbg.generated Mon Apr 08 15:53:02 CDT 2019
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_prj_version
     *
     * @mbg.generated Mon Apr 08 15:53:02 CDT 2019
     */
    public Version withName(String name) {
        this.setName(name);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_prj_version.name
     *
     * @param name the value for m_prj_version.name
     *
     * @mbg.generated Mon Apr 08 15:53:02 CDT 2019
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_prj_version.createdUser
     *
     * @return the value of m_prj_version.createdUser
     *
     * @mbg.generated Mon Apr 08 15:53:02 CDT 2019
     */
    public String getCreateduser() {
        return createduser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_prj_version
     *
     * @mbg.generated Mon Apr 08 15:53:02 CDT 2019
     */
    public Version withCreateduser(String createduser) {
        this.setCreateduser(createduser);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_prj_version.createdUser
     *
     * @param createduser the value for m_prj_version.createdUser
     *
     * @mbg.generated Mon Apr 08 15:53:02 CDT 2019
     */
    public void setCreateduser(String createduser) {
        this.createduser = createduser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_prj_version.sAccountId
     *
     * @return the value of m_prj_version.sAccountId
     *
     * @mbg.generated Mon Apr 08 15:53:02 CDT 2019
     */
    public Integer getSaccountid() {
        return saccountid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_prj_version
     *
     * @mbg.generated Mon Apr 08 15:53:02 CDT 2019
     */
    public Version withSaccountid(Integer saccountid) {
        this.setSaccountid(saccountid);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_prj_version.sAccountId
     *
     * @param saccountid the value for m_prj_version.sAccountId
     *
     * @mbg.generated Mon Apr 08 15:53:02 CDT 2019
     */
    public void setSaccountid(Integer saccountid) {
        this.saccountid = saccountid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_prj_version.lastUpdatedTime
     *
     * @return the value of m_prj_version.lastUpdatedTime
     *
     * @mbg.generated Mon Apr 08 15:53:02 CDT 2019
     */
    public LocalDateTime getLastupdatedtime() {
        return lastupdatedtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_prj_version
     *
     * @mbg.generated Mon Apr 08 15:53:02 CDT 2019
     */
    public Version withLastupdatedtime(LocalDateTime lastupdatedtime) {
        this.setLastupdatedtime(lastupdatedtime);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_prj_version.lastUpdatedTime
     *
     * @param lastupdatedtime the value for m_prj_version.lastUpdatedTime
     *
     * @mbg.generated Mon Apr 08 15:53:02 CDT 2019
     */
    public void setLastupdatedtime(LocalDateTime lastupdatedtime) {
        this.lastupdatedtime = lastupdatedtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_prj_version.createdTime
     *
     * @return the value of m_prj_version.createdTime
     *
     * @mbg.generated Mon Apr 08 15:53:02 CDT 2019
     */
    public LocalDateTime getCreatedtime() {
        return createdtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_prj_version
     *
     * @mbg.generated Mon Apr 08 15:53:02 CDT 2019
     */
    public Version withCreatedtime(LocalDateTime createdtime) {
        this.setCreatedtime(createdtime);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_prj_version.createdTime
     *
     * @param createdtime the value for m_prj_version.createdTime
     *
     * @mbg.generated Mon Apr 08 15:53:02 CDT 2019
     */
    public void setCreatedtime(LocalDateTime createdtime) {
        this.createdtime = createdtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_prj_version.status
     *
     * @return the value of m_prj_version.status
     *
     * @mbg.generated Mon Apr 08 15:53:02 CDT 2019
     */
    public String getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_prj_version
     *
     * @mbg.generated Mon Apr 08 15:53:02 CDT 2019
     */
    public Version withStatus(String status) {
        this.setStatus(status);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_prj_version.status
     *
     * @param status the value for m_prj_version.status
     *
     * @mbg.generated Mon Apr 08 15:53:02 CDT 2019
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_prj_version.prjKey
     *
     * @return the value of m_prj_version.prjKey
     *
     * @mbg.generated Mon Apr 08 15:53:02 CDT 2019
     */
    public Integer getPrjkey() {
        return prjkey;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_prj_version
     *
     * @mbg.generated Mon Apr 08 15:53:02 CDT 2019
     */
    public Version withPrjkey(Integer prjkey) {
        this.setPrjkey(prjkey);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_prj_version.prjKey
     *
     * @param prjkey the value for m_prj_version.prjKey
     *
     * @mbg.generated Mon Apr 08 15:53:02 CDT 2019
     */
    public void setPrjkey(Integer prjkey) {
        this.prjkey = prjkey;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_prj_version.description
     *
     * @return the value of m_prj_version.description
     *
     * @mbg.generated Mon Apr 08 15:53:02 CDT 2019
     */
    public String getDescription() {
        return description;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_prj_version
     *
     * @mbg.generated Mon Apr 08 15:53:02 CDT 2019
     */
    public Version withDescription(String description) {
        this.setDescription(description);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_prj_version.description
     *
     * @param description the value for m_prj_version.description
     *
     * @mbg.generated Mon Apr 08 15:53:02 CDT 2019
     */
    public void setDescription(String description) {
        this.description = description;
    }

    public enum Field {
        id,
        projectid,
        duedate,
        name,
        createduser,
        saccountid,
        lastupdatedtime,
        createdtime,
        status,
        prjkey,
        description;

        public boolean equalTo(Object value) {
            return name().equals(value);
        }
    }
}