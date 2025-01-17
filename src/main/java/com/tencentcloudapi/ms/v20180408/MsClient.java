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
package com.tencentcloudapi.ms.v20180408;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.ms.v20180408.models.*;

public class MsClient extends AbstractClient{
    private static String endpoint = "ms.tencentcloudapi.com";
    private static String service = "ms";
    private static String version = "2018-04-08";

    public MsClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public MsClient(Credential credential, String region, ClientProfile profile) {
        super(MsClient.endpoint, MsClient.version, credential, region, profile);
    }

    /**
     *将应用和资源进行绑定。（注意：根据国家互联网用户实名制相关要求，使用该产品前，需先完成实名认证。）
     * @param req CreateBindInstanceRequest
     * @return CreateBindInstanceResponse
     * @throws TencentCloudSDKException
     */
    public CreateBindInstanceResponse CreateBindInstance(CreateBindInstanceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateBindInstanceResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateBindInstanceResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateBindInstance");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取云COS文件存储临时密钥，密钥仅限于临时上传文件，有访问限制和时效性，请保管好临时密钥。
     * @param req CreateCosSecKeyInstanceRequest
     * @return CreateCosSecKeyInstanceResponse
     * @throws TencentCloudSDKException
     */
    public CreateCosSecKeyInstanceResponse CreateCosSecKeyInstance(CreateCosSecKeyInstanceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateCosSecKeyInstanceResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateCosSecKeyInstanceResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateCosSecKeyInstance");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *用户可以使用该接口自建资源，只支持白名单用户
     * @param req CreateResourceInstancesRequest
     * @return CreateResourceInstancesResponse
     * @throws TencentCloudSDKException
     */
    public CreateResourceInstancesResponse CreateResourceInstances(CreateResourceInstancesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateResourceInstancesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateResourceInstancesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateResourceInstances");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *用户通过该接口提交应用进行应用加固，加固后需通过DescribeShieldResult接口查询加固结果。（注意：根据国家互联网用户实名制相关要求，使用该产品前，需先完成实名认证。）
     * @param req CreateShieldInstanceRequest
     * @return CreateShieldInstanceResponse
     * @throws TencentCloudSDKException
     */
    public CreateShieldInstanceResponse CreateShieldInstance(CreateShieldInstanceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateShieldInstanceResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateShieldInstanceResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateShieldInstance");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *对资源进行策略新增。（注意：根据国家互联网用户实名制相关要求，使用该产品前，需先完成实名认证。）
     * @param req CreateShieldPlanInstanceRequest
     * @return CreateShieldPlanInstanceResponse
     * @throws TencentCloudSDKException
     */
    public CreateShieldPlanInstanceResponse CreateShieldPlanInstance(CreateShieldPlanInstanceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateShieldPlanInstanceResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateShieldPlanInstanceResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateShieldPlanInstance");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *删除一个或者多个app加固信息。（注意：根据国家互联网用户实名制相关要求，使用该产品前，需先完成实名认证。）
     * @param req DeleteShieldInstancesRequest
     * @return DeleteShieldInstancesResponse
     * @throws TencentCloudSDKException
     */
    public DeleteShieldInstancesResponse DeleteShieldInstances(DeleteShieldInstancesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteShieldInstancesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteShieldInstancesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteShieldInstances");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *该接口采用同步模式请求腾讯APK云检测服务，即时返回检测数据，需要用户用轮询的方式调用本接口来进行样本送检并获取检测结果(每隔60s发送一次请求，传相同的参数，重试30次)，一般情况下0.5h内会出检测结果，最长时间是3h。当Result为ok并且ResultList数组非空有值时，代表检测完毕，若长时间获取不到检测结果，请联系客服。
     * @param req DescribeApkDetectionResultRequest
     * @return DescribeApkDetectionResultResponse
     * @throws TencentCloudSDKException
     */
    public DescribeApkDetectionResultResponse DescribeApkDetectionResult(DescribeApkDetectionResultRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeApkDetectionResultResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeApkDetectionResultResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeApkDetectionResult");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取某个用户的所有资源信息。（注意：根据国家互联网用户实名制相关要求，使用该产品前，需先完成实名认证。）
     * @param req DescribeResourceInstancesRequest
     * @return DescribeResourceInstancesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeResourceInstancesResponse DescribeResourceInstances(DescribeResourceInstancesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeResourceInstancesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeResourceInstancesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeResourceInstances");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口用于查看app列表。
可以通过指定任务唯一标识ItemId来查询指定app的详细信息，或通过设定过滤器来查询满足过滤条件的app的详细信息。 指定偏移(Offset)和限制(Limit)来选择结果中的一部分，默认返回满足条件的前20个app信息。（注意：根据国家互联网用户实名制相关要求，使用该产品前，需先完成实名认证。）

     * @param req DescribeShieldInstancesRequest
     * @return DescribeShieldInstancesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeShieldInstancesResponse DescribeShieldInstances(DescribeShieldInstancesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeShieldInstancesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeShieldInstancesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeShieldInstances");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询加固策略。（注意：根据国家互联网用户实名制相关要求，使用该产品前，需先完成实名认证。）
     * @param req DescribeShieldPlanInstanceRequest
     * @return DescribeShieldPlanInstanceResponse
     * @throws TencentCloudSDKException
     */
    public DescribeShieldPlanInstanceResponse DescribeShieldPlanInstance(DescribeShieldPlanInstanceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeShieldPlanInstanceResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeShieldPlanInstanceResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeShieldPlanInstance");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *通过唯一标识获取加固的结果。（注意：根据国家互联网用户实名制相关要求，使用该产品前，需先完成实名认证。）
     * @param req DescribeShieldResultRequest
     * @return DescribeShieldResultResponse
     * @throws TencentCloudSDKException
     */
    public DescribeShieldResultResponse DescribeShieldResult(DescribeShieldResultRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeShieldResultResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeShieldResultResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeShieldResult");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *移动安全-网址检测服务
     * @param req DescribeUrlDetectionResultRequest
     * @return DescribeUrlDetectionResultResponse
     * @throws TencentCloudSDKException
     */
    public DescribeUrlDetectionResultResponse DescribeUrlDetectionResult(DescribeUrlDetectionResultRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeUrlDetectionResultResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeUrlDetectionResultResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeUrlDetectionResult");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取用户基础信息
     * @param req DescribeUserBaseInfoInstanceRequest
     * @return DescribeUserBaseInfoInstanceResponse
     * @throws TencentCloudSDKException
     */
    public DescribeUserBaseInfoInstanceResponse DescribeUserBaseInfoInstance(DescribeUserBaseInfoInstanceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeUserBaseInfoInstanceResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeUserBaseInfoInstanceResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeUserBaseInfoInstance");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

}
