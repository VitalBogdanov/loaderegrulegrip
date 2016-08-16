/**
	* Copyright (c) minuteproject, minuteproject@gmail.com
	* All rights reserved.
	* 
	* Licensed under the Apache License, Version 2.0 (the "License")
	* you may not use this file except in compliance with the License.
	* You may obtain a copy of the License at
	* 
	* http://www.apache.org/licenses/LICENSE-2.0
	* 
	* Unless required by applicable law or agreed to in writing, software
	* distributed under the License is distributed on an "AS IS" BASIS,
	* WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
	* See the License for the specific language governing permissions and
	* limitations under the License.
	* 
	* More information on minuteproject:
	* twitter @minuteproject
	* wiki http://minuteproject.wikispaces.com 
	* blog http://minuteproject.blogspot.net
	* 
*/
/**
	* template reference : 
	* - Minuteproject version : 0.8.8
	* - name      : DomainEntityJPA2Annotation
	* - file name : DomainEntityJPA2Annotation.vm
	* - time      : 2015/02/12 �.�. at 10:23:31 MSK
*/
package ru.iac.entity;


import org.hibernate.annotations.NaturalId;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 *
 * <p>Title: Spmns</p>
 *
 * <p>Description: Domain Object describing a Spmns entity</p>
 *
 */
@Entity (name="Spmns")
@Table (name="\"SPMNS\"")
@NamedQueries ({
	 @NamedQuery(name="Spmns.findAll", query="SELECT spmns FROM Spmns spmns")
        , @NamedQuery(name = "Spmns.findByName", query = "SELECT spmns FROM Spmns spmns WHERE spmns.name = :name")
        ,@NamedQuery(name="Spmns.findByNameContaining", query="SELECT spmns FROM Spmns spmns WHERE spmns.name like :name")

        , @NamedQuery(name = "Spmns.findByKod", query = "SELECT spmns FROM Spmns spmns WHERE spmns.kod = :kod order by 1")
        , @NamedQuery(name = "Spmns.findByKodContaining", query = "SELECT spmns FROM Spmns spmns WHERE spmns.kod like :kod")

	,@NamedQuery(name="Spmns.findByGihdAdate", query="SELECT spmns FROM Spmns spmns WHERE spmns.gihdAdate = :gihdAdate")

	,@NamedQuery(name="Spmns.findByGihdChdate", query="SELECT spmns FROM Spmns spmns WHERE spmns.gihdChdate = :gihdChdate")

	,@NamedQuery(name="Spmns.findByGihdDdate", query="SELECT spmns FROM Spmns spmns WHERE spmns.gihdDdate = :gihdDdate")

	,@NamedQuery(name="Spmns.findByGihdIdUser", query="SELECT spmns FROM Spmns spmns WHERE spmns.gihdIdUser = :gihdIdUser")

	,@NamedQuery(name="Spmns.findByGihdAIdPackage", query="SELECT spmns FROM Spmns spmns WHERE spmns.gihdAIdPackage = :gihdAIdPackage")

	,@NamedQuery(name="Spmns.findByGihdChIdPackage", query="SELECT spmns FROM Spmns spmns WHERE spmns.gihdChIdPackage = :gihdChIdPackage")

	,@NamedQuery(name="Spmns.findByGihdDIdPackage", query="SELECT spmns FROM Spmns spmns WHERE spmns.gihdDIdPackage = :gihdDIdPackage")

	,@NamedQuery(name="Spmns.findByRowCheckSum", query="SELECT spmns FROM Spmns spmns WHERE spmns.rowCheckSum = :rowCheckSum")
	,@NamedQuery(name="Spmns.findByRowCheckSumContaining", query="SELECT spmns FROM Spmns spmns WHERE spmns.rowCheckSum like :rowCheckSum")

})

public class Spmns implements Serializable, EgrulEntity, EgrulWithNaturalId {
    public static final String FIND_ALL = "Spmns.findAll";
    public static final String FIND_BY_NATURALID = "Spmns.findByKod";
    public static final String FIND_BY_NAME = "Spmns.findByName";
    public static final String FIND_BY_NAME_CONTAINING ="Spmns.findByNameContaining";
    public static final String FIND_BY_KOD = "Spmns.findByKod";
    public static final String FIND_BY_KOD_CONTAINING ="Spmns.findByKodContaining";
    public static final String FIND_BY_GIHDADATE = "Spmns.findByGihdAdate";
    public static final String FIND_BY_GIHDCHDATE = "Spmns.findByGihdChdate";
    public static final String FIND_BY_GIHDDDATE = "Spmns.findByGihdDdate";
    public static final String FIND_BY_GIHDIDUSER = "Spmns.findByGihdIdUser";
    public static final String FIND_BY_GIHDAIDPACKAGE = "Spmns.findByGihdAIdPackage";
    public static final String FIND_BY_GIHDCHIDPACKAGE = "Spmns.findByGihdChIdPackage";
    public static final String FIND_BY_GIHDDIDPACKAGE = "Spmns.findByGihdDIdPackage";
    public static final String FIND_BY_ROWCHECKSUM = "Spmns.findByRowCheckSum";
    public static final String FIND_BY_ROWCHECKSUM_CONTAINING ="Spmns.findByRowCheckSumContaining";
    private static final long serialVersionUID = 1L;
    @SequenceGenerator(name = "SPMNSSEQ", sequenceName ="SEQ_SPMNS", allocationSize=1 )
    @Id @Column(name="ID" )
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator="SPMNSSEQ")
    private Integer id;


    @Column(name="NAME"  , length=255 , nullable=true , unique=false)
    private String name;


    @NaturalId
    @Column(name="KOD"  , length=4 , nullable=true , unique=false)
    private String kod;


    @Column(name="GIHD__ADATE"   , nullable=true , unique=false)
    private Date gihdAdate;


    @Column(name="GIHD__CHDATE"   , nullable=true , unique=false)
    private Date gihdChdate;


    @Column(name="GIHD__DDATE"   , nullable=true , unique=false)
    private Date gihdDdate;


    @Column(name="GIHD__ID_USER"   , nullable=true , unique=false)
    private Integer gihdIdUser;


    @Column(name="GIHD__A_ID_PACKAGE"   , nullable=true , unique=false)
    private Integer gihdAIdPackage;


    @Column(name="GIHD__CH_ID_PACKAGE"   , nullable=true , unique=false)
    private Integer gihdChIdPackage;


    @Column(name="GIHD__D_ID_PACKAGE"   , nullable=true , unique=false)
    private Integer gihdDIdPackage;


    @Column(name="ROW_CHECK_SUM"   , nullable=true , unique=false)
    private String rowCheckSum;


    /**
    * Default constructor
    */
    public Spmns() {
    }

	/**
	* All field constructor 
	*/
    public Spmns(
       Integer id,
       String name,
       String kod,
       Date gihdAdate,
       Date gihdChdate,
       Date gihdDdate,
       Integer gihdIdUser,
       Integer gihdAIdPackage,
       Integer gihdChIdPackage,
       Integer gihdDIdPackage,
       String rowCheckSum) {
	 this(
       id,
       name,
       kod,
       gihdAdate,
       gihdChdate,
       gihdDdate,
       gihdIdUser,
       gihdAIdPackage,
       gihdChIdPackage,
       gihdDIdPackage,
       rowCheckSum
	 ,true);
	}
    
	public Spmns(
       Integer id,
       String name,
       String kod,
       Date gihdAdate,
       Date gihdChdate,
       Date gihdDdate,
       Integer gihdIdUser,
       Integer gihdAIdPackage,
       Integer gihdChIdPackage,
       Integer gihdDIdPackage,
       String rowCheckSum	
    , boolean setRelationship) {
       //primary keys
       setId (id);
       //attributes
       setName (name);
       setKod (kod);
       setGihdAdate (gihdAdate);
       setGihdChdate (gihdChdate);
       setGihdDdate (gihdDdate);
       setGihdIdUser (gihdIdUser);
       setGihdAIdPackage (gihdAIdPackage);
       setGihdChIdPackage (gihdChIdPackage);
       setGihdDIdPackage (gihdDIdPackage);
       setRowCheckSum (rowCheckSum);
       //parents
    }

	public Spmns flat() {
	   return new Spmns(
          getId(),
          getName(),
          getKod(),
          getGihdAdate(),
          getGihdChdate(),
          getGihdDdate(),
          getGihdIdUser(),
          getGihdAIdPackage(),
          getGihdChIdPackage(),
          getGihdDIdPackage(),
          getRowCheckSum()
       , false
	   );
	}

    public Integer getId() {
        return id;
    }
	
    public void setId (Integer id) {
        this.id =  id;
    }


    public String getName() {
        return name;
    }
	
    public void setName (String name) {
        this.name =  name;
    }


    public String getKod() {
        return kod;
    }
	
    public void setKod (String kod) {
        this.kod =  kod;
    }


    public Date getGihdAdate() {
        return gihdAdate;
    }
	
    public void setGihdAdate (Date gihdAdate) {
        this.gihdAdate =  gihdAdate;
    }


    public Date getGihdChdate() {
        return gihdChdate;
    }
	
    public void setGihdChdate (Date gihdChdate) {
        this.gihdChdate =  gihdChdate;
    }


    public Date getGihdDdate() {
        return gihdDdate;
    }
	
    public void setGihdDdate (Date gihdDdate) {
        this.gihdDdate =  gihdDdate;
    }


    public Integer getGihdIdUser() {
        return gihdIdUser;
    }
	
    public void setGihdIdUser (Integer gihdIdUser) {
        this.gihdIdUser =  gihdIdUser;
    }


    public Integer getGihdAIdPackage() {
        return gihdAIdPackage;
    }
	
    public void setGihdAIdPackage (Integer gihdAIdPackage) {
        this.gihdAIdPackage =  gihdAIdPackage;
    }


    public Integer getGihdChIdPackage() {
        return gihdChIdPackage;
    }
	
    public void setGihdChIdPackage (Integer gihdChIdPackage) {
        this.gihdChIdPackage =  gihdChIdPackage;
    }


    public Integer getGihdDIdPackage() {
        return gihdDIdPackage;
    }
	
    public void setGihdDIdPackage (Integer gihdDIdPackage) {
        this.gihdDIdPackage =  gihdDIdPackage;
    }


    public String getRowCheckSum() {
        return rowCheckSum;
    }
	
    public void setRowCheckSum (String rowCheckSum) {
        this.rowCheckSum =  rowCheckSum;
    }

    @Override
    public String getIdenti() {
        return id == null ? null : id.toString();
    }


    @Override
    public String getnaturalId() {
        return kod;
    }


    @Override
    public String returnNaturalIdQuery() {
        return FIND_BY_NATURALID;
    }


}
