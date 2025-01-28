package beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name="user")
@Getter 
@Setter 
@NoArgsConstructor 
@ToString
public class User {

	@Id
	@Column(name="id")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	@Size(min=3, message="Username must have atleat 3 characters")
	@NotBlank(message = "Username can't be empty")
	@Column(name="username", nullable=false, unique=true)
	private String username;
	
	@NotBlank(message = "Password can't be empty")
	@Pattern(regexp="^(?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=]).{8,}$", message="Password must contain 8 characters(lowercase, uppercase, digit, special character - atleast one of each)")
	@Column(name="password", nullable=false)
	private String password;
	
	@Column(name="fname")
	private String fname;
	
	@Column(name="lname")
	private String lname;
	
	@Email
	@NotBlank(message = "Email can't be empty")
	@Column(name="email", nullable=false, unique=true)
	private String email;
	
	@Pattern(regexp="(^$|[0-9]{10})", message = "Invalid phone number")
	@Column(name="phone", unique=true, length=12)
	private String phone;
	
	@Column(name="profile_image", columnDefinition="varchar(1000) default 'https://t4.ftcdn.net/jpg/05/89/93/27/360_F_589932782_vQAEAZhHnq1QCGu5ikwrYaQD0Mmurm0N.jpg'")
	private String profileImg;
	
	@Column(name="user_role", nullable=false)
	private String userRole;
	
	@Column(name="about")
	private String about;
	
	@Column(name="status", nullable = false)
	private boolean status;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getProfileImg() {
		return profileImg;
	}

	public void setProfileImg(String profileImg) {
		this.profileImg = profileImg;
	}

	public String getUserRole() {
		return userRole;
	}

	public void setUserRole(String userRole) {
		this.userRole = userRole;
	}

	public String getAbout() {
		return about;
	}

	public void setAbout(String about) {
		this.about = about;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", password=" + password + ", fname=" + fname + ", lname="
				+ lname + ", email=" + email + ", phone=" + phone + ", profileImg=" + profileImg + ", userRole="
				+ userRole + ", about=" + about + ", status=" + status + "]";
	}
	
	
	
	
}
