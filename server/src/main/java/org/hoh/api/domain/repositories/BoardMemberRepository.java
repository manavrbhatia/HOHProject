package org.hoh.api.domain.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.hoh.api.domain.entities.BoardMember;

public interface BoardMemberRepository extends JpaRepository<BoardMember, Long>, JpaSpecificationExecutor<BoardMember> {

}