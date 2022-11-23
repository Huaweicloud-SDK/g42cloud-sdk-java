package com.g42cloud.sdk.cce.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * authenticatingProxy模式相关配置。认证模式为authenticating_proxy时必选
 */
public class AuthenticatingProxy {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ca")

    private String ca;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cert")

    private String cert;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "privateKey")

    private String privateKey;

    public AuthenticatingProxy withCa(String ca) {
        this.ca = ca;
        return this;
    }

    public String getCa() {
        return ca;
    }

    public void setCa(String ca) {
        this.ca = ca;
    }

    public AuthenticatingProxy withCert(String cert) {
        this.cert = cert;
        return this;
    }

    public String getCert() {
        return cert;
    }

    public void setCert(String cert) {
        this.cert = cert;
    }

    public AuthenticatingProxy withPrivateKey(String privateKey) {
        this.privateKey = privateKey;
        return this;
    }

    public String getPrivateKey() {
        return privateKey;
    }

    public void setPrivateKey(String privateKey) {
        this.privateKey = privateKey;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AuthenticatingProxy authenticatingProxy = (AuthenticatingProxy) o;
        return Objects.equals(this.ca, authenticatingProxy.ca) && Objects.equals(this.cert, authenticatingProxy.cert)
            && Objects.equals(this.privateKey, authenticatingProxy.privateKey);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ca, cert, privateKey);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AuthenticatingProxy {\n");
        sb.append("    ca: ").append(toIndentedString(ca)).append("\n");
        sb.append("    cert: ").append(toIndentedString(cert)).append("\n");
        sb.append("    privateKey: ").append(toIndentedString(privateKey)).append("\n");
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
