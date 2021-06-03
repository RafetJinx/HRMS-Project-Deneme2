package kodlamaio.hrms.entities.concretes;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name="job_seekers")
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper=false)
@PrimaryKeyJoinColumn(name="user_id", referencedColumnName = "id")
public class JobSeeker extends User {
	
	@Column(name="first_name")
	private String first_name;
	
	@Column(name="last_name")
	private String last_name;
	
	@Column(name="nationality_identity_number")
	private String national_identity_number;
	
	@Column(name="date_of_birth")
	private Date date_of_birth;
	
}
