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
package com.tencentcloudapi.ess.v20201111;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.ess.v20201111.models.*;

public class EssClient extends AbstractClient{
    private static String endpoint = "ess.tencentcloudapi.com";
    private static String service = "ess";
    private static String version = "2020-11-11";

    public EssClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public EssClient(Credential credential, String region, ClientProfile profile) {
        super(EssClient.endpoint, EssClient.version, credential, region, profile);
    }

    /**
     *将电子签系统员工userId与客户系统员工openId进行绑定
     * @param req BindEmployeeUserIdWithClientOpenIdRequest
     * @return BindEmployeeUserIdWithClientOpenIdResponse
     * @throws TencentCloudSDKException
     */
    public BindEmployeeUserIdWithClientOpenIdResponse BindEmployeeUserIdWithClientOpenId(BindEmployeeUserIdWithClientOpenIdRequest req) throws TencentCloudSDKException{
        JsonResponseModel<BindEmployeeUserIdWithClientOpenIdResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<BindEmployeeUserIdWithClientOpenIdResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "BindEmployeeUserIdWithClientOpenId");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *用于撤销签署流程
适用场景：如果某个合同流程当前至少还有一方没有签署，则可通过该接口取消该合同流程。常用于合同发错、内容填错，需要及时撤销的场景。
注：如果合同流程中的参与方均已签署完毕，则无法通过该接口撤销合同。
     * @param req CancelFlowRequest
     * @return CancelFlowResponse
     * @throws TencentCloudSDKException
     */
    public CancelFlowResponse CancelFlow(CancelFlowRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CancelFlowResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CancelFlowResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CancelFlow");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *此接口（CancelMultiFlowSignQRCode）用于取消一码多扫二维码。该接口对传入的二维码ID，若还在有效期内，可以提前失效。
     * @param req CancelMultiFlowSignQRCodeRequest
     * @return CancelMultiFlowSignQRCodeResponse
     * @throws TencentCloudSDKException
     */
    public CancelMultiFlowSignQRCodeResponse CancelMultiFlowSignQRCode(CancelMultiFlowSignQRCodeRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CancelMultiFlowSignQRCodeResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CancelMultiFlowSignQRCodeResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CancelMultiFlowSignQRCode");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *注：此接口建会废弃，请使用撤销单个签署流程（CancelFlow）接口。
指定需要批量撤回的签署流程Id，获取批量撤销链接。
客户指定需要撤回的签署流程Id，最多100个，超过100不处理；接口调用成功返回批量撤回合同的链接，通过链接跳转到电子签小程序完成批量撤回。
     * @param req CreateBatchCancelFlowUrlRequest
     * @return CreateBatchCancelFlowUrlResponse
     * @throws TencentCloudSDKException
     */
    public CreateBatchCancelFlowUrlResponse CreateBatchCancelFlowUrl(CreateBatchCancelFlowUrlRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateBatchCancelFlowUrlResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateBatchCancelFlowUrlResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateBatchCancelFlowUrl");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *生成子客编辑企业信息二维码
     * @param req CreateChannelSubOrganizationModifyQrCodeRequest
     * @return CreateChannelSubOrganizationModifyQrCodeResponse
     * @throws TencentCloudSDKException
     */
    public CreateChannelSubOrganizationModifyQrCodeResponse CreateChannelSubOrganizationModifyQrCode(CreateChannelSubOrganizationModifyQrCodeRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateChannelSubOrganizationModifyQrCodeResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateChannelSubOrganizationModifyQrCodeResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateChannelSubOrganizationModifyQrCode");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *上传了word、excel文件后，通过该接口发起文件转换任务，将word、excel文件转换为pdf文件。
     * @param req CreateConvertTaskApiRequest
     * @return CreateConvertTaskApiResponse
     * @throws TencentCloudSDKException
     */
    public CreateConvertTaskApiResponse CreateConvertTaskApi(CreateConvertTaskApiRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateConvertTaskApiResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateConvertTaskApiResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateConvertTaskApi");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *创建签署流程电子文档
适用场景：见创建签署流程接口。
注：该接口需要给对应的流程指定一个模板id，并且填充该模板中需要补充的信息。是“发起流程”接口的前置接口。
     * @param req CreateDocumentRequest
     * @return CreateDocumentResponse
     * @throws TencentCloudSDKException
     */
    public CreateDocumentResponse CreateDocument(CreateDocumentRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateDocumentResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateDocumentResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateDocument");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *通过模板创建签署流程
适用场景：在标准制式的合同场景中，可通过提前预制好模板文件，每次调用模板文件的id，补充合同内容信息及签署信息生成电子合同。
注：该接口是通过模板生成合同流程的前置接口，先创建一个不包含签署文件的流程。配合“创建电子文档”接口和“发起流程”接口使用。
     * @param req CreateFlowRequest
     * @return CreateFlowResponse
     * @throws TencentCloudSDKException
     */
    public CreateFlowResponse CreateFlow(CreateFlowRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateFlowResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateFlowResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateFlow");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *补充签署流程本企业签署人信息
适用场景：在通过模板或者文件发起合同时，若未指定本企业签署人信息，则流程发起后，可以调用此接口补充签署人。
同一签署人可以补充多个员工作为候选签署人,最终签署人取决于谁先领取合同完成签署。

注：目前暂时只支持补充来源于企业微信的员工作为候选签署人
     * @param req CreateFlowApproversRequest
     * @return CreateFlowApproversResponse
     * @throws TencentCloudSDKException
     */
    public CreateFlowApproversResponse CreateFlowApprovers(CreateFlowApproversRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateFlowApproversResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateFlowApproversResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateFlowApprovers");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *此接口（CreateFlowByFiles）用来通过上传后的pdf资源编号来创建待签署的合同流程。
适用场景1：适用非制式的合同文件签署。一般开发者自己有完整的签署文件，可以通过该接口传入完整的PDF文件及流程信息生成待签署的合同流程。
适用场景2：可通过该接口传入制式合同文件，同时在指定位置添加签署控件。可以起到接口创建临时模板的效果。如果是标准的制式文件，建议使用模板功能生成模板ID进行合同流程的生成。
注意事项：该接口需要依赖“多文件上传”接口生成pdf资源编号（FileIds）进行使用。
     * @param req CreateFlowByFilesRequest
     * @return CreateFlowByFilesResponse
     * @throws TencentCloudSDKException
     */
    public CreateFlowByFilesResponse CreateFlowByFiles(CreateFlowByFilesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateFlowByFilesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateFlowByFilesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateFlowByFiles");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *创建出证报告，返回报告 ID。需要配合出证套餐才能调用。
出证需要一定时间，建议调用创建出证24小时之后再通过DescribeFlowEvidenceReport进行查询。
     * @param req CreateFlowEvidenceReportRequest
     * @return CreateFlowEvidenceReportResponse
     * @throws TencentCloudSDKException
     */
    public CreateFlowEvidenceReportResponse CreateFlowEvidenceReport(CreateFlowEvidenceReportRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateFlowEvidenceReportResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateFlowEvidenceReportResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateFlowEvidenceReport");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *指定需要批量催办的签署流程Id，批量催办合同，最多100个; 接口失败后返回错误信息
注意:
该接口不可直接调用，请联系客户经理申请使用
仅能催办当前状态为“待签署”的签署人，且只能催办一次
发起合同时，签署人的NotifyType需设置为sms，否则无法催办
     * @param req CreateFlowRemindsRequest
     * @return CreateFlowRemindsResponse
     * @throws TencentCloudSDKException
     */
    public CreateFlowRemindsResponse CreateFlowReminds(CreateFlowRemindsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateFlowRemindsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateFlowRemindsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateFlowReminds");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *提交企业签署流程审批结果
适用场景: 
在通过接口(CreateFlow 或者CreateFlowByFiles)创建签署流程时，若指定了参数 NeedSignReview 为true，且发起方企业作为签署方参与了流程签署，则可以调用此接口提交企业内部签署审批结果。
若签署流程状态正常，且本企业存在签署方未签署，同一签署流程可以多次提交签署审批结果，签署时的最后一个“审批结果”有效。

     * @param req CreateFlowSignReviewRequest
     * @return CreateFlowSignReviewResponse
     * @throws TencentCloudSDKException
     */
    public CreateFlowSignReviewResponse CreateFlowSignReview(CreateFlowSignReviewRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateFlowSignReviewResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateFlowSignReviewResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateFlowSignReview");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *创建集成页面签署链接，请联系客户经理申请使用
     * @param req CreateFlowSignUrlRequest
     * @return CreateFlowSignUrlResponse
     * @throws TencentCloudSDKException
     */
    public CreateFlowSignUrlResponse CreateFlowSignUrl(CreateFlowSignUrlRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateFlowSignUrlResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateFlowSignUrlResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateFlowSignUrl");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *创建员工,如需在此接口提醒员工实名，入参Employees的OpenId不传
     * @param req CreateIntegrationEmployeesRequest
     * @return CreateIntegrationEmployeesResponse
     * @throws TencentCloudSDKException
     */
    public CreateIntegrationEmployeesResponse CreateIntegrationEmployees(CreateIntegrationEmployeesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateIntegrationEmployeesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateIntegrationEmployeesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateIntegrationEmployees");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *绑定员工与对应角色
     * @param req CreateIntegrationUserRolesRequest
     * @return CreateIntegrationUserRolesResponse
     * @throws TencentCloudSDKException
     */
    public CreateIntegrationUserRolesResponse CreateIntegrationUserRoles(CreateIntegrationUserRolesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateIntegrationUserRolesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateIntegrationUserRolesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateIntegrationUserRoles");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *此接口（CreateMultiFlowSignQRCode）用于创建一码多扫流程签署二维码。
适用场景：无需填写签署人信息，可通过模板id生成签署二维码，签署人可通过扫描二维码补充签署信息进行实名签署。常用于提前不知道签署人的身份信息场景，例如：劳务工招工、大批量员工入职等场景。

**本接口适用于发起方没有填写控件的 B2C或者单C模板**

**若是B2C模板,还要满足以下任意一个条件**
- 模板中配置的签署顺序是无序
- B端企业的签署方式是静默签署
- B端企业是非首位签署
     * @param req CreateMultiFlowSignQRCodeRequest
     * @return CreateMultiFlowSignQRCodeResponse
     * @throws TencentCloudSDKException
     */
    public CreateMultiFlowSignQRCodeResponse CreateMultiFlowSignQRCode(CreateMultiFlowSignQRCodeRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateMultiFlowSignQRCodeResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateMultiFlowSignQRCodeResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateMultiFlowSignQRCode");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *创建快速发起流程
适用场景：用户通过API 合同文件及签署信息，并可通过我们返回的URL在页面完成签署控件等信息的编辑与确认，快速发起合同.
注：该接口文件的resourceId 是通过上传文件之后获取的。
     * @param req CreatePrepareFlowRequest
     * @return CreatePrepareFlowResponse
     * @throws TencentCloudSDKException
     */
    public CreatePrepareFlowResponse CreatePrepareFlow(CreatePrepareFlowRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreatePrepareFlowResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreatePrepareFlowResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreatePrepareFlow");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（CreatePreparedPersonalEsign）用于创建导入个人印章（处方单场景专用，在开通个人自动签之后调用，使用此接口请与客户经理确认）。
     * @param req CreatePreparedPersonalEsignRequest
     * @return CreatePreparedPersonalEsignResponse
     * @throws TencentCloudSDKException
     */
    public CreatePreparedPersonalEsignResponse CreatePreparedPersonalEsign(CreatePreparedPersonalEsignRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreatePreparedPersonalEsignResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreatePreparedPersonalEsignResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreatePreparedPersonalEsign");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *发起解除协议，主要应用场景为：基于一份已经签署的合同(签署流程)，进行解除操作。
     * @param req CreateReleaseFlowRequest
     * @return CreateReleaseFlowResponse
     * @throws TencentCloudSDKException
     */
    public CreateReleaseFlowResponse CreateReleaseFlow(CreateReleaseFlowRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateReleaseFlowResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateReleaseFlowResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateReleaseFlow");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取小程序签署链接

适用场景：如果需要签署人在自己的APP、小程序、H5应用中签署，可以通过此接口获取跳转腾讯电子签小程序的签署跳转链接。

注：如果签署人是在PC端扫码签署，可以通过生成跳转链接自主转换成二维码，让签署人在PC端扫码签署。


跳转到小程序的实现，参考官方文档（分为<a href="https://developers.weixin.qq.com/miniprogram/dev/api/navigate/wx.navigateToMiniProgram.html">全屏</a>、<a href="https://developers.weixin.qq.com/miniprogram/dev/framework/open-ability/openEmbeddedMiniProgram.html">半屏</a>两种方式）


如您需要自主配置小程序跳转链接，请参考: <a href="https://cloud.tencent.com/document/product/1323/74774">跳转小程序链接配置说明</a>
     * @param req CreateSchemeUrlRequest
     * @return CreateSchemeUrlResponse
     * @throws TencentCloudSDKException
     */
    public CreateSchemeUrlResponse CreateSchemeUrl(CreateSchemeUrlRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateSchemeUrlResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateSchemeUrlResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateSchemeUrl");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *对企业员工进行印章授权
     * @param req CreateSealPolicyRequest
     * @return CreateSealPolicyResponse
     * @throws TencentCloudSDKException
     */
    public CreateSealPolicyResponse CreateSealPolicy(CreateSealPolicyRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateSealPolicyResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateSealPolicyResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateSealPolicy");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *企业方可以通过此接口获取个人用户开启自动签的跳转链接（处方单场景专用，使用此接口请与客户经理确认）
     * @param req CreateUserAutoSignEnableUrlRequest
     * @return CreateUserAutoSignEnableUrlResponse
     * @throws TencentCloudSDKException
     */
    public CreateUserAutoSignEnableUrlResponse CreateUserAutoSignEnableUrl(CreateUserAutoSignEnableUrlRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateUserAutoSignEnableUrlResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateUserAutoSignEnableUrlResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateUserAutoSignEnableUrl");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *移除员工
     * @param req DeleteIntegrationEmployeesRequest
     * @return DeleteIntegrationEmployeesResponse
     * @throws TencentCloudSDKException
     */
    public DeleteIntegrationEmployeesResponse DeleteIntegrationEmployees(DeleteIntegrationEmployeesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteIntegrationEmployeesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteIntegrationEmployeesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteIntegrationEmployees");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *解绑员工与对应角色关系
     * @param req DeleteIntegrationRoleUsersRequest
     * @return DeleteIntegrationRoleUsersResponse
     * @throws TencentCloudSDKException
     */
    public DeleteIntegrationRoleUsersResponse DeleteIntegrationRoleUsers(DeleteIntegrationRoleUsersRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteIntegrationRoleUsersResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteIntegrationRoleUsersResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteIntegrationRoleUsers");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *撤销员工持有的印章权限
     * @param req DeleteSealPoliciesRequest
     * @return DeleteSealPoliciesResponse
     * @throws TencentCloudSDKException
     */
    public DeleteSealPoliciesResponse DeleteSealPolicies(DeleteSealPoliciesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteSealPoliciesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteSealPoliciesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteSealPolicies");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询文件下载URL
适用场景：通过传参合同流程编号，下载对应的合同PDF文件流到本地。
     * @param req DescribeFileUrlsRequest
     * @return DescribeFileUrlsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeFileUrlsResponse DescribeFileUrls(DescribeFileUrlsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeFileUrlsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeFileUrlsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeFileUrls");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询流程摘要
适用场景：可用于主动查询某个合同流程的签署状态信息。可以配合回调通知使用。
日调用量默认10W
     * @param req DescribeFlowBriefsRequest
     * @return DescribeFlowBriefsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeFlowBriefsResponse DescribeFlowBriefs(DescribeFlowBriefsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeFlowBriefsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeFlowBriefsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeFlowBriefs");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询出证报告，返回报告 URL。
     * @param req DescribeFlowEvidenceReportRequest
     * @return DescribeFlowEvidenceReportResponse
     * @throws TencentCloudSDKException
     */
    public DescribeFlowEvidenceReportResponse DescribeFlowEvidenceReport(DescribeFlowEvidenceReportRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeFlowEvidenceReportResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeFlowEvidenceReportResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeFlowEvidenceReport");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询合同详情
适用场景：可用于主动查询某个合同详情信息。
     * @param req DescribeFlowInfoRequest
     * @return DescribeFlowInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeFlowInfoResponse DescribeFlowInfo(DescribeFlowInfoRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeFlowInfoResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeFlowInfoResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeFlowInfo");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *当模板较多或模板中的控件较多时，可以通过查询模板接口更方便的获取模板列表，以及每个模板内的控件信息。该接口常用来配合“创建电子文档”接口作为前置的接口使用。
     * @param req DescribeFlowTemplatesRequest
     * @return DescribeFlowTemplatesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeFlowTemplatesResponse DescribeFlowTemplates(DescribeFlowTemplatesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeFlowTemplatesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeFlowTemplatesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeFlowTemplates");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询企业员工列表，每次返回的数据量最大为20
     * @param req DescribeIntegrationEmployeesRequest
     * @return DescribeIntegrationEmployeesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeIntegrationEmployeesResponse DescribeIntegrationEmployees(DescribeIntegrationEmployeesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeIntegrationEmployeesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeIntegrationEmployeesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeIntegrationEmployees");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *通过子企业影子账号查询主企业员工账号
     * @param req DescribeIntegrationMainOrganizationUserRequest
     * @return DescribeIntegrationMainOrganizationUserResponse
     * @throws TencentCloudSDKException
     */
    public DescribeIntegrationMainOrganizationUserResponse DescribeIntegrationMainOrganizationUser(DescribeIntegrationMainOrganizationUserRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeIntegrationMainOrganizationUserResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeIntegrationMainOrganizationUserResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeIntegrationMainOrganizationUser");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询企业角色列表
     * @param req DescribeIntegrationRolesRequest
     * @return DescribeIntegrationRolesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeIntegrationRolesResponse DescribeIntegrationRoles(DescribeIntegrationRolesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeIntegrationRolesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeIntegrationRolesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeIntegrationRoles");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *此API接口用户查询加入集团的成员企业
     * @param req DescribeOrganizationGroupOrganizationsRequest
     * @return DescribeOrganizationGroupOrganizationsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeOrganizationGroupOrganizationsResponse DescribeOrganizationGroupOrganizations(DescribeOrganizationGroupOrganizationsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeOrganizationGroupOrganizationsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeOrganizationGroupOrganizationsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeOrganizationGroupOrganizations");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询企业印章的列表，需要操作者具有查询印章权限
客户指定需要获取的印章数量和偏移量，数量最多100，超过100按100处理；入参InfoType控制印章是否携带授权人信息，为1则携带，为0则返回的授权人信息为空数组。接口调用成功返回印章的信息列表还有企业印章的总数。
     * @param req DescribeOrganizationSealsRequest
     * @return DescribeOrganizationSealsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeOrganizationSealsResponse DescribeOrganizationSeals(DescribeOrganizationSealsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeOrganizationSealsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeOrganizationSealsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeOrganizationSeals");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *通过AuthCode查询用户是否实名
     * @param req DescribeThirdPartyAuthCodeRequest
     * @return DescribeThirdPartyAuthCodeResponse
     * @throws TencentCloudSDKException
     */
    public DescribeThirdPartyAuthCodeResponse DescribeThirdPartyAuthCode(DescribeThirdPartyAuthCodeRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeThirdPartyAuthCodeResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeThirdPartyAuthCodeResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeThirdPartyAuthCode");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *企业方可以通过此接口查询个人用户自动签开启状态。（处方单场景专用，使用此接口请与客户经理确认）
     * @param req DescribeUserAutoSignStatusRequest
     * @return DescribeUserAutoSignStatusResponse
     * @throws TencentCloudSDKException
     */
    public DescribeUserAutoSignStatusResponse DescribeUserAutoSignStatus(DescribeUserAutoSignStatusRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeUserAutoSignStatusResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeUserAutoSignStatusResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeUserAutoSignStatus");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *企业方可以通过此接口关闭个人的自动签功能（处方单场景专用，使用此接口请与客户经理确认）
     * @param req DisableUserAutoSignRequest
     * @return DisableUserAutoSignResponse
     * @throws TencentCloudSDKException
     */
    public DisableUserAutoSignResponse DisableUserAutoSign(DisableUserAutoSignRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DisableUserAutoSignResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DisableUserAutoSignResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DisableUserAutoSign");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *通过发起转换任务接口（CreateConvertTaskApi）返回的任务Id查询转换任务状态，通过本接口确认转换任务是否完成。大文件转换所需的时间可能会比较长。
     * @param req GetTaskResultApiRequest
     * @return GetTaskResultApiResponse
     * @throws TencentCloudSDKException
     */
    public GetTaskResultApiResponse GetTaskResultApi(GetTaskResultApiRequest req) throws TencentCloudSDKException{
        JsonResponseModel<GetTaskResultApiResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<GetTaskResultApiResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "GetTaskResultApi");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *新增/删除应用callbackinfo
callbackinfo包含： 回调地址和签名key
操作：新增/删除
     * @param req ModifyApplicationCallbackInfoRequest
     * @return ModifyApplicationCallbackInfoResponse
     * @throws TencentCloudSDKException
     */
    public ModifyApplicationCallbackInfoResponse ModifyApplicationCallbackInfo(ModifyApplicationCallbackInfoRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyApplicationCallbackInfoResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyApplicationCallbackInfoResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyApplicationCallbackInfo");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *此接口用于发起流程
适用场景：见创建签署流程接口。
注：该接口是“创建电子文档”接口的后置接口，用于激活包含完整合同信息（模板及内容信息）的流程。激活后的流程就是一份待签署的电子合同。
     * @param req StartFlowRequest
     * @return StartFlowResponse
     * @throws TencentCloudSDKException
     */
    public StartFlowResponse StartFlow(StartFlowRequest req) throws TencentCloudSDKException{
        JsonResponseModel<StartFlowResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<StartFlowResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "StartFlow");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *将存在绑定关系的电子签系统员工userId与客户系统员工openId进行解绑
     * @param req UnbindEmployeeUserIdWithClientOpenIdRequest
     * @return UnbindEmployeeUserIdWithClientOpenIdResponse
     * @throws TencentCloudSDKException
     */
    public UnbindEmployeeUserIdWithClientOpenIdResponse UnbindEmployeeUserIdWithClientOpenId(UnbindEmployeeUserIdWithClientOpenIdRequest req) throws TencentCloudSDKException{
        JsonResponseModel<UnbindEmployeeUserIdWithClientOpenIdResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<UnbindEmployeeUserIdWithClientOpenIdResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "UnbindEmployeeUserIdWithClientOpenId");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *更新员工信息(姓名，手机号，邮件)，用户实名后无法更改姓名与手机号
     * @param req UpdateIntegrationEmployeesRequest
     * @return UpdateIntegrationEmployeesResponse
     * @throws TencentCloudSDKException
     */
    public UpdateIntegrationEmployeesResponse UpdateIntegrationEmployees(UpdateIntegrationEmployeesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<UpdateIntegrationEmployeesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<UpdateIntegrationEmployeesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "UpdateIntegrationEmployees");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *此接口（UploadFiles）用于文件上传。
适用场景：用于生成pdf资源编号（FileIds）来配合“用PDF创建流程”接口使用，使用场景可详见“用PDF创建流程”接口说明。
其中上传的文件，图片类型(png/jpg/jpeg)大小限制为5M，其他大小限制为60M。
调用时需要设置Domain/接口请求域名为 file.ess.tencent.cn，并设置参数Version/版本号为2020-12-22
     * @param req UploadFilesRequest
     * @return UploadFilesResponse
     * @throws TencentCloudSDKException
     */
    public UploadFilesResponse UploadFiles(UploadFilesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<UploadFilesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<UploadFilesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "UploadFiles");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *对流程的合同文件进行验证，判断文件是否合法。
     * @param req VerifyPdfRequest
     * @return VerifyPdfResponse
     * @throws TencentCloudSDKException
     */
    public VerifyPdfResponse VerifyPdf(VerifyPdfRequest req) throws TencentCloudSDKException{
        JsonResponseModel<VerifyPdfResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<VerifyPdfResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "VerifyPdf");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

}
