package weatherwhere.team.login.domain.member;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
public class Member {
    private Long id;
    private String userId;
    private String userPw;
    private String userPwCheck;
    private String userMail;
    private String userLocation;
    private String userLocation2;
    private String userPhoto;





}
