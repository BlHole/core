package com.huaxu.core.middleware.spring.transactional.bean;

import java.math.BigDecimal;
import java.util.Date;

public class PayAccount {
    /**
     * 账户id
     */
    private Integer id;

    /**
     * 商户ID
     */
    private String businessId;

    /**
     * 账户类型(1=商户,2=个人)
     */
    private Short type;

    /**
     * 账户状态(1=启用,0=停用,-1=冻结)
     */
    private Short status;

    /**
     * 资金余额(分)默认0
     */
    private BigDecimal balanceAccountMoney;

    /**
     * 冻结金额(分)默认0
     */
    private BigDecimal frozenMoney;

    /**
     * 透支金额(分)默认0
     */
    private BigDecimal overdraftMoney;

    /**
     * 管理员名称
     */
    private String adminName;

    /**
     * 管理员手机号
     */
    private Integer adminPhone;

    /**
     * 管理员邮箱
     */
    private String adminEmail;

    /**
     * 创建日期
     */
    private Date createTime;

    /**
     * 最后修改时间
     */
    private Date updateTime;

    /**
     * 创建人
     */
    private String createName;

    /**
     * 最后修改操作人
     */
    private String operationName;

    /**
     * 账户id
     * @return id 账户id
     */
    public Integer getId() {
        return id;
    }

    /**
     * 账户id
     * @param id 账户id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 商户ID
     * @return business_id 商户ID
     */
    public String getBusinessId() {
        return businessId;
    }

    /**
     * 商户ID
     * @param businessId 商户ID
     */
    public void setBusinessId(String businessId) {
        this.businessId = businessId == null ? null : businessId.trim();
    }

    /**
     * 账户类型(1=商户,2=个人)
     * @return type 账户类型(1=商户,2=个人)
     */
    public Short getType() {
        return type;
    }

    /**
     * 账户类型(1=商户,2=个人)
     * @param type 账户类型(1=商户,2=个人)
     */
    public void setType(Short type) {
        this.type = type;
    }

    /**
     * 账户状态(1=启用,0=停用,-1=冻结)
     * @return status 账户状态(1=启用,0=停用,-1=冻结)
     */
    public Short getStatus() {
        return status;
    }

    /**
     * 账户状态(1=启用,0=停用,-1=冻结)
     * @param status 账户状态(1=启用,0=停用,-1=冻结)
     */
    public void setStatus(Short status) {
        this.status = status;
    }

    /**
     * 资金余额(分)默认0
     * @return balance_account_money 资金余额(分)默认0
     */
    public BigDecimal getBalanceAccountMoney() {
        return balanceAccountMoney;
    }

    /**
     * 资金余额(分)默认0
     * @param balanceAccountMoney 资金余额(分)默认0
     */
    public void setBalanceAccountMoney(BigDecimal balanceAccountMoney) {
        this.balanceAccountMoney = balanceAccountMoney;
    }

    /**
     * 冻结金额(分)默认0
     * @return frozen_money 冻结金额(分)默认0
     */
    public BigDecimal getFrozenMoney() {
        return frozenMoney;
    }

    /**
     * 冻结金额(分)默认0
     * @param frozenMoney 冻结金额(分)默认0
     */
    public void setFrozenMoney(BigDecimal frozenMoney) {
        this.frozenMoney = frozenMoney;
    }

    /**
     * 透支金额(分)默认0
     * @return overdraft_money 透支金额(分)默认0
     */
    public BigDecimal getOverdraftMoney() {
        return overdraftMoney;
    }

    /**
     * 透支金额(分)默认0
     * @param overdraftMoney 透支金额(分)默认0
     */
    public void setOverdraftMoney(BigDecimal overdraftMoney) {
        this.overdraftMoney = overdraftMoney;
    }

    /**
     * 管理员名称
     * @return admin_name 管理员名称
     */
    public String getAdminName() {
        return adminName;
    }

    /**
     * 管理员名称
     * @param adminName 管理员名称
     */
    public void setAdminName(String adminName) {
        this.adminName = adminName == null ? null : adminName.trim();
    }

    /**
     * 管理员手机号
     * @return admin_phone 管理员手机号
     */
    public Integer getAdminPhone() {
        return adminPhone;
    }

    /**
     * 管理员手机号
     * @param adminPhone 管理员手机号
     */
    public void setAdminPhone(Integer adminPhone) {
        this.adminPhone = adminPhone;
    }

    /**
     * 管理员邮箱
     * @return admin_email 管理员邮箱
     */
    public String getAdminEmail() {
        return adminEmail;
    }

    /**
     * 管理员邮箱
     * @param adminEmail 管理员邮箱
     */
    public void setAdminEmail(String adminEmail) {
        this.adminEmail = adminEmail == null ? null : adminEmail.trim();
    }

    /**
     * 创建日期
     * @return create_time 创建日期
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 创建日期
     * @param createTime 创建日期
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 最后修改时间
     * @return update_time 最后修改时间
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * 最后修改时间
     * @param updateTime 最后修改时间
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * 创建人
     * @return create_name 创建人
     */
    public String getCreateName() {
        return createName;
    }

    /**
     * 创建人
     * @param createName 创建人
     */
    public void setCreateName(String createName) {
        this.createName = createName == null ? null : createName.trim();
    }

    /**
     * 最后修改操作人
     * @return operation_name 最后修改操作人
     */
    public String getOperationName() {
        return operationName;
    }

    /**
     * 最后修改操作人
     * @param operationName 最后修改操作人
     */
    public void setOperationName(String operationName) {
        this.operationName = operationName == null ? null : operationName.trim();
    }


    @Override
    public String toString() {
        return "PayAccount{" +
                "id=" + id +
                ", businessId='" + businessId + '\'' +
                ", type=" + type +
                ", status=" + status +
                ", balanceAccountMoney=" + balanceAccountMoney +
                ", frozenMoney=" + frozenMoney +
                ", overdraftMoney=" + overdraftMoney +
                ", adminName='" + adminName + '\'' +
                ", adminPhone=" + adminPhone +
                ", adminEmail='" + adminEmail + '\'' +
                ", createTime=" + createTime +
                ", updateTime=" + updateTime +
                ", createName='" + createName + '\'' +
                ", operationName='" + operationName + '\'' +
                '}';
    }
}