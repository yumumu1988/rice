package com.yumumu.riceApi.model.utils;

import com.yumumu.riceApi.interfaces.UniqIdentify;

import java.util.*;

/**
 *  唯一定长集合
 */
public class UniqSizeList<T extends UniqIdentify> extends ArrayList<UniqIdentify> {
    private static final long serialVersionUID = -6958613334255363642L;

    private List<UniqIdentify> list;

    private Set<String> set;

    private Integer maxSize;

    public UniqSizeList(Integer maxSize) {
        this.maxSize = maxSize;
        this.list = new ArrayList<>(maxSize);
        this.set = new HashSet<>(maxSize);
    }

    @Override
    public boolean add(UniqIdentify uniqIdentify) {
        if (this.size() >= maxSize) {
            return false;
        }
        if (set.add(uniqIdentify.getIdentify())) {
            return super.add(uniqIdentify);
        }
        return false;
    }

    @Override
    public void add(int index, UniqIdentify element) {
        if (index > maxSize - 1) {
            return;
        }

        if (this.size() >= maxSize) {
            return;
        }

        if (set.add(element.getIdentify())) {
            super.add(index, element);
        }
    }

    @Override
    public boolean addAll(Collection<? extends UniqIdentify> c) {
        if (this.size() >= maxSize) {
            return false;
        }

        for (UniqIdentify uniqIdentify : c) {
            this.add(uniqIdentify);
            if (this.size() >= maxSize) {
                return true;
            }
        }

        return true;
    }

    @Override
    public boolean addAll(int index, Collection<? extends UniqIdentify> c) {
        if (index > maxSize - 1) {
            return false;
        }

        for (UniqIdentify uniqIdentify : c) {
            this.add(index++, uniqIdentify);
            if (this.size() >= maxSize) {
                return true;
            }
        }

        return true;
    }
}
