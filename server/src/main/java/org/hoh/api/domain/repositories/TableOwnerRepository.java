package org.hoh.api.domain.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.hoh.api.domain.entities.TableOwner;

public interface TableOwnerRepository extends JpaRepository<TableOwner, Long>, JpaSpecificationExecutor<TableOwner> {

}