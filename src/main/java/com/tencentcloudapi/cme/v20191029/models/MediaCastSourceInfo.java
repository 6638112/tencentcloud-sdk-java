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
package com.tencentcloudapi.cme.v20191029.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MediaCastSourceInfo extends AbstractModel{

    /**
    * 输入源 Id，由系统分配。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * 输入源的媒体类型，取值有：
<li>CME：多媒体创作引擎的媒体文件；</li>
<li>VOD：云点播的媒资文件。</li>
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 云点播媒体文件 ID。当 Type = VOD 时必填。
    */
    @SerializedName("FileId")
    @Expose
    private String FileId;

    /**
    * 多媒体创作引擎的媒体 ID。当 Type = CME  时必填。
    */
    @SerializedName("MaterialId")
    @Expose
    private String MaterialId;

    /**
     * Get 输入源 Id，由系统分配。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Id 输入源 Id，由系统分配。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set 输入源 Id，由系统分配。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Id 输入源 Id，由系统分配。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get 输入源的媒体类型，取值有：
<li>CME：多媒体创作引擎的媒体文件；</li>
<li>VOD：云点播的媒资文件。</li> 
     * @return Type 输入源的媒体类型，取值有：
<li>CME：多媒体创作引擎的媒体文件；</li>
<li>VOD：云点播的媒资文件。</li>
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 输入源的媒体类型，取值有：
<li>CME：多媒体创作引擎的媒体文件；</li>
<li>VOD：云点播的媒资文件。</li>
     * @param Type 输入源的媒体类型，取值有：
<li>CME：多媒体创作引擎的媒体文件；</li>
<li>VOD：云点播的媒资文件。</li>
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 云点播媒体文件 ID。当 Type = VOD 时必填。 
     * @return FileId 云点播媒体文件 ID。当 Type = VOD 时必填。
     */
    public String getFileId() {
        return this.FileId;
    }

    /**
     * Set 云点播媒体文件 ID。当 Type = VOD 时必填。
     * @param FileId 云点播媒体文件 ID。当 Type = VOD 时必填。
     */
    public void setFileId(String FileId) {
        this.FileId = FileId;
    }

    /**
     * Get 多媒体创作引擎的媒体 ID。当 Type = CME  时必填。 
     * @return MaterialId 多媒体创作引擎的媒体 ID。当 Type = CME  时必填。
     */
    public String getMaterialId() {
        return this.MaterialId;
    }

    /**
     * Set 多媒体创作引擎的媒体 ID。当 Type = CME  时必填。
     * @param MaterialId 多媒体创作引擎的媒体 ID。当 Type = CME  时必填。
     */
    public void setMaterialId(String MaterialId) {
        this.MaterialId = MaterialId;
    }

    public MediaCastSourceInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MediaCastSourceInfo(MediaCastSourceInfo source) {
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.FileId != null) {
            this.FileId = new String(source.FileId);
        }
        if (source.MaterialId != null) {
            this.MaterialId = new String(source.MaterialId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "FileId", this.FileId);
        this.setParamSimple(map, prefix + "MaterialId", this.MaterialId);

    }
}

