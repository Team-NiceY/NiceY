package site.nicey.controller;

//import io.swagger.annotations.Api;

import io.swagger.v3.oas.annotations.Operation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import site.nicey.model.dto.Recommend;
import site.nicey.model.dto.Shoes;
import site.nicey.model.service.ShoesService;

import java.util.List;

@RestController
//@CrossOrigin("*")
@RequestMapping("/api/shoes")
//@Api(tags = "ㅅㅂ 컨트롤러")
public class ShoesRestController {

    @Autowired
    private ShoesService shoesService;

    // 신발 type별로 전체 목록 가져오기
    @Operation(summary="신발 리스트", description = "전체 신발 목록을 가져온다")
    @GetMapping("/list/{sportsType}")
    public ResponseEntity<List<Shoes>> list(@PathVariable String sportsType) {
        List<Shoes> list = shoesService.getListAll(sportsType);
        return new ResponseEntity<List<Shoes>>(list, HttpStatus.OK);
    }

    // 신발 상세
    @Operation(summary="신발 상세", description = "해당 신발의 정보를 가져온다")
    @GetMapping("/detail/{shoesId}")
    public ResponseEntity<Shoes> shoesSelect(@PathVariable int shoesId) {
        Shoes shoes = shoesService.getShoes(shoesId);
        // 신발 추천수 가져와서 recCnt에 넣기
        int cnt = shoesService.getRecommend(shoesId);
        shoes.setRecCnt(cnt);
        return new ResponseEntity<Shoes>(shoes, HttpStatus.OK);
    }

    // 신발 추천기능
    @Operation(summary="신발 추천", description = "해당 신발을 추천한다")
    @PostMapping("/recommend")
    public ResponseEntity<Void> shoesRecommend(@RequestBody Recommend recommend) {
        shoesService.recommend(recommend);
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    // 신발 검색
    @Operation(summary="신발 검색", description = "해당 검색어를 가진 제품명을 가져온다")
    @GetMapping("/search/{search}")
    public ResponseEntity<?> shoesSearch(@PathVariable String search) {
        List<Shoes> list = shoesService.getSearchList(search);
        if (list == null || list.isEmpty())
            return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
        else
            return new ResponseEntity<List<Shoes>>(list, HttpStatus.OK);
    }
}
