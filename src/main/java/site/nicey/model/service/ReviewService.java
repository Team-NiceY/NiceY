package site.nicey.model.service;

import site.nicey.model.dto.Review;

import java.util.List;

public interface ReviewService {

    List<Review> getReviewList(int id);

    void writeReview(Review review);

    void modifyReview(Review review);

    int reviewWriter(int userId);

    void reviewDelete(Review review);

}
