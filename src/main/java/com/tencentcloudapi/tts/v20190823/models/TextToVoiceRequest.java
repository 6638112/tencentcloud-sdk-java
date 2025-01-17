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
package com.tencentcloudapi.tts.v20190823.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TextToVoiceRequest extends AbstractModel{

    /**
    * 合成语音的源文本，按UTF-8编码统一计算。
中文最大支持150个汉字（全角标点符号算一个汉字）；英文最大支持500个字母（半角标点符号算一个字母）。
    */
    @SerializedName("Text")
    @Expose
    private String Text;

    /**
    * 一次请求对应一个SessionId，会原样返回，建议传入类似于uuid的字符串防止重复。
    */
    @SerializedName("SessionId")
    @Expose
    private String SessionId;

    /**
    * 音量大小，范围：[0，10]，分别对应11个等级的音量，默认为0，代表正常音量。没有静音选项。
    */
    @SerializedName("Volume")
    @Expose
    private Float Volume;

    /**
    * 语速，范围：[-2，6]，分别对应不同语速：<li>-2代表0.6倍</li><li>-1代表0.8倍</li><li>0代表1.0倍（默认）</li><li>1代表1.2倍</li><li>2代表1.5倍</li><li>6代表2.5倍</li>如果需要更细化的语速，可以保留小数点后一位，例如0.5 1.1 1.8等。<br>
    */
    @SerializedName("Speed")
    @Expose
    private Float Speed;

    /**
    * 项目id，用户自定义，默认为0。
    */
    @SerializedName("ProjectId")
    @Expose
    private Long ProjectId;

    /**
    * 模型类型，1-默认模型。
    */
    @SerializedName("ModelType")
    @Expose
    private Long ModelType;

    /**
    * 标准音色<li>10510000-智逍遥，阅读男声</li><li>1001-智瑜，情感女声</li><li>1002-智聆，通用女声</li><li>1003-智美，客服女声</li><li>1004-智云，通用男声</li><li>1005-智莉，通用女声</li><li>1007-智娜，客服女声</li><li>1008-智琪，客服女声</li><li>1009-智芸，知性女声</li><li>1010-智华，通用男声</li><li>1017-智蓉，情感女声</li><li>1018-智靖，情感男声</li><li>1050-WeJack，英文男声</li><li>1051-WeRose，英文女声</li>精品音色<br>精品音色拟真度更高，价格不同于标准音色，查看[购买指南](https://cloud.tencent.com/document/product/1073/34112)<br><li>100510000-智逍遥，阅读男声</li><li>101001-智瑜，情感女声</li><li>101002-智聆，通用女声</li><li>101003-智美，客服女声</li><li>101004-智云，通用男声</li><li>101005-智莉，通用女声</li><li>101006-智言，助手女声</li><li>101007-智娜，客服女声</li><li>101008-智琪，客服女声</li><li>101009-智芸，知性女声</li><li>101010-智华，通用男声</li><li>101011-智燕，新闻女声</li><li>101012-智丹，新闻女声</li><li>101013-智辉，新闻男声</li><li>101014-智宁，新闻男声</li><li>101015-智萌，男童声</li><li>101016-智甜，女童声</li><li>101017-智蓉，情感女声</li><li>101018-智靖，情感男声</li><li>101019-智彤，粤语女声</li><li>101020-智刚，新闻男声</li><li>101021-智瑞，新闻男声</li><li>101022-智虹，新闻女声</li><li>101023-智萱，聊天女声</li><li>101024-智皓，聊天男声</li><li>101025-智薇，聊天女声</li><li>101026-智希，通用女声</li><li>101027-智梅，通用女声</li><li>101028-智洁，通用女声</li><li>101029-智凯，通用男声</li><li>101030-智柯，通用男声</li><li>101031-智奎，通用男声</li><li>101032-智芳，通用女声</li><li>101033-智蓓，客服女声</li><li>101034-智莲，通用女声</li><li>101035-智依，通用女声</li><li>101040-智川，四川女声</li><li>101050-WeJack，英文男声</li><li>101051-WeRose，英文女声</li><li>101052-智味，通用男声</li>
<li>101053-智方，通用男声</li>
<li>101054-智友，通用男声</li>
<li>101055-智付，通用女声</li>
<li>101056-智林，东北男声</li>
<li>301000-爱小广，多情感通用男声</li>
<li>301001-爱小栋，多情感通用男声</li>
<li>301002-爱小海，多情感通用男声</li>
<li>301003-爱小霞，多情感通用女声</li>
<li>301004-爱小玲，多情感通用女声</li>
<li>301005-爱小章，多情感通用男声</li>
<li>301006-爱小峰，多情感通用男声</li>
<li>301007-爱小亮，多情感通用男声</li>
<li>301008-爱小博，多情感通用男声</li>
<li>301009-爱小芸，多情感通用女声</li>
<li>301010-爱小秋，多情感通用女声</li>
<li>301011-爱小芳，多情感通用女声</li>
<li>301012-爱小琴，多情感通用女声</li>
<li>301013-爱小康，多情感通用男声</li>
<li>301014-爱小辉，多情感通用男声</li>
<li>301015-爱小璐，多情感通用女声</li>
<li>301016-爱小阳，多情感通用男声</li>
<li>301017-爱小泉，多情感通用男声</li>
<li>301018-爱小昆，多情感通用男声</li>
<li>301019-爱小诚，多情感通用男声</li>
<li>301020-爱小岚，多情感通用女声</li>
<li>301021-爱小茹，多情感通用女声</li>
<li>301022-爱小蓉，多情感通用女声</li>
<li>301023-爱小燕，多情感通用女声</li>
<li>301024-爱小莲，多情感通用女声</li>
<li>301025-爱小武，多情感通用男声</li>
<li>301026-爱小雪，多情感通用女声</li>
<li>301027-爱小媛，多情感通用女声</li>
<li>301028-爱小娴，多情感通用女声</li>
<li>301029-爱小涛，多情感通用男声</li>
<li>401000-智妍，活力女声</li>
<li>401001-智萱，温暖女声</li>
<li>401002-智飞，活力男声</li>
<li>401003-智悦，活力女声</li>
<li>401004-智海，成熟男声</li>
<li>401005-智凡，新闻男声</li>
<li>401006-智航，导航女声</li>
<li>401007-智婷，广告女声</li>
<li>401008-智霞，通用女声</li>
    */
    @SerializedName("VoiceType")
    @Expose
    private Long VoiceType;

    /**
    * 主语言类型：<li>1-中文（默认）</li><li>2-英文</li>
    */
    @SerializedName("PrimaryLanguage")
    @Expose
    private Long PrimaryLanguage;

    /**
    * 音频采样率：<li>16000：16k（默认）</li><li>8000：8k</li>
    */
    @SerializedName("SampleRate")
    @Expose
    private Long SampleRate;

    /**
    * 返回音频格式，可取值：wav（默认），mp3，pcm
    */
    @SerializedName("Codec")
    @Expose
    private String Codec;

    /**
    * 是否开启时间戳功能，默认为false。
    */
    @SerializedName("EnableSubtitle")
    @Expose
    private Boolean EnableSubtitle;

    /**
    * 断句敏感阈值，默认值为：0，取值范围：[0,1,2]。该值越大越不容易断句，模型会更倾向于仅按照标点符号断句。此参数建议不要随意调整，可能会影响合成效果。
    */
    @SerializedName("SegmentRate")
    @Expose
    private Long SegmentRate;

    /**
    * 控制合成音频的情感，仅支持多情感音色使用。取值: neutral(中性)、sad(悲伤)、happy(高兴)、angry(生气)、fear(恐惧)、news(新闻)、story(故事)、radio(广播)、poetry(诗歌)、call(客服)
    */
    @SerializedName("EmotionCategory")
    @Expose
    private String EmotionCategory;

    /**
    * 控制合成音频情感程度，取值范围为[50,200],默认为100；只有EmotionCategory不为空时生效；
    */
    @SerializedName("EmotionIntensity")
    @Expose
    private Long EmotionIntensity;

    /**
     * Get 合成语音的源文本，按UTF-8编码统一计算。
中文最大支持150个汉字（全角标点符号算一个汉字）；英文最大支持500个字母（半角标点符号算一个字母）。 
     * @return Text 合成语音的源文本，按UTF-8编码统一计算。
中文最大支持150个汉字（全角标点符号算一个汉字）；英文最大支持500个字母（半角标点符号算一个字母）。
     */
    public String getText() {
        return this.Text;
    }

    /**
     * Set 合成语音的源文本，按UTF-8编码统一计算。
中文最大支持150个汉字（全角标点符号算一个汉字）；英文最大支持500个字母（半角标点符号算一个字母）。
     * @param Text 合成语音的源文本，按UTF-8编码统一计算。
中文最大支持150个汉字（全角标点符号算一个汉字）；英文最大支持500个字母（半角标点符号算一个字母）。
     */
    public void setText(String Text) {
        this.Text = Text;
    }

    /**
     * Get 一次请求对应一个SessionId，会原样返回，建议传入类似于uuid的字符串防止重复。 
     * @return SessionId 一次请求对应一个SessionId，会原样返回，建议传入类似于uuid的字符串防止重复。
     */
    public String getSessionId() {
        return this.SessionId;
    }

    /**
     * Set 一次请求对应一个SessionId，会原样返回，建议传入类似于uuid的字符串防止重复。
     * @param SessionId 一次请求对应一个SessionId，会原样返回，建议传入类似于uuid的字符串防止重复。
     */
    public void setSessionId(String SessionId) {
        this.SessionId = SessionId;
    }

    /**
     * Get 音量大小，范围：[0，10]，分别对应11个等级的音量，默认为0，代表正常音量。没有静音选项。 
     * @return Volume 音量大小，范围：[0，10]，分别对应11个等级的音量，默认为0，代表正常音量。没有静音选项。
     */
    public Float getVolume() {
        return this.Volume;
    }

    /**
     * Set 音量大小，范围：[0，10]，分别对应11个等级的音量，默认为0，代表正常音量。没有静音选项。
     * @param Volume 音量大小，范围：[0，10]，分别对应11个等级的音量，默认为0，代表正常音量。没有静音选项。
     */
    public void setVolume(Float Volume) {
        this.Volume = Volume;
    }

    /**
     * Get 语速，范围：[-2，6]，分别对应不同语速：<li>-2代表0.6倍</li><li>-1代表0.8倍</li><li>0代表1.0倍（默认）</li><li>1代表1.2倍</li><li>2代表1.5倍</li><li>6代表2.5倍</li>如果需要更细化的语速，可以保留小数点后一位，例如0.5 1.1 1.8等。<br> 
     * @return Speed 语速，范围：[-2，6]，分别对应不同语速：<li>-2代表0.6倍</li><li>-1代表0.8倍</li><li>0代表1.0倍（默认）</li><li>1代表1.2倍</li><li>2代表1.5倍</li><li>6代表2.5倍</li>如果需要更细化的语速，可以保留小数点后一位，例如0.5 1.1 1.8等。<br>
     */
    public Float getSpeed() {
        return this.Speed;
    }

    /**
     * Set 语速，范围：[-2，6]，分别对应不同语速：<li>-2代表0.6倍</li><li>-1代表0.8倍</li><li>0代表1.0倍（默认）</li><li>1代表1.2倍</li><li>2代表1.5倍</li><li>6代表2.5倍</li>如果需要更细化的语速，可以保留小数点后一位，例如0.5 1.1 1.8等。<br>
     * @param Speed 语速，范围：[-2，6]，分别对应不同语速：<li>-2代表0.6倍</li><li>-1代表0.8倍</li><li>0代表1.0倍（默认）</li><li>1代表1.2倍</li><li>2代表1.5倍</li><li>6代表2.5倍</li>如果需要更细化的语速，可以保留小数点后一位，例如0.5 1.1 1.8等。<br>
     */
    public void setSpeed(Float Speed) {
        this.Speed = Speed;
    }

    /**
     * Get 项目id，用户自定义，默认为0。 
     * @return ProjectId 项目id，用户自定义，默认为0。
     */
    public Long getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set 项目id，用户自定义，默认为0。
     * @param ProjectId 项目id，用户自定义，默认为0。
     */
    public void setProjectId(Long ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get 模型类型，1-默认模型。 
     * @return ModelType 模型类型，1-默认模型。
     */
    public Long getModelType() {
        return this.ModelType;
    }

    /**
     * Set 模型类型，1-默认模型。
     * @param ModelType 模型类型，1-默认模型。
     */
    public void setModelType(Long ModelType) {
        this.ModelType = ModelType;
    }

    /**
     * Get 标准音色<li>10510000-智逍遥，阅读男声</li><li>1001-智瑜，情感女声</li><li>1002-智聆，通用女声</li><li>1003-智美，客服女声</li><li>1004-智云，通用男声</li><li>1005-智莉，通用女声</li><li>1007-智娜，客服女声</li><li>1008-智琪，客服女声</li><li>1009-智芸，知性女声</li><li>1010-智华，通用男声</li><li>1017-智蓉，情感女声</li><li>1018-智靖，情感男声</li><li>1050-WeJack，英文男声</li><li>1051-WeRose，英文女声</li>精品音色<br>精品音色拟真度更高，价格不同于标准音色，查看[购买指南](https://cloud.tencent.com/document/product/1073/34112)<br><li>100510000-智逍遥，阅读男声</li><li>101001-智瑜，情感女声</li><li>101002-智聆，通用女声</li><li>101003-智美，客服女声</li><li>101004-智云，通用男声</li><li>101005-智莉，通用女声</li><li>101006-智言，助手女声</li><li>101007-智娜，客服女声</li><li>101008-智琪，客服女声</li><li>101009-智芸，知性女声</li><li>101010-智华，通用男声</li><li>101011-智燕，新闻女声</li><li>101012-智丹，新闻女声</li><li>101013-智辉，新闻男声</li><li>101014-智宁，新闻男声</li><li>101015-智萌，男童声</li><li>101016-智甜，女童声</li><li>101017-智蓉，情感女声</li><li>101018-智靖，情感男声</li><li>101019-智彤，粤语女声</li><li>101020-智刚，新闻男声</li><li>101021-智瑞，新闻男声</li><li>101022-智虹，新闻女声</li><li>101023-智萱，聊天女声</li><li>101024-智皓，聊天男声</li><li>101025-智薇，聊天女声</li><li>101026-智希，通用女声</li><li>101027-智梅，通用女声</li><li>101028-智洁，通用女声</li><li>101029-智凯，通用男声</li><li>101030-智柯，通用男声</li><li>101031-智奎，通用男声</li><li>101032-智芳，通用女声</li><li>101033-智蓓，客服女声</li><li>101034-智莲，通用女声</li><li>101035-智依，通用女声</li><li>101040-智川，四川女声</li><li>101050-WeJack，英文男声</li><li>101051-WeRose，英文女声</li><li>101052-智味，通用男声</li>
<li>101053-智方，通用男声</li>
<li>101054-智友，通用男声</li>
<li>101055-智付，通用女声</li>
<li>101056-智林，东北男声</li>
<li>301000-爱小广，多情感通用男声</li>
<li>301001-爱小栋，多情感通用男声</li>
<li>301002-爱小海，多情感通用男声</li>
<li>301003-爱小霞，多情感通用女声</li>
<li>301004-爱小玲，多情感通用女声</li>
<li>301005-爱小章，多情感通用男声</li>
<li>301006-爱小峰，多情感通用男声</li>
<li>301007-爱小亮，多情感通用男声</li>
<li>301008-爱小博，多情感通用男声</li>
<li>301009-爱小芸，多情感通用女声</li>
<li>301010-爱小秋，多情感通用女声</li>
<li>301011-爱小芳，多情感通用女声</li>
<li>301012-爱小琴，多情感通用女声</li>
<li>301013-爱小康，多情感通用男声</li>
<li>301014-爱小辉，多情感通用男声</li>
<li>301015-爱小璐，多情感通用女声</li>
<li>301016-爱小阳，多情感通用男声</li>
<li>301017-爱小泉，多情感通用男声</li>
<li>301018-爱小昆，多情感通用男声</li>
<li>301019-爱小诚，多情感通用男声</li>
<li>301020-爱小岚，多情感通用女声</li>
<li>301021-爱小茹，多情感通用女声</li>
<li>301022-爱小蓉，多情感通用女声</li>
<li>301023-爱小燕，多情感通用女声</li>
<li>301024-爱小莲，多情感通用女声</li>
<li>301025-爱小武，多情感通用男声</li>
<li>301026-爱小雪，多情感通用女声</li>
<li>301027-爱小媛，多情感通用女声</li>
<li>301028-爱小娴，多情感通用女声</li>
<li>301029-爱小涛，多情感通用男声</li>
<li>401000-智妍，活力女声</li>
<li>401001-智萱，温暖女声</li>
<li>401002-智飞，活力男声</li>
<li>401003-智悦，活力女声</li>
<li>401004-智海，成熟男声</li>
<li>401005-智凡，新闻男声</li>
<li>401006-智航，导航女声</li>
<li>401007-智婷，广告女声</li>
<li>401008-智霞，通用女声</li> 
     * @return VoiceType 标准音色<li>10510000-智逍遥，阅读男声</li><li>1001-智瑜，情感女声</li><li>1002-智聆，通用女声</li><li>1003-智美，客服女声</li><li>1004-智云，通用男声</li><li>1005-智莉，通用女声</li><li>1007-智娜，客服女声</li><li>1008-智琪，客服女声</li><li>1009-智芸，知性女声</li><li>1010-智华，通用男声</li><li>1017-智蓉，情感女声</li><li>1018-智靖，情感男声</li><li>1050-WeJack，英文男声</li><li>1051-WeRose，英文女声</li>精品音色<br>精品音色拟真度更高，价格不同于标准音色，查看[购买指南](https://cloud.tencent.com/document/product/1073/34112)<br><li>100510000-智逍遥，阅读男声</li><li>101001-智瑜，情感女声</li><li>101002-智聆，通用女声</li><li>101003-智美，客服女声</li><li>101004-智云，通用男声</li><li>101005-智莉，通用女声</li><li>101006-智言，助手女声</li><li>101007-智娜，客服女声</li><li>101008-智琪，客服女声</li><li>101009-智芸，知性女声</li><li>101010-智华，通用男声</li><li>101011-智燕，新闻女声</li><li>101012-智丹，新闻女声</li><li>101013-智辉，新闻男声</li><li>101014-智宁，新闻男声</li><li>101015-智萌，男童声</li><li>101016-智甜，女童声</li><li>101017-智蓉，情感女声</li><li>101018-智靖，情感男声</li><li>101019-智彤，粤语女声</li><li>101020-智刚，新闻男声</li><li>101021-智瑞，新闻男声</li><li>101022-智虹，新闻女声</li><li>101023-智萱，聊天女声</li><li>101024-智皓，聊天男声</li><li>101025-智薇，聊天女声</li><li>101026-智希，通用女声</li><li>101027-智梅，通用女声</li><li>101028-智洁，通用女声</li><li>101029-智凯，通用男声</li><li>101030-智柯，通用男声</li><li>101031-智奎，通用男声</li><li>101032-智芳，通用女声</li><li>101033-智蓓，客服女声</li><li>101034-智莲，通用女声</li><li>101035-智依，通用女声</li><li>101040-智川，四川女声</li><li>101050-WeJack，英文男声</li><li>101051-WeRose，英文女声</li><li>101052-智味，通用男声</li>
<li>101053-智方，通用男声</li>
<li>101054-智友，通用男声</li>
<li>101055-智付，通用女声</li>
<li>101056-智林，东北男声</li>
<li>301000-爱小广，多情感通用男声</li>
<li>301001-爱小栋，多情感通用男声</li>
<li>301002-爱小海，多情感通用男声</li>
<li>301003-爱小霞，多情感通用女声</li>
<li>301004-爱小玲，多情感通用女声</li>
<li>301005-爱小章，多情感通用男声</li>
<li>301006-爱小峰，多情感通用男声</li>
<li>301007-爱小亮，多情感通用男声</li>
<li>301008-爱小博，多情感通用男声</li>
<li>301009-爱小芸，多情感通用女声</li>
<li>301010-爱小秋，多情感通用女声</li>
<li>301011-爱小芳，多情感通用女声</li>
<li>301012-爱小琴，多情感通用女声</li>
<li>301013-爱小康，多情感通用男声</li>
<li>301014-爱小辉，多情感通用男声</li>
<li>301015-爱小璐，多情感通用女声</li>
<li>301016-爱小阳，多情感通用男声</li>
<li>301017-爱小泉，多情感通用男声</li>
<li>301018-爱小昆，多情感通用男声</li>
<li>301019-爱小诚，多情感通用男声</li>
<li>301020-爱小岚，多情感通用女声</li>
<li>301021-爱小茹，多情感通用女声</li>
<li>301022-爱小蓉，多情感通用女声</li>
<li>301023-爱小燕，多情感通用女声</li>
<li>301024-爱小莲，多情感通用女声</li>
<li>301025-爱小武，多情感通用男声</li>
<li>301026-爱小雪，多情感通用女声</li>
<li>301027-爱小媛，多情感通用女声</li>
<li>301028-爱小娴，多情感通用女声</li>
<li>301029-爱小涛，多情感通用男声</li>
<li>401000-智妍，活力女声</li>
<li>401001-智萱，温暖女声</li>
<li>401002-智飞，活力男声</li>
<li>401003-智悦，活力女声</li>
<li>401004-智海，成熟男声</li>
<li>401005-智凡，新闻男声</li>
<li>401006-智航，导航女声</li>
<li>401007-智婷，广告女声</li>
<li>401008-智霞，通用女声</li>
     */
    public Long getVoiceType() {
        return this.VoiceType;
    }

    /**
     * Set 标准音色<li>10510000-智逍遥，阅读男声</li><li>1001-智瑜，情感女声</li><li>1002-智聆，通用女声</li><li>1003-智美，客服女声</li><li>1004-智云，通用男声</li><li>1005-智莉，通用女声</li><li>1007-智娜，客服女声</li><li>1008-智琪，客服女声</li><li>1009-智芸，知性女声</li><li>1010-智华，通用男声</li><li>1017-智蓉，情感女声</li><li>1018-智靖，情感男声</li><li>1050-WeJack，英文男声</li><li>1051-WeRose，英文女声</li>精品音色<br>精品音色拟真度更高，价格不同于标准音色，查看[购买指南](https://cloud.tencent.com/document/product/1073/34112)<br><li>100510000-智逍遥，阅读男声</li><li>101001-智瑜，情感女声</li><li>101002-智聆，通用女声</li><li>101003-智美，客服女声</li><li>101004-智云，通用男声</li><li>101005-智莉，通用女声</li><li>101006-智言，助手女声</li><li>101007-智娜，客服女声</li><li>101008-智琪，客服女声</li><li>101009-智芸，知性女声</li><li>101010-智华，通用男声</li><li>101011-智燕，新闻女声</li><li>101012-智丹，新闻女声</li><li>101013-智辉，新闻男声</li><li>101014-智宁，新闻男声</li><li>101015-智萌，男童声</li><li>101016-智甜，女童声</li><li>101017-智蓉，情感女声</li><li>101018-智靖，情感男声</li><li>101019-智彤，粤语女声</li><li>101020-智刚，新闻男声</li><li>101021-智瑞，新闻男声</li><li>101022-智虹，新闻女声</li><li>101023-智萱，聊天女声</li><li>101024-智皓，聊天男声</li><li>101025-智薇，聊天女声</li><li>101026-智希，通用女声</li><li>101027-智梅，通用女声</li><li>101028-智洁，通用女声</li><li>101029-智凯，通用男声</li><li>101030-智柯，通用男声</li><li>101031-智奎，通用男声</li><li>101032-智芳，通用女声</li><li>101033-智蓓，客服女声</li><li>101034-智莲，通用女声</li><li>101035-智依，通用女声</li><li>101040-智川，四川女声</li><li>101050-WeJack，英文男声</li><li>101051-WeRose，英文女声</li><li>101052-智味，通用男声</li>
<li>101053-智方，通用男声</li>
<li>101054-智友，通用男声</li>
<li>101055-智付，通用女声</li>
<li>101056-智林，东北男声</li>
<li>301000-爱小广，多情感通用男声</li>
<li>301001-爱小栋，多情感通用男声</li>
<li>301002-爱小海，多情感通用男声</li>
<li>301003-爱小霞，多情感通用女声</li>
<li>301004-爱小玲，多情感通用女声</li>
<li>301005-爱小章，多情感通用男声</li>
<li>301006-爱小峰，多情感通用男声</li>
<li>301007-爱小亮，多情感通用男声</li>
<li>301008-爱小博，多情感通用男声</li>
<li>301009-爱小芸，多情感通用女声</li>
<li>301010-爱小秋，多情感通用女声</li>
<li>301011-爱小芳，多情感通用女声</li>
<li>301012-爱小琴，多情感通用女声</li>
<li>301013-爱小康，多情感通用男声</li>
<li>301014-爱小辉，多情感通用男声</li>
<li>301015-爱小璐，多情感通用女声</li>
<li>301016-爱小阳，多情感通用男声</li>
<li>301017-爱小泉，多情感通用男声</li>
<li>301018-爱小昆，多情感通用男声</li>
<li>301019-爱小诚，多情感通用男声</li>
<li>301020-爱小岚，多情感通用女声</li>
<li>301021-爱小茹，多情感通用女声</li>
<li>301022-爱小蓉，多情感通用女声</li>
<li>301023-爱小燕，多情感通用女声</li>
<li>301024-爱小莲，多情感通用女声</li>
<li>301025-爱小武，多情感通用男声</li>
<li>301026-爱小雪，多情感通用女声</li>
<li>301027-爱小媛，多情感通用女声</li>
<li>301028-爱小娴，多情感通用女声</li>
<li>301029-爱小涛，多情感通用男声</li>
<li>401000-智妍，活力女声</li>
<li>401001-智萱，温暖女声</li>
<li>401002-智飞，活力男声</li>
<li>401003-智悦，活力女声</li>
<li>401004-智海，成熟男声</li>
<li>401005-智凡，新闻男声</li>
<li>401006-智航，导航女声</li>
<li>401007-智婷，广告女声</li>
<li>401008-智霞，通用女声</li>
     * @param VoiceType 标准音色<li>10510000-智逍遥，阅读男声</li><li>1001-智瑜，情感女声</li><li>1002-智聆，通用女声</li><li>1003-智美，客服女声</li><li>1004-智云，通用男声</li><li>1005-智莉，通用女声</li><li>1007-智娜，客服女声</li><li>1008-智琪，客服女声</li><li>1009-智芸，知性女声</li><li>1010-智华，通用男声</li><li>1017-智蓉，情感女声</li><li>1018-智靖，情感男声</li><li>1050-WeJack，英文男声</li><li>1051-WeRose，英文女声</li>精品音色<br>精品音色拟真度更高，价格不同于标准音色，查看[购买指南](https://cloud.tencent.com/document/product/1073/34112)<br><li>100510000-智逍遥，阅读男声</li><li>101001-智瑜，情感女声</li><li>101002-智聆，通用女声</li><li>101003-智美，客服女声</li><li>101004-智云，通用男声</li><li>101005-智莉，通用女声</li><li>101006-智言，助手女声</li><li>101007-智娜，客服女声</li><li>101008-智琪，客服女声</li><li>101009-智芸，知性女声</li><li>101010-智华，通用男声</li><li>101011-智燕，新闻女声</li><li>101012-智丹，新闻女声</li><li>101013-智辉，新闻男声</li><li>101014-智宁，新闻男声</li><li>101015-智萌，男童声</li><li>101016-智甜，女童声</li><li>101017-智蓉，情感女声</li><li>101018-智靖，情感男声</li><li>101019-智彤，粤语女声</li><li>101020-智刚，新闻男声</li><li>101021-智瑞，新闻男声</li><li>101022-智虹，新闻女声</li><li>101023-智萱，聊天女声</li><li>101024-智皓，聊天男声</li><li>101025-智薇，聊天女声</li><li>101026-智希，通用女声</li><li>101027-智梅，通用女声</li><li>101028-智洁，通用女声</li><li>101029-智凯，通用男声</li><li>101030-智柯，通用男声</li><li>101031-智奎，通用男声</li><li>101032-智芳，通用女声</li><li>101033-智蓓，客服女声</li><li>101034-智莲，通用女声</li><li>101035-智依，通用女声</li><li>101040-智川，四川女声</li><li>101050-WeJack，英文男声</li><li>101051-WeRose，英文女声</li><li>101052-智味，通用男声</li>
<li>101053-智方，通用男声</li>
<li>101054-智友，通用男声</li>
<li>101055-智付，通用女声</li>
<li>101056-智林，东北男声</li>
<li>301000-爱小广，多情感通用男声</li>
<li>301001-爱小栋，多情感通用男声</li>
<li>301002-爱小海，多情感通用男声</li>
<li>301003-爱小霞，多情感通用女声</li>
<li>301004-爱小玲，多情感通用女声</li>
<li>301005-爱小章，多情感通用男声</li>
<li>301006-爱小峰，多情感通用男声</li>
<li>301007-爱小亮，多情感通用男声</li>
<li>301008-爱小博，多情感通用男声</li>
<li>301009-爱小芸，多情感通用女声</li>
<li>301010-爱小秋，多情感通用女声</li>
<li>301011-爱小芳，多情感通用女声</li>
<li>301012-爱小琴，多情感通用女声</li>
<li>301013-爱小康，多情感通用男声</li>
<li>301014-爱小辉，多情感通用男声</li>
<li>301015-爱小璐，多情感通用女声</li>
<li>301016-爱小阳，多情感通用男声</li>
<li>301017-爱小泉，多情感通用男声</li>
<li>301018-爱小昆，多情感通用男声</li>
<li>301019-爱小诚，多情感通用男声</li>
<li>301020-爱小岚，多情感通用女声</li>
<li>301021-爱小茹，多情感通用女声</li>
<li>301022-爱小蓉，多情感通用女声</li>
<li>301023-爱小燕，多情感通用女声</li>
<li>301024-爱小莲，多情感通用女声</li>
<li>301025-爱小武，多情感通用男声</li>
<li>301026-爱小雪，多情感通用女声</li>
<li>301027-爱小媛，多情感通用女声</li>
<li>301028-爱小娴，多情感通用女声</li>
<li>301029-爱小涛，多情感通用男声</li>
<li>401000-智妍，活力女声</li>
<li>401001-智萱，温暖女声</li>
<li>401002-智飞，活力男声</li>
<li>401003-智悦，活力女声</li>
<li>401004-智海，成熟男声</li>
<li>401005-智凡，新闻男声</li>
<li>401006-智航，导航女声</li>
<li>401007-智婷，广告女声</li>
<li>401008-智霞，通用女声</li>
     */
    public void setVoiceType(Long VoiceType) {
        this.VoiceType = VoiceType;
    }

    /**
     * Get 主语言类型：<li>1-中文（默认）</li><li>2-英文</li> 
     * @return PrimaryLanguage 主语言类型：<li>1-中文（默认）</li><li>2-英文</li>
     */
    public Long getPrimaryLanguage() {
        return this.PrimaryLanguage;
    }

    /**
     * Set 主语言类型：<li>1-中文（默认）</li><li>2-英文</li>
     * @param PrimaryLanguage 主语言类型：<li>1-中文（默认）</li><li>2-英文</li>
     */
    public void setPrimaryLanguage(Long PrimaryLanguage) {
        this.PrimaryLanguage = PrimaryLanguage;
    }

    /**
     * Get 音频采样率：<li>16000：16k（默认）</li><li>8000：8k</li> 
     * @return SampleRate 音频采样率：<li>16000：16k（默认）</li><li>8000：8k</li>
     */
    public Long getSampleRate() {
        return this.SampleRate;
    }

    /**
     * Set 音频采样率：<li>16000：16k（默认）</li><li>8000：8k</li>
     * @param SampleRate 音频采样率：<li>16000：16k（默认）</li><li>8000：8k</li>
     */
    public void setSampleRate(Long SampleRate) {
        this.SampleRate = SampleRate;
    }

    /**
     * Get 返回音频格式，可取值：wav（默认），mp3，pcm 
     * @return Codec 返回音频格式，可取值：wav（默认），mp3，pcm
     */
    public String getCodec() {
        return this.Codec;
    }

    /**
     * Set 返回音频格式，可取值：wav（默认），mp3，pcm
     * @param Codec 返回音频格式，可取值：wav（默认），mp3，pcm
     */
    public void setCodec(String Codec) {
        this.Codec = Codec;
    }

    /**
     * Get 是否开启时间戳功能，默认为false。 
     * @return EnableSubtitle 是否开启时间戳功能，默认为false。
     */
    public Boolean getEnableSubtitle() {
        return this.EnableSubtitle;
    }

    /**
     * Set 是否开启时间戳功能，默认为false。
     * @param EnableSubtitle 是否开启时间戳功能，默认为false。
     */
    public void setEnableSubtitle(Boolean EnableSubtitle) {
        this.EnableSubtitle = EnableSubtitle;
    }

    /**
     * Get 断句敏感阈值，默认值为：0，取值范围：[0,1,2]。该值越大越不容易断句，模型会更倾向于仅按照标点符号断句。此参数建议不要随意调整，可能会影响合成效果。 
     * @return SegmentRate 断句敏感阈值，默认值为：0，取值范围：[0,1,2]。该值越大越不容易断句，模型会更倾向于仅按照标点符号断句。此参数建议不要随意调整，可能会影响合成效果。
     */
    public Long getSegmentRate() {
        return this.SegmentRate;
    }

    /**
     * Set 断句敏感阈值，默认值为：0，取值范围：[0,1,2]。该值越大越不容易断句，模型会更倾向于仅按照标点符号断句。此参数建议不要随意调整，可能会影响合成效果。
     * @param SegmentRate 断句敏感阈值，默认值为：0，取值范围：[0,1,2]。该值越大越不容易断句，模型会更倾向于仅按照标点符号断句。此参数建议不要随意调整，可能会影响合成效果。
     */
    public void setSegmentRate(Long SegmentRate) {
        this.SegmentRate = SegmentRate;
    }

    /**
     * Get 控制合成音频的情感，仅支持多情感音色使用。取值: neutral(中性)、sad(悲伤)、happy(高兴)、angry(生气)、fear(恐惧)、news(新闻)、story(故事)、radio(广播)、poetry(诗歌)、call(客服) 
     * @return EmotionCategory 控制合成音频的情感，仅支持多情感音色使用。取值: neutral(中性)、sad(悲伤)、happy(高兴)、angry(生气)、fear(恐惧)、news(新闻)、story(故事)、radio(广播)、poetry(诗歌)、call(客服)
     */
    public String getEmotionCategory() {
        return this.EmotionCategory;
    }

    /**
     * Set 控制合成音频的情感，仅支持多情感音色使用。取值: neutral(中性)、sad(悲伤)、happy(高兴)、angry(生气)、fear(恐惧)、news(新闻)、story(故事)、radio(广播)、poetry(诗歌)、call(客服)
     * @param EmotionCategory 控制合成音频的情感，仅支持多情感音色使用。取值: neutral(中性)、sad(悲伤)、happy(高兴)、angry(生气)、fear(恐惧)、news(新闻)、story(故事)、radio(广播)、poetry(诗歌)、call(客服)
     */
    public void setEmotionCategory(String EmotionCategory) {
        this.EmotionCategory = EmotionCategory;
    }

    /**
     * Get 控制合成音频情感程度，取值范围为[50,200],默认为100；只有EmotionCategory不为空时生效； 
     * @return EmotionIntensity 控制合成音频情感程度，取值范围为[50,200],默认为100；只有EmotionCategory不为空时生效；
     */
    public Long getEmotionIntensity() {
        return this.EmotionIntensity;
    }

    /**
     * Set 控制合成音频情感程度，取值范围为[50,200],默认为100；只有EmotionCategory不为空时生效；
     * @param EmotionIntensity 控制合成音频情感程度，取值范围为[50,200],默认为100；只有EmotionCategory不为空时生效；
     */
    public void setEmotionIntensity(Long EmotionIntensity) {
        this.EmotionIntensity = EmotionIntensity;
    }

    public TextToVoiceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TextToVoiceRequest(TextToVoiceRequest source) {
        if (source.Text != null) {
            this.Text = new String(source.Text);
        }
        if (source.SessionId != null) {
            this.SessionId = new String(source.SessionId);
        }
        if (source.Volume != null) {
            this.Volume = new Float(source.Volume);
        }
        if (source.Speed != null) {
            this.Speed = new Float(source.Speed);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new Long(source.ProjectId);
        }
        if (source.ModelType != null) {
            this.ModelType = new Long(source.ModelType);
        }
        if (source.VoiceType != null) {
            this.VoiceType = new Long(source.VoiceType);
        }
        if (source.PrimaryLanguage != null) {
            this.PrimaryLanguage = new Long(source.PrimaryLanguage);
        }
        if (source.SampleRate != null) {
            this.SampleRate = new Long(source.SampleRate);
        }
        if (source.Codec != null) {
            this.Codec = new String(source.Codec);
        }
        if (source.EnableSubtitle != null) {
            this.EnableSubtitle = new Boolean(source.EnableSubtitle);
        }
        if (source.SegmentRate != null) {
            this.SegmentRate = new Long(source.SegmentRate);
        }
        if (source.EmotionCategory != null) {
            this.EmotionCategory = new String(source.EmotionCategory);
        }
        if (source.EmotionIntensity != null) {
            this.EmotionIntensity = new Long(source.EmotionIntensity);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Text", this.Text);
        this.setParamSimple(map, prefix + "SessionId", this.SessionId);
        this.setParamSimple(map, prefix + "Volume", this.Volume);
        this.setParamSimple(map, prefix + "Speed", this.Speed);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "ModelType", this.ModelType);
        this.setParamSimple(map, prefix + "VoiceType", this.VoiceType);
        this.setParamSimple(map, prefix + "PrimaryLanguage", this.PrimaryLanguage);
        this.setParamSimple(map, prefix + "SampleRate", this.SampleRate);
        this.setParamSimple(map, prefix + "Codec", this.Codec);
        this.setParamSimple(map, prefix + "EnableSubtitle", this.EnableSubtitle);
        this.setParamSimple(map, prefix + "SegmentRate", this.SegmentRate);
        this.setParamSimple(map, prefix + "EmotionCategory", this.EmotionCategory);
        this.setParamSimple(map, prefix + "EmotionIntensity", this.EmotionIntensity);

    }
}

