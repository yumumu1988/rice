package com.yumumu.riceApi.model.utils;

import com.yumumu.riceApi.interfaces.UniqIdentify;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

/**
 *  唯一集合
 */
public class UniqList<T extends UniqIdentify> extends ArrayList<UniqIdentify> {

    private static final long serialVersionUID = -1620243130189968519L;

    private final Set<String> set = new HashSet<>();

    @Override
    public boolean add(UniqIdentify uniqIdentify) {
        if (set.add(uniqIdentify.getIdentify())) {
            return super.add(uniqIdentify);
        } else {
            return false;
        }
    }

    @Override
    public void add(int index, UniqIdentify element) {
        if (set.add(element.getIdentify())) {
            super.add(index, element);
        }
    }

    @Override
    public boolean addAll(Collection<? extends UniqIdentify> c) {
        c.forEach(this::add);
        return true;
    }

    @Override
    public boolean addAll(int index, Collection<? extends UniqIdentify> c) {
        Collection<UniqIdentify> collection = new ArrayList<>(c.size());
        c.forEach(e->{
            if (set.add(e.getIdentify())) {
                collection.add(e);
            }
        });
        return super.addAll(index, collection);
    }
}
