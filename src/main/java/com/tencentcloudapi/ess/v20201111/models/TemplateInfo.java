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

public class TemplateInfo extends AbstractModel{

    /**
    * 模板ID
    */
    @SerializedName("TemplateId")
    @Expose
    private String TemplateId;

    /**
    * 模板名字
    */
    @SerializedName("TemplateName")
    @Expose
    private String TemplateName;

    /**
    * 模板描述信息
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 模板关联的资源IDs
    */
    @SerializedName("DocumentResourceIds")
    @Expose
    private String [] DocumentResourceIds;

    /**
    * 返回的文件信息结构
    */
    @SerializedName("FileInfos")
    @Expose
    private FileInfo [] FileInfos;

    /**
    * 附件关联的资源ID是
    */
    @SerializedName("AttachmentResourceIds")
    @Expose
    private String [] AttachmentResourceIds;

    /**
    * 签署顺序
    */
    @SerializedName("SignOrder")
    @Expose
    private Long [] SignOrder;

    /**
    * 签署参与者的信息
    */
    @SerializedName("Recipients")
    @Expose
    private Recipient [] Recipients;

    /**
    * 模板信息结构
    */
    @SerializedName("Components")
    @Expose
    private Component [] Components;

    /**
    * 签署区模板信息结构
    */
    @SerializedName("SignComponents")
    @Expose
    private Component [] SignComponents;

    /**
    * 模板状态(-1:不可用；0:草稿态；1:正式态)
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 模板的创建人
    */
    @SerializedName("Creator")
    @Expose
    private String Creator;

    /**
    * 模板创建的时间戳（精确到秒）
    */
    @SerializedName("CreatedOn")
    @Expose
    private Long CreatedOn;

    /**
    * 发起人角色信息
    */
    @SerializedName("Promoter")
    @Expose
    private Recipient Promoter;

    /**
    * 模板可用状态，取值：1启用（默认），2停用
    */
    @SerializedName("Available")
    @Expose
    private Long Available;

    /**
    * 模板创建组织id
    */
    @SerializedName("OrganizationId")
    @Expose
    private String OrganizationId;

    /**
    * 模板预览链接
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PreviewUrl")
    @Expose
    private String PreviewUrl;

    /**
    * 模板版本。默认为空时，全数字字符，初始版本为yyyyMMdd001。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TemplateVersion")
    @Expose
    private String TemplateVersion;

    /**
    * 模板是否已发布。true-已发布；false-未发布
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Published")
    @Expose
    private Boolean Published;

    /**
     * Get 模板ID 
     * @return TemplateId 模板ID
     */
    public String getTemplateId() {
        return this.TemplateId;
    }

    /**
     * Set 模板ID
     * @param TemplateId 模板ID
     */
    public void setTemplateId(String TemplateId) {
        this.TemplateId = TemplateId;
    }

    /**
     * Get 模板名字 
     * @return TemplateName 模板名字
     */
    public String getTemplateName() {
        return this.TemplateName;
    }

    /**
     * Set 模板名字
     * @param TemplateName 模板名字
     */
    public void setTemplateName(String TemplateName) {
        this.TemplateName = TemplateName;
    }

    /**
     * Get 模板描述信息 
     * @return Description 模板描述信息
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 模板描述信息
     * @param Description 模板描述信息
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 模板关联的资源IDs 
     * @return DocumentResourceIds 模板关联的资源IDs
     */
    public String [] getDocumentResourceIds() {
        return this.DocumentResourceIds;
    }

    /**
     * Set 模板关联的资源IDs
     * @param DocumentResourceIds 模板关联的资源IDs
     */
    public void setDocumentResourceIds(String [] DocumentResourceIds) {
        this.DocumentResourceIds = DocumentResourceIds;
    }

    /**
     * Get 返回的文件信息结构 
     * @return FileInfos 返回的文件信息结构
     */
    public FileInfo [] getFileInfos() {
        return this.FileInfos;
    }

    /**
     * Set 返回的文件信息结构
     * @param FileInfos 返回的文件信息结构
     */
    public void setFileInfos(FileInfo [] FileInfos) {
        this.FileInfos = FileInfos;
    }

    /**
     * Get 附件关联的资源ID是 
     * @return AttachmentResourceIds 附件关联的资源ID是
     */
    public String [] getAttachmentResourceIds() {
        return this.AttachmentResourceIds;
    }

    /**
     * Set 附件关联的资源ID是
     * @param AttachmentResourceIds 附件关联的资源ID是
     */
    public void setAttachmentResourceIds(String [] AttachmentResourceIds) {
        this.AttachmentResourceIds = AttachmentResourceIds;
    }

    /**
     * Get 签署顺序 
     * @return SignOrder 签署顺序
     */
    public Long [] getSignOrder() {
        return this.SignOrder;
    }

    /**
     * Set 签署顺序
     * @param SignOrder 签署顺序
     */
    public void setSignOrder(Long [] SignOrder) {
        this.SignOrder = SignOrder;
    }

    /**
     * Get 签署参与者的信息 
     * @return Recipients 签署参与者的信息
     */
    public Recipient [] getRecipients() {
        return this.Recipients;
    }

    /**
     * Set 签署参与者的信息
     * @param Recipients 签署参与者的信息
     */
    public void setRecipients(Recipient [] Recipients) {
        this.Recipients = Recipients;
    }

    /**
     * Get 模板信息结构 
     * @return Components 模板信息结构
     */
    public Component [] getComponents() {
        return this.Components;
    }

    /**
     * Set 模板信息结构
     * @param Components 模板信息结构
     */
    public void setComponents(Component [] Components) {
        this.Components = Components;
    }

    /**
     * Get 签署区模板信息结构 
     * @return SignComponents 签署区模板信息结构
     */
    public Component [] getSignComponents() {
        return this.SignComponents;
    }

    /**
     * Set 签署区模板信息结构
     * @param SignComponents 签署区模板信息结构
     */
    public void setSignComponents(Component [] SignComponents) {
        this.SignComponents = SignComponents;
    }

    /**
     * Get 模板状态(-1:不可用；0:草稿态；1:正式态) 
     * @return Status 模板状态(-1:不可用；0:草稿态；1:正式态)
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 模板状态(-1:不可用；0:草稿态；1:正式态)
     * @param Status 模板状态(-1:不可用；0:草稿态；1:正式态)
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 模板的创建人 
     * @return Creator 模板的创建人
     */
    public String getCreator() {
        return this.Creator;
    }

    /**
     * Set 模板的创建人
     * @param Creator 模板的创建人
     */
    public void setCreator(String Creator) {
        this.Creator = Creator;
    }

    /**
     * Get 模板创建的时间戳（精确到秒） 
     * @return CreatedOn 模板创建的时间戳（精确到秒）
     */
    public Long getCreatedOn() {
        return this.CreatedOn;
    }

    /**
     * Set 模板创建的时间戳（精确到秒）
     * @param CreatedOn 模板创建的时间戳（精确到秒）
     */
    public void setCreatedOn(Long CreatedOn) {
        this.CreatedOn = CreatedOn;
    }

    /**
     * Get 发起人角色信息 
     * @return Promoter 发起人角色信息
     */
    public Recipient getPromoter() {
        return this.Promoter;
    }

    /**
     * Set 发起人角色信息
     * @param Promoter 发起人角色信息
     */
    public void setPromoter(Recipient Promoter) {
        this.Promoter = Promoter;
    }

    /**
     * Get 模板可用状态，取值：1启用（默认），2停用 
     * @return Available 模板可用状态，取值：1启用（默认），2停用
     */
    public Long getAvailable() {
        return this.Available;
    }

    /**
     * Set 模板可用状态，取值：1启用（默认），2停用
     * @param Available 模板可用状态，取值：1启用（默认），2停用
     */
    public void setAvailable(Long Available) {
        this.Available = Available;
    }

    /**
     * Get 模板创建组织id 
     * @return OrganizationId 模板创建组织id
     */
    public String getOrganizationId() {
        return this.OrganizationId;
    }

    /**
     * Set 模板创建组织id
     * @param OrganizationId 模板创建组织id
     */
    public void setOrganizationId(String OrganizationId) {
        this.OrganizationId = OrganizationId;
    }

    /**
     * Get 模板预览链接
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PreviewUrl 模板预览链接
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPreviewUrl() {
        return this.PreviewUrl;
    }

    /**
     * Set 模板预览链接
注意：此字段可能返回 null，表示取不到有效值。
     * @param PreviewUrl 模板预览链接
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPreviewUrl(String PreviewUrl) {
        this.PreviewUrl = PreviewUrl;
    }

    /**
     * Get 模板版本。默认为空时，全数字字符，初始版本为yyyyMMdd001。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TemplateVersion 模板版本。默认为空时，全数字字符，初始版本为yyyyMMdd001。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTemplateVersion() {
        return this.TemplateVersion;
    }

    /**
     * Set 模板版本。默认为空时，全数字字符，初始版本为yyyyMMdd001。
注意：此字段可能返回 null，表示取不到有效值。
     * @param TemplateVersion 模板版本。默认为空时，全数字字符，初始版本为yyyyMMdd001。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTemplateVersion(String TemplateVersion) {
        this.TemplateVersion = TemplateVersion;
    }

    /**
     * Get 模板是否已发布。true-已发布；false-未发布
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Published 模板是否已发布。true-已发布；false-未发布
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getPublished() {
        return this.Published;
    }

    /**
     * Set 模板是否已发布。true-已发布；false-未发布
注意：此字段可能返回 null，表示取不到有效值。
     * @param Published 模板是否已发布。true-已发布；false-未发布
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPublished(Boolean Published) {
        this.Published = Published;
    }

    public TemplateInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TemplateInfo(TemplateInfo source) {
        if (source.TemplateId != null) {
            this.TemplateId = new String(source.TemplateId);
        }
        if (source.TemplateName != null) {
            this.TemplateName = new String(source.TemplateName);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.DocumentResourceIds != null) {
            this.DocumentResourceIds = new String[source.DocumentResourceIds.length];
            for (int i = 0; i < source.DocumentResourceIds.length; i++) {
                this.DocumentResourceIds[i] = new String(source.DocumentResourceIds[i]);
            }
        }
        if (source.FileInfos != null) {
            this.FileInfos = new FileInfo[source.FileInfos.length];
            for (int i = 0; i < source.FileInfos.length; i++) {
                this.FileInfos[i] = new FileInfo(source.FileInfos[i]);
            }
        }
        if (source.AttachmentResourceIds != null) {
            this.AttachmentResourceIds = new String[source.AttachmentResourceIds.length];
            for (int i = 0; i < source.AttachmentResourceIds.length; i++) {
                this.AttachmentResourceIds[i] = new String(source.AttachmentResourceIds[i]);
            }
        }
        if (source.SignOrder != null) {
            this.SignOrder = new Long[source.SignOrder.length];
            for (int i = 0; i < source.SignOrder.length; i++) {
                this.SignOrder[i] = new Long(source.SignOrder[i]);
            }
        }
        if (source.Recipients != null) {
            this.Recipients = new Recipient[source.Recipients.length];
            for (int i = 0; i < source.Recipients.length; i++) {
                this.Recipients[i] = new Recipient(source.Recipients[i]);
            }
        }
        if (source.Components != null) {
            this.Components = new Component[source.Components.length];
            for (int i = 0; i < source.Components.length; i++) {
                this.Components[i] = new Component(source.Components[i]);
            }
        }
        if (source.SignComponents != null) {
            this.SignComponents = new Component[source.SignComponents.length];
            for (int i = 0; i < source.SignComponents.length; i++) {
                this.SignComponents[i] = new Component(source.SignComponents[i]);
            }
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.Creator != null) {
            this.Creator = new String(source.Creator);
        }
        if (source.CreatedOn != null) {
            this.CreatedOn = new Long(source.CreatedOn);
        }
        if (source.Promoter != null) {
            this.Promoter = new Recipient(source.Promoter);
        }
        if (source.Available != null) {
            this.Available = new Long(source.Available);
        }
        if (source.OrganizationId != null) {
            this.OrganizationId = new String(source.OrganizationId);
        }
        if (source.PreviewUrl != null) {
            this.PreviewUrl = new String(source.PreviewUrl);
        }
        if (source.TemplateVersion != null) {
            this.TemplateVersion = new String(source.TemplateVersion);
        }
        if (source.Published != null) {
            this.Published = new Boolean(source.Published);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TemplateId", this.TemplateId);
        this.setParamSimple(map, prefix + "TemplateName", this.TemplateName);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamArraySimple(map, prefix + "DocumentResourceIds.", this.DocumentResourceIds);
        this.setParamArrayObj(map, prefix + "FileInfos.", this.FileInfos);
        this.setParamArraySimple(map, prefix + "AttachmentResourceIds.", this.AttachmentResourceIds);
        this.setParamArraySimple(map, prefix + "SignOrder.", this.SignOrder);
        this.setParamArrayObj(map, prefix + "Recipients.", this.Recipients);
        this.setParamArrayObj(map, prefix + "Components.", this.Components);
        this.setParamArrayObj(map, prefix + "SignComponents.", this.SignComponents);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Creator", this.Creator);
        this.setParamSimple(map, prefix + "CreatedOn", this.CreatedOn);
        this.setParamObj(map, prefix + "Promoter.", this.Promoter);
        this.setParamSimple(map, prefix + "Available", this.Available);
        this.setParamSimple(map, prefix + "OrganizationId", this.OrganizationId);
        this.setParamSimple(map, prefix + "PreviewUrl", this.PreviewUrl);
        this.setParamSimple(map, prefix + "TemplateVersion", this.TemplateVersion);
        this.setParamSimple(map, prefix + "Published", this.Published);

    }
}

