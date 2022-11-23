package com.g42cloud.sdk.cce.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 创建节点时的扩展参数。
 */
public class NodeExtendParam {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ecs:performancetype")

    private String ecsPerformancetype;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "orderID")

    private String orderID;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "productID")

    private String productID;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "maxPods")

    private Integer maxPods;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "periodType")

    private String periodType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "periodNum")

    private Integer periodNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "isAutoRenew")

    private String isAutoRenew;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "isAutoPay")

    private String isAutoPay;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "DockerLVMConfigOverride")

    private String dockerLVMConfigOverride;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dockerBaseSize")

    private Integer dockerBaseSize;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "publicKey")

    private String publicKey;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "alpha.cce/preInstall")

    private String alphaCcePreInstall;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "alpha.cce/postInstall")

    private String alphaCcePostInstall;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "alpha.cce/NodeImageID")

    private String alphaCceNodeImageID;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "nicMultiqueue")

    private String nicMultiqueue;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "nicThreshold")

    private String nicThreshold;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_id")

    private String enterpriseProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "chargingMode")

    private Integer chargingMode;

    public NodeExtendParam withEcsPerformancetype(String ecsPerformancetype) {
        this.ecsPerformancetype = ecsPerformancetype;
        return this;
    }

    public String getEcsPerformancetype() {
        return ecsPerformancetype;
    }

    public void setEcsPerformancetype(String ecsPerformancetype) {
        this.ecsPerformancetype = ecsPerformancetype;
    }

    public NodeExtendParam withOrderID(String orderID) {
        this.orderID = orderID;
        return this;
    }

    public String getOrderID() {
        return orderID;
    }

    public void setOrderID(String orderID) {
        this.orderID = orderID;
    }

    public NodeExtendParam withProductID(String productID) {
        this.productID = productID;
        return this;
    }

    public String getProductID() {
        return productID;
    }

    public void setProductID(String productID) {
        this.productID = productID;
    }

    public NodeExtendParam withMaxPods(Integer maxPods) {
        this.maxPods = maxPods;
        return this;
    }

    public Integer getMaxPods() {
        return maxPods;
    }

    public void setMaxPods(Integer maxPods) {
        this.maxPods = maxPods;
    }

    public NodeExtendParam withPeriodType(String periodType) {
        this.periodType = periodType;
        return this;
    }

    public String getPeriodType() {
        return periodType;
    }

    public void setPeriodType(String periodType) {
        this.periodType = periodType;
    }

    public NodeExtendParam withPeriodNum(Integer periodNum) {
        this.periodNum = periodNum;
        return this;
    }

    public Integer getPeriodNum() {
        return periodNum;
    }

    public void setPeriodNum(Integer periodNum) {
        this.periodNum = periodNum;
    }

    public NodeExtendParam withIsAutoRenew(String isAutoRenew) {
        this.isAutoRenew = isAutoRenew;
        return this;
    }

    public String getIsAutoRenew() {
        return isAutoRenew;
    }

    public void setIsAutoRenew(String isAutoRenew) {
        this.isAutoRenew = isAutoRenew;
    }

    public NodeExtendParam withIsAutoPay(String isAutoPay) {
        this.isAutoPay = isAutoPay;
        return this;
    }

    public String getIsAutoPay() {
        return isAutoPay;
    }

    public void setIsAutoPay(String isAutoPay) {
        this.isAutoPay = isAutoPay;
    }

    public NodeExtendParam withDockerLVMConfigOverride(String dockerLVMConfigOverride) {
        this.dockerLVMConfigOverride = dockerLVMConfigOverride;
        return this;
    }

    public String getDockerLVMConfigOverride() {
        return dockerLVMConfigOverride;
    }

    public void setDockerLVMConfigOverride(String dockerLVMConfigOverride) {
        this.dockerLVMConfigOverride = dockerLVMConfigOverride;
    }

    public NodeExtendParam withDockerBaseSize(Integer dockerBaseSize) {
        this.dockerBaseSize = dockerBaseSize;
        return this;
    }

    public Integer getDockerBaseSize() {
        return dockerBaseSize;
    }

    public void setDockerBaseSize(Integer dockerBaseSize) {
        this.dockerBaseSize = dockerBaseSize;
    }

    public NodeExtendParam withPublicKey(String publicKey) {
        this.publicKey = publicKey;
        return this;
    }

    public String getPublicKey() {
        return publicKey;
    }

    public void setPublicKey(String publicKey) {
        this.publicKey = publicKey;
    }

    public NodeExtendParam withAlphaCcePreInstall(String alphaCcePreInstall) {
        this.alphaCcePreInstall = alphaCcePreInstall;
        return this;
    }

    public String getAlphaCcePreInstall() {
        return alphaCcePreInstall;
    }

    public void setAlphaCcePreInstall(String alphaCcePreInstall) {
        this.alphaCcePreInstall = alphaCcePreInstall;
    }

    public NodeExtendParam withAlphaCcePostInstall(String alphaCcePostInstall) {
        this.alphaCcePostInstall = alphaCcePostInstall;
        return this;
    }

    public String getAlphaCcePostInstall() {
        return alphaCcePostInstall;
    }

    public void setAlphaCcePostInstall(String alphaCcePostInstall) {
        this.alphaCcePostInstall = alphaCcePostInstall;
    }

    public NodeExtendParam withAlphaCceNodeImageID(String alphaCceNodeImageID) {
        this.alphaCceNodeImageID = alphaCceNodeImageID;
        return this;
    }

    public String getAlphaCceNodeImageID() {
        return alphaCceNodeImageID;
    }

    public void setAlphaCceNodeImageID(String alphaCceNodeImageID) {
        this.alphaCceNodeImageID = alphaCceNodeImageID;
    }

    public NodeExtendParam withNicMultiqueue(String nicMultiqueue) {
        this.nicMultiqueue = nicMultiqueue;
        return this;
    }

    public String getNicMultiqueue() {
        return nicMultiqueue;
    }

    public void setNicMultiqueue(String nicMultiqueue) {
        this.nicMultiqueue = nicMultiqueue;
    }

    public NodeExtendParam withNicThreshold(String nicThreshold) {
        this.nicThreshold = nicThreshold;
        return this;
    }

    public String getNicThreshold() {
        return nicThreshold;
    }

    public void setNicThreshold(String nicThreshold) {
        this.nicThreshold = nicThreshold;
    }

    public NodeExtendParam withEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    public String getEnterpriseProjectId() {
        return enterpriseProjectId;
    }

    public void setEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
    }

    public NodeExtendParam withChargingMode(Integer chargingMode) {
        this.chargingMode = chargingMode;
        return this;
    }

    public Integer getChargingMode() {
        return chargingMode;
    }

    public void setChargingMode(Integer chargingMode) {
        this.chargingMode = chargingMode;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        NodeExtendParam nodeExtendParam = (NodeExtendParam) o;
        return Objects.equals(this.ecsPerformancetype, nodeExtendParam.ecsPerformancetype)
            && Objects.equals(this.orderID, nodeExtendParam.orderID)
            && Objects.equals(this.productID, nodeExtendParam.productID)
            && Objects.equals(this.maxPods, nodeExtendParam.maxPods)
            && Objects.equals(this.periodType, nodeExtendParam.periodType)
            && Objects.equals(this.periodNum, nodeExtendParam.periodNum)
            && Objects.equals(this.isAutoRenew, nodeExtendParam.isAutoRenew)
            && Objects.equals(this.isAutoPay, nodeExtendParam.isAutoPay)
            && Objects.equals(this.dockerLVMConfigOverride, nodeExtendParam.dockerLVMConfigOverride)
            && Objects.equals(this.dockerBaseSize, nodeExtendParam.dockerBaseSize)
            && Objects.equals(this.publicKey, nodeExtendParam.publicKey)
            && Objects.equals(this.alphaCcePreInstall, nodeExtendParam.alphaCcePreInstall)
            && Objects.equals(this.alphaCcePostInstall, nodeExtendParam.alphaCcePostInstall)
            && Objects.equals(this.alphaCceNodeImageID, nodeExtendParam.alphaCceNodeImageID)
            && Objects.equals(this.nicMultiqueue, nodeExtendParam.nicMultiqueue)
            && Objects.equals(this.nicThreshold, nodeExtendParam.nicThreshold)
            && Objects.equals(this.enterpriseProjectId, nodeExtendParam.enterpriseProjectId)
            && Objects.equals(this.chargingMode, nodeExtendParam.chargingMode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ecsPerformancetype,
            orderID,
            productID,
            maxPods,
            periodType,
            periodNum,
            isAutoRenew,
            isAutoPay,
            dockerLVMConfigOverride,
            dockerBaseSize,
            publicKey,
            alphaCcePreInstall,
            alphaCcePostInstall,
            alphaCceNodeImageID,
            nicMultiqueue,
            nicThreshold,
            enterpriseProjectId,
            chargingMode);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NodeExtendParam {\n");
        sb.append("    ecsPerformancetype: ").append(toIndentedString(ecsPerformancetype)).append("\n");
        sb.append("    orderID: ").append(toIndentedString(orderID)).append("\n");
        sb.append("    productID: ").append(toIndentedString(productID)).append("\n");
        sb.append("    maxPods: ").append(toIndentedString(maxPods)).append("\n");
        sb.append("    periodType: ").append(toIndentedString(periodType)).append("\n");
        sb.append("    periodNum: ").append(toIndentedString(periodNum)).append("\n");
        sb.append("    isAutoRenew: ").append(toIndentedString(isAutoRenew)).append("\n");
        sb.append("    isAutoPay: ").append(toIndentedString(isAutoPay)).append("\n");
        sb.append("    dockerLVMConfigOverride: ").append(toIndentedString(dockerLVMConfigOverride)).append("\n");
        sb.append("    dockerBaseSize: ").append(toIndentedString(dockerBaseSize)).append("\n");
        sb.append("    publicKey: ").append(toIndentedString(publicKey)).append("\n");
        sb.append("    alphaCcePreInstall: ").append(toIndentedString(alphaCcePreInstall)).append("\n");
        sb.append("    alphaCcePostInstall: ").append(toIndentedString(alphaCcePostInstall)).append("\n");
        sb.append("    alphaCceNodeImageID: ").append(toIndentedString(alphaCceNodeImageID)).append("\n");
        sb.append("    nicMultiqueue: ").append(toIndentedString(nicMultiqueue)).append("\n");
        sb.append("    nicThreshold: ").append(toIndentedString(nicThreshold)).append("\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
        sb.append("    chargingMode: ").append(toIndentedString(chargingMode)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
