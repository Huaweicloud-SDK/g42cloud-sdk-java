package com.g42cloud.sdk.evs.v2;

import com.g42cloud.sdk.evs.v2.model.*;
import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.SyncInvoker;

public class EvsClient {

    protected HcClient hcClient;

    public EvsClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<EvsClient> newBuilder() {
        return new ClientBuilder<>(EvsClient::new);
    }

    public BatchCreateVolumeTagsResponse batchCreateVolumeTags(BatchCreateVolumeTagsRequest request) {
        return hcClient.syncInvokeHttp(request, EvsMeta.batchCreateVolumeTags);
    }

    public SyncInvoker<BatchCreateVolumeTagsRequest, BatchCreateVolumeTagsResponse> batchCreateVolumeTagsInvoker(
        BatchCreateVolumeTagsRequest request) {
        return new SyncInvoker<BatchCreateVolumeTagsRequest, BatchCreateVolumeTagsResponse>(request,
            EvsMeta.batchCreateVolumeTags, hcClient);
    }

    public BatchDeleteVolumeTagsResponse batchDeleteVolumeTags(BatchDeleteVolumeTagsRequest request) {
        return hcClient.syncInvokeHttp(request, EvsMeta.batchDeleteVolumeTags);
    }

    public SyncInvoker<BatchDeleteVolumeTagsRequest, BatchDeleteVolumeTagsResponse> batchDeleteVolumeTagsInvoker(
        BatchDeleteVolumeTagsRequest request) {
        return new SyncInvoker<BatchDeleteVolumeTagsRequest, BatchDeleteVolumeTagsResponse>(request,
            EvsMeta.batchDeleteVolumeTags, hcClient);
    }

    public CinderAcceptVolumeTransferResponse cinderAcceptVolumeTransfer(CinderAcceptVolumeTransferRequest request) {
        return hcClient.syncInvokeHttp(request, EvsMeta.cinderAcceptVolumeTransfer);
    }

    public SyncInvoker<CinderAcceptVolumeTransferRequest, CinderAcceptVolumeTransferResponse> cinderAcceptVolumeTransferInvoker(
        CinderAcceptVolumeTransferRequest request) {
        return new SyncInvoker<CinderAcceptVolumeTransferRequest, CinderAcceptVolumeTransferResponse>(request,
            EvsMeta.cinderAcceptVolumeTransfer, hcClient);
    }

    public CinderCreateVolumeTransferResponse cinderCreateVolumeTransfer(CinderCreateVolumeTransferRequest request) {
        return hcClient.syncInvokeHttp(request, EvsMeta.cinderCreateVolumeTransfer);
    }

    public SyncInvoker<CinderCreateVolumeTransferRequest, CinderCreateVolumeTransferResponse> cinderCreateVolumeTransferInvoker(
        CinderCreateVolumeTransferRequest request) {
        return new SyncInvoker<CinderCreateVolumeTransferRequest, CinderCreateVolumeTransferResponse>(request,
            EvsMeta.cinderCreateVolumeTransfer, hcClient);
    }

    public CinderDeleteVolumeTransferResponse cinderDeleteVolumeTransfer(CinderDeleteVolumeTransferRequest request) {
        return hcClient.syncInvokeHttp(request, EvsMeta.cinderDeleteVolumeTransfer);
    }

    public SyncInvoker<CinderDeleteVolumeTransferRequest, CinderDeleteVolumeTransferResponse> cinderDeleteVolumeTransferInvoker(
        CinderDeleteVolumeTransferRequest request) {
        return new SyncInvoker<CinderDeleteVolumeTransferRequest, CinderDeleteVolumeTransferResponse>(request,
            EvsMeta.cinderDeleteVolumeTransfer, hcClient);
    }

    public CinderListAvailabilityZonesResponse cinderListAvailabilityZones(CinderListAvailabilityZonesRequest request) {
        return hcClient.syncInvokeHttp(request, EvsMeta.cinderListAvailabilityZones);
    }

    public SyncInvoker<CinderListAvailabilityZonesRequest, CinderListAvailabilityZonesResponse> cinderListAvailabilityZonesInvoker(
        CinderListAvailabilityZonesRequest request) {
        return new SyncInvoker<CinderListAvailabilityZonesRequest, CinderListAvailabilityZonesResponse>(request,
            EvsMeta.cinderListAvailabilityZones, hcClient);
    }

    public CinderListQuotasResponse cinderListQuotas(CinderListQuotasRequest request) {
        return hcClient.syncInvokeHttp(request, EvsMeta.cinderListQuotas);
    }

    public SyncInvoker<CinderListQuotasRequest, CinderListQuotasResponse> cinderListQuotasInvoker(
        CinderListQuotasRequest request) {
        return new SyncInvoker<CinderListQuotasRequest, CinderListQuotasResponse>(request, EvsMeta.cinderListQuotas,
            hcClient);
    }

    public CinderListVolumeTransfersResponse cinderListVolumeTransfers(CinderListVolumeTransfersRequest request) {
        return hcClient.syncInvokeHttp(request, EvsMeta.cinderListVolumeTransfers);
    }

    public SyncInvoker<CinderListVolumeTransfersRequest, CinderListVolumeTransfersResponse> cinderListVolumeTransfersInvoker(
        CinderListVolumeTransfersRequest request) {
        return new SyncInvoker<CinderListVolumeTransfersRequest, CinderListVolumeTransfersResponse>(request,
            EvsMeta.cinderListVolumeTransfers, hcClient);
    }

    public CinderListVolumeTypesResponse cinderListVolumeTypes(CinderListVolumeTypesRequest request) {
        return hcClient.syncInvokeHttp(request, EvsMeta.cinderListVolumeTypes);
    }

    public SyncInvoker<CinderListVolumeTypesRequest, CinderListVolumeTypesResponse> cinderListVolumeTypesInvoker(
        CinderListVolumeTypesRequest request) {
        return new SyncInvoker<CinderListVolumeTypesRequest, CinderListVolumeTypesResponse>(request,
            EvsMeta.cinderListVolumeTypes, hcClient);
    }

    public CinderShowVolumeTransferResponse cinderShowVolumeTransfer(CinderShowVolumeTransferRequest request) {
        return hcClient.syncInvokeHttp(request, EvsMeta.cinderShowVolumeTransfer);
    }

    public SyncInvoker<CinderShowVolumeTransferRequest, CinderShowVolumeTransferResponse> cinderShowVolumeTransferInvoker(
        CinderShowVolumeTransferRequest request) {
        return new SyncInvoker<CinderShowVolumeTransferRequest, CinderShowVolumeTransferResponse>(request,
            EvsMeta.cinderShowVolumeTransfer, hcClient);
    }

    public CreateSnapshotResponse createSnapshot(CreateSnapshotRequest request) {
        return hcClient.syncInvokeHttp(request, EvsMeta.createSnapshot);
    }

    public SyncInvoker<CreateSnapshotRequest, CreateSnapshotResponse> createSnapshotInvoker(
        CreateSnapshotRequest request) {
        return new SyncInvoker<CreateSnapshotRequest, CreateSnapshotResponse>(request, EvsMeta.createSnapshot,
            hcClient);
    }

    public CreateVolumeResponse createVolume(CreateVolumeRequest request) {
        return hcClient.syncInvokeHttp(request, EvsMeta.createVolume);
    }

    public SyncInvoker<CreateVolumeRequest, CreateVolumeResponse> createVolumeInvoker(CreateVolumeRequest request) {
        return new SyncInvoker<CreateVolumeRequest, CreateVolumeResponse>(request, EvsMeta.createVolume, hcClient);
    }

    public DeleteSnapshotResponse deleteSnapshot(DeleteSnapshotRequest request) {
        return hcClient.syncInvokeHttp(request, EvsMeta.deleteSnapshot);
    }

    public SyncInvoker<DeleteSnapshotRequest, DeleteSnapshotResponse> deleteSnapshotInvoker(
        DeleteSnapshotRequest request) {
        return new SyncInvoker<DeleteSnapshotRequest, DeleteSnapshotResponse>(request, EvsMeta.deleteSnapshot,
            hcClient);
    }

    public DeleteVolumeResponse deleteVolume(DeleteVolumeRequest request) {
        return hcClient.syncInvokeHttp(request, EvsMeta.deleteVolume);
    }

    public SyncInvoker<DeleteVolumeRequest, DeleteVolumeResponse> deleteVolumeInvoker(DeleteVolumeRequest request) {
        return new SyncInvoker<DeleteVolumeRequest, DeleteVolumeResponse>(request, EvsMeta.deleteVolume, hcClient);
    }

    public ListSnapshotsResponse listSnapshots(ListSnapshotsRequest request) {
        return hcClient.syncInvokeHttp(request, EvsMeta.listSnapshots);
    }

    public SyncInvoker<ListSnapshotsRequest, ListSnapshotsResponse> listSnapshotsInvoker(ListSnapshotsRequest request) {
        return new SyncInvoker<ListSnapshotsRequest, ListSnapshotsResponse>(request, EvsMeta.listSnapshots, hcClient);
    }

    public ListVolumeTagsResponse listVolumeTags(ListVolumeTagsRequest request) {
        return hcClient.syncInvokeHttp(request, EvsMeta.listVolumeTags);
    }

    public SyncInvoker<ListVolumeTagsRequest, ListVolumeTagsResponse> listVolumeTagsInvoker(
        ListVolumeTagsRequest request) {
        return new SyncInvoker<ListVolumeTagsRequest, ListVolumeTagsResponse>(request, EvsMeta.listVolumeTags,
            hcClient);
    }

    public ListVolumesResponse listVolumes(ListVolumesRequest request) {
        return hcClient.syncInvokeHttp(request, EvsMeta.listVolumes);
    }

    public SyncInvoker<ListVolumesRequest, ListVolumesResponse> listVolumesInvoker(ListVolumesRequest request) {
        return new SyncInvoker<ListVolumesRequest, ListVolumesResponse>(request, EvsMeta.listVolumes, hcClient);
    }

    public ListVolumesByTagsResponse listVolumesByTags(ListVolumesByTagsRequest request) {
        return hcClient.syncInvokeHttp(request, EvsMeta.listVolumesByTags);
    }

    public SyncInvoker<ListVolumesByTagsRequest, ListVolumesByTagsResponse> listVolumesByTagsInvoker(
        ListVolumesByTagsRequest request) {
        return new SyncInvoker<ListVolumesByTagsRequest, ListVolumesByTagsResponse>(request, EvsMeta.listVolumesByTags,
            hcClient);
    }

    public ResizeVolumeResponse resizeVolume(ResizeVolumeRequest request) {
        return hcClient.syncInvokeHttp(request, EvsMeta.resizeVolume);
    }

    public SyncInvoker<ResizeVolumeRequest, ResizeVolumeResponse> resizeVolumeInvoker(ResizeVolumeRequest request) {
        return new SyncInvoker<ResizeVolumeRequest, ResizeVolumeResponse>(request, EvsMeta.resizeVolume, hcClient);
    }

    public RollbackSnapshotResponse rollbackSnapshot(RollbackSnapshotRequest request) {
        return hcClient.syncInvokeHttp(request, EvsMeta.rollbackSnapshot);
    }

    public SyncInvoker<RollbackSnapshotRequest, RollbackSnapshotResponse> rollbackSnapshotInvoker(
        RollbackSnapshotRequest request) {
        return new SyncInvoker<RollbackSnapshotRequest, RollbackSnapshotResponse>(request, EvsMeta.rollbackSnapshot,
            hcClient);
    }

    public ShowJobResponse showJob(ShowJobRequest request) {
        return hcClient.syncInvokeHttp(request, EvsMeta.showJob);
    }

    public SyncInvoker<ShowJobRequest, ShowJobResponse> showJobInvoker(ShowJobRequest request) {
        return new SyncInvoker<ShowJobRequest, ShowJobResponse>(request, EvsMeta.showJob, hcClient);
    }

    public ShowSnapshotResponse showSnapshot(ShowSnapshotRequest request) {
        return hcClient.syncInvokeHttp(request, EvsMeta.showSnapshot);
    }

    public SyncInvoker<ShowSnapshotRequest, ShowSnapshotResponse> showSnapshotInvoker(ShowSnapshotRequest request) {
        return new SyncInvoker<ShowSnapshotRequest, ShowSnapshotResponse>(request, EvsMeta.showSnapshot, hcClient);
    }

    public ShowVolumeResponse showVolume(ShowVolumeRequest request) {
        return hcClient.syncInvokeHttp(request, EvsMeta.showVolume);
    }

    public SyncInvoker<ShowVolumeRequest, ShowVolumeResponse> showVolumeInvoker(ShowVolumeRequest request) {
        return new SyncInvoker<ShowVolumeRequest, ShowVolumeResponse>(request, EvsMeta.showVolume, hcClient);
    }

    public ShowVolumeTagsResponse showVolumeTags(ShowVolumeTagsRequest request) {
        return hcClient.syncInvokeHttp(request, EvsMeta.showVolumeTags);
    }

    public SyncInvoker<ShowVolumeTagsRequest, ShowVolumeTagsResponse> showVolumeTagsInvoker(
        ShowVolumeTagsRequest request) {
        return new SyncInvoker<ShowVolumeTagsRequest, ShowVolumeTagsResponse>(request, EvsMeta.showVolumeTags,
            hcClient);
    }

    public UpdateSnapshotResponse updateSnapshot(UpdateSnapshotRequest request) {
        return hcClient.syncInvokeHttp(request, EvsMeta.updateSnapshot);
    }

    public SyncInvoker<UpdateSnapshotRequest, UpdateSnapshotResponse> updateSnapshotInvoker(
        UpdateSnapshotRequest request) {
        return new SyncInvoker<UpdateSnapshotRequest, UpdateSnapshotResponse>(request, EvsMeta.updateSnapshot,
            hcClient);
    }

    public UpdateVolumeResponse updateVolume(UpdateVolumeRequest request) {
        return hcClient.syncInvokeHttp(request, EvsMeta.updateVolume);
    }

    public SyncInvoker<UpdateVolumeRequest, UpdateVolumeResponse> updateVolumeInvoker(UpdateVolumeRequest request) {
        return new SyncInvoker<UpdateVolumeRequest, UpdateVolumeResponse>(request, EvsMeta.updateVolume, hcClient);
    }

    public ListVersionsResponse listVersions(ListVersionsRequest request) {
        return hcClient.syncInvokeHttp(request, EvsMeta.listVersions);
    }

    public SyncInvoker<ListVersionsRequest, ListVersionsResponse> listVersionsInvoker(ListVersionsRequest request) {
        return new SyncInvoker<ListVersionsRequest, ListVersionsResponse>(request, EvsMeta.listVersions, hcClient);
    }

    public ShowVersionResponse showVersion(ShowVersionRequest request) {
        return hcClient.syncInvokeHttp(request, EvsMeta.showVersion);
    }

    public SyncInvoker<ShowVersionRequest, ShowVersionResponse> showVersionInvoker(ShowVersionRequest request) {
        return new SyncInvoker<ShowVersionRequest, ShowVersionResponse>(request, EvsMeta.showVersion, hcClient);
    }

}
