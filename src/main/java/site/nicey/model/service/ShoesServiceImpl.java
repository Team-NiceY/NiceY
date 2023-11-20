package site.nicey.model.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import site.nicey.model.dao.ShoesDao;
import site.nicey.model.dto.Shoes;

import java.util.List;

@Service
public class ShoesServiceImpl implements ShoesService {

    private ShoesDao shoesDao;

    @Autowired
    public void setShoesDao(ShoesDao shoesDao){
        this.shoesDao = shoesDao;
    }

    @Override
    public List<Shoes> getListAll(String sportsType) {
        return shoesDao.selectAll(sportsType);
    }
}