package site.nicey.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import site.nicey.model.dto.User;
import site.nicey.model.service.UserService;

@Tag(name="user", description = "사용자API")
@RestController
@CrossOrigin("*")
@RequestMapping("/api/user")
//@Api(tags = "사용자 컨트롤러")
public class UserRestController {
// commit
    @Autowired
    private UserService userService;

    // 회원가입
    @Operation(summary="회원가입", description = "정보를 입력하여 회원가입")
    @PostMapping("/regist")
    public ResponseEntity<Integer> signup(@RequestBody User user) {
        int result = userService.signup(user);
        return new ResponseEntity<Integer>(result, HttpStatus.CREATED);
    }

    // 로그인
    @Operation(summary = "로그인", description = "로그인 성공 여부")
    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestBody User user) {
        User loginUser = userService.login(user);

        // 로그인 성공 여부
        if(loginUser == null)
            return new ResponseEntity<Void>(HttpStatus.UNAUTHORIZED);
        else
            return new ResponseEntity<User>(loginUser, HttpStatus.OK);
    }

    // 로그아웃
    @Operation(summary = "로그아웃", description = "로그아웃")
    @GetMapping("/logout")
    public ResponseEntity<Void> logout(HttpSession session) {
        session.invalidate();
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

}
