package com.test.tree;


import com.test.tree.utils.TreeNodeId;
import com.test.tree.utils.TreeNodeLabel;
import com.test.tree.utils.TreeNodePid;

/**
 * Created by fuweiwei on 2015/12/24.
 */
public class BaseTreeBean {
    @TreeNodeId
    private String id;   //自己id
    @TreeNodePid
    private  String parentId; //上一层id
    @TreeNodeLabel
    private String name; //名字

    public BaseTreeBean(){

    }
    public BaseTreeBean(String id, String parentId, String name){
        this.id = id;
        this.parentId = parentId;
        this.name = name;

    }
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
