package com.schema.service;

import com.schema.models.Device;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "devices", path = "devices")
public interface DeviceRepo extends JpaRepository<Device, Integer> {

}
