package lang.object.equals;

import java.util.Objects;

public class UserV2 {

	private String id;

	public UserV2(String id) {
		super();
		this.id = id;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		UserV2 other = (UserV2) obj;
		return Objects.equals(id, other.id);
	}
	
	/*
	@Override
	public boolean equals(Object obj) { // Object 타입을 매개변수로 사용해 객체의 특정 값을 사용하려면 다운캐스팅이 필요하다.
		UserV2 user = (UserV2) obj;
		return id.equals(user.id); // 나(UserV2)의 id와 인수로 넘어온 id가 같은지 확인
	}
	*/
	
	
}
