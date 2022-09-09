package com.hidro.system.Dth22.Service;

import com.hidro.system.Dth22.Data.Dth22_entity;
import com.hidro.system.Dth22.Data.repository.Dth22_repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Dth22_service_impl {
    @Autowired
    Dth22_repository dth22_repository;

    public List<Dth22_entity> findAll(){
        return dth22_repository.findAll();
    }


}
