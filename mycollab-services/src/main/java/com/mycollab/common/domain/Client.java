/*Domain class of table m_client*/
package com.mycollab.common.domain;

import com.mycollab.core.arguments.ValuedBean;
import com.mycollab.db.metadata.Column;
import com.mycollab.db.metadata.Table;
import java.time.LocalDateTime;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.ibatis.type.Alias;
import org.hibernate.validator.constraints.Length;

@SuppressWarnings("ucd")
@Table("m_client")
@Alias("Client")
public class Client extends ValuedBean {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_client.id
     *
     * @mbg.generated Sat Jan 19 02:07:59 CST 2019
     */
    @Column("id")
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_client.name
     *
     * @mbg.generated Sat Jan 19 02:07:59 CST 2019
     */
    @NotEmpty
    @Length(max=255, message="Field value is too long")
    @Column("name")
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_client.website
     *
     * @mbg.generated Sat Jan 19 02:07:59 CST 2019
     */
    @Length(max=255, message="Field value is too long")
    @Column("website")
    private String website;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_client.phoneOffice
     *
     * @mbg.generated Sat Jan 19 02:07:59 CST 2019
     */
    @Length(max=45, message="Field value is too long")
    @Column("phoneOffice")
    private String phoneoffice;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_client.fax
     *
     * @mbg.generated Sat Jan 19 02:07:59 CST 2019
     */
    @Length(max=45, message="Field value is too long")
    @Column("fax")
    private String fax;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_client.alternatePhone
     *
     * @mbg.generated Sat Jan 19 02:07:59 CST 2019
     */
    @Length(max=45, message="Field value is too long")
    @Column("alternatePhone")
    private String alternatephone;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_client.annualRevenue
     *
     * @mbg.generated Sat Jan 19 02:07:59 CST 2019
     */
    @Length(max=45, message="Field value is too long")
    @Column("annualRevenue")
    private String annualrevenue;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_client.billingAddress
     *
     * @mbg.generated Sat Jan 19 02:07:59 CST 2019
     */
    @Length(max=255, message="Field value is too long")
    @Column("billingAddress")
    private String billingaddress;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_client.city
     *
     * @mbg.generated Sat Jan 19 02:07:59 CST 2019
     */
    @Length(max=100, message="Field value is too long")
    @Column("city")
    private String city;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_client.postalCode
     *
     * @mbg.generated Sat Jan 19 02:07:59 CST 2019
     */
    @Length(max=45, message="Field value is too long")
    @Column("postalCode")
    private String postalcode;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_client.state
     *
     * @mbg.generated Sat Jan 19 02:07:59 CST 2019
     */
    @Length(max=45, message="Field value is too long")
    @Column("state")
    private String state;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_client.email
     *
     * @mbg.generated Sat Jan 19 02:07:59 CST 2019
     */
    @Length(max=45, message="Field value is too long")
    @Column("email")
    private String email;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_client.ownership
     *
     * @mbg.generated Sat Jan 19 02:07:59 CST 2019
     */
    @Length(max=255, message="Field value is too long")
    @Column("ownership")
    private String ownership;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_client.shippingAddress
     *
     * @mbg.generated Sat Jan 19 02:07:59 CST 2019
     */
    @Length(max=255, message="Field value is too long")
    @Column("shippingAddress")
    private String shippingaddress;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_client.shippingCity
     *
     * @mbg.generated Sat Jan 19 02:07:59 CST 2019
     */
    @Length(max=100, message="Field value is too long")
    @Column("shippingCity")
    private String shippingcity;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_client.shippingPostalCode
     *
     * @mbg.generated Sat Jan 19 02:07:59 CST 2019
     */
    @Length(max=45, message="Field value is too long")
    @Column("shippingPostalCode")
    private String shippingpostalcode;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_client.shippingState
     *
     * @mbg.generated Sat Jan 19 02:07:59 CST 2019
     */
    @Length(max=45, message="Field value is too long")
    @Column("shippingState")
    private String shippingstate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_client.numemployees
     *
     * @mbg.generated Sat Jan 19 02:07:59 CST 2019
     */
    @Column("numemployees")
    private Integer numemployees;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_client.createdTime
     *
     * @mbg.generated Sat Jan 19 02:07:59 CST 2019
     */
    @Column("createdTime")
    private LocalDateTime createdtime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_client.createdUser
     *
     * @mbg.generated Sat Jan 19 02:07:59 CST 2019
     */
    @Length(max=45, message="Field value is too long")
    @Column("createdUser")
    private String createduser;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_client.sAccountId
     *
     * @mbg.generated Sat Jan 19 02:07:59 CST 2019
     */
    @NotNull
    @Column("sAccountId")
    private Integer saccountid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_client.assignUser
     *
     * @mbg.generated Sat Jan 19 02:07:59 CST 2019
     */
    @Length(max=45, message="Field value is too long")
    @Column("assignUser")
    private String assignuser;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_client.type
     *
     * @mbg.generated Sat Jan 19 02:07:59 CST 2019
     */
    @Length(max=45, message="Field value is too long")
    @Column("type")
    private String type;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_client.industry
     *
     * @mbg.generated Sat Jan 19 02:07:59 CST 2019
     */
    @Length(max=45, message="Field value is too long")
    @Column("industry")
    private String industry;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_client.lastUpdatedTime
     *
     * @mbg.generated Sat Jan 19 02:07:59 CST 2019
     */
    @Column("lastUpdatedTime")
    private LocalDateTime lastupdatedtime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_client.billingCountry
     *
     * @mbg.generated Sat Jan 19 02:07:59 CST 2019
     */
    @Length(max=45, message="Field value is too long")
    @Column("billingCountry")
    private String billingcountry;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_client.shippingCountry
     *
     * @mbg.generated Sat Jan 19 02:07:59 CST 2019
     */
    @Length(max=45, message="Field value is too long")
    @Column("shippingCountry")
    private String shippingcountry;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_client.avatarId
     *
     * @mbg.generated Sat Jan 19 02:07:59 CST 2019
     */
    @Length(max=100, message="Field value is too long")
    @Column("avatarId")
    private String avatarid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_client.description
     *
     * @mbg.generated Sat Jan 19 02:07:59 CST 2019
     */
    @Length(max=16777215, message="Field value is too long")
    @Column("description")
    private String description;

    private static final long serialVersionUID = 1;

    public final boolean equals(Object obj) {
        if (obj == null) { return false;}
        if (obj == this) { return true;}
        if (!obj.getClass().isAssignableFrom(getClass())) { return false;}
        Client item = (Client)obj;
        return new EqualsBuilder().append(id, item.id).build();
    }

    public final int hashCode() {
        return new HashCodeBuilder(417, 1745).append(id).build();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_client.id
     *
     * @return the value of m_client.id
     *
     * @mbg.generated Sat Jan 19 02:07:59 CST 2019
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_client.id
     *
     * @param id the value for m_client.id
     *
     * @mbg.generated Sat Jan 19 02:07:59 CST 2019
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_client.name
     *
     * @return the value of m_client.name
     *
     * @mbg.generated Sat Jan 19 02:07:59 CST 2019
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_client.name
     *
     * @param name the value for m_client.name
     *
     * @mbg.generated Sat Jan 19 02:07:59 CST 2019
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_client.website
     *
     * @return the value of m_client.website
     *
     * @mbg.generated Sat Jan 19 02:07:59 CST 2019
     */
    public String getWebsite() {
        return website;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_client.website
     *
     * @param website the value for m_client.website
     *
     * @mbg.generated Sat Jan 19 02:07:59 CST 2019
     */
    public void setWebsite(String website) {
        this.website = website;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_client.phoneOffice
     *
     * @return the value of m_client.phoneOffice
     *
     * @mbg.generated Sat Jan 19 02:07:59 CST 2019
     */
    public String getPhoneoffice() {
        return phoneoffice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_client.phoneOffice
     *
     * @param phoneoffice the value for m_client.phoneOffice
     *
     * @mbg.generated Sat Jan 19 02:07:59 CST 2019
     */
    public void setPhoneoffice(String phoneoffice) {
        this.phoneoffice = phoneoffice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_client.fax
     *
     * @return the value of m_client.fax
     *
     * @mbg.generated Sat Jan 19 02:07:59 CST 2019
     */
    public String getFax() {
        return fax;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_client.fax
     *
     * @param fax the value for m_client.fax
     *
     * @mbg.generated Sat Jan 19 02:07:59 CST 2019
     */
    public void setFax(String fax) {
        this.fax = fax;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_client.alternatePhone
     *
     * @return the value of m_client.alternatePhone
     *
     * @mbg.generated Sat Jan 19 02:07:59 CST 2019
     */
    public String getAlternatephone() {
        return alternatephone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_client.alternatePhone
     *
     * @param alternatephone the value for m_client.alternatePhone
     *
     * @mbg.generated Sat Jan 19 02:07:59 CST 2019
     */
    public void setAlternatephone(String alternatephone) {
        this.alternatephone = alternatephone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_client.annualRevenue
     *
     * @return the value of m_client.annualRevenue
     *
     * @mbg.generated Sat Jan 19 02:07:59 CST 2019
     */
    public String getAnnualrevenue() {
        return annualrevenue;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_client.annualRevenue
     *
     * @param annualrevenue the value for m_client.annualRevenue
     *
     * @mbg.generated Sat Jan 19 02:07:59 CST 2019
     */
    public void setAnnualrevenue(String annualrevenue) {
        this.annualrevenue = annualrevenue;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_client.billingAddress
     *
     * @return the value of m_client.billingAddress
     *
     * @mbg.generated Sat Jan 19 02:07:59 CST 2019
     */
    public String getBillingaddress() {
        return billingaddress;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_client.billingAddress
     *
     * @param billingaddress the value for m_client.billingAddress
     *
     * @mbg.generated Sat Jan 19 02:07:59 CST 2019
     */
    public void setBillingaddress(String billingaddress) {
        this.billingaddress = billingaddress;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_client.city
     *
     * @return the value of m_client.city
     *
     * @mbg.generated Sat Jan 19 02:07:59 CST 2019
     */
    public String getCity() {
        return city;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_client.city
     *
     * @param city the value for m_client.city
     *
     * @mbg.generated Sat Jan 19 02:07:59 CST 2019
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_client.postalCode
     *
     * @return the value of m_client.postalCode
     *
     * @mbg.generated Sat Jan 19 02:07:59 CST 2019
     */
    public String getPostalcode() {
        return postalcode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_client.postalCode
     *
     * @param postalcode the value for m_client.postalCode
     *
     * @mbg.generated Sat Jan 19 02:07:59 CST 2019
     */
    public void setPostalcode(String postalcode) {
        this.postalcode = postalcode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_client.state
     *
     * @return the value of m_client.state
     *
     * @mbg.generated Sat Jan 19 02:07:59 CST 2019
     */
    public String getState() {
        return state;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_client.state
     *
     * @param state the value for m_client.state
     *
     * @mbg.generated Sat Jan 19 02:07:59 CST 2019
     */
    public void setState(String state) {
        this.state = state;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_client.email
     *
     * @return the value of m_client.email
     *
     * @mbg.generated Sat Jan 19 02:07:59 CST 2019
     */
    public String getEmail() {
        return email;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_client.email
     *
     * @param email the value for m_client.email
     *
     * @mbg.generated Sat Jan 19 02:07:59 CST 2019
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_client.ownership
     *
     * @return the value of m_client.ownership
     *
     * @mbg.generated Sat Jan 19 02:07:59 CST 2019
     */
    public String getOwnership() {
        return ownership;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_client.ownership
     *
     * @param ownership the value for m_client.ownership
     *
     * @mbg.generated Sat Jan 19 02:07:59 CST 2019
     */
    public void setOwnership(String ownership) {
        this.ownership = ownership;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_client.shippingAddress
     *
     * @return the value of m_client.shippingAddress
     *
     * @mbg.generated Sat Jan 19 02:07:59 CST 2019
     */
    public String getShippingaddress() {
        return shippingaddress;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_client.shippingAddress
     *
     * @param shippingaddress the value for m_client.shippingAddress
     *
     * @mbg.generated Sat Jan 19 02:07:59 CST 2019
     */
    public void setShippingaddress(String shippingaddress) {
        this.shippingaddress = shippingaddress;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_client.shippingCity
     *
     * @return the value of m_client.shippingCity
     *
     * @mbg.generated Sat Jan 19 02:07:59 CST 2019
     */
    public String getShippingcity() {
        return shippingcity;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_client.shippingCity
     *
     * @param shippingcity the value for m_client.shippingCity
     *
     * @mbg.generated Sat Jan 19 02:07:59 CST 2019
     */
    public void setShippingcity(String shippingcity) {
        this.shippingcity = shippingcity;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_client.shippingPostalCode
     *
     * @return the value of m_client.shippingPostalCode
     *
     * @mbg.generated Sat Jan 19 02:07:59 CST 2019
     */
    public String getShippingpostalcode() {
        return shippingpostalcode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_client.shippingPostalCode
     *
     * @param shippingpostalcode the value for m_client.shippingPostalCode
     *
     * @mbg.generated Sat Jan 19 02:07:59 CST 2019
     */
    public void setShippingpostalcode(String shippingpostalcode) {
        this.shippingpostalcode = shippingpostalcode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_client.shippingState
     *
     * @return the value of m_client.shippingState
     *
     * @mbg.generated Sat Jan 19 02:07:59 CST 2019
     */
    public String getShippingstate() {
        return shippingstate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_client.shippingState
     *
     * @param shippingstate the value for m_client.shippingState
     *
     * @mbg.generated Sat Jan 19 02:07:59 CST 2019
     */
    public void setShippingstate(String shippingstate) {
        this.shippingstate = shippingstate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_client.numemployees
     *
     * @return the value of m_client.numemployees
     *
     * @mbg.generated Sat Jan 19 02:07:59 CST 2019
     */
    public Integer getNumemployees() {
        return numemployees;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_client.numemployees
     *
     * @param numemployees the value for m_client.numemployees
     *
     * @mbg.generated Sat Jan 19 02:07:59 CST 2019
     */
    public void setNumemployees(Integer numemployees) {
        this.numemployees = numemployees;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_client.createdTime
     *
     * @return the value of m_client.createdTime
     *
     * @mbg.generated Sat Jan 19 02:07:59 CST 2019
     */
    public LocalDateTime getCreatedtime() {
        return createdtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_client.createdTime
     *
     * @param createdtime the value for m_client.createdTime
     *
     * @mbg.generated Sat Jan 19 02:07:59 CST 2019
     */
    public void setCreatedtime(LocalDateTime createdtime) {
        this.createdtime = createdtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_client.createdUser
     *
     * @return the value of m_client.createdUser
     *
     * @mbg.generated Sat Jan 19 02:07:59 CST 2019
     */
    public String getCreateduser() {
        return createduser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_client.createdUser
     *
     * @param createduser the value for m_client.createdUser
     *
     * @mbg.generated Sat Jan 19 02:07:59 CST 2019
     */
    public void setCreateduser(String createduser) {
        this.createduser = createduser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_client.sAccountId
     *
     * @return the value of m_client.sAccountId
     *
     * @mbg.generated Sat Jan 19 02:07:59 CST 2019
     */
    public Integer getSaccountid() {
        return saccountid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_client.sAccountId
     *
     * @param saccountid the value for m_client.sAccountId
     *
     * @mbg.generated Sat Jan 19 02:07:59 CST 2019
     */
    public void setSaccountid(Integer saccountid) {
        this.saccountid = saccountid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_client.assignUser
     *
     * @return the value of m_client.assignUser
     *
     * @mbg.generated Sat Jan 19 02:07:59 CST 2019
     */
    public String getAssignuser() {
        return assignuser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_client.assignUser
     *
     * @param assignuser the value for m_client.assignUser
     *
     * @mbg.generated Sat Jan 19 02:07:59 CST 2019
     */
    public void setAssignuser(String assignuser) {
        this.assignuser = assignuser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_client.type
     *
     * @return the value of m_client.type
     *
     * @mbg.generated Sat Jan 19 02:07:59 CST 2019
     */
    public String getType() {
        return type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_client.type
     *
     * @param type the value for m_client.type
     *
     * @mbg.generated Sat Jan 19 02:07:59 CST 2019
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_client.industry
     *
     * @return the value of m_client.industry
     *
     * @mbg.generated Sat Jan 19 02:07:59 CST 2019
     */
    public String getIndustry() {
        return industry;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_client.industry
     *
     * @param industry the value for m_client.industry
     *
     * @mbg.generated Sat Jan 19 02:07:59 CST 2019
     */
    public void setIndustry(String industry) {
        this.industry = industry;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_client.lastUpdatedTime
     *
     * @return the value of m_client.lastUpdatedTime
     *
     * @mbg.generated Sat Jan 19 02:07:59 CST 2019
     */
    public LocalDateTime getLastupdatedtime() {
        return lastupdatedtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_client.lastUpdatedTime
     *
     * @param lastupdatedtime the value for m_client.lastUpdatedTime
     *
     * @mbg.generated Sat Jan 19 02:07:59 CST 2019
     */
    public void setLastupdatedtime(LocalDateTime lastupdatedtime) {
        this.lastupdatedtime = lastupdatedtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_client.billingCountry
     *
     * @return the value of m_client.billingCountry
     *
     * @mbg.generated Sat Jan 19 02:07:59 CST 2019
     */
    public String getBillingcountry() {
        return billingcountry;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_client.billingCountry
     *
     * @param billingcountry the value for m_client.billingCountry
     *
     * @mbg.generated Sat Jan 19 02:07:59 CST 2019
     */
    public void setBillingcountry(String billingcountry) {
        this.billingcountry = billingcountry;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_client.shippingCountry
     *
     * @return the value of m_client.shippingCountry
     *
     * @mbg.generated Sat Jan 19 02:07:59 CST 2019
     */
    public String getShippingcountry() {
        return shippingcountry;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_client.shippingCountry
     *
     * @param shippingcountry the value for m_client.shippingCountry
     *
     * @mbg.generated Sat Jan 19 02:07:59 CST 2019
     */
    public void setShippingcountry(String shippingcountry) {
        this.shippingcountry = shippingcountry;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_client.avatarId
     *
     * @return the value of m_client.avatarId
     *
     * @mbg.generated Sat Jan 19 02:07:59 CST 2019
     */
    public String getAvatarid() {
        return avatarid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_client.avatarId
     *
     * @param avatarid the value for m_client.avatarId
     *
     * @mbg.generated Sat Jan 19 02:07:59 CST 2019
     */
    public void setAvatarid(String avatarid) {
        this.avatarid = avatarid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_client.description
     *
     * @return the value of m_client.description
     *
     * @mbg.generated Sat Jan 19 02:07:59 CST 2019
     */
    public String getDescription() {
        return description;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_client.description
     *
     * @param description the value for m_client.description
     *
     * @mbg.generated Sat Jan 19 02:07:59 CST 2019
     */
    public void setDescription(String description) {
        this.description = description;
    }

    public enum Field {
        id,
        name,
        website,
        phoneoffice,
        fax,
        alternatephone,
        annualrevenue,
        billingaddress,
        city,
        postalcode,
        state,
        email,
        ownership,
        shippingaddress,
        shippingcity,
        shippingpostalcode,
        shippingstate,
        numemployees,
        createdtime,
        createduser,
        saccountid,
        assignuser,
        type,
        industry,
        lastupdatedtime,
        billingcountry,
        shippingcountry,
        avatarid,
        description;

        public boolean equalTo(Object value) {
            return name().equals(value);
        }
    }
}