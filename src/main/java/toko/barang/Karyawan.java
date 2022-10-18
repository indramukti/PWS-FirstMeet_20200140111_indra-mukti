/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package toko.barang;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author DELL
 */
@Entity
@Table(name = "karyawan")
@NamedQueries({
    @NamedQuery(name = "Karyawan.findAll", query = "SELECT k FROM Karyawan k"),
    @NamedQuery(name = "Karyawan.findByIdKaryawan", query = "SELECT k FROM Karyawan k WHERE k.idKaryawan = :idKaryawan"),
    @NamedQuery(name = "Karyawan.findByNamaKaryawan", query = "SELECT k FROM Karyawan k WHERE k.namaKaryawan = :namaKaryawan"),
    @NamedQuery(name = "Karyawan.findByNoTlp", query = "SELECT k FROM Karyawan k WHERE k.noTlp = :noTlp"),
    @NamedQuery(name = "Karyawan.findByTglLahir", query = "SELECT k FROM Karyawan k WHERE k.tglLahir = :tglLahir")})
public class Karyawan implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id_karyawan")
    private Integer idKaryawan;
    @Basic(optional = false)
    @Column(name = "nama_karyawan")
    private String namaKaryawan;
    @Basic(optional = false)
    @Column(name = "no_tlp")
    private int noTlp;
    @Basic(optional = false)
    @Column(name = "tgl_lahir")
    private int tglLahir;

    public Karyawan() {
    }

    public Karyawan(Integer idKaryawan) {
        this.idKaryawan = idKaryawan;
    }

    public Karyawan(Integer idKaryawan, String namaKaryawan, int noTlp, int tglLahir) {
        this.idKaryawan = idKaryawan;
        this.namaKaryawan = namaKaryawan;
        this.noTlp = noTlp;
        this.tglLahir = tglLahir;
    }

    public Integer getIdKaryawan() {
        return idKaryawan;
    }

    public void setIdKaryawan(Integer idKaryawan) {
        this.idKaryawan = idKaryawan;
    }

    public String getNamaKaryawan() {
        return namaKaryawan;
    }

    public void setNamaKaryawan(String namaKaryawan) {
        this.namaKaryawan = namaKaryawan;
    }

    public int getNoTlp() {
        return noTlp;
    }

    public void setNoTlp(int noTlp) {
        this.noTlp = noTlp;
    }

    public int getTglLahir() {
        return tglLahir;
    }

    public void setTglLahir(int tglLahir) {
        this.tglLahir = tglLahir;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idKaryawan != null ? idKaryawan.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Karyawan)) {
            return false;
        }
        Karyawan other = (Karyawan) object;
        if ((this.idKaryawan == null && other.idKaryawan != null) || (this.idKaryawan != null && !this.idKaryawan.equals(other.idKaryawan))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "toko.barang.Karyawan[ idKaryawan=" + idKaryawan + " ]";
    }
    
}
