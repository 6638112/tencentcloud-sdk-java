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
package com.tencentcloudapi.tse.v20201207.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class EngineRegionInfo extends AbstractModel{

    /**
    * 引擎节点所在地域
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EngineRegion")
    @Expose
    private String EngineRegion;

    /**
    * 此地域节点分配数量
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Replica")
    @Expose
    private Long Replica;

    /**
    * 集群网络信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("VpcInfos")
    @Expose
    private VpcInfo [] VpcInfos;

    /**
     * Get 引擎节点所在地域
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EngineRegion 引擎节点所在地域
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getEngineRegion() {
        return this.EngineRegion;
    }

    /**
     * Set 引擎节点所在地域
注意：此字段可能返回 null，表示取不到有效值。
     * @param EngineRegion 引擎节点所在地域
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEngineRegion(String EngineRegion) {
        this.EngineRegion = EngineRegion;
    }

    /**
     * Get 此地域节点分配数量
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Replica 此地域节点分配数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getReplica() {
        return this.Replica;
    }

    /**
     * Set 此地域节点分配数量
注意：此字段可能返回 null，表示取不到有效值。
     * @param Replica 此地域节点分配数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setReplica(Long Replica) {
        this.Replica = Replica;
    }

    /**
     * Get 集群网络信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return VpcInfos 集群网络信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public VpcInfo [] getVpcInfos() {
        return this.VpcInfos;
    }

    /**
     * Set 集群网络信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param VpcInfos 集群网络信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVpcInfos(VpcInfo [] VpcInfos) {
        this.VpcInfos = VpcInfos;
    }

    public EngineRegionInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public EngineRegionInfo(EngineRegionInfo source) {
        if (source.EngineRegion != null) {
            this.EngineRegion = new String(source.EngineRegion);
        }
        if (source.Replica != null) {
            this.Replica = new Long(source.Replica);
        }
        if (source.VpcInfos != null) {
            this.VpcInfos = new VpcInfo[source.VpcInfos.length];
            for (int i = 0; i < source.VpcInfos.length; i++) {
                this.VpcInfos[i] = new VpcInfo(source.VpcInfos[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EngineRegion", this.EngineRegion);
        this.setParamSimple(map, prefix + "Replica", this.Replica);
        this.setParamArrayObj(map, prefix + "VpcInfos.", this.VpcInfos);

    }
}
