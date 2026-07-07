package com.codegnan.collectionframework;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionMethodsDemo {

	public static void main(String[] args) {
		
		Collection<String> fruits=new ArrayList<>();
		System.out.println("-----------add()------------");
		// add(object o) : adds a single element to the collection
		fruits.add("apple");
		fruits.add("banana");
		fruits.add("cherry");
		fruits.add("kiwi");
		fruits.add("pineapple");
		System.out.println("fruits after add()" +fruits);
		System.out.println("--------addAll()------------");
		Collection<String>morefruits=new ArrayList<>();
		morefruits.add("mango");
		morefruits.add("grapes");
		morefruits.add("orange");
		morefruits.add("papaya");
		fruits.addAll(morefruits);
		System.out.println("fruits after addAll()" +fruits);
		System.out.println("--------remove()------------");
		fruits.remove("banana");
		System.out.println("fruits after remove(Banana)" +fruits);

		System.out.println("------------removeAll()-------------");

		System.out.println("fruits after remove()" +fruits);
		Collection<String>removeList=new ArrayList<String>();
		removeList.add("mango");
		removeList.add("cherry");
		removeList.add("papaya");
		fruits.removeAll(removeList);
		System.out.println("fruits after removeAll(mango,cherry,papaya): " + fruits);
		System.out.println("------------retainAll()-------------");
		Collection<String> retainList = new ArrayList<>();
		retainList.add("apple");
		retainList.add("grapes");
		retainList.add("oranges");
		fruits.retainAll(retainList);
		System.out.println("fruits after retainAll()" +fruits);
		System.out.println("---------contains()----------------");
		System.out.println("---------------containsAll()-------------");
		Collection<String> checkedList= new ArrayList<>();
		checkedList.add("apple");
		checkedList.add("grapes");
		System.out.println("fruits after containAll()" +fruits.containsAll(checkedList));
		System.out.println("-----------size()-----------");
		System.out.println("num of fruits" + fruits.size());
		System.out.println("-----------isEmpty()------------");
		System.out.println("is collection empty?" +fruits.isEmpty());
		System.out.println("---------toArray()-----------------");
		Object[] fruitArray = fruits.toArray();
		for(int i=0;i<fruitArray.length;i++) {
			System.out.println(fruitArray[i] + " ");
		}
		System.out.println();
		System.out.println("------------- iterator() -------------");
		System.out.println("Iterating using iterator");
		Iterator<String> itr = fruits.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next() + " ");
		}
		fruits.clear();
		System.out.println("Fruits after clear() : " + fruits);
		System.out.println("Is Collection Empty after clear()? " + fruits.isEmpty());
		
		
		
		
		
		
		

		

		

		

		



		


	}

}
