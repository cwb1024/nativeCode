package cwb.honor.集合.map;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CardDemo2 {

	Map<Integer, String> cardMap = new HashMap<Integer, String>();
	List<Integer> numberList = new ArrayList<Integer>();// 记录编号
	String[] style = { "♥", "♦", "♣", "♠" };
	String[] point = { "2", "A", "K", "Q", "J", "10", "9", "8", "7", "6", "5",
			"4", "3" };
	List<Integer> player1 = new ArrayList<Integer>();
	List<Integer> player2 = new ArrayList<Integer>();
	List<Integer> player3 = new ArrayList<Integer>();
	List<Integer> bottom = new ArrayList<Integer>();

	public void initCard() {
		// 首先将花色和数字组装好
		int index = 2;
		for (int i = 0; i < point.length; i++) {
			for (int j = 0; j < style.length; j++) {
				String cardStr = style[j] + point[i];
				cardMap.put(index, cardStr);
				numberList.add(index);
				index++;
			}
		}
		cardMap.put(0, "大王");
		numberList.add(0);
		cardMap.put(1, "小王");
		numberList.add(1);
	}

	public void breakCard() {
		Collections.shuffle(numberList);// 由于Collections工具类只能操作list集合，所以需要一个辅助的list集合存储数字，通过数字介意对照到什么牌
	}

	public void provideCard() {
		// 发牌需要接收方，三个玩家，即三个List集合，还有一个底牌
		for (int i = 0; i < numberList.size(); i++) {
			if (i < 3) {
				// 先拿底牌
				bottom.add(numberList.get(i));
			} else if (i % 3 == 0) {
				player1.add(numberList.get(i));
			} else if (i % 3 == 1) {
				player2.add(numberList.get(i));
			} else if (i % 3 == 2) {
				player3.add(numberList.get(i));
			}
		}
	}
	
	public void watchCard(){
		sortCard(player1);
		sortCard(player2);
		sortCard(player3);
		sortCard(bottom);
		lookCard("张三", player1, cardMap);
		lookCard("李四", player2, cardMap);
		lookCard("王五", player3, cardMap);
		lookCard("底牌", bottom, cardMap);

		
	}
	
	public void sortCard(List<Integer> list){
		Collections.sort(list);
	}

	public void lookCard(String name,List<Integer> list,Map<Integer, String> cardMap) {
		System.out.print(name+":");
		for (Integer i : list) {
			System.out.print(cardMap.get(i)+"\t");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		CardDemo2 card = new CardDemo2();
		card.initCard();
		card.breakCard();
		card.provideCard();
		card.watchCard();
	}

}
