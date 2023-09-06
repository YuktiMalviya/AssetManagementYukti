package com.asset.managment.demo.Repository;

import com.asset.managment.demo.Entity.Asset;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AssetRepository extends JpaRepository<Asset, Integer> {
    List<Asset> findByAssetName(String assetName);
}
