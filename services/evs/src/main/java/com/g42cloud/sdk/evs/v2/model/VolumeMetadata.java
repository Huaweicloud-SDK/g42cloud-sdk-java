package com.g42cloud.sdk.evs.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 云硬盘的元数据。
 */
public class VolumeMetadata {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "__system__cmkid")

    private String systemCmkid;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "__system__encrypted")

    private String systemEncrypted;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "full_clone")

    private String fullClone;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "hw:passthrough")

    private String hwPassthrough;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "orderID")

    private String orderID;

    public VolumeMetadata withSystemCmkid(String systemCmkid) {
        this.systemCmkid = systemCmkid;
        return this;
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "__system__cmkid")
    public String getSystemCmkid() {
        return systemCmkid;
    }

    public void setSystemCmkid(String systemCmkid) {
        this.systemCmkid = systemCmkid;
    }

    public VolumeMetadata withSystemEncrypted(String systemEncrypted) {
        this.systemEncrypted = systemEncrypted;
        return this;
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "__system__encrypted")
    public String getSystemEncrypted() {
        return systemEncrypted;
    }

    public void setSystemEncrypted(String systemEncrypted) {
        this.systemEncrypted = systemEncrypted;
    }

    public VolumeMetadata withFullClone(String fullClone) {
        this.fullClone = fullClone;
        return this;
    }

    public String getFullClone() {
        return fullClone;
    }

    public void setFullClone(String fullClone) {
        this.fullClone = fullClone;
    }

    public VolumeMetadata withHwPassthrough(String hwPassthrough) {
        this.hwPassthrough = hwPassthrough;
        return this;
    }

    public String getHwPassthrough() {
        return hwPassthrough;
    }

    public void setHwPassthrough(String hwPassthrough) {
        this.hwPassthrough = hwPassthrough;
    }

    public VolumeMetadata withOrderID(String orderID) {
        this.orderID = orderID;
        return this;
    }

    public String getOrderID() {
        return orderID;
    }

    public void setOrderID(String orderID) {
        this.orderID = orderID;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        VolumeMetadata volumeMetadata = (VolumeMetadata) o;
        return Objects.equals(this.systemCmkid, volumeMetadata.systemCmkid)
            && Objects.equals(this.systemEncrypted, volumeMetadata.systemEncrypted)
            && Objects.equals(this.fullClone, volumeMetadata.fullClone)
            && Objects.equals(this.hwPassthrough, volumeMetadata.hwPassthrough)
            && Objects.equals(this.orderID, volumeMetadata.orderID);
    }

    @Override
    public int hashCode() {
        return Objects.hash(systemCmkid, systemEncrypted, fullClone, hwPassthrough, orderID);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class VolumeMetadata {\n");
        sb.append("    systemCmkid: ").append(toIndentedString(systemCmkid)).append("\n");
        sb.append("    systemEncrypted: ").append(toIndentedString(systemEncrypted)).append("\n");
        sb.append("    fullClone: ").append(toIndentedString(fullClone)).append("\n");
        sb.append("    hwPassthrough: ").append(toIndentedString(hwPassthrough)).append("\n");
        sb.append("    orderID: ").append(toIndentedString(orderID)).append("\n");
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
