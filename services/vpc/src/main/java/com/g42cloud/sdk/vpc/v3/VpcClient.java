package com.g42cloud.sdk.vpc.v3;

import com.g42cloud.sdk.vpc.v3.model.*;
import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.SyncInvoker;

public class VpcClient {

    protected HcClient hcClient;

    public VpcClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<VpcClient> newBuilder() {
        return new ClientBuilder<>(VpcClient::new);
    }

    public BatchCreateSubNetworkInterfaceResponse batchCreateSubNetworkInterface(
        BatchCreateSubNetworkInterfaceRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.batchCreateSubNetworkInterface);
    }

    public SyncInvoker<BatchCreateSubNetworkInterfaceRequest, BatchCreateSubNetworkInterfaceResponse> batchCreateSubNetworkInterfaceInvoker(
        BatchCreateSubNetworkInterfaceRequest request) {
        return new SyncInvoker<BatchCreateSubNetworkInterfaceRequest, BatchCreateSubNetworkInterfaceResponse>(request,
            VpcMeta.batchCreateSubNetworkInterface, hcClient);
    }

    public CreateSecurityGroupResponse createSecurityGroup(CreateSecurityGroupRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.createSecurityGroup);
    }

    public SyncInvoker<CreateSecurityGroupRequest, CreateSecurityGroupResponse> createSecurityGroupInvoker(
        CreateSecurityGroupRequest request) {
        return new SyncInvoker<CreateSecurityGroupRequest, CreateSecurityGroupResponse>(request,
            VpcMeta.createSecurityGroup, hcClient);
    }

    public CreateSecurityGroupRuleResponse createSecurityGroupRule(CreateSecurityGroupRuleRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.createSecurityGroupRule);
    }

    public SyncInvoker<CreateSecurityGroupRuleRequest, CreateSecurityGroupRuleResponse> createSecurityGroupRuleInvoker(
        CreateSecurityGroupRuleRequest request) {
        return new SyncInvoker<CreateSecurityGroupRuleRequest, CreateSecurityGroupRuleResponse>(request,
            VpcMeta.createSecurityGroupRule, hcClient);
    }

    public CreateSubNetworkInterfaceResponse createSubNetworkInterface(CreateSubNetworkInterfaceRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.createSubNetworkInterface);
    }

    public SyncInvoker<CreateSubNetworkInterfaceRequest, CreateSubNetworkInterfaceResponse> createSubNetworkInterfaceInvoker(
        CreateSubNetworkInterfaceRequest request) {
        return new SyncInvoker<CreateSubNetworkInterfaceRequest, CreateSubNetworkInterfaceResponse>(request,
            VpcMeta.createSubNetworkInterface, hcClient);
    }

    public DeleteSecurityGroupResponse deleteSecurityGroup(DeleteSecurityGroupRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.deleteSecurityGroup);
    }

    public SyncInvoker<DeleteSecurityGroupRequest, DeleteSecurityGroupResponse> deleteSecurityGroupInvoker(
        DeleteSecurityGroupRequest request) {
        return new SyncInvoker<DeleteSecurityGroupRequest, DeleteSecurityGroupResponse>(request,
            VpcMeta.deleteSecurityGroup, hcClient);
    }

    public DeleteSecurityGroupRuleResponse deleteSecurityGroupRule(DeleteSecurityGroupRuleRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.deleteSecurityGroupRule);
    }

    public SyncInvoker<DeleteSecurityGroupRuleRequest, DeleteSecurityGroupRuleResponse> deleteSecurityGroupRuleInvoker(
        DeleteSecurityGroupRuleRequest request) {
        return new SyncInvoker<DeleteSecurityGroupRuleRequest, DeleteSecurityGroupRuleResponse>(request,
            VpcMeta.deleteSecurityGroupRule, hcClient);
    }

    public DeleteSubNetworkInterfaceResponse deleteSubNetworkInterface(DeleteSubNetworkInterfaceRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.deleteSubNetworkInterface);
    }

    public SyncInvoker<DeleteSubNetworkInterfaceRequest, DeleteSubNetworkInterfaceResponse> deleteSubNetworkInterfaceInvoker(
        DeleteSubNetworkInterfaceRequest request) {
        return new SyncInvoker<DeleteSubNetworkInterfaceRequest, DeleteSubNetworkInterfaceResponse>(request,
            VpcMeta.deleteSubNetworkInterface, hcClient);
    }

    public ListSecurityGroupRulesResponse listSecurityGroupRules(ListSecurityGroupRulesRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.listSecurityGroupRules);
    }

    public SyncInvoker<ListSecurityGroupRulesRequest, ListSecurityGroupRulesResponse> listSecurityGroupRulesInvoker(
        ListSecurityGroupRulesRequest request) {
        return new SyncInvoker<ListSecurityGroupRulesRequest, ListSecurityGroupRulesResponse>(request,
            VpcMeta.listSecurityGroupRules, hcClient);
    }

    public ListSecurityGroupsResponse listSecurityGroups(ListSecurityGroupsRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.listSecurityGroups);
    }

    public SyncInvoker<ListSecurityGroupsRequest, ListSecurityGroupsResponse> listSecurityGroupsInvoker(
        ListSecurityGroupsRequest request) {
        return new SyncInvoker<ListSecurityGroupsRequest, ListSecurityGroupsResponse>(request,
            VpcMeta.listSecurityGroups, hcClient);
    }

    public ListSubNetworkInterfacesResponse listSubNetworkInterfaces(ListSubNetworkInterfacesRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.listSubNetworkInterfaces);
    }

    public SyncInvoker<ListSubNetworkInterfacesRequest, ListSubNetworkInterfacesResponse> listSubNetworkInterfacesInvoker(
        ListSubNetworkInterfacesRequest request) {
        return new SyncInvoker<ListSubNetworkInterfacesRequest, ListSubNetworkInterfacesResponse>(request,
            VpcMeta.listSubNetworkInterfaces, hcClient);
    }

    public MigrateSubNetworkInterfaceResponse migrateSubNetworkInterface(MigrateSubNetworkInterfaceRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.migrateSubNetworkInterface);
    }

    public SyncInvoker<MigrateSubNetworkInterfaceRequest, MigrateSubNetworkInterfaceResponse> migrateSubNetworkInterfaceInvoker(
        MigrateSubNetworkInterfaceRequest request) {
        return new SyncInvoker<MigrateSubNetworkInterfaceRequest, MigrateSubNetworkInterfaceResponse>(request,
            VpcMeta.migrateSubNetworkInterface, hcClient);
    }

    public ShowSecurityGroupResponse showSecurityGroup(ShowSecurityGroupRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.showSecurityGroup);
    }

    public SyncInvoker<ShowSecurityGroupRequest, ShowSecurityGroupResponse> showSecurityGroupInvoker(
        ShowSecurityGroupRequest request) {
        return new SyncInvoker<ShowSecurityGroupRequest, ShowSecurityGroupResponse>(request, VpcMeta.showSecurityGroup,
            hcClient);
    }

    public ShowSecurityGroupRuleResponse showSecurityGroupRule(ShowSecurityGroupRuleRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.showSecurityGroupRule);
    }

    public SyncInvoker<ShowSecurityGroupRuleRequest, ShowSecurityGroupRuleResponse> showSecurityGroupRuleInvoker(
        ShowSecurityGroupRuleRequest request) {
        return new SyncInvoker<ShowSecurityGroupRuleRequest, ShowSecurityGroupRuleResponse>(request,
            VpcMeta.showSecurityGroupRule, hcClient);
    }

    public ShowSubNetworkInterfaceResponse showSubNetworkInterface(ShowSubNetworkInterfaceRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.showSubNetworkInterface);
    }

    public SyncInvoker<ShowSubNetworkInterfaceRequest, ShowSubNetworkInterfaceResponse> showSubNetworkInterfaceInvoker(
        ShowSubNetworkInterfaceRequest request) {
        return new SyncInvoker<ShowSubNetworkInterfaceRequest, ShowSubNetworkInterfaceResponse>(request,
            VpcMeta.showSubNetworkInterface, hcClient);
    }

    public ShowSubNetworkInterfacesQuantityResponse showSubNetworkInterfacesQuantity(
        ShowSubNetworkInterfacesQuantityRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.showSubNetworkInterfacesQuantity);
    }

    public SyncInvoker<ShowSubNetworkInterfacesQuantityRequest, ShowSubNetworkInterfacesQuantityResponse> showSubNetworkInterfacesQuantityInvoker(
        ShowSubNetworkInterfacesQuantityRequest request) {
        return new SyncInvoker<ShowSubNetworkInterfacesQuantityRequest, ShowSubNetworkInterfacesQuantityResponse>(
            request, VpcMeta.showSubNetworkInterfacesQuantity, hcClient);
    }

    public UpdateSecurityGroupResponse updateSecurityGroup(UpdateSecurityGroupRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.updateSecurityGroup);
    }

    public SyncInvoker<UpdateSecurityGroupRequest, UpdateSecurityGroupResponse> updateSecurityGroupInvoker(
        UpdateSecurityGroupRequest request) {
        return new SyncInvoker<UpdateSecurityGroupRequest, UpdateSecurityGroupResponse>(request,
            VpcMeta.updateSecurityGroup, hcClient);
    }

    public UpdateSubNetworkInterfaceResponse updateSubNetworkInterface(UpdateSubNetworkInterfaceRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.updateSubNetworkInterface);
    }

    public SyncInvoker<UpdateSubNetworkInterfaceRequest, UpdateSubNetworkInterfaceResponse> updateSubNetworkInterfaceInvoker(
        UpdateSubNetworkInterfaceRequest request) {
        return new SyncInvoker<UpdateSubNetworkInterfaceRequest, UpdateSubNetworkInterfaceResponse>(request,
            VpcMeta.updateSubNetworkInterface, hcClient);
    }

    public CreateAddressGroupResponse createAddressGroup(CreateAddressGroupRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.createAddressGroup);
    }

    public SyncInvoker<CreateAddressGroupRequest, CreateAddressGroupResponse> createAddressGroupInvoker(
        CreateAddressGroupRequest request) {
        return new SyncInvoker<CreateAddressGroupRequest, CreateAddressGroupResponse>(request,
            VpcMeta.createAddressGroup, hcClient);
    }

    public DeleteAddressGroupResponse deleteAddressGroup(DeleteAddressGroupRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.deleteAddressGroup);
    }

    public SyncInvoker<DeleteAddressGroupRequest, DeleteAddressGroupResponse> deleteAddressGroupInvoker(
        DeleteAddressGroupRequest request) {
        return new SyncInvoker<DeleteAddressGroupRequest, DeleteAddressGroupResponse>(request,
            VpcMeta.deleteAddressGroup, hcClient);
    }

    public DeleteIpAddressGroupForceResponse deleteIpAddressGroupForce(DeleteIpAddressGroupForceRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.deleteIpAddressGroupForce);
    }

    public SyncInvoker<DeleteIpAddressGroupForceRequest, DeleteIpAddressGroupForceResponse> deleteIpAddressGroupForceInvoker(
        DeleteIpAddressGroupForceRequest request) {
        return new SyncInvoker<DeleteIpAddressGroupForceRequest, DeleteIpAddressGroupForceResponse>(request,
            VpcMeta.deleteIpAddressGroupForce, hcClient);
    }

    public ListAddressGroupResponse listAddressGroup(ListAddressGroupRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.listAddressGroup);
    }

    public SyncInvoker<ListAddressGroupRequest, ListAddressGroupResponse> listAddressGroupInvoker(
        ListAddressGroupRequest request) {
        return new SyncInvoker<ListAddressGroupRequest, ListAddressGroupResponse>(request, VpcMeta.listAddressGroup,
            hcClient);
    }

    public ShowAddressGroupResponse showAddressGroup(ShowAddressGroupRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.showAddressGroup);
    }

    public SyncInvoker<ShowAddressGroupRequest, ShowAddressGroupResponse> showAddressGroupInvoker(
        ShowAddressGroupRequest request) {
        return new SyncInvoker<ShowAddressGroupRequest, ShowAddressGroupResponse>(request, VpcMeta.showAddressGroup,
            hcClient);
    }

    public UpdateAddressGroupResponse updateAddressGroup(UpdateAddressGroupRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.updateAddressGroup);
    }

    public SyncInvoker<UpdateAddressGroupRequest, UpdateAddressGroupResponse> updateAddressGroupInvoker(
        UpdateAddressGroupRequest request) {
        return new SyncInvoker<UpdateAddressGroupRequest, UpdateAddressGroupResponse>(request,
            VpcMeta.updateAddressGroup, hcClient);
    }

    public AddVpcExtendCidrResponse addVpcExtendCidr(AddVpcExtendCidrRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.addVpcExtendCidr);
    }

    public SyncInvoker<AddVpcExtendCidrRequest, AddVpcExtendCidrResponse> addVpcExtendCidrInvoker(
        AddVpcExtendCidrRequest request) {
        return new SyncInvoker<AddVpcExtendCidrRequest, AddVpcExtendCidrResponse>(request, VpcMeta.addVpcExtendCidr,
            hcClient);
    }

    public CreateVpcResponse createVpc(CreateVpcRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.createVpc);
    }

    public SyncInvoker<CreateVpcRequest, CreateVpcResponse> createVpcInvoker(CreateVpcRequest request) {
        return new SyncInvoker<CreateVpcRequest, CreateVpcResponse>(request, VpcMeta.createVpc, hcClient);
    }

    public DeleteVpcResponse deleteVpc(DeleteVpcRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.deleteVpc);
    }

    public SyncInvoker<DeleteVpcRequest, DeleteVpcResponse> deleteVpcInvoker(DeleteVpcRequest request) {
        return new SyncInvoker<DeleteVpcRequest, DeleteVpcResponse>(request, VpcMeta.deleteVpc, hcClient);
    }

    public ListVpcsResponse listVpcs(ListVpcsRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.listVpcs);
    }

    public SyncInvoker<ListVpcsRequest, ListVpcsResponse> listVpcsInvoker(ListVpcsRequest request) {
        return new SyncInvoker<ListVpcsRequest, ListVpcsResponse>(request, VpcMeta.listVpcs, hcClient);
    }

    public RemoveVpcExtendCidrResponse removeVpcExtendCidr(RemoveVpcExtendCidrRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.removeVpcExtendCidr);
    }

    public SyncInvoker<RemoveVpcExtendCidrRequest, RemoveVpcExtendCidrResponse> removeVpcExtendCidrInvoker(
        RemoveVpcExtendCidrRequest request) {
        return new SyncInvoker<RemoveVpcExtendCidrRequest, RemoveVpcExtendCidrResponse>(request,
            VpcMeta.removeVpcExtendCidr, hcClient);
    }

    public ShowVpcResponse showVpc(ShowVpcRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.showVpc);
    }

    public SyncInvoker<ShowVpcRequest, ShowVpcResponse> showVpcInvoker(ShowVpcRequest request) {
        return new SyncInvoker<ShowVpcRequest, ShowVpcResponse>(request, VpcMeta.showVpc, hcClient);
    }

    public UpdateVpcResponse updateVpc(UpdateVpcRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.updateVpc);
    }

    public SyncInvoker<UpdateVpcRequest, UpdateVpcResponse> updateVpcInvoker(UpdateVpcRequest request) {
        return new SyncInvoker<UpdateVpcRequest, UpdateVpcResponse>(request, VpcMeta.updateVpc, hcClient);
    }

}
