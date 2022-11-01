package view;


import java.util.List;

public interface IService<T, L> {
    void insert(T obj, List<T> objs);
    void delete(T obj, List<T> objs);
    void update(T obj, List<T> objs);
}
