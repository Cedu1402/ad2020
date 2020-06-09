package ch.hslu.ad.sw03;

public class SearchTree<T extends Comparable<T>> implements Tree<T>{

    private TreeNode<T> root;

    @Override
    public void add(T element) {
        if(element == null){
            throw new NullPointerException();
        }

        if(this.root == null){
            this.root = new TreeNode<T>(element);
        }else {
            if(this.root.getElement().compareTo(element) != 0){
                this.root.add(element);
            }
        }
    }

    @Override
    public String toString(){
        return this.root.toString();
    }

    @Override
    public void remove(T element) {

    }

    @Override
    public boolean inOrderSearch(T element) {
        if(this.root == null){
            return false;
        }
        return this.root.inOrderSearch(element);
    }

    @Override
    public boolean postOrderSearch(T element) {
        if(this.root == null){
            return false;
        }
        return this.root.postOrderSearch(element);
    }

    @Override
    public boolean preOrderSearch(T element) {
        if(this.root == null){
            return false;
        }
        return this.root.preOrderSearch(element);
    }
}
