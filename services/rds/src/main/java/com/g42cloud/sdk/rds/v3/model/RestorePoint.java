package com.g42cloud.sdk.rds.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * RestorePoint
 */
public class RestorePoint {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_id")

    private String instanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "backup_id")

    private String backupId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "restore_time")

    private Integer restoreTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "database_name")

    private Map<String, String> databaseName = null;

    public RestorePoint withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public RestorePoint withType(String type) {
        this.type = type;
        return this;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public RestorePoint withBackupId(String backupId) {
        this.backupId = backupId;
        return this;
    }

    public String getBackupId() {
        return backupId;
    }

    public void setBackupId(String backupId) {
        this.backupId = backupId;
    }

    public RestorePoint withRestoreTime(Integer restoreTime) {
        this.restoreTime = restoreTime;
        return this;
    }

    public Integer getRestoreTime() {
        return restoreTime;
    }

    public void setRestoreTime(Integer restoreTime) {
        this.restoreTime = restoreTime;
    }

    public RestorePoint withDatabaseName(Map<String, String> databaseName) {
        this.databaseName = databaseName;
        return this;
    }

    public RestorePoint putDatabaseNameItem(String key, String databaseNameItem) {
        if (this.databaseName == null) {
            this.databaseName = new HashMap<>();
        }
        this.databaseName.put(key, databaseNameItem);
        return this;
    }

    public RestorePoint withDatabaseName(Consumer<Map<String, String>> databaseNameSetter) {
        if (this.databaseName == null) {
            this.databaseName = new HashMap<>();
        }
        databaseNameSetter.accept(this.databaseName);
        return this;
    }

    public Map<String, String> getDatabaseName() {
        return databaseName;
    }

    public void setDatabaseName(Map<String, String> databaseName) {
        this.databaseName = databaseName;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RestorePoint restorePoint = (RestorePoint) o;
        return Objects.equals(this.instanceId, restorePoint.instanceId) && Objects.equals(this.type, restorePoint.type)
            && Objects.equals(this.backupId, restorePoint.backupId)
            && Objects.equals(this.restoreTime, restorePoint.restoreTime)
            && Objects.equals(this.databaseName, restorePoint.databaseName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(instanceId, type, backupId, restoreTime, databaseName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RestorePoint {\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    backupId: ").append(toIndentedString(backupId)).append("\n");
        sb.append("    restoreTime: ").append(toIndentedString(restoreTime)).append("\n");
        sb.append("    databaseName: ").append(toIndentedString(databaseName)).append("\n");
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
