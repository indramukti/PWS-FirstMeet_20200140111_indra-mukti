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
@Table(name = "transaksi")
@NamedQueries({
    @NamedQuery(name = "Transaksi.findAll", query = "SELECT t FROM Transaksi t"),
    @NamedQuery(name = "Transaksi.findByIdTransaksi", query = "SELECT t FROM Transaksi t WHERE t.idTransaksi = :idTransaksi"),
    @NamedQuery(name = "Transaksi.findByKodeBarang", query = "SELECT t FROM Transaksi t WHERE t.kodeBarang = :kodeBarang"),
    @NamedQuery(name = "Transaksi.findByIdKaryawan", query = "SELECT t FROM Transaksi t WHERE t.idKaryawan = :idKaryawan"),
    @NamedQuery(name = "Transaksi.findByIdCostomer", query = "SELECT t FROM Transaksi t WHERE t.idCostomer = :idCostomer")})
public class Transaksi implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id_transaksi")
    private Integer idTransaksi;
    @Basic(optional = false)
    @Column(name = "kode_barang")
    private int kodeBarang;
    @Basic(optional = false)
    @Column(name = "id_karyawan")
    private int idKaryawan;
    @Basic(optional = false)
    @Column(name = "id_costomer")
    private int idCostomer;

    public Transaksi() {
    }

    public Transaksi(Integer idTransaksi) {
        this.idTransaksi = idTransaksi;
    }

    public Transaksi(Integer idTransaksi, int kodeBarang, int idKaryawan, int idCostomer) {
        this.idTransaksi = idTransaksi;
        this.kodeBarang = kodeBarang;
        this.idKaryawan = idKaryawan;
        this.idCostomer = idCostomer;
    }

    public Integer getIdTransaksi() {
        return idTransaksi;
    }

    public void setIdTransaksi(Integer idTransaksi) {
        this.idTransaksi = idTransaksi;
    }

    public int getKodeBarang() {
        return kodeBarang;
    }

    public void setKodeBarang(int kodeBarang) {
        this.kodeBarang = kodeBarang;
    }

    public int getIdKaryawan() {
        return idKaryawan;
    }

    public void setIdKaryawan(int idKaryawan) {
        this.idKaryawan = idKaryawan;
    }

    public int getIdCostomer() {
        return idCostomer;
    }

    public void setIdCostomer(int idCostomer) {
        this.idCostomer = idCostomer;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idTransaksi != null ? idTransaksi.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Transaksi)) {
            return false;
        }
        Transaksi other = (Transaksi) object;
        if ((this.idTransaksi == null && other.idTransaksi != null) || (this.idTransaksi != null && !this.idTransaksi.equals(other.idTransaksi))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "toko.barang.Transaksi[ idTransaksi=" + idTransaksi + " ]";
    }
    
}
