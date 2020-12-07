package com.example.fr01.services;

import com.example.fr01.model.entities.QuestionEntity;
import com.example.fr01.model.in.QuestionCreate;
import com.example.fr01.repositories.IQuestionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class QuestionService {
    @Autowired
    private IQuestionRepository iQuestionRepository;

    public List<QuestionEntity> read() {
        return iQuestionRepository.findAll();
    }


    public QuestionEntity create(QuestionCreate questionCreate) {

        QuestionEntity questionEntity = new QuestionEntity();

        questionEntity.setA(questionCreate.getA());
        questionEntity.setB(questionCreate.getB());
        questionEntity.setC(questionCreate.getC());
        questionEntity.setD(questionCreate.getD());
        questionEntity.setDapan(questionCreate.getDapan());
        questionEntity.setLoaicauhoi(questionCreate.getLoaicauhoi());
        questionEntity.setNoidung(questionCreate.getNoidung());
        questionEntity.setCapdo(questionCreate.getCapdo());

        questionEntity = iQuestionRepository.save(questionEntity);

        return questionEntity;
    }

    public String delete(int id) {

        QuestionEntity user = iQuestionRepository.findById(id).orElse(null);
        if (user == null) return "Fail !";

        iQuestionRepository.delete(user);

        return "Success !";
    }
}
