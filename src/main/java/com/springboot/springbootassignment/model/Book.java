package com.springboot.springbootassignment.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name = "BOOK", uniqueConstraints = { @UniqueConstraint(columnNames = { "BOOK_ID" }) })
public class Book implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1736359082512516235L;
	
	@Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
	private long bookId;
	
    private String title;
    private double price;
    private int volume;
    private String publishDate;
    
	/**
	 * @return the bookId
	 */
    @Id
    @Column(name = "BOOK_ID")
    public long getBookId() {
		return bookId;
	}
	/**
	 * @param bookId the bookId to set
	 */
	public void setBookId(long bookId) {
		this.bookId = bookId;
	}
	/**
	 * @return the title
	 */
	 @Column(name = "BOOK_TITLE", nullable = false)
	public String getTitle() {
		return title;
	}
	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}
	/**
	 * @return the price
	 */
	 @Column(name = "PRICE", nullable = false)
	public double getPrice() {
		return price;
	}
	/**
	 * @param price the price to set
	 */
	public void setPrice(double price) {
		this.price = price;
	}
	/**
	 * @return the volume
	 */
	 @Column(name = "VOLUME", nullable = false)
	public int getVolume() {
		return volume;
	}
	/**
	 * @param volume the volume to set
	 */
	public void setVolume(int volume) {
		this.volume = volume;
	}
	/**
	 * @return the publishDate
	 */
	 @Column(name = "PUBLISH_DATE", nullable = false)
	public String getPublishDate() {
		return publishDate;
	}
	/**
	 * @param publishDate the publishDate to set
	 */
	public void setPublishDate(String publishDate) {
		this.publishDate = publishDate;
	}

}
