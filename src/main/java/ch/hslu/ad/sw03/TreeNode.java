package ch.hslu.ad.sw03;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class TreeNode<T extends Comparable<T>> implements Node<T>{
    private Node<T> leftNode;
    private Node<T> rightNode;
    private T element;
    private static Logger LOG = LogManager.getLogger();

    public TreeNode(T element){
        this.element = element;
    }

    @Override
    public String toString(){
        String result = "";
        if(this.element == null){
            return "";
        }
        result = result + " Element: " + this.element.toString();
        if(this.leftNode != null){
            result = result + " Left: " +  leftNode.toString();
        }
        if(this.rightNode != null){
            result = result + " Right" + rightNode.toString();
        }
        return "\nNode ( " + result + " )";
    }

    @Override
    public void add(T element) {
        if(this.element == null){
            this.element = element;
        }else if(this.element.compareTo(element) > 0){
            if(this.leftNode == null){
                this.leftNode = new TreeNode<T>(element);
            }else{
                this.leftNode.add(element);
            }
        }else if(this.element.compareTo(element) < 0){
            if(this.rightNode == null){
                this.rightNode = new TreeNode<T>(element);
            }else{
                this.rightNode.add(element);
            }
        }
    }

    @Override
    public T getElement() {
        return this.element;
    }

    @Override
    public boolean inOrderSearch(T element) {
        if(this.leftNode != null){
            // search in child nodes and return true if found.
            if(this.leftNode.inOrderSearch(element)){
                return true;
            }
        }
        LOG.info("\nSerach Node : " + this.getElement().toString());
        if (this.getElement().equals(element)){
            return true;
        }
        if(this.rightNode != null){
            // search in child nodes and return true if found.
            if(this.rightNode.inOrderSearch(element)){
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean preOrderSearch(T element) {
        LOG.info("\nSerach Node : " + this.getElement().toString());
        if(this.getElement().equals(element)){
            return true;
        }
        if(this.leftNode != null){
            if(this.leftNode.preOrderSearch(element)){
                return true;
            }
        }
        if(this.rightNode != null){
            if(this.rightNode.preOrderSearch(element)){
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean postOrderSearch(T element) {
        if(this.leftNode != null){
            if(this.leftNode.postOrderSearch(element)){
                return true;
            }
        }
        if(this.rightNode != null){
            if(this.rightNode.postOrderSearch(element)){
                return true;
            }
        }
        LOG.info("\nSerach Node : " + this.getElement().toString());
        if(this.getElement().equals(element)){
            return true;
        }
        return false;
    }


    @Override
    public Node<T> getLeftChild() {
        return null;
    }

    @Override
    public Node<T> getRightChild() {
        return null;
    }
}
