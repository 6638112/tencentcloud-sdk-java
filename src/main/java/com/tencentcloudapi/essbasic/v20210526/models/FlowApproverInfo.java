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
package com.tencentcloudapi.essbasic.v20210526.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class FlowApproverInfo extends AbstractModel{

    /**
    * 签署人姓名，最大长度50个字符
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 签署人身份证件类型
1.ID_CARD 居民身份证
2.HONGKONG_MACAO_AND_TAIWAN 港澳台居民居住证
3.HONGKONG_AND_MACAO 港澳居民来往内地通行证
    */
    @SerializedName("IdCardType")
    @Expose
    private String IdCardType;

    /**
    * 签署人证件号
    */
    @SerializedName("IdCardNumber")
    @Expose
    private String IdCardNumber;

    /**
    * 签署人手机号，脱敏显示。大陆手机号为11位，暂不支持海外手机号。
    */
    @SerializedName("Mobile")
    @Expose
    private String Mobile;

    /**
    * 企业签署方工商营业执照上的企业名称，签署方为非发起方企业场景下必传，最大长度64个字符；
    */
    @SerializedName("OrganizationName")
    @Expose
    private String OrganizationName;

    /**
    * 指定签署人非第三方平台子客企业下员工，在ApproverType为ORGANIZATION时指定。
默认为false，即签署人位于同一个第三方平台应用号下；默认为false，即签署人位于同一个第三方应用号下；
    */
    @SerializedName("NotChannelOrganization")
    @Expose
    private Boolean NotChannelOrganization;

    /**
    * 用户侧第三方id，最大长度64个字符
当签署方为同一第三方平台下的员工时，该字段若不指定，则发起【待领取】的流程
    */
    @SerializedName("OpenId")
    @Expose
    private String OpenId;

    /**
    * 企业签署方在同一第三方平台应用下的其他合作企业OpenId，签署方为非发起方企业场景下必传，最大长度64个字符；
    */
    @SerializedName("OrganizationOpenId")
    @Expose
    private String OrganizationOpenId;

    /**
    * 签署人类型
PERSON-个人/自然人；
PERSON_AUTO_SIGN-个人自动签（定制化场景下使用）；
ORGANIZATION-企业（企业签署方或模板发起时的企业静默签）；
ENTERPRISESERVER-企业静默签（文件发起时的企业静默签字）。
    */
    @SerializedName("ApproverType")
    @Expose
    private String ApproverType;

    /**
    * 签署流程签署人在模板中对应的签署人Id；在非单方签署、以及非B2C签署的场景下必传，用于指定当前签署方在签署流程中的位置；
    */
    @SerializedName("RecipientId")
    @Expose
    private String RecipientId;

    /**
    * 签署截止时间，默认一年
    */
    @SerializedName("Deadline")
    @Expose
    private Long Deadline;

    /**
    * 签署完回调url，最大长度1000个字符
    */
    @SerializedName("CallbackUrl")
    @Expose
    private String CallbackUrl;

    /**
    * 使用PDF文件直接发起合同时，签署人指定的签署控件
    */
    @SerializedName("SignComponents")
    @Expose
    private Component [] SignComponents;

    /**
    * 个人签署方指定签署控件类型，目前支持：OCR_ESIGN -AI智慧手写签名
HANDWRITE -手写签名
    */
    @SerializedName("ComponentLimitType")
    @Expose
    private String [] ComponentLimitType;

    /**
    * 合同的强制预览时间：3~300s，未指定则按合同页数计算
    */
    @SerializedName("PreReadTime")
    @Expose
    private Long PreReadTime;

    /**
    * 签署完前端跳转的url，暂未使用
    */
    @SerializedName("JumpUrl")
    @Expose
    private String JumpUrl;

    /**
    * 签署人个性化能力值
    */
    @SerializedName("ApproverOption")
    @Expose
    private ApproverOption ApproverOption;

    /**
    * 当前签署方进行签署操作是否需要企业内部审批，true 则为需要
    */
    @SerializedName("ApproverNeedSignReview")
    @Expose
    private Boolean ApproverNeedSignReview;

    /**
    * 签署人查看合同时认证方式, 1-实名查看 2-短信验证码查看(企业签署方不支持该方式) 如果不传默认为1
查看合同的认证方式 Flow层级的优先于approver层级的
    */
    @SerializedName("ApproverVerifyTypes")
    @Expose
    private Long [] ApproverVerifyTypes;

    /**
    * 签署人签署合同时的认证方式
1-人脸认证 2-签署密码 3-运营商三要素(默认为1,2)
    */
    @SerializedName("ApproverSignTypes")
    @Expose
    private Long [] ApproverSignTypes;

    /**
     * Get 签署人姓名，最大长度50个字符 
     * @return Name 签署人姓名，最大长度50个字符
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 签署人姓名，最大长度50个字符
     * @param Name 签署人姓名，最大长度50个字符
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 签署人身份证件类型
1.ID_CARD 居民身份证
2.HONGKONG_MACAO_AND_TAIWAN 港澳台居民居住证
3.HONGKONG_AND_MACAO 港澳居民来往内地通行证 
     * @return IdCardType 签署人身份证件类型
1.ID_CARD 居民身份证
2.HONGKONG_MACAO_AND_TAIWAN 港澳台居民居住证
3.HONGKONG_AND_MACAO 港澳居民来往内地通行证
     */
    public String getIdCardType() {
        return this.IdCardType;
    }

    /**
     * Set 签署人身份证件类型
1.ID_CARD 居民身份证
2.HONGKONG_MACAO_AND_TAIWAN 港澳台居民居住证
3.HONGKONG_AND_MACAO 港澳居民来往内地通行证
     * @param IdCardType 签署人身份证件类型
1.ID_CARD 居民身份证
2.HONGKONG_MACAO_AND_TAIWAN 港澳台居民居住证
3.HONGKONG_AND_MACAO 港澳居民来往内地通行证
     */
    public void setIdCardType(String IdCardType) {
        this.IdCardType = IdCardType;
    }

    /**
     * Get 签署人证件号 
     * @return IdCardNumber 签署人证件号
     */
    public String getIdCardNumber() {
        return this.IdCardNumber;
    }

    /**
     * Set 签署人证件号
     * @param IdCardNumber 签署人证件号
     */
    public void setIdCardNumber(String IdCardNumber) {
        this.IdCardNumber = IdCardNumber;
    }

    /**
     * Get 签署人手机号，脱敏显示。大陆手机号为11位，暂不支持海外手机号。 
     * @return Mobile 签署人手机号，脱敏显示。大陆手机号为11位，暂不支持海外手机号。
     */
    public String getMobile() {
        return this.Mobile;
    }

    /**
     * Set 签署人手机号，脱敏显示。大陆手机号为11位，暂不支持海外手机号。
     * @param Mobile 签署人手机号，脱敏显示。大陆手机号为11位，暂不支持海外手机号。
     */
    public void setMobile(String Mobile) {
        this.Mobile = Mobile;
    }

    /**
     * Get 企业签署方工商营业执照上的企业名称，签署方为非发起方企业场景下必传，最大长度64个字符； 
     * @return OrganizationName 企业签署方工商营业执照上的企业名称，签署方为非发起方企业场景下必传，最大长度64个字符；
     */
    public String getOrganizationName() {
        return this.OrganizationName;
    }

    /**
     * Set 企业签署方工商营业执照上的企业名称，签署方为非发起方企业场景下必传，最大长度64个字符；
     * @param OrganizationName 企业签署方工商营业执照上的企业名称，签署方为非发起方企业场景下必传，最大长度64个字符；
     */
    public void setOrganizationName(String OrganizationName) {
        this.OrganizationName = OrganizationName;
    }

    /**
     * Get 指定签署人非第三方平台子客企业下员工，在ApproverType为ORGANIZATION时指定。
默认为false，即签署人位于同一个第三方平台应用号下；默认为false，即签署人位于同一个第三方应用号下； 
     * @return NotChannelOrganization 指定签署人非第三方平台子客企业下员工，在ApproverType为ORGANIZATION时指定。
默认为false，即签署人位于同一个第三方平台应用号下；默认为false，即签署人位于同一个第三方应用号下；
     */
    public Boolean getNotChannelOrganization() {
        return this.NotChannelOrganization;
    }

    /**
     * Set 指定签署人非第三方平台子客企业下员工，在ApproverType为ORGANIZATION时指定。
默认为false，即签署人位于同一个第三方平台应用号下；默认为false，即签署人位于同一个第三方应用号下；
     * @param NotChannelOrganization 指定签署人非第三方平台子客企业下员工，在ApproverType为ORGANIZATION时指定。
默认为false，即签署人位于同一个第三方平台应用号下；默认为false，即签署人位于同一个第三方应用号下；
     */
    public void setNotChannelOrganization(Boolean NotChannelOrganization) {
        this.NotChannelOrganization = NotChannelOrganization;
    }

    /**
     * Get 用户侧第三方id，最大长度64个字符
当签署方为同一第三方平台下的员工时，该字段若不指定，则发起【待领取】的流程 
     * @return OpenId 用户侧第三方id，最大长度64个字符
当签署方为同一第三方平台下的员工时，该字段若不指定，则发起【待领取】的流程
     */
    public String getOpenId() {
        return this.OpenId;
    }

    /**
     * Set 用户侧第三方id，最大长度64个字符
当签署方为同一第三方平台下的员工时，该字段若不指定，则发起【待领取】的流程
     * @param OpenId 用户侧第三方id，最大长度64个字符
当签署方为同一第三方平台下的员工时，该字段若不指定，则发起【待领取】的流程
     */
    public void setOpenId(String OpenId) {
        this.OpenId = OpenId;
    }

    /**
     * Get 企业签署方在同一第三方平台应用下的其他合作企业OpenId，签署方为非发起方企业场景下必传，最大长度64个字符； 
     * @return OrganizationOpenId 企业签署方在同一第三方平台应用下的其他合作企业OpenId，签署方为非发起方企业场景下必传，最大长度64个字符；
     */
    public String getOrganizationOpenId() {
        return this.OrganizationOpenId;
    }

    /**
     * Set 企业签署方在同一第三方平台应用下的其他合作企业OpenId，签署方为非发起方企业场景下必传，最大长度64个字符；
     * @param OrganizationOpenId 企业签署方在同一第三方平台应用下的其他合作企业OpenId，签署方为非发起方企业场景下必传，最大长度64个字符；
     */
    public void setOrganizationOpenId(String OrganizationOpenId) {
        this.OrganizationOpenId = OrganizationOpenId;
    }

    /**
     * Get 签署人类型
PERSON-个人/自然人；
PERSON_AUTO_SIGN-个人自动签（定制化场景下使用）；
ORGANIZATION-企业（企业签署方或模板发起时的企业静默签）；
ENTERPRISESERVER-企业静默签（文件发起时的企业静默签字）。 
     * @return ApproverType 签署人类型
PERSON-个人/自然人；
PERSON_AUTO_SIGN-个人自动签（定制化场景下使用）；
ORGANIZATION-企业（企业签署方或模板发起时的企业静默签）；
ENTERPRISESERVER-企业静默签（文件发起时的企业静默签字）。
     */
    public String getApproverType() {
        return this.ApproverType;
    }

    /**
     * Set 签署人类型
PERSON-个人/自然人；
PERSON_AUTO_SIGN-个人自动签（定制化场景下使用）；
ORGANIZATION-企业（企业签署方或模板发起时的企业静默签）；
ENTERPRISESERVER-企业静默签（文件发起时的企业静默签字）。
     * @param ApproverType 签署人类型
PERSON-个人/自然人；
PERSON_AUTO_SIGN-个人自动签（定制化场景下使用）；
ORGANIZATION-企业（企业签署方或模板发起时的企业静默签）；
ENTERPRISESERVER-企业静默签（文件发起时的企业静默签字）。
     */
    public void setApproverType(String ApproverType) {
        this.ApproverType = ApproverType;
    }

    /**
     * Get 签署流程签署人在模板中对应的签署人Id；在非单方签署、以及非B2C签署的场景下必传，用于指定当前签署方在签署流程中的位置； 
     * @return RecipientId 签署流程签署人在模板中对应的签署人Id；在非单方签署、以及非B2C签署的场景下必传，用于指定当前签署方在签署流程中的位置；
     */
    public String getRecipientId() {
        return this.RecipientId;
    }

    /**
     * Set 签署流程签署人在模板中对应的签署人Id；在非单方签署、以及非B2C签署的场景下必传，用于指定当前签署方在签署流程中的位置；
     * @param RecipientId 签署流程签署人在模板中对应的签署人Id；在非单方签署、以及非B2C签署的场景下必传，用于指定当前签署方在签署流程中的位置；
     */
    public void setRecipientId(String RecipientId) {
        this.RecipientId = RecipientId;
    }

    /**
     * Get 签署截止时间，默认一年 
     * @return Deadline 签署截止时间，默认一年
     */
    public Long getDeadline() {
        return this.Deadline;
    }

    /**
     * Set 签署截止时间，默认一年
     * @param Deadline 签署截止时间，默认一年
     */
    public void setDeadline(Long Deadline) {
        this.Deadline = Deadline;
    }

    /**
     * Get 签署完回调url，最大长度1000个字符 
     * @return CallbackUrl 签署完回调url，最大长度1000个字符
     */
    public String getCallbackUrl() {
        return this.CallbackUrl;
    }

    /**
     * Set 签署完回调url，最大长度1000个字符
     * @param CallbackUrl 签署完回调url，最大长度1000个字符
     */
    public void setCallbackUrl(String CallbackUrl) {
        this.CallbackUrl = CallbackUrl;
    }

    /**
     * Get 使用PDF文件直接发起合同时，签署人指定的签署控件 
     * @return SignComponents 使用PDF文件直接发起合同时，签署人指定的签署控件
     */
    public Component [] getSignComponents() {
        return this.SignComponents;
    }

    /**
     * Set 使用PDF文件直接发起合同时，签署人指定的签署控件
     * @param SignComponents 使用PDF文件直接发起合同时，签署人指定的签署控件
     */
    public void setSignComponents(Component [] SignComponents) {
        this.SignComponents = SignComponents;
    }

    /**
     * Get 个人签署方指定签署控件类型，目前支持：OCR_ESIGN -AI智慧手写签名
HANDWRITE -手写签名 
     * @return ComponentLimitType 个人签署方指定签署控件类型，目前支持：OCR_ESIGN -AI智慧手写签名
HANDWRITE -手写签名
     */
    public String [] getComponentLimitType() {
        return this.ComponentLimitType;
    }

    /**
     * Set 个人签署方指定签署控件类型，目前支持：OCR_ESIGN -AI智慧手写签名
HANDWRITE -手写签名
     * @param ComponentLimitType 个人签署方指定签署控件类型，目前支持：OCR_ESIGN -AI智慧手写签名
HANDWRITE -手写签名
     */
    public void setComponentLimitType(String [] ComponentLimitType) {
        this.ComponentLimitType = ComponentLimitType;
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
     * Get 签署完前端跳转的url，暂未使用 
     * @return JumpUrl 签署完前端跳转的url，暂未使用
     */
    public String getJumpUrl() {
        return this.JumpUrl;
    }

    /**
     * Set 签署完前端跳转的url，暂未使用
     * @param JumpUrl 签署完前端跳转的url，暂未使用
     */
    public void setJumpUrl(String JumpUrl) {
        this.JumpUrl = JumpUrl;
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
     * Get 当前签署方进行签署操作是否需要企业内部审批，true 则为需要 
     * @return ApproverNeedSignReview 当前签署方进行签署操作是否需要企业内部审批，true 则为需要
     */
    public Boolean getApproverNeedSignReview() {
        return this.ApproverNeedSignReview;
    }

    /**
     * Set 当前签署方进行签署操作是否需要企业内部审批，true 则为需要
     * @param ApproverNeedSignReview 当前签署方进行签署操作是否需要企业内部审批，true 则为需要
     */
    public void setApproverNeedSignReview(Boolean ApproverNeedSignReview) {
        this.ApproverNeedSignReview = ApproverNeedSignReview;
    }

    /**
     * Get 签署人查看合同时认证方式, 1-实名查看 2-短信验证码查看(企业签署方不支持该方式) 如果不传默认为1
查看合同的认证方式 Flow层级的优先于approver层级的 
     * @return ApproverVerifyTypes 签署人查看合同时认证方式, 1-实名查看 2-短信验证码查看(企业签署方不支持该方式) 如果不传默认为1
查看合同的认证方式 Flow层级的优先于approver层级的
     */
    public Long [] getApproverVerifyTypes() {
        return this.ApproverVerifyTypes;
    }

    /**
     * Set 签署人查看合同时认证方式, 1-实名查看 2-短信验证码查看(企业签署方不支持该方式) 如果不传默认为1
查看合同的认证方式 Flow层级的优先于approver层级的
     * @param ApproverVerifyTypes 签署人查看合同时认证方式, 1-实名查看 2-短信验证码查看(企业签署方不支持该方式) 如果不传默认为1
查看合同的认证方式 Flow层级的优先于approver层级的
     */
    public void setApproverVerifyTypes(Long [] ApproverVerifyTypes) {
        this.ApproverVerifyTypes = ApproverVerifyTypes;
    }

    /**
     * Get 签署人签署合同时的认证方式
1-人脸认证 2-签署密码 3-运营商三要素(默认为1,2) 
     * @return ApproverSignTypes 签署人签署合同时的认证方式
1-人脸认证 2-签署密码 3-运营商三要素(默认为1,2)
     */
    public Long [] getApproverSignTypes() {
        return this.ApproverSignTypes;
    }

    /**
     * Set 签署人签署合同时的认证方式
1-人脸认证 2-签署密码 3-运营商三要素(默认为1,2)
     * @param ApproverSignTypes 签署人签署合同时的认证方式
1-人脸认证 2-签署密码 3-运营商三要素(默认为1,2)
     */
    public void setApproverSignTypes(Long [] ApproverSignTypes) {
        this.ApproverSignTypes = ApproverSignTypes;
    }

    public FlowApproverInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public FlowApproverInfo(FlowApproverInfo source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.IdCardType != null) {
            this.IdCardType = new String(source.IdCardType);
        }
        if (source.IdCardNumber != null) {
            this.IdCardNumber = new String(source.IdCardNumber);
        }
        if (source.Mobile != null) {
            this.Mobile = new String(source.Mobile);
        }
        if (source.OrganizationName != null) {
            this.OrganizationName = new String(source.OrganizationName);
        }
        if (source.NotChannelOrganization != null) {
            this.NotChannelOrganization = new Boolean(source.NotChannelOrganization);
        }
        if (source.OpenId != null) {
            this.OpenId = new String(source.OpenId);
        }
        if (source.OrganizationOpenId != null) {
            this.OrganizationOpenId = new String(source.OrganizationOpenId);
        }
        if (source.ApproverType != null) {
            this.ApproverType = new String(source.ApproverType);
        }
        if (source.RecipientId != null) {
            this.RecipientId = new String(source.RecipientId);
        }
        if (source.Deadline != null) {
            this.Deadline = new Long(source.Deadline);
        }
        if (source.CallbackUrl != null) {
            this.CallbackUrl = new String(source.CallbackUrl);
        }
        if (source.SignComponents != null) {
            this.SignComponents = new Component[source.SignComponents.length];
            for (int i = 0; i < source.SignComponents.length; i++) {
                this.SignComponents[i] = new Component(source.SignComponents[i]);
            }
        }
        if (source.ComponentLimitType != null) {
            this.ComponentLimitType = new String[source.ComponentLimitType.length];
            for (int i = 0; i < source.ComponentLimitType.length; i++) {
                this.ComponentLimitType[i] = new String(source.ComponentLimitType[i]);
            }
        }
        if (source.PreReadTime != null) {
            this.PreReadTime = new Long(source.PreReadTime);
        }
        if (source.JumpUrl != null) {
            this.JumpUrl = new String(source.JumpUrl);
        }
        if (source.ApproverOption != null) {
            this.ApproverOption = new ApproverOption(source.ApproverOption);
        }
        if (source.ApproverNeedSignReview != null) {
            this.ApproverNeedSignReview = new Boolean(source.ApproverNeedSignReview);
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
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "IdCardType", this.IdCardType);
        this.setParamSimple(map, prefix + "IdCardNumber", this.IdCardNumber);
        this.setParamSimple(map, prefix + "Mobile", this.Mobile);
        this.setParamSimple(map, prefix + "OrganizationName", this.OrganizationName);
        this.setParamSimple(map, prefix + "NotChannelOrganization", this.NotChannelOrganization);
        this.setParamSimple(map, prefix + "OpenId", this.OpenId);
        this.setParamSimple(map, prefix + "OrganizationOpenId", this.OrganizationOpenId);
        this.setParamSimple(map, prefix + "ApproverType", this.ApproverType);
        this.setParamSimple(map, prefix + "RecipientId", this.RecipientId);
        this.setParamSimple(map, prefix + "Deadline", this.Deadline);
        this.setParamSimple(map, prefix + "CallbackUrl", this.CallbackUrl);
        this.setParamArrayObj(map, prefix + "SignComponents.", this.SignComponents);
        this.setParamArraySimple(map, prefix + "ComponentLimitType.", this.ComponentLimitType);
        this.setParamSimple(map, prefix + "PreReadTime", this.PreReadTime);
        this.setParamSimple(map, prefix + "JumpUrl", this.JumpUrl);
        this.setParamObj(map, prefix + "ApproverOption.", this.ApproverOption);
        this.setParamSimple(map, prefix + "ApproverNeedSignReview", this.ApproverNeedSignReview);
        this.setParamArraySimple(map, prefix + "ApproverVerifyTypes.", this.ApproverVerifyTypes);
        this.setParamArraySimple(map, prefix + "ApproverSignTypes.", this.ApproverSignTypes);

    }
}

