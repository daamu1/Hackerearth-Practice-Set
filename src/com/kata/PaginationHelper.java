package com.kata;

import java.util.List;

public class PaginationHelper<I> {

    private final List<I> collection;
    private final int itemsPerPage;

    public PaginationHelper(List<I> collection, int itemsPerPage) {
        this.collection = collection;
        this.itemsPerPage = itemsPerPage;
    }

    public int itemCount() {
        return collection.size();
    }

    public int pageCount() {
        int totalItems = itemCount();
        return totalItems % itemsPerPage == 0 ? totalItems / itemsPerPage : totalItems / itemsPerPage + 1;
    }

    public int pageItemCount(int pageIndex) {
        if (pageIndex < 0 || pageIndex >= pageCount()) {
            return -1;
        }
        if (pageIndex == pageCount() - 1) {
            return itemCount() % itemsPerPage == 0 ? itemsPerPage : itemCount() % itemsPerPage;
        }
        return itemsPerPage;
    }

    public int pageIndex(int itemIndex) {
        if (itemIndex < 0 || itemIndex >= itemCount()) {
            return -1;
        }
        return itemIndex / itemsPerPage;
    }
}
