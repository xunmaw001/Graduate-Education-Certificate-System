package com.entity.vo;

import com.entity.ZhuanjiediEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 转接地
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("zhuanjiedi")
public class ZhuanjiediVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

    @TableField(value = "id")
    private Integer id;


    /**
     * 用户
     */

    @TableField(value = "yonghu_id")
    private Integer yonghuId;


    /**
     * 转接地编号
     */

    @TableField(value = "zhuanjiedi_uuid_number")
    private String zhuanjiediUuidNumber;


    /**
     * 转接地名称
     */

    @TableField(value = "zhuanjiedi_name")
    private String zhuanjiediName;


    /**
     * 转接地地址
     */

    @TableField(value = "zhuanjiedi_address")
    private String zhuanjiediAddress;


    /**
     * 转接地类型
     */

    @TableField(value = "zhuanjiedi_types")
    private Integer zhuanjiediTypes;


    /**
     * 二级类型
     */

    @TableField(value = "zhuanjiedi_erji_types")
    private Integer zhuanjiediErjiTypes;


    /**
     * 转接地详情
     */

    @TableField(value = "zhuanjiedi_content")
    private String zhuanjiediContent;


    /**
     * 签约备注
     */

    @TableField(value = "shangdian_shouyin_content")
    private String shangdianShouyinContent;


    /**
     * 录入时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "insert_time")
    private Date insertTime;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "create_time")
    private Date createTime;


    /**
	 * 设置：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 获取：主键
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 设置：用户
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }


    /**
	 * 获取：用户
	 */

    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 设置：转接地编号
	 */
    public String getZhuanjiediUuidNumber() {
        return zhuanjiediUuidNumber;
    }


    /**
	 * 获取：转接地编号
	 */

    public void setZhuanjiediUuidNumber(String zhuanjiediUuidNumber) {
        this.zhuanjiediUuidNumber = zhuanjiediUuidNumber;
    }
    /**
	 * 设置：转接地名称
	 */
    public String getZhuanjiediName() {
        return zhuanjiediName;
    }


    /**
	 * 获取：转接地名称
	 */

    public void setZhuanjiediName(String zhuanjiediName) {
        this.zhuanjiediName = zhuanjiediName;
    }
    /**
	 * 设置：转接地地址
	 */
    public String getZhuanjiediAddress() {
        return zhuanjiediAddress;
    }


    /**
	 * 获取：转接地地址
	 */

    public void setZhuanjiediAddress(String zhuanjiediAddress) {
        this.zhuanjiediAddress = zhuanjiediAddress;
    }
    /**
	 * 设置：转接地类型
	 */
    public Integer getZhuanjiediTypes() {
        return zhuanjiediTypes;
    }


    /**
	 * 获取：转接地类型
	 */

    public void setZhuanjiediTypes(Integer zhuanjiediTypes) {
        this.zhuanjiediTypes = zhuanjiediTypes;
    }
    /**
	 * 设置：二级类型
	 */
    public Integer getZhuanjiediErjiTypes() {
        return zhuanjiediErjiTypes;
    }


    /**
	 * 获取：二级类型
	 */

    public void setZhuanjiediErjiTypes(Integer zhuanjiediErjiTypes) {
        this.zhuanjiediErjiTypes = zhuanjiediErjiTypes;
    }
    /**
	 * 设置：转接地详情
	 */
    public String getZhuanjiediContent() {
        return zhuanjiediContent;
    }


    /**
	 * 获取：转接地详情
	 */

    public void setZhuanjiediContent(String zhuanjiediContent) {
        this.zhuanjiediContent = zhuanjiediContent;
    }
    /**
	 * 设置：签约备注
	 */
    public String getShangdianShouyinContent() {
        return shangdianShouyinContent;
    }


    /**
	 * 获取：签约备注
	 */

    public void setShangdianShouyinContent(String shangdianShouyinContent) {
        this.shangdianShouyinContent = shangdianShouyinContent;
    }
    /**
	 * 设置：录入时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 获取：录入时间
	 */

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 设置：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

}
