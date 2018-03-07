package generated.com.saladweek.paprika.db.hsqldb.entity;
// Generated 2018. 2. 7 오전 6:10:08 by Hibernate Tools 5.0.6.Final


import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * DocumentTranslations generated by hbm2java
 */
@Entity
@Table(name="document_translations"
)
public class DocumentTranslations  implements java.io.Serializable {


     private int id;
     private int documentId;
     private String locale;
     private Date createdAt;
     private Date updatedAt;
     private String title;
     private String body;
     private String desc;
     private String keywords;

    public DocumentTranslations() {
    }

	
    public DocumentTranslations(int id, int documentId, String locale) {
        this.id = id;
        this.documentId = documentId;
        this.locale = locale;
    }
    public DocumentTranslations(int id, int documentId, String locale, Date createdAt, Date updatedAt, String title, String body, String desc, String keywords) {
       this.id = id;
       this.documentId = documentId;
       this.locale = locale;
       this.createdAt = createdAt;
       this.updatedAt = updatedAt;
       this.title = title;
       this.body = body;
       this.desc = desc;
       this.keywords = keywords;
    }
   
     @Id 

    
    @Column(name="id", unique=true, nullable=false)
    public int getId() {
        return this.id;
    }
    
    public void setId(int id) {
        this.id = id;
    }

    
    @Column(name="document_id", nullable=false)
    public int getDocumentId() {
        return this.documentId;
    }
    
    public void setDocumentId(int documentId) {
        this.documentId = documentId;
    }

    
    @Column(name="locale", nullable=false)
    public String getLocale() {
        return this.locale;
    }
    
    public void setLocale(String locale) {
        this.locale = locale;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="created_at", length=19)
    public Date getCreatedAt() {
        return this.createdAt;
    }
    
    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="updated_at", length=19)
    public Date getUpdatedAt() {
        return this.updatedAt;
    }
    
    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    
    @Column(name="title")
    public String getTitle() {
        return this.title;
    }
    
    public void setTitle(String title) {
        this.title = title;
    }

    
    @Column(name="body", length=65535)
    public String getBody() {
        return this.body;
    }
    
    public void setBody(String body) {
        this.body = body;
    }

    
    @Column(name="desc", length=65535)
    public String getDesc() {
        return this.desc;
    }
    
    public void setDesc(String desc) {
        this.desc = desc;
    }

    
    @Column(name="keywords", length=65535)
    public String getKeywords() {
        return this.keywords;
    }
    
    public void setKeywords(String keywords) {
        this.keywords = keywords;
    }




}

