package com.MrZ.mrz.repositories;

import com.MrZ.mrz.entities.AZ_enterprise;
import com.MrZ.mrz.entities.Outlet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface AZ_enterpriseRepo extends JpaRepository<AZ_enterprise, Integer> {
    @Query("SELECT  az from AZ_enterprise  az order by  az.id ")
    List<AZ_enterprise> getAllAzEnterprise();

    @Query("SELECT o from Outlet o inner join AZ_enterprise az on az.id=o.enterprise_ac.id where az.id=?1 ")
    List<Outlet> getListOfOutLets(int azId);
}
