package com.bawono.tutorial.springdata.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "pemain")
public class Pemain {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_pemain")
	private Long id;
	@Column(name = "nama")
	private String nama;
	@Column(name = "nama_kesebelasan")
	private String namaKesebelasan;
	@Column(name = "usia")
	private Integer usia;

	public Pemain() {
		super();
	}

	public Pemain(String nama, String namaKesebelasan, Integer usia) {
		super();
		this.nama = nama;
		this.namaKesebelasan = namaKesebelasan;
		this.usia = usia;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNama() {
		return nama;
	}

	public void setNama(String nama) {
		this.nama = nama;
	}

	public String getNamaKesebelasan() {
		return namaKesebelasan;
	}

	public void setNamaKesebelasan(String namaKesebelasan) {
		this.namaKesebelasan = namaKesebelasan;
	}

	public Integer getUsia() {
		return usia;
	}

	public void setUsia(Integer usia) {
		this.usia = usia;
	}

	@Override
	public String toString() {
		return "Pemain [id=" + id + ", nama=" + nama + ", namaKesebelasan=" + namaKesebelasan + ", usia=" + usia + "]";
	}

}
