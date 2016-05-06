package com.example.zmw.studyitemdrag.bean;

import com.google.gson.annotations.SerializedName;
import com.j256.ormlite.field.DataType;
import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

import java.io.Serializable;

public class BookTable implements Serializable {
    private static final long serialVersionUID = 24653157905739211L;
    /**
     *
     */

    private int id;
    /**
     * 书id
     */
    @SerializedName("bk_mid")
    private String bookId;
    /**
     * 书名
     */
    @SerializedName("bk_title")
    private String name;
    /**
     * 封面图
     */
    @SerializedName("bk_cover_imgid")
    private String coverImageId;
    private String authorId;
    @SerializedName("bp_au_pname")
    private String authorName;
    /**
     * 是否包月
     */
    @SerializedName("bp_hire_flag")
    private int isMonthly;
    /**
     * 是否有新章节
     */
    private int hasNewChapter;//比较catalogupdatetime值确定这个参数
    private long lastReadDate;//请求书架时返回没有数据就用默认数据0
    private String lastReadChapter;
    private int lastReadLocation = 0;
    private float readPercentage;//读书的时候修改
    @SerializedName("bp_last_cpt_time")
    private long catalogUpdateTime;//最后修改时间
    private int IsOnShelf;//是否在书架0为假,1为真
    @SerializedName("operate_time")
    private long addToShelfTime;//加入书架之后生成时间  //移除书架的时候设置为0
    @SerializedName("bp_mdate")
    private long bookTotalStamp;//用于更新目录
    @SerializedName("bk_description")
    private String bookDesc;//详情
    @SerializedName("bk_share_url")

    private String website;//分享地址

    public String getBookDesc() {
        return bookDesc;
    }

    public void setBookDesc(String bookDesc) {
        this.bookDesc = bookDesc;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public long getBookTotalStamp() {
        return bookTotalStamp;
    }

    public void setBookTotalStamp(long bookTotalStamp) {
        this.bookTotalStamp = bookTotalStamp;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBookId() {
        return bookId;
    }

    public void setBookId(String bookId) {
        this.bookId = bookId;
    }

    public String getAuthorId() {
        return authorId;
    }

    public void setAuthorId(String authorId) {
        this.authorId = authorId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCoverImageId() {
        return coverImageId;
    }

    public void setCoverImageId(String coverImageId) {
        this.coverImageId = coverImageId;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public int getIsMonthly() {
        return isMonthly;
    }

    public void setIsMonthly(int isMonthly) {
        this.isMonthly = isMonthly;
    }

    public int getHasNewChapter() {
        return hasNewChapter;
    }

    public void setHasNewChapter(int hasNewChapter) {
        this.hasNewChapter = hasNewChapter;
    }

    public long getLastReadDate() {
        return lastReadDate;
    }

    public void setLastReadDate(long lastReadDate) {
        this.lastReadDate = lastReadDate;
    }

    public String getLastReadChapter() {
        return lastReadChapter;
    }

    public void setLastReadChapter(String lastReadChapter) {
        this.lastReadChapter = lastReadChapter;
    }

    public int getLastReadLocation() {
        return lastReadLocation;
    }

    public void setLastReadLocation(int lastReadLocation) {
        this.lastReadLocation = lastReadLocation;
    }

    public long getCatalogUpdateTime() {
        return catalogUpdateTime;
    }

    public void setCatalogUpdateTime(long catalogUpdateTime) {
        this.catalogUpdateTime = catalogUpdateTime;
    }

    public int getIsOnShelf() {
        return IsOnShelf;
    }

    public void setIsOnShelf(int isOnShelf) {
        IsOnShelf = isOnShelf;
    }

    public long getAddToShelfTime() {
        return addToShelfTime;
    }

    public void setAddToShelfTime(long addToShelfTime) {
        this.addToShelfTime = addToShelfTime;
    }

    public float getReadPercentage() {
        return readPercentage;
    }

    public void setReadPercentage(float readPercentage) {
        this.readPercentage = readPercentage;
    }

    @Override
    public String toString() {
        return "BookTable{" +
                "id=" + id +
                ", bookid='" + bookId + '\'' +
                ", name='" + name + '\'' +
                ", coverImageId='" + coverImageId + '\'' +
                ", authorName='" + authorName + '\'' +
                ", isMonthly=" + isMonthly +
                ", hasNewChapter=" + hasNewChapter +
                ", lastReadDate=" + lastReadDate +
                ", lastReadChapter=" + lastReadChapter +
                ", lastReadLocation=" + lastReadLocation +
                ", readPercentage=" + readPercentage +
                ", catalogUpdateTime=" + catalogUpdateTime +
                ", IsOnShelf=" + IsOnShelf +
                ", addToShelfTime=" + addToShelfTime +
                '}';
    }
}