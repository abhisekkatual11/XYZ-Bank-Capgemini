package com.capgemini.bank.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capgemini.bank.entity.DemandDraft;

public interface DemandDraftRepository extends JpaRepository<DemandDraft, Long> {

}
