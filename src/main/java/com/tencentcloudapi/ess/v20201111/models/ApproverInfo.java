/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.tencentcloudapi.ess.v20201111.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ApproverInfo extends AbstractModel{

    /**
    * 参与者类型：
0：企业
1：个人
3：企业静默签署
注：类型为3（企业静默签署）时，此接口会默认完成该签署方的签署。静默签署仅进行盖章操作，不能自动签名。
    */
    @SerializedName("ApproverType")
    @Expose
    private Long ApproverType;

    /**
    * 本环节需要操作人的名字
    */
    @SerializedName("ApproverName")
    @Expose
    private String ApproverName;

    /**
    * 本环节需要操作人的手机号
    */
    @SerializedName("ApproverMobile")
    @Expose
    private String ApproverMobile;

    /**
    * 本环节操作人签署控件配置
    */
    @SerializedName("SignComponents")
    @Expose
    private Component [] SignComponents;

    /**
    * 如果是企业,则为企业的名字
    */
    @SerializedName("OrganizationName")
    @Expose
    private String OrganizationName;

    /**
    * 身份证号
    */
    @SerializedName("ApproverIdCardNumber")
    @Expose
    private String ApproverIdCardNumber;

    /**
    * 证件类型 
ID_CARD 身份证
HONGKONG_AND_MACAO 港澳居民来往内地通行证
HONGKONG_MACAO_AND_TAIWAN 港澳台居民居住证(格式同居民身份证)
    */
    @SerializedName("ApproverIdCardType")
    @Expose
    private String ApproverIdCardType;

    /**
    * sms--短信，none--不通知
    */
    @SerializedName("NotifyType")
    @Expose
    private String NotifyType;

    /**
    * 1--收款人、2--开具人、3--见证人
    */
    @SerializedName("ApproverRole")
    @Expose
    private Long ApproverRole;

    /**
    * 签署意愿确认渠道,WEIXINAPP:人脸识别
    */
    @SerializedName("VerifyChannel")
    @Expose
    private String [] VerifyChannel;

    /**
    * 合同的强制预览时间：3~300s，未指定则按合同页数计算
    */
    @SerializedName("PreReadTime")
    @Expose
    private Long PreReadTime;

    /**
    * 签署人userId，传此字段则不用传姓名、手机号
    */
    @SerializedName("UserId")
    @Expose
    private String UserId;

    /**
    * 签署人用户来源,企微侧用户请传入：WEWORKAPP
    */
    @SerializedName("ApproverSource")
    @Expose
    private String ApproverSource;

    /**
    * 客户自定义签署人标识，64位长度，保证唯一，非企微场景不使用此字段
    */
    @SerializedName("CustomApproverTag")
    @Expose
    private String CustomApproverTag;

    /**
    * 签署人个性化能力值
    */
    @SerializedName("ApproverOption")
    @Expose
    private ApproverOption ApproverOption;

    /**
    * 签署人查看合同时认证方式, 
1-实名查看 2-短信验证码查看(企业签署方不支持该方式)
如果不传默认为1
    */
    @SerializedName("ApproverVerifyTypes")
    @Expose
    private Long [] ApproverVerifyTypes;

    /**
    * 签署人签署合同时的认证方式
1-人脸认证 2-签署密码 3-运营商三要素(默认为1,2)
合同签署认证方式的优先级 verifyChannel>approverSignTypes
    */
    @SerializedName("ApproverSignTypes")
    @Expose
    private Long [] ApproverSignTypes;

    /**
     * Get 参与者类型：
0：企业
1：个人
3：企业静默签署
注：类型为3（企业静默签署）时，此接口会默认完成该签署方的签署。静默签署仅进行盖章操作，不能自动签名。 
     * @return ApproverType 参与者类型：
0：企业
1：个人
3：企业静默签署
注：类型为3（企业静默签署）时，此接口会默认完成该签署方的签署。静默签署仅进行盖章操作，不能自动签名。
     */
    public Long getApproverType() {
        return this.ApproverType;
    }

    /**
     * Set 参与者类型：
0：企业
1：个人
3：企业静默签署
注：类型为3（企业静默签署）时，此接口会默认完成该签署方的签署。静默签署仅进行盖章操作，不能自动签名。
     * @param ApproverType 参与者类型：
0：企业
1：个人
3：企业静默签署
注：类型为3（企业静默签署）时，此接口会默认完成该签署方的签署。静默签署仅进行盖章操作，不能自动签名。
     */
    public void setApproverType(Long ApproverType) {
        this.ApproverType = ApproverType;
    }

    /**
     * Get 本环节需要操作人的名字 
     * @return ApproverName 本环节需要操作人的名字
     */
    public String getApproverName() {
        return this.ApproverName;
    }

    /**
     * Set 本环节需要操作人的名字
     * @param ApproverName 本环节需要操作人的名字
     */
    public void setApproverName(String ApproverName) {
        this.ApproverName = ApproverName;
    }

    /**
     * Get 本环节需要操作人的手机号 
     * @return ApproverMobile 本环节需要操作人的手机号
     */
    public String getApproverMobile() {
        return this.ApproverMobile;
    }

    /**
     * Set 本环节需要操作人的手机号
     * @param ApproverMobile 本环节需要操作人的手机号
     */
    public void setApproverMobile(String ApproverMobile) {
        this.ApproverMobile = ApproverMobile;
    }

    /**
     * Get 本环节操作人签署控件配置 
     * @return SignComponents 本环节操作人签署控件配置
     */
    public Component [] getSignComponents() {
        return this.SignComponents;
    }

    /**
     * Set 本环节操作人签署控件配置
     * @param SignComponents 本环节操作人签署控件配置
     */
    public void setSignComponents(Component [] SignComponents) {
        this.SignComponents = SignComponents;
    }

    /**
     * Get 如果是企业,则为企业的名字 
     * @return OrganizationName 如果是企业,则为企业的名字
     */
    public String getOrganizationName() {
        return this.OrganizationName;
    }

    /**
     * Set 如果是企业,则为企业的名字
     * @param OrganizationName 如果是企业,则为企业的名字
     */
    public void setOrganizationName(String OrganizationName) {
        this.OrganizationName = OrganizationName;
    }

    /**
     * Get 身份证号 
     * @return ApproverIdCardNumber 身份证号
     */
    public String getApproverIdCardNumber() {
        return this.ApproverIdCardNumber;
    }

    /**
     * Set 身份证号
     * @param ApproverIdCardNumber 身份证号
     */
    public void setApproverIdCardNumber(String ApproverIdCardNumber) {
        this.ApproverIdCardNumber = ApproverIdCardNumber;
    }

    /**
     * Get 证件类型 
ID_CARD 身份证
HONGKONG_AND_MACAO 港澳居民来往内地通行证
HONGKONG_MACAO_AND_TAIWAN 港澳台居民居住证(格式同居民身份证) 
     * @return ApproverIdCardType 证件类型 
ID_CARD 身份证
HONGKONG_AND_MACAO 港澳居民来往内地通行证
HONGKONG_MACAO_AND_TAIWAN 港澳台居民居住证(格式同居民身份证)
     */
    public String getApproverIdCardType() {
        return this.ApproverIdCardType;
    }

    /**
     * Set 证件类型 
ID_CARD 身份证
HONGKONG_AND_MACAO 港澳居民来往内地通行证
HONGKONG_MACAO_AND_TAIWAN 港澳台居民居住证(格式同居民身份证)
     * @param ApproverIdCardType 证件类型 
ID_CARD 身份证
HONGKONG_AND_MACAO 港澳居民来往内地通行证
HONGKONG_MACAO_AND_TAIWAN 港澳台居民居住证(格式同居民身份证)
     */
    public void setApproverIdCardType(String ApproverIdCardType) {
        this.ApproverIdCardType = ApproverIdCardType;
    }

    /**
     * Get sms--短信，none--不通知 
     * @return NotifyType sms--短信，none--不通知
     */
    public String getNotifyType() {
        return this.NotifyType;
    }

    /**
     * Set sms--短信，none--不通知
     * @param NotifyType sms--短信，none--不通知
     */
    public void setNotifyType(String NotifyType) {
        this.NotifyType = NotifyType;
    }

    /**
     * Get 1--收款人、2--开具人、3--见证人 
     * @return ApproverRole 1--收款人、2--开具人、3--见证人
     */
    public Long getApproverRole() {
        return this.ApproverRole;
    }

    /**
     * Set 1--收款人、2--开具人、3--见证人
     * @param ApproverRole 1--收款人、2--开具人、3--见证人
     */
    public void setApproverRole(Long ApproverRole) {
        this.ApproverRole = ApproverRole;
    }

    /**
     * Get 签署意愿确认渠道,WEIXINAPP:人脸识别 
     * @return VerifyChannel 签署意愿确认渠道,WEIXINAPP:人脸识别
     */
    public String [] getVerifyChannel() {
        return this.VerifyChannel;
    }

    /**
     * Set 签署意愿确认渠道,WEIXINAPP:人脸识别
     * @param VerifyChannel 签署意愿确认渠道,WEIXINAPP:人脸识别
     */
    public void setVerifyChannel(String [] VerifyChannel) {
        this.VerifyChannel = VerifyChannel;
    }

    /**
     * Get 合同的强制预览时间：3~300s，未指定则按合同页数计算 
     * @return PreReadTime 合同的强制预览时间：3~300s，未指定则按合同页数计算
     */
    public Long getPreReadTime() {
        return this.PreReadTime;
    }

    /**
     * Set 合同的强制预览时间：3~300s，未指定则按合同页数计算
     * @param PreReadTime 合同的强制预览时间：3~300s，未指定则按合同页数计算
     */
    public void setPreReadTime(Long PreReadTime) {
        this.PreReadTime = PreReadTime;
    }

    /**
     * Get 签署人userId，传此字段则不用传姓名、手机号 
     * @return UserId 签署人userId，传此字段则不用传姓名、手机号
     */
    public String getUserId() {
        return this.UserId;
    }

    /**
     * Set 签署人userId，传此字段则不用传姓名、手机号
     * @param UserId 签署人userId，传此字段则不用传姓名、手机号
     */
    public void setUserId(String UserId) {
        this.UserId = UserId;
    }

    /**
     * Get 签署人用户来源,企微侧用户请传入：WEWORKAPP 
     * @return ApproverSource 签署人用户来源,企微侧用户请传入：WEWORKAPP
     */
    public String getApproverSource() {
        return this.ApproverSource;
    }

    /**
     * Set 签署人用户来源,企微侧用户请传入：WEWORKAPP
     * @param ApproverSource 签署人用户来源,企微侧用户请传入：WEWORKAPP
     */
    public void setApproverSource(String ApproverSource) {
        this.ApproverSource = ApproverSource;
    }

    /**
     * Get 客户自定义签署人标识，64位长度，保证唯一，非企微场景不使用此字段 
     * @return CustomApproverTag 客户自定义签署人标识，64位长度，保证唯一，非企微场景不使用此字段
     */
    public String getCustomApproverTag() {
        return this.CustomApproverTag;
    }

    /**
     * Set 客户自定义签署人标识，64位长度，保证唯一，非企微场景不使用此字段
     * @param CustomApproverTag 客户自定义签署人标识，64位长度，保证唯一，非企微场景不使用此字段
     */
    public void setCustomApproverTag(String CustomApproverTag) {
        this.CustomApproverTag = CustomApproverTag;
    }

    /**
     * Get 签署人个性化能力值 
     * @return ApproverOption 签署人个性化能力值
     */
    public ApproverOption getApproverOption() {
        return this.ApproverOption;
    }

    /**
     * Set 签署人个性化能力值
     * @param ApproverOption 签署人个性化能力值
     */
    public void setApproverOption(ApproverOption ApproverOption) {
        this.ApproverOption = ApproverOption;
    }

    /**
     * Get 签署人查看合同时认证方式, 
1-实名查看 2-短信验证码查看(企业签署方不支持该方式)
如果不传默认为1 
     * @return ApproverVerifyTypes 签署人查看合同时认证方式, 
1-实名查看 2-短信验证码查看(企业签署方不支持该方式)
如果不传默认为1
     */
    public Long [] getApproverVerifyTypes() {
        return this.ApproverVerifyTypes;
    }

    /**
     * Set 签署人查看合同时认证方式, 
1-实名查看 2-短信验证码查看(企业签署方不支持该方式)
如果不传默认为1
     * @param ApproverVerifyTypes 签署人查看合同时认证方式, 
1-实名查看 2-短信验证码查看(企业签署方不支持该方式)
如果不传默认为1
     */
    public void setApproverVerifyTypes(Long [] ApproverVerifyTypes) {
        this.ApproverVerifyTypes = ApproverVerifyTypes;
    }

    /**
     * Get 签署人签署合同时的认证方式
1-人脸认证 2-签署密码 3-运营商三要素(默认为1,2)
合同签署认证方式的优先级 verifyChannel>approverSignTypes 
     * @return ApproverSignTypes 签署人签署合同时的认证方式
1-人脸认证 2-签署密码 3-运营商三要素(默认为1,2)
合同签署认证方式的优先级 verifyChannel>approverSignTypes
     */
    public Long [] getApproverSignTypes() {
        return this.ApproverSignTypes;
    }

    /**
     * Set 签署人签署合同时的认证方式
1-人脸认证 2-签署密码 3-运营商三要素(默认为1,2)
合同签署认证方式的优先级 verifyChannel>approverSignTypes
     * @param ApproverSignTypes 签署人签署合同时的认证方式
1-人脸认证 2-签署密码 3-运营商三要素(默认为1,2)
合同签署认证方式的优先级 verifyChannel>approverSignTypes
     */
    public void setApproverSignTypes(Long [] ApproverSignTypes) {
        this.ApproverSignTypes = ApproverSignTypes;
    }

    public ApproverInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ApproverInfo(ApproverInfo source) {
        if (source.ApproverType != null) {
            this.ApproverType = new Long(source.ApproverType);
        }
        if (source.ApproverName != null) {
            this.ApproverName = new String(source.ApproverName);
        }
        if (source.ApproverMobile != null) {
            this.ApproverMobile = new String(source.ApproverMobile);
        }
        if (source.SignComponents != null) {
            this.SignComponents = new Component[source.SignComponents.length];
            for (int i = 0; i < source.SignComponents.length; i++) {
                this.SignComponents[i] = new Component(source.SignComponents[i]);
            }
        }
        if (source.OrganizationName != null) {
            this.OrganizationName = new String(source.OrganizationName);
        }
        if (source.ApproverIdCardNumber != null) {
            this.ApproverIdCardNumber = new String(source.ApproverIdCardNumber);
        }
        if (source.ApproverIdCardType != null) {
            this.ApproverIdCardType = new String(source.ApproverIdCardType);
        }
        if (source.NotifyType != null) {
            this.NotifyType = new String(source.NotifyType);
        }
        if (source.ApproverRole != null) {
            this.ApproverRole = new Long(source.ApproverRole);
        }
        if (source.VerifyChannel != null) {
            this.VerifyChannel = new String[source.VerifyChannel.length];
            for (int i = 0; i < source.VerifyChannel.length; i++) {
                this.VerifyChannel[i] = new String(source.VerifyChannel[i]);
            }
        }
        if (source.PreReadTime != null) {
            this.PreReadTime = new Long(source.PreReadTime);
        }
        if (source.UserId != null) {
            this.UserId = new String(source.UserId);
        }
        if (source.ApproverSource != null) {
            this.ApproverSource = new String(source.ApproverSource);
        }
        if (source.CustomApproverTag != null) {
            this.CustomApproverTag = new String(source.CustomApproverTag);
        }
        if (source.ApproverOption != null) {
            this.ApproverOption = new ApproverOption(source.ApproverOption);
        }
        if (source.ApproverVerifyTypes != null) {
            this.ApproverVerifyTypes = new Long[source.ApproverVerifyTypes.length];
            for (int i = 0; i < source.ApproverVerifyTypes.length; i++) {
                this.ApproverVerifyTypes[i] = new Long(source.ApproverVerifyTypes[i]);
            }
        }
        if (source.ApproverSignTypes != null) {
            this.ApproverSignTypes = new Long[source.ApproverSignTypes.length];
            for (int i = 0; i < source.ApproverSignTypes.length; i++) {
                this.ApproverSignTypes[i] = new Long(source.ApproverSignTypes[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ApproverType", this.ApproverType);
        this.setParamSimple(map, prefix + "ApproverName", this.ApproverName);
        this.setParamSimple(map, prefix + "ApproverMobile", this.ApproverMobile);
        this.setParamArrayObj(map, prefix + "SignComponents.", this.SignComponents);
        this.setParamSimple(map, prefix + "OrganizationName", this.OrganizationName);
        this.setParamSimple(map, prefix + "ApproverIdCardNumber", this.ApproverIdCardNumber);
        this.setParamSimple(map, prefix + "ApproverIdCardType", this.ApproverIdCardType);
        this.setParamSimple(map, prefix + "NotifyType", this.NotifyType);
        this.setParamSimple(map, prefix + "ApproverRole", this.ApproverRole);
        this.setParamArraySimple(map, prefix + "VerifyChannel.", this.VerifyChannel);
        this.setParamSimple(map, prefix + "PreReadTime", this.PreReadTime);
        this.setParamSimple(map, prefix + "UserId", this.UserId);
        this.setParamSimple(map, prefix + "ApproverSource", this.ApproverSource);
        this.setParamSimple(map, prefix + "CustomApproverTag", this.CustomApproverTag);
        this.setParamObj(map, prefix + "ApproverOption.", this.ApproverOption);
        this.setParamArraySimple(map, prefix + "ApproverVerifyTypes.", this.ApproverVerifyTypes);
        this.setParamArraySimple(map, prefix + "ApproverSignTypes.", this.ApproverSignTypes);

    }
}

