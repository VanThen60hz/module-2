package m2_case_study.FuramaManager.service;

import java.util.List;

public interface BaseService<T> {
    void create(T t);
    void update(T t);
    List<T> findAll();
}