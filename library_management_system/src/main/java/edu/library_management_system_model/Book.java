package edu.library_management_system_model;

import java.sql.Date;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@Entity
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String author;
    private String studentName; 
    private Date issueDate;
    private Date expiryDate;
   
    public Book() {
        super();
    }

	public Book(int id, String name, String author, String studentName, Date issueDate, Date expiryDate) {
		super();
		this.id = id;
		this.name = name;
		this.author = author;
		this.studentName = studentName;
		this.issueDate = issueDate;
		this.expiryDate = expiryDate;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public Date getIssueDate() {
		return issueDate;
	}

	public void setIssueDate(Date issueDate) {
		this.issueDate = issueDate;
	}

	public Date getExpiryDate() {
		return expiryDate;
	}

	public void setExpiryDate(Date expiryDate) {
		this.expiryDate = expiryDate;
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", name=" + name + ", author=" + author + ", studentName=" + studentName
				+ ", issueDate=" + issueDate + ", expiryDate=" + expiryDate + "]";
	}
	
    
    
}
