package com.g42cloud.sdk.ecs.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 
 */
public class PostPaidServerRootVolumeExtendParam {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resourceSpecCode")

    private String resourceSpecCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resourceType")

    private String resourceType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "snapshotId")

    private String snapshotId;

    public PostPaidServerRootVolumeExtendParam withResourceSpecCode(String resourceSpecCode) {
        this.resourceSpecCode = resourceSpecCode;
        return this;
    }

    public String getResourceSpecCode() {
        return resourceSpecCode;
    }

    public void setResourceSpecCode(String resourceSpecCode) {
        this.resourceSpecCode = resourceSpecCode;
    }

    public PostPaidServerRootVolumeExtendParam withResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }

    public String getResourceType() {
        return resourceType;
    }

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    public PostPaidServerRootVolumeExtendParam withSnapshotId(String snapshotId) {
        this.snapshotId = snapshotId;
        return this;
    }

    public String getSnapshotId() {
        return snapshotId;
    }

    public void setSnapshotId(String snapshotId) {
        this.snapshotId = snapshotId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PostPaidServerRootVolumeExtendParam postPaidServerRootVolumeExtendParam =
            (PostPaidServerRootVolumeExtendParam) o;
        return Objects.equals(this.resourceSpecCode, postPaidServerRootVolumeExtendParam.resourceSpecCode)
            && Objects.equals(this.resourceType, postPaidServerRootVolumeExtendParam.resourceType)
            && Objects.equals(this.snapshotId, postPaidServerRootVolumeExtendParam.snapshotId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(resourceSpecCode, resourceType, snapshotId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PostPaidServerRootVolumeExtendParam {\n");
        sb.append("    resourceSpecCode: ").append(toIndentedString(resourceSpecCode)).append("\n");
        sb.append("    resourceType: ").append(toIndentedString(resourceType)).append("\n");
        sb.append("    snapshotId: ").append(toIndentedString(snapshotId)).append("\n");
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
