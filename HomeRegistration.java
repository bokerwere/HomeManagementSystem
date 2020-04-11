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
@Table(name = "home _registration", catalog = "homemanagement", schema = "")
@NamedQueries({
    @NamedQuery(name = "HomeRegistration.findAll", query = "SELECT h FROM HomeRegistration h")
    , @NamedQuery(name = "HomeRegistration.findById", query = "SELECT h FROM HomeRegistration h WHERE h.id = :id")
    , @NamedQuery(name = "HomeRegistration.findByFname", query = "SELECT h FROM HomeRegistration h WHERE h.fname = :fname")
    , @NamedQuery(name = "HomeRegistration.findByLname", query = "SELECT h FROM HomeRegistration h WHERE h.lname = :lname")
    , @NamedQuery(name = "HomeRegistration.findByIdnumber", query = "SELECT h FROM HomeRegistration h WHERE h.idnumber = :idnumber")
    , @NamedQuery(name = "HomeRegistration.findByMnumber", query = "SELECT h FROM HomeRegistration h WHERE h.mnumber = :mnumber")
    , @NamedQuery(name = "HomeRegistration.findByGender", query = "SELECT h FROM HomeRegistration h WHERE h.gender = :gender")
    , @NamedQuery(name = "HomeRegistration.findByPassword", query = "SELECT h FROM HomeRegistration h WHERE h.password = :password")})
public class HomeRegistration implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "fname")
    private String fname;
    @Basic(optional = false)
    @Column(name = "lname")
    private String lname;
    @Basic(optional = false)
    @Column(name = "idnumber")
    private int idnumber;
    @Basic(optional = false)
    @Column(name = "mnumber")
    private int mnumber;
    @Basic(optional = false)
    @Column(name = "gender")
    private String gender;
    @Basic(optional = false)
    @Column(name = "password")
    private String password;

    public HomeRegistration() {
    }

    public HomeRegistration(Integer id) {
        this.id = id;
    }

    public HomeRegistration(Integer id, String fname, String lname, int idnumber, int mnumber, String gender, String password) {
        this.id = id;
        this.fname = fname;
        this.lname = lname;
        this.idnumber = idnumber;
        this.mnumber = mnumber;
        this.gender = gender;
        this.password = password;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        Integer oldId = this.id;
        this.id = id;
        changeSupport.firePropertyChange("id", oldId, id);
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        String oldFname = this.fname;
        this.fname = fname;
        changeSupport.firePropertyChange("fname", oldFname, fname);
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        String oldLname = this.lname;
        this.lname = lname;
        changeSupport.firePropertyChange("lname", oldLname, lname);
    }

    public int getIdnumber() {
        return idnumber;
    }

    public void setIdnumber(int idnumber) {
        int oldIdnumber = this.idnumber;
        this.idnumber = idnumber;
        changeSupport.firePropertyChange("idnumber", oldIdnumber, idnumber);
    }

    public int getMnumber() {
        return mnumber;
    }

    public void setMnumber(int mnumber) {
        int oldMnumber = this.mnumber;
        this.mnumber = mnumber;
        changeSupport.firePropertyChange("mnumber", oldMnumber, mnumber);
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        String oldGender = this.gender;
        this.gender = gender;
        changeSupport.firePropertyChange("gender", oldGender, gender);
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        String oldPassword = this.password;
        this.password = password;
        changeSupport.firePropertyChange("password", oldPassword, password);
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
        if (!(object instanceof HomeRegistration)) {
            return false;
        }
        HomeRegistration other = (HomeRegistration) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "homemanagementsystem.HomeRegistration.HomeRegistration[ id=" + id + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
