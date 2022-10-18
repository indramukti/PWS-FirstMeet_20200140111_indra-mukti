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
@Table(name = "barang")
@NamedQueries({
    @NamedQuery(name = "Barang.findAll", query = "SELECT b FROM Barang b"),
    @NamedQuery(name = "Barang.findByKodeBarang", query = "SELECT b FROM Barang b WHERE b.kodeBarang = :kodeBarang"),
    @NamedQuery(name = "Barang.findByNamaBarang", query = "SELECT b FROM Barang b WHERE b.namaBarang = :namaBarang"),
    @NamedQuery(name = "Barang.findByStockBarang", query = "SELECT b FROM Barang b WHERE b.stockBarang = :stockBarang")})
public class Barang implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "kode_barang")
    private Integer kodeBarang;
    @Basic(optional = false)
    @Column(name = "nama_barang")
    private String namaBarang;
    @Basic(optional = false)
    @Column(name = "stock_barang")
    private int stockBarang;

    public Barang() {
    }

    public Barang(Integer kodeBarang) {
        this.kodeBarang = kodeBarang;
    }

    public Barang(Integer kodeBarang, String namaBarang, int stockBarang) {
        this.kodeBarang = kodeBarang;
        this.namaBarang = namaBarang;
        this.stockBarang = stockBarang;
    }

    public Integer getKodeBarang() {
        return kodeBarang;
    }

    public void setKodeBarang(Integer kodeBarang) {
        this.kodeBarang = kodeBarang;
    }

    public String getNamaBarang() {
        return namaBarang;
    }

    public void setNamaBarang(String namaBarang) {
        this.namaBarang = namaBarang;
    }

    public int getStockBarang() {
        return stockBarang;
    }

    public void setStockBarang(int stockBarang) {
        this.stockBarang = stockBarang;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (kodeBarang != null ? kodeBarang.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Barang)) {
            return false;
        }
        Barang other = (Barang) object;
        if ((this.kodeBarang == null && other.kodeBarang != null) || (this.kodeBarang != null && !this.kodeBarang.equals(other.kodeBarang))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "toko.barang.Barang[ kodeBarang=" + kodeBarang + " ]";
    }
    
}
