package com.g42cloud.sdk.vpc.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 
 */
public class CreateAddressGroupOption {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ip_version")

    private Integer ipVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ip_set")

    private List<String> ipSet = null;

    public CreateAddressGroupOption withName(String name) {
        this.name = name;
        return this;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CreateAddressGroupOption withDescription(String description) {
        this.description = description;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public CreateAddressGroupOption withIpVersion(Integer ipVersion) {
        this.ipVersion = ipVersion;
        return this;
    }

    public Integer getIpVersion() {
        return ipVersion;
    }

    public void setIpVersion(Integer ipVersion) {
        this.ipVersion = ipVersion;
    }

    public CreateAddressGroupOption withIpSet(List<String> ipSet) {
        this.ipSet = ipSet;
        return this;
    }

    public CreateAddressGroupOption addIpSetItem(String ipSetItem) {
        if (this.ipSet == null) {
            this.ipSet = new ArrayList<>();
        }
        this.ipSet.add(ipSetItem);
        return this;
    }

    public CreateAddressGroupOption withIpSet(Consumer<List<String>> ipSetSetter) {
        if (this.ipSet == null) {
            this.ipSet = new ArrayList<>();
        }
        ipSetSetter.accept(this.ipSet);
        return this;
    }

    public List<String> getIpSet() {
        return ipSet;
    }

    public void setIpSet(List<String> ipSet) {
        this.ipSet = ipSet;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateAddressGroupOption createAddressGroupOption = (CreateAddressGroupOption) o;
        return Objects.equals(this.name, createAddressGroupOption.name)
            && Objects.equals(this.description, createAddressGroupOption.description)
            && Objects.equals(this.ipVersion, createAddressGroupOption.ipVersion)
            && Objects.equals(this.ipSet, createAddressGroupOption.ipSet);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, description, ipVersion, ipSet);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateAddressGroupOption {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    ipVersion: ").append(toIndentedString(ipVersion)).append("\n");
        sb.append("    ipSet: ").append(toIndentedString(ipSet)).append("\n");
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
