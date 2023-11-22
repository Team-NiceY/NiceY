package site.nicey.model.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import site.nicey.model.dao.ReviewDao;
import site.nicey.model.dto.Review;

import java.util.List;

@Service
public class ReviewServiceImpl implements ReviewService{

    private ReviewDao reviewDao;

    @Autowired
    public void setReviewDao(ReviewDao reviewDao) {
        this.reviewDao = reviewDao;
    }

    @Override
    public List<Review> getReviewList(int shoesId) {
        return reviewDao.selectReviewAll(shoesId);
    }

    @Transactional
    @Override
    public void writeReview(Review review) {
        reviewDao.insertReview(review);
    }

    @Transactional
    @Override
    public void modifyReview(Review review) {
        reviewDao.updateReview(review);
    }

    @Override
    public int reviewWriter(int userId) {
        return reviewDao.selectReviewWriter(userId);
    }

    @Transactional
    @Override
    public void reviewDelete(Review review) {
        reviewDao.deleteReview(review);
    }

    @Override
    public Review getReview(int reviewId) {
        reviewDao.updateViewCnt(reviewId);
        return reviewDao.getReview(reviewId);
    }

}
