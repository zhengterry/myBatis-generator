package com.baofu.cbpayservice.dal.models;

import java.util.Date;

/**
 * 描述
 * <p>
 * User: 不良人 Date:2017/9/18 ProjectName: mybatis-generator-core Version: 1.0
 **/
public class BaseDo {
    /**
     * 系统ID编号
     */
    private Long id;

    /**
     * 创建时间
     */
    private Date createAt;

    /**
     * 创建人
     */
    private String createBy = "SYSTEM";

    /**
     * 更新时间
     */
    private Date updateAt;

    /**
     * 更新人
     */
    private String updateBy = "SYSTEM";

    /**
     * 备注
     */
    private String remarks;
}
