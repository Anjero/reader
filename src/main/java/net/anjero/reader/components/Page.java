package net.anjero.reader.components;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * @author :Anjero
 * @version :1.0
 * @Title :Page.java
 * @Description:
 * @Datetime :2013-9-27
 * @Copyright :Copyright (c) 2012
 * @Company :Cheshell
 */
public class Page<T> implements Serializable {

  private int totalCount;
  private int pageNo;
  private int pageSize;
  private int totalPage;
  private List<T> list;

  public Page() {
    this(0, 1, 20, new ArrayList<T>());
  }

  public Page(int totalCount, int pageNo, int pageSize, List<T> list) {
    super();
    this.totalCount = totalCount;
    this.pageNo = pageNo;
    this.pageSize = pageSize;
    this.list = list;
  }

  public int getTotalCount() {
    return totalCount;
  }

  public void setTotalCount(int totalCount) {
    this.totalCount = totalCount;
  }

  public int getPageNo() {
    return pageNo;
  }

  public void setPageNo(int pageNo) {
    this.pageNo = pageNo;
  }

  public int getPageSize() {
    return pageSize;
  }

  public void setPageSize(int pageSize) {
    this.pageSize = pageSize;
  }

  public int getTotalPage() {
    if (pageSize == 0) {
      return totalPage = 0;
    }
    return (this.totalCount + pageSize - 1) / pageSize;
  }

  public void setTotalPage(int totalPage) {
    this.totalPage = totalPage;
  }

  public List<T> getList() {
    return list;
  }

  public void setList(List<T> list) {
    this.list = list;
  }

  @Override
  public String toString() {
    return "Page{" +
        "totalCount=" + totalCount +
        ", pageNo=" + pageNo +
        ", pageSize=" + pageSize +
        ", totalPage=" + totalPage +
        ", list=" + list +
        '}';
  }
}
