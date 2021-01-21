package com.MrZ.mrz.repositories;

import com.MrZ.mrz.entities.SourceAccountList;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface SourceAccountListRepo extends JpaRepository<SourceAccountList, Integer> {

    @Query("select sc from SourceAccountList sc order by sc.id")
    List<SourceAccountList> findAllSourceAList();
}
