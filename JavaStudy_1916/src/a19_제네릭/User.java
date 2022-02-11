package a19_제네릭;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class User {
	private String username;
	private String password;
}

@NoArgsConstructor
@AllArgsConstructor
@Data
class PersonalUser extends User {
	private String personal_name;
}

@NoArgsConstructor
@AllArgsConstructor
@Data
class CompanyUser extends User {
	private String company_name;
}