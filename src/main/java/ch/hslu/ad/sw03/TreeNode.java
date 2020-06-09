package ch.hslu.ad.sw03;

public class TreeNode<T extends Comparable<T>> implements Node<T>{
    private Node<T> leftNode;
    private Node<T> rightNode;
    private T element;

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
    public Node<T> getLeftChild() {
        return null;
    }

    @Override
    public Node<T> getRightChild() {
        return null;
    }
}
