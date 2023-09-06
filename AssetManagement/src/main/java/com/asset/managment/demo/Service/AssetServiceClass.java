package com.asset.managment.demo.Service;

import com.asset.managment.demo.Entity.Asset;
import com.asset.managment.demo.Repository.AssetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class AssetServiceClass implements AssetService {

    @Autowired
    private AssetRepository assetRepository;

    @Override
    public Asset createAsset(Asset asset) {
        return assetRepository.save(asset);
    }

    @Override
    public Asset updateAsset(Asset asset) {
        Optional<Asset> assetDb = this.assetRepository.findById(asset.getId());

        if(assetDb.isPresent()) {
            Asset assetUpdate = assetDb.get();
            assetUpdate.setId(asset.getId());
            assetUpdate.setAssetName(asset.getAssetName());
            assetUpdate.setPurchaseDate(asset.getPurchaseDate());
            assetUpdate.setConditionNotes(asset.getConditionNotes());
            assetUpdate.setCategory(asset.getCategory());
            assetUpdate.setAssignmentStatus(asset.getAssignmentStatus());

            assetRepository.save(assetUpdate);
            return assetUpdate;
        }

        return null;
    }

    @Override
    public List<Asset> getAllAsset() {
        return assetRepository.findAll();
    }

    @Override
    public List<Asset> getAssetByName(String assetName) {
        return assetRepository.findByAssetName(assetName);
    }

    @Override
    public void deleteAsset(int id) {
        Optional<Asset> assetDb = this.assetRepository.findById(id);

        if(assetDb.isPresent()) {
            this.assetRepository.delete(assetDb.get());
        }
    }

}
