package site.nicey.controller;

import io.swagger.v3.oas.annotations.Operation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import site.nicey.model.dto.Review;
import site.nicey.model.service.ReviewService;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/api/shoes/reviews")
//@Api(tags = "리뷰 컨트롤러")
public class ReviewRestController {

    @Autowired
    private ReviewService reviewService;

    // 해당 신발의 리뷰들을 가져온다
    @Operation(summary="신발 리뷰", description = "해당 신발의 리뷰 전체 가져온다")
    @GetMapping("/{shoesId}")
    public ResponseEntity<?> reviewList (@PathVariable int shoesId) {
        List<Review> list = reviewService.getReviewList(shoesId);
        if (list == null || list.isEmpty())
            return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
        else
            return new ResponseEntity<List<Review>>(list, HttpStatus.OK);
    }

    // 해당 신발의 리뷰를 작성한다.
    @Operation(summary="리뷰 작성", description = "해당 신발의 리뷰를 작성한다")
    @PostMapping()
    public ResponseEntity<Void> reviewWrite(@RequestBody Review review) {
        reviewService.writeReview(review);
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    // 자신이 작성한 리뷰를 수정한다.
    @Operation(summary="리뷰 수정", description = "자신이 작성한 리뷰를 수정한다")
    @PutMapping()
    public ResponseEntity<Void> reviewModify(@RequestBody Review review) {
        reviewService.modifyReview(review);
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    // 본인이 작성한 리뷰는 본인만 삭제한다.
    @Operation(summary="리뷰 삭제", description = "자신이 작성한 리뷰를 삭제한다")
    @DeleteMapping()
    public ResponseEntity<Void> reviewDelete(@RequestBody Review review) {

        // 세션에 저장된 id 확인 후 delete 해야함
        reviewService.reviewDelete(review);
        return new ResponseEntity<Void>(HttpStatus.OK);

//        int result = reviewService.reviewWriter(review.getReviewId());
//        if (result == review.getUserId())
//            return new ResponseEntity<Void>(HttpStatus.UNAUTHORIZED);
//        else {
//            reviewService.reviewDelete(review);
//            return new ResponseEntity<Void>(HttpStatus.OK);
//        }
    }

    // 리뷰 상세
    @Operation(summary="리뷰 상세", description = "해당 신발 리뷰의 정보를 가져온다")
    @GetMapping("/detail/{reviewId}")
    public ResponseEntity<Review> reviewSelect(@PathVariable int reviewId) {
        Review review = reviewService.getReview(reviewId);
        return new ResponseEntity<Review>(review, HttpStatus.OK);
    }



}
