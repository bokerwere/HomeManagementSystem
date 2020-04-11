/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homemanagementsystem.HomeRegistration;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author boker
 */
@Entity
@Table(name = "home_item", catalog = "homemanagement", schema = "")
@NamedQueries({
    @NamedQuery(name = "HomeItem.findAll", query = "SELECT h FROM HomeItem h")
    , @NamedQuery(name = "HomeItem.findById", query = "SELECT h FROM HomeItem h WHERE h.id = :id")
    , @NamedQuery(name = "HomeItem.findByItemname", query = "SELECT h FROM HomeItem h WHERE h.itemname = :itemname")
    , @NamedQuery(name = "HomeItem.findByItemcategory", query = "SELECT h FROM HomeItem h WHERE h.itemcategory = :itemcategory")
    , @NamedQuery(name = "HomeItem.findByItemdescription", query = "SELECT h FROM HomeItem h WHERE h.itemdescription = :itemdescription")
    , @NamedQuery(name = "HomeItem.findByItemprice", query = "SELECT h FROM HomeItem h WHERE h.itemprice = :itemprice")})
public class HomeItem implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "itemname")
    private String itemname;
    @Basic(optional = false)
    @Column(name = "itemcategory")
    private String itemcategory;
    @Basic(optional = false)
    @Column(name = "itemdescription")
    private String itemdescription;
    @Basic(optional = false)
    @Column(name = "itemprice")
    private int itemprice;

    public HomeItem() {
    }

    public HomeItem(Integer id) {
        this.id = id;
    }

    public HomeItem(Integer id, String itemname, String itemcategory, String itemdescription, int itemprice) {
        this.id = id;
        this.itemname = itemname;
        this.itemcategory = itemcategory;
        this.itemdescription = itemdescription;
        this.itemprice = itemprice;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        Integer oldId = this.id;
        this.id = id;
        changeSupport.firePropertyChange("id", oldId, id);
    }

    public String getItemname() {
        return itemname;
    }

    public void setItemname(String itemname) {
        String oldItemname = this.itemname;
        this.itemname = itemname;
        changeSupport.firePropertyChange("itemname", oldItemname, itemname);
    }

    public String getItemcategory() {
        return itemcategory;
    }

    public void setItemcategory(String itemcategory) {
        String oldItemcategory = this.itemcategory;
        this.itemcategory = itemcategory;
        changeSupport.firePropertyChange("itemcategory", oldItemcategory, itemcategory);
    }

    public String getItemdescription() {
        return itemdescription;
    }

    public void setItemdescription(String itemdescription) {
        String oldItemdescription = this.itemdescription;
        this.itemdescription = itemdescription;
        changeSupport.firePropertyChange("itemdescription", oldItemdescription, itemdescription);
    }

    public int getItemprice() {
        return itemprice;
    }

    public void setItemprice(int itemprice) {
        int oldItemprice = this.itemprice;
        this.itemprice = itemprice;
        changeSupport.firePropertyChange("itemprice", oldItemprice, itemprice);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof HomeItem)) {
            return false;
        }
        HomeItem other = (HomeItem) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "homemanagementsystem.HomeRegistration.HomeItem[ id=" + id + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
