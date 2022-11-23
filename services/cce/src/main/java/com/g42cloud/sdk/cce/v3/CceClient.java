package com.g42cloud.sdk.cce.v3;

import com.g42cloud.sdk.cce.v3.model.*;
import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.SyncInvoker;

public class CceClient {

    protected HcClient hcClient;

    public CceClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<CceClient> newBuilder() {
        return new ClientBuilder<>(CceClient::new);
    }

    public AwakeClusterResponse awakeCluster(AwakeClusterRequest request) {
        return hcClient.syncInvokeHttp(request, CceMeta.awakeCluster);
    }

    public SyncInvoker<AwakeClusterRequest, AwakeClusterResponse> awakeClusterInvoker(AwakeClusterRequest request) {
        return new SyncInvoker<AwakeClusterRequest, AwakeClusterResponse>(request, CceMeta.awakeCluster, hcClient);
    }

    public CreateAddonInstanceResponse createAddonInstance(CreateAddonInstanceRequest request) {
        return hcClient.syncInvokeHttp(request, CceMeta.createAddonInstance);
    }

    public SyncInvoker<CreateAddonInstanceRequest, CreateAddonInstanceResponse> createAddonInstanceInvoker(
        CreateAddonInstanceRequest request) {
        return new SyncInvoker<CreateAddonInstanceRequest, CreateAddonInstanceResponse>(request,
            CceMeta.createAddonInstance, hcClient);
    }

    public CreateCloudPersistentVolumeClaimsResponse createCloudPersistentVolumeClaims(
        CreateCloudPersistentVolumeClaimsRequest request) {
        return hcClient.syncInvokeHttp(request, CceMeta.createCloudPersistentVolumeClaims);
    }

    public SyncInvoker<CreateCloudPersistentVolumeClaimsRequest, CreateCloudPersistentVolumeClaimsResponse> createCloudPersistentVolumeClaimsInvoker(
        CreateCloudPersistentVolumeClaimsRequest request) {
        return new SyncInvoker<CreateCloudPersistentVolumeClaimsRequest, CreateCloudPersistentVolumeClaimsResponse>(
            request, CceMeta.createCloudPersistentVolumeClaims, hcClient);
    }

    public CreateClusterResponse createCluster(CreateClusterRequest request) {
        return hcClient.syncInvokeHttp(request, CceMeta.createCluster);
    }

    public SyncInvoker<CreateClusterRequest, CreateClusterResponse> createClusterInvoker(CreateClusterRequest request) {
        return new SyncInvoker<CreateClusterRequest, CreateClusterResponse>(request, CceMeta.createCluster, hcClient);
    }

    public CreateKubernetesClusterCertResponse createKubernetesClusterCert(CreateKubernetesClusterCertRequest request) {
        return hcClient.syncInvokeHttp(request, CceMeta.createKubernetesClusterCert);
    }

    public SyncInvoker<CreateKubernetesClusterCertRequest, CreateKubernetesClusterCertResponse> createKubernetesClusterCertInvoker(
        CreateKubernetesClusterCertRequest request) {
        return new SyncInvoker<CreateKubernetesClusterCertRequest, CreateKubernetesClusterCertResponse>(request,
            CceMeta.createKubernetesClusterCert, hcClient);
    }

    public CreateNodeResponse createNode(CreateNodeRequest request) {
        return hcClient.syncInvokeHttp(request, CceMeta.createNode);
    }

    public SyncInvoker<CreateNodeRequest, CreateNodeResponse> createNodeInvoker(CreateNodeRequest request) {
        return new SyncInvoker<CreateNodeRequest, CreateNodeResponse>(request, CceMeta.createNode, hcClient);
    }

    public CreateNodePoolResponse createNodePool(CreateNodePoolRequest request) {
        return hcClient.syncInvokeHttp(request, CceMeta.createNodePool);
    }

    public SyncInvoker<CreateNodePoolRequest, CreateNodePoolResponse> createNodePoolInvoker(
        CreateNodePoolRequest request) {
        return new SyncInvoker<CreateNodePoolRequest, CreateNodePoolResponse>(request, CceMeta.createNodePool,
            hcClient);
    }

    public DeleteAddonInstanceResponse deleteAddonInstance(DeleteAddonInstanceRequest request) {
        return hcClient.syncInvokeHttp(request, CceMeta.deleteAddonInstance);
    }

    public SyncInvoker<DeleteAddonInstanceRequest, DeleteAddonInstanceResponse> deleteAddonInstanceInvoker(
        DeleteAddonInstanceRequest request) {
        return new SyncInvoker<DeleteAddonInstanceRequest, DeleteAddonInstanceResponse>(request,
            CceMeta.deleteAddonInstance, hcClient);
    }

    public DeleteCloudPersistentVolumeClaimsResponse deleteCloudPersistentVolumeClaims(
        DeleteCloudPersistentVolumeClaimsRequest request) {
        return hcClient.syncInvokeHttp(request, CceMeta.deleteCloudPersistentVolumeClaims);
    }

    public SyncInvoker<DeleteCloudPersistentVolumeClaimsRequest, DeleteCloudPersistentVolumeClaimsResponse> deleteCloudPersistentVolumeClaimsInvoker(
        DeleteCloudPersistentVolumeClaimsRequest request) {
        return new SyncInvoker<DeleteCloudPersistentVolumeClaimsRequest, DeleteCloudPersistentVolumeClaimsResponse>(
            request, CceMeta.deleteCloudPersistentVolumeClaims, hcClient);
    }

    public DeleteClusterResponse deleteCluster(DeleteClusterRequest request) {
        return hcClient.syncInvokeHttp(request, CceMeta.deleteCluster);
    }

    public SyncInvoker<DeleteClusterRequest, DeleteClusterResponse> deleteClusterInvoker(DeleteClusterRequest request) {
        return new SyncInvoker<DeleteClusterRequest, DeleteClusterResponse>(request, CceMeta.deleteCluster, hcClient);
    }

    public DeleteNodeResponse deleteNode(DeleteNodeRequest request) {
        return hcClient.syncInvokeHttp(request, CceMeta.deleteNode);
    }

    public SyncInvoker<DeleteNodeRequest, DeleteNodeResponse> deleteNodeInvoker(DeleteNodeRequest request) {
        return new SyncInvoker<DeleteNodeRequest, DeleteNodeResponse>(request, CceMeta.deleteNode, hcClient);
    }

    public DeleteNodePoolResponse deleteNodePool(DeleteNodePoolRequest request) {
        return hcClient.syncInvokeHttp(request, CceMeta.deleteNodePool);
    }

    public SyncInvoker<DeleteNodePoolRequest, DeleteNodePoolResponse> deleteNodePoolInvoker(
        DeleteNodePoolRequest request) {
        return new SyncInvoker<DeleteNodePoolRequest, DeleteNodePoolResponse>(request, CceMeta.deleteNodePool,
            hcClient);
    }

    public HibernateClusterResponse hibernateCluster(HibernateClusterRequest request) {
        return hcClient.syncInvokeHttp(request, CceMeta.hibernateCluster);
    }

    public SyncInvoker<HibernateClusterRequest, HibernateClusterResponse> hibernateClusterInvoker(
        HibernateClusterRequest request) {
        return new SyncInvoker<HibernateClusterRequest, HibernateClusterResponse>(request, CceMeta.hibernateCluster,
            hcClient);
    }

    public ListAddonInstancesResponse listAddonInstances(ListAddonInstancesRequest request) {
        return hcClient.syncInvokeHttp(request, CceMeta.listAddonInstances);
    }

    public SyncInvoker<ListAddonInstancesRequest, ListAddonInstancesResponse> listAddonInstancesInvoker(
        ListAddonInstancesRequest request) {
        return new SyncInvoker<ListAddonInstancesRequest, ListAddonInstancesResponse>(request,
            CceMeta.listAddonInstances, hcClient);
    }

    public ListAddonTemplatesResponse listAddonTemplates(ListAddonTemplatesRequest request) {
        return hcClient.syncInvokeHttp(request, CceMeta.listAddonTemplates);
    }

    public SyncInvoker<ListAddonTemplatesRequest, ListAddonTemplatesResponse> listAddonTemplatesInvoker(
        ListAddonTemplatesRequest request) {
        return new SyncInvoker<ListAddonTemplatesRequest, ListAddonTemplatesResponse>(request,
            CceMeta.listAddonTemplates, hcClient);
    }

    public ListClustersResponse listClusters(ListClustersRequest request) {
        return hcClient.syncInvokeHttp(request, CceMeta.listClusters);
    }

    public SyncInvoker<ListClustersRequest, ListClustersResponse> listClustersInvoker(ListClustersRequest request) {
        return new SyncInvoker<ListClustersRequest, ListClustersResponse>(request, CceMeta.listClusters, hcClient);
    }

    public ListNodePoolsResponse listNodePools(ListNodePoolsRequest request) {
        return hcClient.syncInvokeHttp(request, CceMeta.listNodePools);
    }

    public SyncInvoker<ListNodePoolsRequest, ListNodePoolsResponse> listNodePoolsInvoker(ListNodePoolsRequest request) {
        return new SyncInvoker<ListNodePoolsRequest, ListNodePoolsResponse>(request, CceMeta.listNodePools, hcClient);
    }

    public ListNodesResponse listNodes(ListNodesRequest request) {
        return hcClient.syncInvokeHttp(request, CceMeta.listNodes);
    }

    public SyncInvoker<ListNodesRequest, ListNodesResponse> listNodesInvoker(ListNodesRequest request) {
        return new SyncInvoker<ListNodesRequest, ListNodesResponse>(request, CceMeta.listNodes, hcClient);
    }

    public MigrateNodeResponse migrateNode(MigrateNodeRequest request) {
        return hcClient.syncInvokeHttp(request, CceMeta.migrateNode);
    }

    public SyncInvoker<MigrateNodeRequest, MigrateNodeResponse> migrateNodeInvoker(MigrateNodeRequest request) {
        return new SyncInvoker<MigrateNodeRequest, MigrateNodeResponse>(request, CceMeta.migrateNode, hcClient);
    }

    public RemoveNodeResponse removeNode(RemoveNodeRequest request) {
        return hcClient.syncInvokeHttp(request, CceMeta.removeNode);
    }

    public SyncInvoker<RemoveNodeRequest, RemoveNodeResponse> removeNodeInvoker(RemoveNodeRequest request) {
        return new SyncInvoker<RemoveNodeRequest, RemoveNodeResponse>(request, CceMeta.removeNode, hcClient);
    }

    public ShowAddonInstanceResponse showAddonInstance(ShowAddonInstanceRequest request) {
        return hcClient.syncInvokeHttp(request, CceMeta.showAddonInstance);
    }

    public SyncInvoker<ShowAddonInstanceRequest, ShowAddonInstanceResponse> showAddonInstanceInvoker(
        ShowAddonInstanceRequest request) {
        return new SyncInvoker<ShowAddonInstanceRequest, ShowAddonInstanceResponse>(request, CceMeta.showAddonInstance,
            hcClient);
    }

    public ShowClusterResponse showCluster(ShowClusterRequest request) {
        return hcClient.syncInvokeHttp(request, CceMeta.showCluster);
    }

    public SyncInvoker<ShowClusterRequest, ShowClusterResponse> showClusterInvoker(ShowClusterRequest request) {
        return new SyncInvoker<ShowClusterRequest, ShowClusterResponse>(request, CceMeta.showCluster, hcClient);
    }

    public ShowJobResponse showJob(ShowJobRequest request) {
        return hcClient.syncInvokeHttp(request, CceMeta.showJob);
    }

    public SyncInvoker<ShowJobRequest, ShowJobResponse> showJobInvoker(ShowJobRequest request) {
        return new SyncInvoker<ShowJobRequest, ShowJobResponse>(request, CceMeta.showJob, hcClient);
    }

    public ShowNodeResponse showNode(ShowNodeRequest request) {
        return hcClient.syncInvokeHttp(request, CceMeta.showNode);
    }

    public SyncInvoker<ShowNodeRequest, ShowNodeResponse> showNodeInvoker(ShowNodeRequest request) {
        return new SyncInvoker<ShowNodeRequest, ShowNodeResponse>(request, CceMeta.showNode, hcClient);
    }

    public ShowNodePoolResponse showNodePool(ShowNodePoolRequest request) {
        return hcClient.syncInvokeHttp(request, CceMeta.showNodePool);
    }

    public SyncInvoker<ShowNodePoolRequest, ShowNodePoolResponse> showNodePoolInvoker(ShowNodePoolRequest request) {
        return new SyncInvoker<ShowNodePoolRequest, ShowNodePoolResponse>(request, CceMeta.showNodePool, hcClient);
    }

    public UpdateAddonInstanceResponse updateAddonInstance(UpdateAddonInstanceRequest request) {
        return hcClient.syncInvokeHttp(request, CceMeta.updateAddonInstance);
    }

    public SyncInvoker<UpdateAddonInstanceRequest, UpdateAddonInstanceResponse> updateAddonInstanceInvoker(
        UpdateAddonInstanceRequest request) {
        return new SyncInvoker<UpdateAddonInstanceRequest, UpdateAddonInstanceResponse>(request,
            CceMeta.updateAddonInstance, hcClient);
    }

    public UpdateClusterResponse updateCluster(UpdateClusterRequest request) {
        return hcClient.syncInvokeHttp(request, CceMeta.updateCluster);
    }

    public SyncInvoker<UpdateClusterRequest, UpdateClusterResponse> updateClusterInvoker(UpdateClusterRequest request) {
        return new SyncInvoker<UpdateClusterRequest, UpdateClusterResponse>(request, CceMeta.updateCluster, hcClient);
    }

    public UpdateNodeResponse updateNode(UpdateNodeRequest request) {
        return hcClient.syncInvokeHttp(request, CceMeta.updateNode);
    }

    public SyncInvoker<UpdateNodeRequest, UpdateNodeResponse> updateNodeInvoker(UpdateNodeRequest request) {
        return new SyncInvoker<UpdateNodeRequest, UpdateNodeResponse>(request, CceMeta.updateNode, hcClient);
    }

    public UpdateNodePoolResponse updateNodePool(UpdateNodePoolRequest request) {
        return hcClient.syncInvokeHttp(request, CceMeta.updateNodePool);
    }

    public SyncInvoker<UpdateNodePoolRequest, UpdateNodePoolResponse> updateNodePoolInvoker(
        UpdateNodePoolRequest request) {
        return new SyncInvoker<UpdateNodePoolRequest, UpdateNodePoolResponse>(request, CceMeta.updateNodePool,
            hcClient);
    }

}
