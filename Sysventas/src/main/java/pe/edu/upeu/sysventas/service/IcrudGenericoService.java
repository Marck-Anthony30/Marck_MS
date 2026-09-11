package pe.edu.upeu.sysventas.service;

import java.util.List;

public interface IcrudGenericoService<T, ID> {
    T save(T entity);
    T update(ID id, T entity);
    List<T> findAll();
    T findId(ID id);
    void delete(ID id);
}
