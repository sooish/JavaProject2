/**
CREATE TABLE education (
       school_id         	    VARCHAR2(100)  PRIMARY KEY,
       school_name             	VARCHAR2(100) NOT NULL,
       num_students         	NUMBER(20) NOT NULL,
       num_facluty              NUMBER(20) NOT NULL,
       it_concentration         NUMBER(20) NOT NULL
); */

package mbaevaluation.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class EducationDTO {
	private String school_id;
	private String school_name;
	private int stunum1;
	private int num_faculty;
	private float it_concentration;
	
//	@Override
//	public String toString() {
//		StringBuilder builder = new StringBuilder();
//		builder.append("1. �б� id : ");
//		builder.append(school_id);
//		builder.append(" 2. �б� �̸� : ");
//		builder.append(school_name);
//		builder.append(" 3. �л��� : ");
//		builder.append(num_students);
//		builder.append(" 4. �������� : ");
//		builder.append(num_faculty);
//		builder.append(" 5. IT�о� ���õ� : ");
//		builder.append(it_concentration);
//		return builder.toString();
//	}
	
}
