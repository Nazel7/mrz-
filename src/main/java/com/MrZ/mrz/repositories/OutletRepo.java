package com.MrZ.mrz.repositories;

import com.MrZ.mrz.entities.Outlet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface OutletRepo extends JpaRepository<Outlet, Integer> {

     Outlet getOutletsByAccountNo(String accountNo);
}
