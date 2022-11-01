package model;

import view.IService;

import java.util.List;

public class ReaderModel implements IService<Reader, List<Reader>> {
    @Override
    public void insert(Reader obj, List<Reader> objs) {
        objs.add(obj);
    }

    @Override
    public void delete(Reader obj, List<Reader> objs) {
        for (int i = 0; i < objs.size(); i++) {
            if (objs.get(i).getId() == obj.getId()){
                objs.remove(objs.get(i));
            }
        }
    }

    @Override
    public void update(Reader obj, List<Reader> objs) {
        for (Reader reader:objs) {
            if (obj.getId() == reader.getId()) {
                objs.remove(reader);
                objs.add(obj);
            }
        }
    }
}
