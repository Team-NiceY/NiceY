package site.nicey.model.dao;

import site.nicey.model.dto.Shoes;

import java.util.List;

public interface ShoesDao {

    public List<Shoes> selectAll(String sportsType);
}
