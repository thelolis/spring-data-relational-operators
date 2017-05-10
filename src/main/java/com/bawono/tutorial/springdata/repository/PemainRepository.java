package com.bawono.tutorial.springdata.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bawono.tutorial.springdata.model.Pemain;

@Repository("pemainRepository")
public interface PemainRepository extends JpaRepository<Pemain, Long> {
	public List<Pemain> findByNamaContainingOrNamaContaining(String title, String title2);

	public List<Pemain> findByNamaLikeAndUsiaEquals(String nama, Integer Usia);

	public List<Pemain> findByNamaKesebelasanNot(String namaKesebelasan);
}
