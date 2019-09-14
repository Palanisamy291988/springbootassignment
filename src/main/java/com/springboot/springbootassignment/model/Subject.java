package com.springboot.springbootassignment.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name = "SUBJECT", uniqueConstraints = { @UniqueConstraint(columnNames = { "SUBJECT_ID" }) })
public class Subject implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 6132221244878168943L;
	
	
	private long subjectId;
	private String subtitle;
	private int durationInHours;
	private Book book;
   
	/**
	 * @return the subjectId
	 */
	@Id
	@Column(name = "SUBJECT_ID")
    @GeneratedValue(strategy = GenerationType.AUTO)
    public long getSubjectId() {
		return subjectId;
	}
	/**
	 * @return the references
	 */
	//@OneToOne(cascade = CascadeType.ALL)
	@OneToOne
    @JoinColumn(name="BOOK_ID")
	public Book getBook() {
		return book;
	}
	/**
	 * @param references the references to set
	 */
	public void setBook(Book book) {
		this.book = book;
	}
	/**
	 * @param subjectId the subjectId to set
	 */
	public void setSubjectId(long subjectId) {
		this.subjectId = subjectId;
	}
	/**
	 * @return the subtitle
	 */
	@Column(name = "SUBJECT_TITLE", nullable = false)	
	public String getSubtitle() {
		return subtitle;
	}
	/**
	 * @param subtitle the subtitle to set
	 */
	public void setSubtitle(String subtitle) {
		this.subtitle = subtitle;
	}
	/**
	 * @return the durationInHours
	 */
	@Column(name = "DURATION_INHOURS", nullable = false)
	public int getDurationInHours() {
		return durationInHours;
	}
	/**
	 * @param durationInHours the durationInHours to set
	 */
	public void setDurationInHours(int durationInHours) {
		this.durationInHours = durationInHours;
	}
	
	
}
