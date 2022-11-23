package com.g42cloud.sdk.vpc.v2;

import com.g42cloud.sdk.vpc.v2.model.*;
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

    public AcceptVpcPeeringResponse acceptVpcPeering(AcceptVpcPeeringRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.acceptVpcPeering);
    }

    public SyncInvoker<AcceptVpcPeeringRequest, AcceptVpcPeeringResponse> acceptVpcPeeringInvoker(
        AcceptVpcPeeringRequest request) {
        return new SyncInvoker<AcceptVpcPeeringRequest, AcceptVpcPeeringResponse>(request, VpcMeta.acceptVpcPeering,
            hcClient);
    }

    public AssociateRouteTableResponse associateRouteTable(AssociateRouteTableRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.associateRouteTable);
    }

    public SyncInvoker<AssociateRouteTableRequest, AssociateRouteTableResponse> associateRouteTableInvoker(
        AssociateRouteTableRequest request) {
        return new SyncInvoker<AssociateRouteTableRequest, AssociateRouteTableResponse>(request,
            VpcMeta.associateRouteTable, hcClient);
    }

    public BatchCreateSubnetTagsResponse batchCreateSubnetTags(BatchCreateSubnetTagsRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.batchCreateSubnetTags);
    }

    public SyncInvoker<BatchCreateSubnetTagsRequest, BatchCreateSubnetTagsResponse> batchCreateSubnetTagsInvoker(
        BatchCreateSubnetTagsRequest request) {
        return new SyncInvoker<BatchCreateSubnetTagsRequest, BatchCreateSubnetTagsResponse>(request,
            VpcMeta.batchCreateSubnetTags, hcClient);
    }

    public BatchDeleteSubnetTagsResponse batchDeleteSubnetTags(BatchDeleteSubnetTagsRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.batchDeleteSubnetTags);
    }

    public SyncInvoker<BatchDeleteSubnetTagsRequest, BatchDeleteSubnetTagsResponse> batchDeleteSubnetTagsInvoker(
        BatchDeleteSubnetTagsRequest request) {
        return new SyncInvoker<BatchDeleteSubnetTagsRequest, BatchDeleteSubnetTagsResponse>(request,
            VpcMeta.batchDeleteSubnetTags, hcClient);
    }

    public CreatePortResponse createPort(CreatePortRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.createPort);
    }

    public SyncInvoker<CreatePortRequest, CreatePortResponse> createPortInvoker(CreatePortRequest request) {
        return new SyncInvoker<CreatePortRequest, CreatePortResponse>(request, VpcMeta.createPort, hcClient);
    }

    public CreateRouteTableResponse createRouteTable(CreateRouteTableRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.createRouteTable);
    }

    public SyncInvoker<CreateRouteTableRequest, CreateRouteTableResponse> createRouteTableInvoker(
        CreateRouteTableRequest request) {
        return new SyncInvoker<CreateRouteTableRequest, CreateRouteTableResponse>(request, VpcMeta.createRouteTable,
            hcClient);
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

    public CreateSubnetResponse createSubnet(CreateSubnetRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.createSubnet);
    }

    public SyncInvoker<CreateSubnetRequest, CreateSubnetResponse> createSubnetInvoker(CreateSubnetRequest request) {
        return new SyncInvoker<CreateSubnetRequest, CreateSubnetResponse>(request, VpcMeta.createSubnet, hcClient);
    }

    public CreateSubnetTagResponse createSubnetTag(CreateSubnetTagRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.createSubnetTag);
    }

    public SyncInvoker<CreateSubnetTagRequest, CreateSubnetTagResponse> createSubnetTagInvoker(
        CreateSubnetTagRequest request) {
        return new SyncInvoker<CreateSubnetTagRequest, CreateSubnetTagResponse>(request, VpcMeta.createSubnetTag,
            hcClient);
    }

    public CreateVpcPeeringResponse createVpcPeering(CreateVpcPeeringRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.createVpcPeering);
    }

    public SyncInvoker<CreateVpcPeeringRequest, CreateVpcPeeringResponse> createVpcPeeringInvoker(
        CreateVpcPeeringRequest request) {
        return new SyncInvoker<CreateVpcPeeringRequest, CreateVpcPeeringResponse>(request, VpcMeta.createVpcPeering,
            hcClient);
    }

    public DeletePortResponse deletePort(DeletePortRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.deletePort);
    }

    public SyncInvoker<DeletePortRequest, DeletePortResponse> deletePortInvoker(DeletePortRequest request) {
        return new SyncInvoker<DeletePortRequest, DeletePortResponse>(request, VpcMeta.deletePort, hcClient);
    }

    public DeleteRouteTableResponse deleteRouteTable(DeleteRouteTableRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.deleteRouteTable);
    }

    public SyncInvoker<DeleteRouteTableRequest, DeleteRouteTableResponse> deleteRouteTableInvoker(
        DeleteRouteTableRequest request) {
        return new SyncInvoker<DeleteRouteTableRequest, DeleteRouteTableResponse>(request, VpcMeta.deleteRouteTable,
            hcClient);
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

    public DeleteSubnetResponse deleteSubnet(DeleteSubnetRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.deleteSubnet);
    }

    public SyncInvoker<DeleteSubnetRequest, DeleteSubnetResponse> deleteSubnetInvoker(DeleteSubnetRequest request) {
        return new SyncInvoker<DeleteSubnetRequest, DeleteSubnetResponse>(request, VpcMeta.deleteSubnet, hcClient);
    }

    public DeleteSubnetTagResponse deleteSubnetTag(DeleteSubnetTagRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.deleteSubnetTag);
    }

    public SyncInvoker<DeleteSubnetTagRequest, DeleteSubnetTagResponse> deleteSubnetTagInvoker(
        DeleteSubnetTagRequest request) {
        return new SyncInvoker<DeleteSubnetTagRequest, DeleteSubnetTagResponse>(request, VpcMeta.deleteSubnetTag,
            hcClient);
    }

    public DeleteVpcPeeringResponse deleteVpcPeering(DeleteVpcPeeringRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.deleteVpcPeering);
    }

    public SyncInvoker<DeleteVpcPeeringRequest, DeleteVpcPeeringResponse> deleteVpcPeeringInvoker(
        DeleteVpcPeeringRequest request) {
        return new SyncInvoker<DeleteVpcPeeringRequest, DeleteVpcPeeringResponse>(request, VpcMeta.deleteVpcPeering,
            hcClient);
    }

    public DisassociateRouteTableResponse disassociateRouteTable(DisassociateRouteTableRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.disassociateRouteTable);
    }

    public SyncInvoker<DisassociateRouteTableRequest, DisassociateRouteTableResponse> disassociateRouteTableInvoker(
        DisassociateRouteTableRequest request) {
        return new SyncInvoker<DisassociateRouteTableRequest, DisassociateRouteTableResponse>(request,
            VpcMeta.disassociateRouteTable, hcClient);
    }

    public ListPortsResponse listPorts(ListPortsRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.listPorts);
    }

    public SyncInvoker<ListPortsRequest, ListPortsResponse> listPortsInvoker(ListPortsRequest request) {
        return new SyncInvoker<ListPortsRequest, ListPortsResponse>(request, VpcMeta.listPorts, hcClient);
    }

    public ListRouteTablesResponse listRouteTables(ListRouteTablesRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.listRouteTables);
    }

    public SyncInvoker<ListRouteTablesRequest, ListRouteTablesResponse> listRouteTablesInvoker(
        ListRouteTablesRequest request) {
        return new SyncInvoker<ListRouteTablesRequest, ListRouteTablesResponse>(request, VpcMeta.listRouteTables,
            hcClient);
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

    public ListSubnetTagsResponse listSubnetTags(ListSubnetTagsRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.listSubnetTags);
    }

    public SyncInvoker<ListSubnetTagsRequest, ListSubnetTagsResponse> listSubnetTagsInvoker(
        ListSubnetTagsRequest request) {
        return new SyncInvoker<ListSubnetTagsRequest, ListSubnetTagsResponse>(request, VpcMeta.listSubnetTags,
            hcClient);
    }

    public ListSubnetsResponse listSubnets(ListSubnetsRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.listSubnets);
    }

    public SyncInvoker<ListSubnetsRequest, ListSubnetsResponse> listSubnetsInvoker(ListSubnetsRequest request) {
        return new SyncInvoker<ListSubnetsRequest, ListSubnetsResponse>(request, VpcMeta.listSubnets, hcClient);
    }

    public ListSubnetsByTagsResponse listSubnetsByTags(ListSubnetsByTagsRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.listSubnetsByTags);
    }

    public SyncInvoker<ListSubnetsByTagsRequest, ListSubnetsByTagsResponse> listSubnetsByTagsInvoker(
        ListSubnetsByTagsRequest request) {
        return new SyncInvoker<ListSubnetsByTagsRequest, ListSubnetsByTagsResponse>(request, VpcMeta.listSubnetsByTags,
            hcClient);
    }

    public ListVpcPeeringsResponse listVpcPeerings(ListVpcPeeringsRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.listVpcPeerings);
    }

    public SyncInvoker<ListVpcPeeringsRequest, ListVpcPeeringsResponse> listVpcPeeringsInvoker(
        ListVpcPeeringsRequest request) {
        return new SyncInvoker<ListVpcPeeringsRequest, ListVpcPeeringsResponse>(request, VpcMeta.listVpcPeerings,
            hcClient);
    }

    public RejectVpcPeeringResponse rejectVpcPeering(RejectVpcPeeringRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.rejectVpcPeering);
    }

    public SyncInvoker<RejectVpcPeeringRequest, RejectVpcPeeringResponse> rejectVpcPeeringInvoker(
        RejectVpcPeeringRequest request) {
        return new SyncInvoker<RejectVpcPeeringRequest, RejectVpcPeeringResponse>(request, VpcMeta.rejectVpcPeering,
            hcClient);
    }

    public ShowPortResponse showPort(ShowPortRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.showPort);
    }

    public SyncInvoker<ShowPortRequest, ShowPortResponse> showPortInvoker(ShowPortRequest request) {
        return new SyncInvoker<ShowPortRequest, ShowPortResponse>(request, VpcMeta.showPort, hcClient);
    }

    public ShowQuotaResponse showQuota(ShowQuotaRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.showQuota);
    }

    public SyncInvoker<ShowQuotaRequest, ShowQuotaResponse> showQuotaInvoker(ShowQuotaRequest request) {
        return new SyncInvoker<ShowQuotaRequest, ShowQuotaResponse>(request, VpcMeta.showQuota, hcClient);
    }

    public ShowRouteTableResponse showRouteTable(ShowRouteTableRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.showRouteTable);
    }

    public SyncInvoker<ShowRouteTableRequest, ShowRouteTableResponse> showRouteTableInvoker(
        ShowRouteTableRequest request) {
        return new SyncInvoker<ShowRouteTableRequest, ShowRouteTableResponse>(request, VpcMeta.showRouteTable,
            hcClient);
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

    public ShowSubnetResponse showSubnet(ShowSubnetRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.showSubnet);
    }

    public SyncInvoker<ShowSubnetRequest, ShowSubnetResponse> showSubnetInvoker(ShowSubnetRequest request) {
        return new SyncInvoker<ShowSubnetRequest, ShowSubnetResponse>(request, VpcMeta.showSubnet, hcClient);
    }

    public ShowSubnetTagsResponse showSubnetTags(ShowSubnetTagsRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.showSubnetTags);
    }

    public SyncInvoker<ShowSubnetTagsRequest, ShowSubnetTagsResponse> showSubnetTagsInvoker(
        ShowSubnetTagsRequest request) {
        return new SyncInvoker<ShowSubnetTagsRequest, ShowSubnetTagsResponse>(request, VpcMeta.showSubnetTags,
            hcClient);
    }

    public ShowVpcPeeringResponse showVpcPeering(ShowVpcPeeringRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.showVpcPeering);
    }

    public SyncInvoker<ShowVpcPeeringRequest, ShowVpcPeeringResponse> showVpcPeeringInvoker(
        ShowVpcPeeringRequest request) {
        return new SyncInvoker<ShowVpcPeeringRequest, ShowVpcPeeringResponse>(request, VpcMeta.showVpcPeering,
            hcClient);
    }

    public UpdatePortResponse updatePort(UpdatePortRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.updatePort);
    }

    public SyncInvoker<UpdatePortRequest, UpdatePortResponse> updatePortInvoker(UpdatePortRequest request) {
        return new SyncInvoker<UpdatePortRequest, UpdatePortResponse>(request, VpcMeta.updatePort, hcClient);
    }

    public UpdateRouteTableResponse updateRouteTable(UpdateRouteTableRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.updateRouteTable);
    }

    public SyncInvoker<UpdateRouteTableRequest, UpdateRouteTableResponse> updateRouteTableInvoker(
        UpdateRouteTableRequest request) {
        return new SyncInvoker<UpdateRouteTableRequest, UpdateRouteTableResponse>(request, VpcMeta.updateRouteTable,
            hcClient);
    }

    public UpdateSubnetResponse updateSubnet(UpdateSubnetRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.updateSubnet);
    }

    public SyncInvoker<UpdateSubnetRequest, UpdateSubnetResponse> updateSubnetInvoker(UpdateSubnetRequest request) {
        return new SyncInvoker<UpdateSubnetRequest, UpdateSubnetResponse>(request, VpcMeta.updateSubnet, hcClient);
    }

    public UpdateVpcPeeringResponse updateVpcPeering(UpdateVpcPeeringRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.updateVpcPeering);
    }

    public SyncInvoker<UpdateVpcPeeringRequest, UpdateVpcPeeringResponse> updateVpcPeeringInvoker(
        UpdateVpcPeeringRequest request) {
        return new SyncInvoker<UpdateVpcPeeringRequest, UpdateVpcPeeringResponse>(request, VpcMeta.updateVpcPeering,
            hcClient);
    }

    public CreatePrivateipResponse createPrivateip(CreatePrivateipRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.createPrivateip);
    }

    public SyncInvoker<CreatePrivateipRequest, CreatePrivateipResponse> createPrivateipInvoker(
        CreatePrivateipRequest request) {
        return new SyncInvoker<CreatePrivateipRequest, CreatePrivateipResponse>(request, VpcMeta.createPrivateip,
            hcClient);
    }

    public DeletePrivateipResponse deletePrivateip(DeletePrivateipRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.deletePrivateip);
    }

    public SyncInvoker<DeletePrivateipRequest, DeletePrivateipResponse> deletePrivateipInvoker(
        DeletePrivateipRequest request) {
        return new SyncInvoker<DeletePrivateipRequest, DeletePrivateipResponse>(request, VpcMeta.deletePrivateip,
            hcClient);
    }

    public ListPrivateipsResponse listPrivateips(ListPrivateipsRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.listPrivateips);
    }

    public SyncInvoker<ListPrivateipsRequest, ListPrivateipsResponse> listPrivateipsInvoker(
        ListPrivateipsRequest request) {
        return new SyncInvoker<ListPrivateipsRequest, ListPrivateipsResponse>(request, VpcMeta.listPrivateips,
            hcClient);
    }

    public ShowNetworkIpAvailabilitiesResponse showNetworkIpAvailabilities(ShowNetworkIpAvailabilitiesRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.showNetworkIpAvailabilities);
    }

    public SyncInvoker<ShowNetworkIpAvailabilitiesRequest, ShowNetworkIpAvailabilitiesResponse> showNetworkIpAvailabilitiesInvoker(
        ShowNetworkIpAvailabilitiesRequest request) {
        return new SyncInvoker<ShowNetworkIpAvailabilitiesRequest, ShowNetworkIpAvailabilitiesResponse>(request,
            VpcMeta.showNetworkIpAvailabilities, hcClient);
    }

    public ShowPrivateipResponse showPrivateip(ShowPrivateipRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.showPrivateip);
    }

    public SyncInvoker<ShowPrivateipRequest, ShowPrivateipResponse> showPrivateipInvoker(ShowPrivateipRequest request) {
        return new SyncInvoker<ShowPrivateipRequest, ShowPrivateipResponse>(request, VpcMeta.showPrivateip, hcClient);
    }

    public NeutronCreateSecurityGroupResponse neutronCreateSecurityGroup(NeutronCreateSecurityGroupRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.neutronCreateSecurityGroup);
    }

    public SyncInvoker<NeutronCreateSecurityGroupRequest, NeutronCreateSecurityGroupResponse> neutronCreateSecurityGroupInvoker(
        NeutronCreateSecurityGroupRequest request) {
        return new SyncInvoker<NeutronCreateSecurityGroupRequest, NeutronCreateSecurityGroupResponse>(request,
            VpcMeta.neutronCreateSecurityGroup, hcClient);
    }

    public NeutronCreateSecurityGroupRuleResponse neutronCreateSecurityGroupRule(
        NeutronCreateSecurityGroupRuleRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.neutronCreateSecurityGroupRule);
    }

    public SyncInvoker<NeutronCreateSecurityGroupRuleRequest, NeutronCreateSecurityGroupRuleResponse> neutronCreateSecurityGroupRuleInvoker(
        NeutronCreateSecurityGroupRuleRequest request) {
        return new SyncInvoker<NeutronCreateSecurityGroupRuleRequest, NeutronCreateSecurityGroupRuleResponse>(request,
            VpcMeta.neutronCreateSecurityGroupRule, hcClient);
    }

    public NeutronDeleteSecurityGroupResponse neutronDeleteSecurityGroup(NeutronDeleteSecurityGroupRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.neutronDeleteSecurityGroup);
    }

    public SyncInvoker<NeutronDeleteSecurityGroupRequest, NeutronDeleteSecurityGroupResponse> neutronDeleteSecurityGroupInvoker(
        NeutronDeleteSecurityGroupRequest request) {
        return new SyncInvoker<NeutronDeleteSecurityGroupRequest, NeutronDeleteSecurityGroupResponse>(request,
            VpcMeta.neutronDeleteSecurityGroup, hcClient);
    }

    public NeutronDeleteSecurityGroupRuleResponse neutronDeleteSecurityGroupRule(
        NeutronDeleteSecurityGroupRuleRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.neutronDeleteSecurityGroupRule);
    }

    public SyncInvoker<NeutronDeleteSecurityGroupRuleRequest, NeutronDeleteSecurityGroupRuleResponse> neutronDeleteSecurityGroupRuleInvoker(
        NeutronDeleteSecurityGroupRuleRequest request) {
        return new SyncInvoker<NeutronDeleteSecurityGroupRuleRequest, NeutronDeleteSecurityGroupRuleResponse>(request,
            VpcMeta.neutronDeleteSecurityGroupRule, hcClient);
    }

    public NeutronListSecurityGroupRulesResponse neutronListSecurityGroupRules(
        NeutronListSecurityGroupRulesRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.neutronListSecurityGroupRules);
    }

    public SyncInvoker<NeutronListSecurityGroupRulesRequest, NeutronListSecurityGroupRulesResponse> neutronListSecurityGroupRulesInvoker(
        NeutronListSecurityGroupRulesRequest request) {
        return new SyncInvoker<NeutronListSecurityGroupRulesRequest, NeutronListSecurityGroupRulesResponse>(request,
            VpcMeta.neutronListSecurityGroupRules, hcClient);
    }

    public NeutronListSecurityGroupsResponse neutronListSecurityGroups(NeutronListSecurityGroupsRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.neutronListSecurityGroups);
    }

    public SyncInvoker<NeutronListSecurityGroupsRequest, NeutronListSecurityGroupsResponse> neutronListSecurityGroupsInvoker(
        NeutronListSecurityGroupsRequest request) {
        return new SyncInvoker<NeutronListSecurityGroupsRequest, NeutronListSecurityGroupsResponse>(request,
            VpcMeta.neutronListSecurityGroups, hcClient);
    }

    public NeutronShowSecurityGroupResponse neutronShowSecurityGroup(NeutronShowSecurityGroupRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.neutronShowSecurityGroup);
    }

    public SyncInvoker<NeutronShowSecurityGroupRequest, NeutronShowSecurityGroupResponse> neutronShowSecurityGroupInvoker(
        NeutronShowSecurityGroupRequest request) {
        return new SyncInvoker<NeutronShowSecurityGroupRequest, NeutronShowSecurityGroupResponse>(request,
            VpcMeta.neutronShowSecurityGroup, hcClient);
    }

    public NeutronShowSecurityGroupRuleResponse neutronShowSecurityGroupRule(
        NeutronShowSecurityGroupRuleRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.neutronShowSecurityGroupRule);
    }

    public SyncInvoker<NeutronShowSecurityGroupRuleRequest, NeutronShowSecurityGroupRuleResponse> neutronShowSecurityGroupRuleInvoker(
        NeutronShowSecurityGroupRuleRequest request) {
        return new SyncInvoker<NeutronShowSecurityGroupRuleRequest, NeutronShowSecurityGroupRuleResponse>(request,
            VpcMeta.neutronShowSecurityGroupRule, hcClient);
    }

    public NeutronUpdateSecurityGroupResponse neutronUpdateSecurityGroup(NeutronUpdateSecurityGroupRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.neutronUpdateSecurityGroup);
    }

    public SyncInvoker<NeutronUpdateSecurityGroupRequest, NeutronUpdateSecurityGroupResponse> neutronUpdateSecurityGroupInvoker(
        NeutronUpdateSecurityGroupRequest request) {
        return new SyncInvoker<NeutronUpdateSecurityGroupRequest, NeutronUpdateSecurityGroupResponse>(request,
            VpcMeta.neutronUpdateSecurityGroup, hcClient);
    }

    public NeutronAddFirewallRuleResponse neutronAddFirewallRule(NeutronAddFirewallRuleRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.neutronAddFirewallRule);
    }

    public SyncInvoker<NeutronAddFirewallRuleRequest, NeutronAddFirewallRuleResponse> neutronAddFirewallRuleInvoker(
        NeutronAddFirewallRuleRequest request) {
        return new SyncInvoker<NeutronAddFirewallRuleRequest, NeutronAddFirewallRuleResponse>(request,
            VpcMeta.neutronAddFirewallRule, hcClient);
    }

    public NeutronCreateFirewallGroupResponse neutronCreateFirewallGroup(NeutronCreateFirewallGroupRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.neutronCreateFirewallGroup);
    }

    public SyncInvoker<NeutronCreateFirewallGroupRequest, NeutronCreateFirewallGroupResponse> neutronCreateFirewallGroupInvoker(
        NeutronCreateFirewallGroupRequest request) {
        return new SyncInvoker<NeutronCreateFirewallGroupRequest, NeutronCreateFirewallGroupResponse>(request,
            VpcMeta.neutronCreateFirewallGroup, hcClient);
    }

    public NeutronCreateFirewallPolicyResponse neutronCreateFirewallPolicy(NeutronCreateFirewallPolicyRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.neutronCreateFirewallPolicy);
    }

    public SyncInvoker<NeutronCreateFirewallPolicyRequest, NeutronCreateFirewallPolicyResponse> neutronCreateFirewallPolicyInvoker(
        NeutronCreateFirewallPolicyRequest request) {
        return new SyncInvoker<NeutronCreateFirewallPolicyRequest, NeutronCreateFirewallPolicyResponse>(request,
            VpcMeta.neutronCreateFirewallPolicy, hcClient);
    }

    public NeutronCreateFirewallRuleResponse neutronCreateFirewallRule(NeutronCreateFirewallRuleRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.neutronCreateFirewallRule);
    }

    public SyncInvoker<NeutronCreateFirewallRuleRequest, NeutronCreateFirewallRuleResponse> neutronCreateFirewallRuleInvoker(
        NeutronCreateFirewallRuleRequest request) {
        return new SyncInvoker<NeutronCreateFirewallRuleRequest, NeutronCreateFirewallRuleResponse>(request,
            VpcMeta.neutronCreateFirewallRule, hcClient);
    }

    public NeutronDeleteFirewallGroupResponse neutronDeleteFirewallGroup(NeutronDeleteFirewallGroupRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.neutronDeleteFirewallGroup);
    }

    public SyncInvoker<NeutronDeleteFirewallGroupRequest, NeutronDeleteFirewallGroupResponse> neutronDeleteFirewallGroupInvoker(
        NeutronDeleteFirewallGroupRequest request) {
        return new SyncInvoker<NeutronDeleteFirewallGroupRequest, NeutronDeleteFirewallGroupResponse>(request,
            VpcMeta.neutronDeleteFirewallGroup, hcClient);
    }

    public NeutronDeleteFirewallPolicyResponse neutronDeleteFirewallPolicy(NeutronDeleteFirewallPolicyRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.neutronDeleteFirewallPolicy);
    }

    public SyncInvoker<NeutronDeleteFirewallPolicyRequest, NeutronDeleteFirewallPolicyResponse> neutronDeleteFirewallPolicyInvoker(
        NeutronDeleteFirewallPolicyRequest request) {
        return new SyncInvoker<NeutronDeleteFirewallPolicyRequest, NeutronDeleteFirewallPolicyResponse>(request,
            VpcMeta.neutronDeleteFirewallPolicy, hcClient);
    }

    public NeutronDeleteFirewallRuleResponse neutronDeleteFirewallRule(NeutronDeleteFirewallRuleRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.neutronDeleteFirewallRule);
    }

    public SyncInvoker<NeutronDeleteFirewallRuleRequest, NeutronDeleteFirewallRuleResponse> neutronDeleteFirewallRuleInvoker(
        NeutronDeleteFirewallRuleRequest request) {
        return new SyncInvoker<NeutronDeleteFirewallRuleRequest, NeutronDeleteFirewallRuleResponse>(request,
            VpcMeta.neutronDeleteFirewallRule, hcClient);
    }

    public NeutronListFirewallGroupsResponse neutronListFirewallGroups(NeutronListFirewallGroupsRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.neutronListFirewallGroups);
    }

    public SyncInvoker<NeutronListFirewallGroupsRequest, NeutronListFirewallGroupsResponse> neutronListFirewallGroupsInvoker(
        NeutronListFirewallGroupsRequest request) {
        return new SyncInvoker<NeutronListFirewallGroupsRequest, NeutronListFirewallGroupsResponse>(request,
            VpcMeta.neutronListFirewallGroups, hcClient);
    }

    public NeutronListFirewallPoliciesResponse neutronListFirewallPolicies(NeutronListFirewallPoliciesRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.neutronListFirewallPolicies);
    }

    public SyncInvoker<NeutronListFirewallPoliciesRequest, NeutronListFirewallPoliciesResponse> neutronListFirewallPoliciesInvoker(
        NeutronListFirewallPoliciesRequest request) {
        return new SyncInvoker<NeutronListFirewallPoliciesRequest, NeutronListFirewallPoliciesResponse>(request,
            VpcMeta.neutronListFirewallPolicies, hcClient);
    }

    public NeutronListFirewallRulesResponse neutronListFirewallRules(NeutronListFirewallRulesRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.neutronListFirewallRules);
    }

    public SyncInvoker<NeutronListFirewallRulesRequest, NeutronListFirewallRulesResponse> neutronListFirewallRulesInvoker(
        NeutronListFirewallRulesRequest request) {
        return new SyncInvoker<NeutronListFirewallRulesRequest, NeutronListFirewallRulesResponse>(request,
            VpcMeta.neutronListFirewallRules, hcClient);
    }

    public NeutronRemoveFirewallRuleResponse neutronRemoveFirewallRule(NeutronRemoveFirewallRuleRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.neutronRemoveFirewallRule);
    }

    public SyncInvoker<NeutronRemoveFirewallRuleRequest, NeutronRemoveFirewallRuleResponse> neutronRemoveFirewallRuleInvoker(
        NeutronRemoveFirewallRuleRequest request) {
        return new SyncInvoker<NeutronRemoveFirewallRuleRequest, NeutronRemoveFirewallRuleResponse>(request,
            VpcMeta.neutronRemoveFirewallRule, hcClient);
    }

    public NeutronShowFirewallGroupResponse neutronShowFirewallGroup(NeutronShowFirewallGroupRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.neutronShowFirewallGroup);
    }

    public SyncInvoker<NeutronShowFirewallGroupRequest, NeutronShowFirewallGroupResponse> neutronShowFirewallGroupInvoker(
        NeutronShowFirewallGroupRequest request) {
        return new SyncInvoker<NeutronShowFirewallGroupRequest, NeutronShowFirewallGroupResponse>(request,
            VpcMeta.neutronShowFirewallGroup, hcClient);
    }

    public NeutronShowFirewallPolicyResponse neutronShowFirewallPolicy(NeutronShowFirewallPolicyRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.neutronShowFirewallPolicy);
    }

    public SyncInvoker<NeutronShowFirewallPolicyRequest, NeutronShowFirewallPolicyResponse> neutronShowFirewallPolicyInvoker(
        NeutronShowFirewallPolicyRequest request) {
        return new SyncInvoker<NeutronShowFirewallPolicyRequest, NeutronShowFirewallPolicyResponse>(request,
            VpcMeta.neutronShowFirewallPolicy, hcClient);
    }

    public NeutronShowFirewallRuleResponse neutronShowFirewallRule(NeutronShowFirewallRuleRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.neutronShowFirewallRule);
    }

    public SyncInvoker<NeutronShowFirewallRuleRequest, NeutronShowFirewallRuleResponse> neutronShowFirewallRuleInvoker(
        NeutronShowFirewallRuleRequest request) {
        return new SyncInvoker<NeutronShowFirewallRuleRequest, NeutronShowFirewallRuleResponse>(request,
            VpcMeta.neutronShowFirewallRule, hcClient);
    }

    public NeutronUpdateFirewallGroupResponse neutronUpdateFirewallGroup(NeutronUpdateFirewallGroupRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.neutronUpdateFirewallGroup);
    }

    public SyncInvoker<NeutronUpdateFirewallGroupRequest, NeutronUpdateFirewallGroupResponse> neutronUpdateFirewallGroupInvoker(
        NeutronUpdateFirewallGroupRequest request) {
        return new SyncInvoker<NeutronUpdateFirewallGroupRequest, NeutronUpdateFirewallGroupResponse>(request,
            VpcMeta.neutronUpdateFirewallGroup, hcClient);
    }

    public NeutronUpdateFirewallPolicyResponse neutronUpdateFirewallPolicy(NeutronUpdateFirewallPolicyRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.neutronUpdateFirewallPolicy);
    }

    public SyncInvoker<NeutronUpdateFirewallPolicyRequest, NeutronUpdateFirewallPolicyResponse> neutronUpdateFirewallPolicyInvoker(
        NeutronUpdateFirewallPolicyRequest request) {
        return new SyncInvoker<NeutronUpdateFirewallPolicyRequest, NeutronUpdateFirewallPolicyResponse>(request,
            VpcMeta.neutronUpdateFirewallPolicy, hcClient);
    }

    public NeutronUpdateFirewallRuleResponse neutronUpdateFirewallRule(NeutronUpdateFirewallRuleRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.neutronUpdateFirewallRule);
    }

    public SyncInvoker<NeutronUpdateFirewallRuleRequest, NeutronUpdateFirewallRuleResponse> neutronUpdateFirewallRuleInvoker(
        NeutronUpdateFirewallRuleRequest request) {
        return new SyncInvoker<NeutronUpdateFirewallRuleRequest, NeutronUpdateFirewallRuleResponse>(request,
            VpcMeta.neutronUpdateFirewallRule, hcClient);
    }

    public BatchCreateVpcTagsResponse batchCreateVpcTags(BatchCreateVpcTagsRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.batchCreateVpcTags);
    }

    public SyncInvoker<BatchCreateVpcTagsRequest, BatchCreateVpcTagsResponse> batchCreateVpcTagsInvoker(
        BatchCreateVpcTagsRequest request) {
        return new SyncInvoker<BatchCreateVpcTagsRequest, BatchCreateVpcTagsResponse>(request,
            VpcMeta.batchCreateVpcTags, hcClient);
    }

    public BatchDeleteVpcTagsResponse batchDeleteVpcTags(BatchDeleteVpcTagsRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.batchDeleteVpcTags);
    }

    public SyncInvoker<BatchDeleteVpcTagsRequest, BatchDeleteVpcTagsResponse> batchDeleteVpcTagsInvoker(
        BatchDeleteVpcTagsRequest request) {
        return new SyncInvoker<BatchDeleteVpcTagsRequest, BatchDeleteVpcTagsResponse>(request,
            VpcMeta.batchDeleteVpcTags, hcClient);
    }

    public CreateVpcResponse createVpc(CreateVpcRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.createVpc);
    }

    public SyncInvoker<CreateVpcRequest, CreateVpcResponse> createVpcInvoker(CreateVpcRequest request) {
        return new SyncInvoker<CreateVpcRequest, CreateVpcResponse>(request, VpcMeta.createVpc, hcClient);
    }

    public CreateVpcResourceTagResponse createVpcResourceTag(CreateVpcResourceTagRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.createVpcResourceTag);
    }

    public SyncInvoker<CreateVpcResourceTagRequest, CreateVpcResourceTagResponse> createVpcResourceTagInvoker(
        CreateVpcResourceTagRequest request) {
        return new SyncInvoker<CreateVpcResourceTagRequest, CreateVpcResourceTagResponse>(request,
            VpcMeta.createVpcResourceTag, hcClient);
    }

    public CreateVpcRouteResponse createVpcRoute(CreateVpcRouteRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.createVpcRoute);
    }

    public SyncInvoker<CreateVpcRouteRequest, CreateVpcRouteResponse> createVpcRouteInvoker(
        CreateVpcRouteRequest request) {
        return new SyncInvoker<CreateVpcRouteRequest, CreateVpcRouteResponse>(request, VpcMeta.createVpcRoute,
            hcClient);
    }

    public DeleteVpcResponse deleteVpc(DeleteVpcRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.deleteVpc);
    }

    public SyncInvoker<DeleteVpcRequest, DeleteVpcResponse> deleteVpcInvoker(DeleteVpcRequest request) {
        return new SyncInvoker<DeleteVpcRequest, DeleteVpcResponse>(request, VpcMeta.deleteVpc, hcClient);
    }

    public DeleteVpcRouteResponse deleteVpcRoute(DeleteVpcRouteRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.deleteVpcRoute);
    }

    public SyncInvoker<DeleteVpcRouteRequest, DeleteVpcRouteResponse> deleteVpcRouteInvoker(
        DeleteVpcRouteRequest request) {
        return new SyncInvoker<DeleteVpcRouteRequest, DeleteVpcRouteResponse>(request, VpcMeta.deleteVpcRoute,
            hcClient);
    }

    public DeleteVpcTagResponse deleteVpcTag(DeleteVpcTagRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.deleteVpcTag);
    }

    public SyncInvoker<DeleteVpcTagRequest, DeleteVpcTagResponse> deleteVpcTagInvoker(DeleteVpcTagRequest request) {
        return new SyncInvoker<DeleteVpcTagRequest, DeleteVpcTagResponse>(request, VpcMeta.deleteVpcTag, hcClient);
    }

    public ListVpcRoutesResponse listVpcRoutes(ListVpcRoutesRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.listVpcRoutes);
    }

    public SyncInvoker<ListVpcRoutesRequest, ListVpcRoutesResponse> listVpcRoutesInvoker(ListVpcRoutesRequest request) {
        return new SyncInvoker<ListVpcRoutesRequest, ListVpcRoutesResponse>(request, VpcMeta.listVpcRoutes, hcClient);
    }

    public ListVpcTagsResponse listVpcTags(ListVpcTagsRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.listVpcTags);
    }

    public SyncInvoker<ListVpcTagsRequest, ListVpcTagsResponse> listVpcTagsInvoker(ListVpcTagsRequest request) {
        return new SyncInvoker<ListVpcTagsRequest, ListVpcTagsResponse>(request, VpcMeta.listVpcTags, hcClient);
    }

    public ListVpcsResponse listVpcs(ListVpcsRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.listVpcs);
    }

    public SyncInvoker<ListVpcsRequest, ListVpcsResponse> listVpcsInvoker(ListVpcsRequest request) {
        return new SyncInvoker<ListVpcsRequest, ListVpcsResponse>(request, VpcMeta.listVpcs, hcClient);
    }

    public ListVpcsByTagsResponse listVpcsByTags(ListVpcsByTagsRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.listVpcsByTags);
    }

    public SyncInvoker<ListVpcsByTagsRequest, ListVpcsByTagsResponse> listVpcsByTagsInvoker(
        ListVpcsByTagsRequest request) {
        return new SyncInvoker<ListVpcsByTagsRequest, ListVpcsByTagsResponse>(request, VpcMeta.listVpcsByTags,
            hcClient);
    }

    public ShowVpcResponse showVpc(ShowVpcRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.showVpc);
    }

    public SyncInvoker<ShowVpcRequest, ShowVpcResponse> showVpcInvoker(ShowVpcRequest request) {
        return new SyncInvoker<ShowVpcRequest, ShowVpcResponse>(request, VpcMeta.showVpc, hcClient);
    }

    public ShowVpcRouteResponse showVpcRoute(ShowVpcRouteRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.showVpcRoute);
    }

    public SyncInvoker<ShowVpcRouteRequest, ShowVpcRouteResponse> showVpcRouteInvoker(ShowVpcRouteRequest request) {
        return new SyncInvoker<ShowVpcRouteRequest, ShowVpcRouteResponse>(request, VpcMeta.showVpcRoute, hcClient);
    }

    public ShowVpcTagsResponse showVpcTags(ShowVpcTagsRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.showVpcTags);
    }

    public SyncInvoker<ShowVpcTagsRequest, ShowVpcTagsResponse> showVpcTagsInvoker(ShowVpcTagsRequest request) {
        return new SyncInvoker<ShowVpcTagsRequest, ShowVpcTagsResponse>(request, VpcMeta.showVpcTags, hcClient);
    }

    public UpdateVpcResponse updateVpc(UpdateVpcRequest request) {
        return hcClient.syncInvokeHttp(request, VpcMeta.updateVpc);
    }

    public SyncInvoker<UpdateVpcRequest, UpdateVpcResponse> updateVpcInvoker(UpdateVpcRequest request) {
        return new SyncInvoker<UpdateVpcRequest, UpdateVpcResponse>(request, VpcMeta.updateVpc, hcClient);
    }

}
