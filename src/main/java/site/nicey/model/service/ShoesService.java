package site.nicey.model.service;

import site.nicey.model.dto.Recommend;
import site.nicey.model.dto.Shoes;

import java.util.List;

public interface ShoesService {

    List<Shoes> getListAll(String sportsType);

    Shoes getShoes(int shoesId);

    void recommend(Recommend recommend);

    int getRecommend(int shoesId);
}
