package hellojpa;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;

@Entity
@SequenceGenerator(
		name = "MEMBER_SEQ_GENERATOR",
		sequenceName = "MEMBER_SEQ", /// 매핑할 데이터베이스 시퀀스 이름
		initialValue = 1, allocationSize = 50
		)
public class Member {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE,
					generator = "MEMBER_SEQ_GENERATOR")
	private Long id;
	
	@Column(name =  "name", nullable = false)
	private String username;

	public Member() {}

	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}
	
	
//	private Integer age;
//	
//	@Enumerated(EnumType.STRING)
//	private RoleType roleType;
//	
//	@Temporal(TemporalType.TIMESTAMP)
//	private Date createdDate;
//	
//	@Temporal(TemporalType.TIMESTAMP)
//	private Date lastModifiedDate;
//	
////	private LocalDate testLocalDate;
////	private LocalDateTime testLocalDateTimes;
//	
//	@Lob
//	private String description;
//	
//	@Transient
//	private int temp;
//	
//	public Member() {}
//
//	public Long getId() {
//		return id;
//	}
//
//	public void setId(Long id) {
//		this.id = id;
//	}
//
//	public String getUsername() {
//		return username;
//	}
//
//	public void setUsername(String username) {
//		this.username = username;
//	}

//	public Long getId() {
//		return id;
//	}
//
//	public void setId(Long id) {
//		this.id = id;
//	}
//
//	public String getUsername() {
//		return username;
//	}
//
//	public void setUsername(String username) {
//		this.username = username;
//	}
//
//	public Integer getAge() {
//		return age;
//	}
//
//	public void setAge(Integer age) {
//		this.age = age;
//	}
//
//	public RoleType getRoleType() {
//		return roleType;
//	}
//
//	public void setRoleType(RoleType roleType) {
//		this.roleType = roleType;
//	}
//
//	public Date getCreatedDate() {
//		return createdDate;
//	}
//
//	public void setCreatedDate(Date createdDate) {
//		this.createdDate = createdDate;
//	}
//
//	public Date getLastModifiedDate() {
//		return lastModifiedDate;
//	}
//
//	public void setLastModifiedDate(Date lastModifiedDate) {
//		this.lastModifiedDate = lastModifiedDate;
//	}
//
//	public String getDescription() {
//		return description;
//	}
//
//	public void setDescription(String description) {
//		this.description = description;
//	}
//
//	public int getTemp() {
//		return temp;
//	}
//
//	public void setTemp(int temp) {
//		this.temp = temp;
//	};

	
}
