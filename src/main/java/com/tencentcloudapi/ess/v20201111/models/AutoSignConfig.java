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

public class AutoSignConfig extends AbstractModel{

    /**
    * 自动签开通个人用户的三要素
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UserInfo")
    @Expose
    private UserThreeFactor UserInfo;

    /**
    * 回调链接
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CallbackUrl")
    @Expose
    private String CallbackUrl;

    /**
    * 是否回调证书信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CertInfoCallback")
    @Expose
    private Boolean CertInfoCallback;

    /**
    * 是否支持用户自定义签名印章
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UserDefineSeal")
    @Expose
    private Boolean UserDefineSeal;

    /**
    * 是否需要回调的时候返回印章(签名) 图片的 base64
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SealImgCallback")
    @Expose
    private Boolean SealImgCallback;

    /**
    * 开通时候的验证方式，取值：WEIXINAPP（微信人脸识别），INSIGHT（慧眼人脸认别），TELECOM（运营商三要素验证）。如果是小程序开通链接，支持传 WEIXINAPP / TELECOM。如果是 H5 开通链接，支持传 INSIGHT / TELECOM。默认值 WEIXINAPP / INSIGHT。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("VerifyChannels")
    @Expose
    private String [] VerifyChannels;

    /**
     * Get 自动签开通个人用户的三要素
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UserInfo 自动签开通个人用户的三要素
注意：此字段可能返回 null，表示取不到有效值。
     */
    public UserThreeFactor getUserInfo() {
        return this.UserInfo;
    }

    /**
     * Set 自动签开通个人用户的三要素
注意：此字段可能返回 null，表示取不到有效值。
     * @param UserInfo 自动签开通个人用户的三要素
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUserInfo(UserThreeFactor UserInfo) {
        this.UserInfo = UserInfo;
    }

    /**
     * Get 回调链接
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CallbackUrl 回调链接
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCallbackUrl() {
        return this.CallbackUrl;
    }

    /**
     * Set 回调链接
注意：此字段可能返回 null，表示取不到有效值。
     * @param CallbackUrl 回调链接
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCallbackUrl(String CallbackUrl) {
        this.CallbackUrl = CallbackUrl;
    }

    /**
     * Get 是否回调证书信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CertInfoCallback 是否回调证书信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getCertInfoCallback() {
        return this.CertInfoCallback;
    }

    /**
     * Set 是否回调证书信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param CertInfoCallback 是否回调证书信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCertInfoCallback(Boolean CertInfoCallback) {
        this.CertInfoCallback = CertInfoCallback;
    }

    /**
     * Get 是否支持用户自定义签名印章
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UserDefineSeal 是否支持用户自定义签名印章
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getUserDefineSeal() {
        return this.UserDefineSeal;
    }

    /**
     * Set 是否支持用户自定义签名印章
注意：此字段可能返回 null，表示取不到有效值。
     * @param UserDefineSeal 是否支持用户自定义签名印章
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUserDefineSeal(Boolean UserDefineSeal) {
        this.UserDefineSeal = UserDefineSeal;
    }

    /**
     * Get 是否需要回调的时候返回印章(签名) 图片的 base64
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SealImgCallback 是否需要回调的时候返回印章(签名) 图片的 base64
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getSealImgCallback() {
        return this.SealImgCallback;
    }

    /**
     * Set 是否需要回调的时候返回印章(签名) 图片的 base64
注意：此字段可能返回 null，表示取不到有效值。
     * @param SealImgCallback 是否需要回调的时候返回印章(签名) 图片的 base64
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSealImgCallback(Boolean SealImgCallback) {
        this.SealImgCallback = SealImgCallback;
    }

    /**
     * Get 开通时候的验证方式，取值：WEIXINAPP（微信人脸识别），INSIGHT（慧眼人脸认别），TELECOM（运营商三要素验证）。如果是小程序开通链接，支持传 WEIXINAPP / TELECOM。如果是 H5 开通链接，支持传 INSIGHT / TELECOM。默认值 WEIXINAPP / INSIGHT。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return VerifyChannels 开通时候的验证方式，取值：WEIXINAPP（微信人脸识别），INSIGHT（慧眼人脸认别），TELECOM（运营商三要素验证）。如果是小程序开通链接，支持传 WEIXINAPP / TELECOM。如果是 H5 开通链接，支持传 INSIGHT / TELECOM。默认值 WEIXINAPP / INSIGHT。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getVerifyChannels() {
        return this.VerifyChannels;
    }

    /**
     * Set 开通时候的验证方式，取值：WEIXINAPP（微信人脸识别），INSIGHT（慧眼人脸认别），TELECOM（运营商三要素验证）。如果是小程序开通链接，支持传 WEIXINAPP / TELECOM。如果是 H5 开通链接，支持传 INSIGHT / TELECOM。默认值 WEIXINAPP / INSIGHT。
注意：此字段可能返回 null，表示取不到有效值。
     * @param VerifyChannels 开通时候的验证方式，取值：WEIXINAPP（微信人脸识别），INSIGHT（慧眼人脸认别），TELECOM（运营商三要素验证）。如果是小程序开通链接，支持传 WEIXINAPP / TELECOM。如果是 H5 开通链接，支持传 INSIGHT / TELECOM。默认值 WEIXINAPP / INSIGHT。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVerifyChannels(String [] VerifyChannels) {
        this.VerifyChannels = VerifyChannels;
    }

    public AutoSignConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AutoSignConfig(AutoSignConfig source) {
        if (source.UserInfo != null) {
            this.UserInfo = new UserThreeFactor(source.UserInfo);
        }
        if (source.CallbackUrl != null) {
            this.CallbackUrl = new String(source.CallbackUrl);
        }
        if (source.CertInfoCallback != null) {
            this.CertInfoCallback = new Boolean(source.CertInfoCallback);
        }
        if (source.UserDefineSeal != null) {
            this.UserDefineSeal = new Boolean(source.UserDefineSeal);
        }
        if (source.SealImgCallback != null) {
            this.SealImgCallback = new Boolean(source.SealImgCallback);
        }
        if (source.VerifyChannels != null) {
            this.VerifyChannels = new String[source.VerifyChannels.length];
            for (int i = 0; i < source.VerifyChannels.length; i++) {
                this.VerifyChannels[i] = new String(source.VerifyChannels[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "UserInfo.", this.UserInfo);
        this.setParamSimple(map, prefix + "CallbackUrl", this.CallbackUrl);
        this.setParamSimple(map, prefix + "CertInfoCallback", this.CertInfoCallback);
        this.setParamSimple(map, prefix + "UserDefineSeal", this.UserDefineSeal);
        this.setParamSimple(map, prefix + "SealImgCallback", this.SealImgCallback);
        this.setParamArraySimple(map, prefix + "VerifyChannels.", this.VerifyChannels);

    }
}
