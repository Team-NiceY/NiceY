package site.nicey.model.dao;

import site.nicey.model.dto.Recommend;
import site.nicey.model.dto.Shoes;

import java.util.List;

public interface ShoesDao {

    List<Shoes> selectAll(String sportsType);

    Shoes selectShoes(int shoesId);

    void insertRecommend(Recommend recommend);

    int selectRecCnt(int shoesId);
}
