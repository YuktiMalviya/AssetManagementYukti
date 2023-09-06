package com.asset.managment.demo.Service;


import com.asset.managment.demo.Entity.Asset;

import java.util.List;

public interface AssetService {
    Asset createAsset(Asset asset);
    Asset updateAsset(Asset asset);
    List<Asset> getAllAsset();
    List<Asset> getAssetByName(String assetName);
    void deleteAsset(int id);
}
