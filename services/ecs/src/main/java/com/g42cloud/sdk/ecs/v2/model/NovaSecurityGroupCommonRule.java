package com.g42cloud.sdk.ecs.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 
 */
public class NovaSecurityGroupCommonRule {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "from_port")

    private Integer fromPort;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "group")

    private NovaSecurityGroupCommonGroup group;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ip_protocol")

    private String ipProtocol;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ip_range")

    private NovaSecurityGroupCommonIpRange ipRange;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "parent_group_id")

    private String parentGroupId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "to_port")

    private Integer toPort;

    public NovaSecurityGroupCommonRule withFromPort(Integer fromPort) {
        this.fromPort = fromPort;
        return this;
    }

    public Integer getFromPort() {
        return fromPort;
    }

    public void setFromPort(Integer fromPort) {
        this.fromPort = fromPort;
    }

    public NovaSecurityGroupCommonRule withGroup(NovaSecurityGroupCommonGroup group) {
        this.group = group;
        return this;
    }

    public NovaSecurityGroupCommonRule withGroup(Consumer<NovaSecurityGroupCommonGroup> groupSetter) {
        if (this.group == null) {
            this.group = new NovaSecurityGroupCommonGroup();
            groupSetter.accept(this.group);
        }

        return this;
    }

    public NovaSecurityGroupCommonGroup getGroup() {
        return group;
    }

    public void setGroup(NovaSecurityGroupCommonGroup group) {
        this.group = group;
    }

    public NovaSecurityGroupCommonRule withId(String id) {
        this.id = id;
        return this;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public NovaSecurityGroupCommonRule withIpProtocol(String ipProtocol) {
        this.ipProtocol = ipProtocol;
        return this;
    }

    public String getIpProtocol() {
        return ipProtocol;
    }

    public void setIpProtocol(String ipProtocol) {
        this.ipProtocol = ipProtocol;
    }

    public NovaSecurityGroupCommonRule withIpRange(NovaSecurityGroupCommonIpRange ipRange) {
        this.ipRange = ipRange;
        return this;
    }

    public NovaSecurityGroupCommonRule withIpRange(Consumer<NovaSecurityGroupCommonIpRange> ipRangeSetter) {
        if (this.ipRange == null) {
            this.ipRange = new NovaSecurityGroupCommonIpRange();
            ipRangeSetter.accept(this.ipRange);
        }

        return this;
    }

    public NovaSecurityGroupCommonIpRange getIpRange() {
        return ipRange;
    }

    public void setIpRange(NovaSecurityGroupCommonIpRange ipRange) {
        this.ipRange = ipRange;
    }

    public NovaSecurityGroupCommonRule withParentGroupId(String parentGroupId) {
        this.parentGroupId = parentGroupId;
        return this;
    }

    public String getParentGroupId() {
        return parentGroupId;
    }

    public void setParentGroupId(String parentGroupId) {
        this.parentGroupId = parentGroupId;
    }

    public NovaSecurityGroupCommonRule withToPort(Integer toPort) {
        this.toPort = toPort;
        return this;
    }

    public Integer getToPort() {
        return toPort;
    }

    public void setToPort(Integer toPort) {
        this.toPort = toPort;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        NovaSecurityGroupCommonRule novaSecurityGroupCommonRule = (NovaSecurityGroupCommonRule) o;
        return Objects.equals(this.fromPort, novaSecurityGroupCommonRule.fromPort)
            && Objects.equals(this.group, novaSecurityGroupCommonRule.group)
            && Objects.equals(this.id, novaSecurityGroupCommonRule.id)
            && Objects.equals(this.ipProtocol, novaSecurityGroupCommonRule.ipProtocol)
            && Objects.equals(this.ipRange, novaSecurityGroupCommonRule.ipRange)
            && Objects.equals(this.parentGroupId, novaSecurityGroupCommonRule.parentGroupId)
            && Objects.equals(this.toPort, novaSecurityGroupCommonRule.toPort);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fromPort, group, id, ipProtocol, ipRange, parentGroupId, toPort);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NovaSecurityGroupCommonRule {\n");
        sb.append("    fromPort: ").append(toIndentedString(fromPort)).append("\n");
        sb.append("    group: ").append(toIndentedString(group)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    ipProtocol: ").append(toIndentedString(ipProtocol)).append("\n");
        sb.append("    ipRange: ").append(toIndentedString(ipRange)).append("\n");
        sb.append("    parentGroupId: ").append(toIndentedString(parentGroupId)).append("\n");
        sb.append("    toPort: ").append(toIndentedString(toPort)).append("\n");
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
