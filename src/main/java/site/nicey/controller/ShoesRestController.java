package site.nicey.controller;

//import io.swagger.annotations.Api;

import io.swagger.v3.oas.annotations.Operation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import site.nicey.model.dto.Shoes;
import site.nicey.model.service.ShoesService;

import java.util.List;

@RestController
@RequestMapping("/shoes")
//@Api(tags = "ㅅㅂ 컨트롤러")
public class ShoesRestController {

    @Autowired
    private ShoesService shoesService;

    // 신발 전체 목록 가져오기

    @Operation(summary="신발 리스트", description = "전체 신발 목록을 가져온다")
    @GetMapping("/list")
    public ResponseEntity<List<Shoes>> list() {
        List<Shoes> list = shoesService.getListAll();
        return new ResponseEntity<List<Shoes>>(list, HttpStatus.OK);
    }



}
