package site.nicey.model.dao;

import site.nicey.model.dto.Review;

import java.util.List;

public interface ReviewDao {

    List<Review> selectReviewAll(int shoesId);

    void insertReview(Review review);

    void updateReview(Review review);

    int selectReviewWriter(int userId);

    void deleteReview(Review review);

    Review getReview(int reviewId);

    void updateViewCnt(int reviewId);
}
