package a18_lombok;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
@ToString
public class Student {
	private String 이름;
	private String 학년;
	private String 반;
	private String 번호;
	private String 주소;
	private String 연락처;
	private String 생년월일;
}
