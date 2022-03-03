package com.yumumu.riceApi.model.utils;

import java.util.ArrayList;
import java.util.Collection;

/**
 *  定长集合
 */
public class SizeList extends ArrayList {
    private static final long serialVersionUID = -1880221139494472747L;

    private int maxCapacity;

    public SizeList(int initialCapacity) {
        super(initialCapacity);
        this.maxCapacity = initialCapacity;
    }

    @Override
    public boolean add(Object o) {
        if (this.size() >= maxCapacity) {
            return false;
        }
        return super.add(o);
    }

    @Override
    public void add(int index, Object element) {
        if (index >= maxCapacity - 1) {
            return;
        }
        super.add(index, element);
    }

    @Override
    public boolean addAll(Collection c) {
        if (this.size() >= maxCapacity) {
            return false;
        }
        for (Object o : c) {
            boolean add = this.add(o);
            if (!add) {
                return true;
            }
        }
        return true;
    }

    @Override
    public boolean addAll(int index, Collection c) {
        if (this.size() >= maxCapacity) {
            return false;
        }
        for (Object o : c) {
            this.add(index++, o);
            if (this.size() >= maxCapacity) {
                return true;
            }
        }
        return true;
    }
}
