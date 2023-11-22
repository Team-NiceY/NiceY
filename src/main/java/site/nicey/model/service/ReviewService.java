package site.nicey.model.service;

import site.nicey.model.dto.Review;

import java.util.List;

public interface ReviewService {

    List<Review> getReviewList(int shoesId);

    void writeReview(Review review);

    void modifyReview(Review review);

    int reviewWriter(int userId);

    void reviewDelete(Review review);

    Review getReview(int reviewId);
}
