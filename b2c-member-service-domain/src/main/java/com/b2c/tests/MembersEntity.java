package com.b2c.tests;

import javax.persistence.*;
import java.sql.Date;

/**
 * Created by baishiguang on 2017/7/25.
 */
@Entity
@Table(name = "members", schema = "b2c")
public class MembersEntity {
    private Integer id;
    private Integer siteId;
    private String avatarImageFileId;
    private String email;
    private String username;
    private String password;
    private String salt;
    private Integer registerTime;
    private Integer lastLoginTime;
    private String lastLoginIp;
    private Integer memberRankId;
    private Integer addressId;
    private Byte gender;
    private Date birthday;
    private String qq;
    private String msn;
    private String mobile;
    private String phone;
    private Integer gradeId;
    private String nickName;
    private Byte isBlackList;

    @Id
    @Column(name = "id", nullable = false)
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Basic
    @Column(name = "siteId", nullable = false)
    public Integer getSiteId() {
        return siteId;
    }

    public void setSiteId(Integer siteId) {
        this.siteId = siteId;
    }

    @Basic
    @Column(name = "avatarImageFileId", nullable = true, length = 255)
    public String getAvatarImageFileId() {
        return avatarImageFileId;
    }

    public void setAvatarImageFileId(String avatarImageFileId) {
        this.avatarImageFileId = avatarImageFileId;
    }

    @Basic
    @Column(name = "email", nullable = true, length = 120)
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Basic
    @Column(name = "username", nullable = false, length = 60)
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Basic
    @Column(name = "password", nullable = true, length = 32)
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Basic
    @Column(name = "salt", nullable = true, length = 10)
    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }

    @Basic
    @Column(name = "registerTime", nullable = false)
    public Integer getRegisterTime() {
        return registerTime;
    }

    public void setRegisterTime(Integer registerTime) {
        this.registerTime = registerTime;
    }

    @Basic
    @Column(name = "lastLoginTime", nullable = true)
    public Integer getLastLoginTime() {
        return lastLoginTime;
    }

    public void setLastLoginTime(Integer lastLoginTime) {
        this.lastLoginTime = lastLoginTime;
    }

    @Basic
    @Column(name = "lastLoginIp", nullable = true, length = 15)
    public String getLastLoginIp() {
        return lastLoginIp;
    }

    public void setLastLoginIp(String lastLoginIp) {
        this.lastLoginIp = lastLoginIp;
    }

    @Basic
    @Column(name = "memberRankId", nullable = true)
    public Integer getMemberRankId() {
        return memberRankId;
    }

    public void setMemberRankId(Integer memberRankId) {
        this.memberRankId = memberRankId;
    }

    @Basic
    @Column(name = "addressId", nullable = true)
    public Integer getAddressId() {
        return addressId;
    }

    public void setAddressId(Integer addressId) {
        this.addressId = addressId;
    }

    @Basic
    @Column(name = "gender", nullable = true)
    public Byte getGender() {
        return gender;
    }

    public void setGender(Byte gender) {
        this.gender = gender;
    }

    @Basic
    @Column(name = "birthday", nullable = true)
    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    @Basic
    @Column(name = "qq", nullable = true, length = 20)
    public String getQq() {
        return qq;
    }

    public void setQq(String qq) {
        this.qq = qq;
    }

    @Basic
    @Column(name = "msn", nullable = true, length = 60)
    public String getMsn() {
        return msn;
    }

    public void setMsn(String msn) {
        this.msn = msn;
    }

    @Basic
    @Column(name = "mobile", nullable = true, length = 15)
    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    @Basic
    @Column(name = "phone", nullable = true, length = 20)
    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Basic
    @Column(name = "grade_id", nullable = false)
    public Integer getGradeId() {
        return gradeId;
    }

    public void setGradeId(Integer gradeId) {
        this.gradeId = gradeId;
    }

    @Basic
    @Column(name = "nick_name", nullable = false, length = 60)
    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    @Basic
    @Column(name = "is_blackList", nullable = false)
    public Byte getIsBlackList() {
        return isBlackList;
    }

    public void setIsBlackList(Byte isBlackList) {
        this.isBlackList = isBlackList;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MembersEntity that = (MembersEntity) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (siteId != null ? !siteId.equals(that.siteId) : that.siteId != null) return false;
        if (avatarImageFileId != null ? !avatarImageFileId.equals(that.avatarImageFileId) : that.avatarImageFileId != null)
            return false;
        if (email != null ? !email.equals(that.email) : that.email != null) return false;
        if (username != null ? !username.equals(that.username) : that.username != null) return false;
        if (password != null ? !password.equals(that.password) : that.password != null) return false;
        if (salt != null ? !salt.equals(that.salt) : that.salt != null) return false;
        if (registerTime != null ? !registerTime.equals(that.registerTime) : that.registerTime != null) return false;
        if (lastLoginTime != null ? !lastLoginTime.equals(that.lastLoginTime) : that.lastLoginTime != null)
            return false;
        if (lastLoginIp != null ? !lastLoginIp.equals(that.lastLoginIp) : that.lastLoginIp != null) return false;
        if (memberRankId != null ? !memberRankId.equals(that.memberRankId) : that.memberRankId != null) return false;
        if (addressId != null ? !addressId.equals(that.addressId) : that.addressId != null) return false;
        if (gender != null ? !gender.equals(that.gender) : that.gender != null) return false;
        if (birthday != null ? !birthday.equals(that.birthday) : that.birthday != null) return false;
        if (qq != null ? !qq.equals(that.qq) : that.qq != null) return false;
        if (msn != null ? !msn.equals(that.msn) : that.msn != null) return false;
        if (mobile != null ? !mobile.equals(that.mobile) : that.mobile != null) return false;
        if (phone != null ? !phone.equals(that.phone) : that.phone != null) return false;
        if (gradeId != null ? !gradeId.equals(that.gradeId) : that.gradeId != null) return false;
        if (nickName != null ? !nickName.equals(that.nickName) : that.nickName != null) return false;
        if (isBlackList != null ? !isBlackList.equals(that.isBlackList) : that.isBlackList != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (siteId != null ? siteId.hashCode() : 0);
        result = 31 * result + (avatarImageFileId != null ? avatarImageFileId.hashCode() : 0);
        result = 31 * result + (email != null ? email.hashCode() : 0);
        result = 31 * result + (username != null ? username.hashCode() : 0);
        result = 31 * result + (password != null ? password.hashCode() : 0);
        result = 31 * result + (salt != null ? salt.hashCode() : 0);
        result = 31 * result + (registerTime != null ? registerTime.hashCode() : 0);
        result = 31 * result + (lastLoginTime != null ? lastLoginTime.hashCode() : 0);
        result = 31 * result + (lastLoginIp != null ? lastLoginIp.hashCode() : 0);
        result = 31 * result + (memberRankId != null ? memberRankId.hashCode() : 0);
        result = 31 * result + (addressId != null ? addressId.hashCode() : 0);
        result = 31 * result + (gender != null ? gender.hashCode() : 0);
        result = 31 * result + (birthday != null ? birthday.hashCode() : 0);
        result = 31 * result + (qq != null ? qq.hashCode() : 0);
        result = 31 * result + (msn != null ? msn.hashCode() : 0);
        result = 31 * result + (mobile != null ? mobile.hashCode() : 0);
        result = 31 * result + (phone != null ? phone.hashCode() : 0);
        result = 31 * result + (gradeId != null ? gradeId.hashCode() : 0);
        result = 31 * result + (nickName != null ? nickName.hashCode() : 0);
        result = 31 * result + (isBlackList != null ? isBlackList.hashCode() : 0);
        return result;
    }
}
