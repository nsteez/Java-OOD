package Problem2;

import java.util.Objects;

public class StringList implements iList {

  private Node headerNode;

  public Node getHeaderNode() {
    return headerNode;
  }

  @Override
  public Boolean isEmpty() {
    return headerNode == null;
  }

  @Override
  //Only works with non-null header
  public Integer size() {
    if (isEmpty())
      return 0;
    else {
      Integer size = 1;
      Node tempNode = this.headerNode; //store in temporary Node
      while (headerNode.getNextPointer() != null) {
        size++;
        tempNode = tempNode.getNextPointer();
      }
      return size;
    }
  }

//  public Integer size2() {
//    {
//      Integer size = 0;
//      Node tempNode = this.headerNode;
//      while (tempNode != null) {
//        size++;
//        tempNode = tempNode.getNextPointer(); // getPointer
//      }
//      return size;
//    }
//  }

  @Override
  public Boolean contains(String element) {
    if (isEmpty())
      return false;
    else {
      Node tempNode = this.headerNode;
      while (tempNode.getNextPointer() != null) {
        if (tempNode.getValue().equals(element))
          return true;
        tempNode = tempNode.getNextPointer();
      }
    }
    return false;
  }

  @Override
  public Boolean containsAll(StringList list) {


    if (this.isEmpty() || list.isEmpty())
      return false;
    else {
      Node tempNode = this.headerNode;
      while (tempNode.getNextPointer() != null) {
        if (!list.contains(tempNode.getValue()))
          return false;
        tempNode = tempNode.getNextPointer();
      }
    }
    return true;
  }

  @Override
  public StringList filterLargerThan(Integer maxStringLength) {
    if (this.isEmpty())
      return this;
    else {
      Node tempNode = this.headerNode;
      StringList resultingList;
      while (tempNode.getNextPointer() != null);
    }
    return null;
  }

 @Override
public Boolean hasDuplicates() {
   if (!this.isEmpty()) {
     Node tempNode = this.headerNode;
     while (tempNode.getNextPointer() != null) {
       Node tempNode2 = tempNode.getNextPointer();
       while (tempNode2 != null) {
         if (tempNode.getValue().equals(tempNode2.getValue())) {
           return true;
         }
         tempNode2 = tempNode2.getNextPointer();
       }

       tempNode = tempNode.getNextPointer();
     }
   }
   return false;
 }

  @Override
  public StringList removeDuplicates() {
    return new StringList();
  }

  public StringList addElement(String Element) {
    Node tempNode = new Node(Element, null);

    if (isEmpty()) {
      headerNode = tempNode;
      return this;
    } else {
      Node currentNode = headerNode;
      while (currentNode.getNextPointer() != null) {
        currentNode = currentNode.getNextPointer();
      }
      currentNode.setPointer(tempNode);
    }
    return this;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StringList that = (StringList) o;
    return Objects.equals(headerNode, that.headerNode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(headerNode);
  }

  @Override
  public String toString() {
    return "StringList{" +
        "headerNode=" + headerNode +
        '}';
  }
}
