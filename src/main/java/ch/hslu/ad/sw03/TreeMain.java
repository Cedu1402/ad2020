package ch.hslu.ad.sw03;


import java.util.Objects;

public class TreeMain {

    public static void main(String[] args){
        SearchTree<Mountain> testTree = new SearchTree<>();

        Mountain matterhorn = new Mountain(50);
        testTree.add(matterhorn);

        Mountain napf = new Mountain(45);
        testTree.add(napf);

        Mountain huttuberg = new Mountain(40);
        testTree.add(huttuberg);

        Mountain testberg1 = new Mountain(60);
        testTree.add(testberg1);

        Mountain testberg2 = new Mountain(52);
        testTree.add(testberg2);

        Mountain testberg3 = new Mountain(65);
        testTree.add(testberg3);

        Mountain testberg4 = new Mountain(62);
        testTree.add(testberg4);

        Mountain testberg5 = new Mountain(46);
        testTree.add(testberg5);

        Mountain testberg6 = new Mountain(47);
        testTree.add(testberg6);

        Mountain testberg7 = new Mountain(5);
        testTree.add(testberg7);

        //testTree.postOrderSearch(testberg5);
        System.out.println((12 % 10));
        // System.out.println(testTree.toString());
    }
}
