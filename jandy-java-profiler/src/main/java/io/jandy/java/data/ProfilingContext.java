package io.jandy.java.data;

import java.util.ArrayList;
import java.util.List;

/**
 * @author JCooky
 * @since 2016-03-16
 */
public class ProfilingContext {
  private List<TreeNode> nodes;
  private List<MethodObject> methods;
  private List<ClassObject> classes;
  private List<ExceptionObject> exceptions;
  private String rootId;

  public void setNodes(List<TreeNode> nodes) {
    this.nodes = nodes;
  }

  public List<TreeNode> getNodes() {
    return nodes;
  }

  public void setMethods(ArrayList<MethodObject> methods) {
    this.methods = methods;
  }

  public List<MethodObject> getMethods() {
    return methods;
  }

  public void setClasses(ArrayList<ClassObject> classes) {
    this.classes = classes;
  }

  public List<ClassObject> getClasses() {
    return classes;
  }

  public void setExceptions(List<ExceptionObject> exceptions) {
    this.exceptions = exceptions;
  }

  public List<ExceptionObject> getExceptions() {
    return exceptions;
  }

  public void setRootId(String rootId) {
    this.rootId = rootId;
  }

  public String getRootId() {
    return rootId;
  }
}
