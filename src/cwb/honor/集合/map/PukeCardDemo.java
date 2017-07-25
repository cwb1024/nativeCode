package cwb.honor.集合.map;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class PukeCardDemo {

	public void getInitCard() {
		Map<Integer, String> initCard = new HashMap<Integer, String>();
		List<Integer> numbers = new ArrayList<Integer>();
		String[] card = { "2", "A", "K", "Q", "J", "10", "9", "8", "7", "6",
				"5", "4", "3" };
		String[] colors = { "❤", "♦", "♣", "♠" };
		int index = 2;
		for (String cards : card) {
			for (String color : colors) {
				initCard.put(index, color + cards);
				numbers.add(index);
				index++;
			}
		}
		initCard.put(0, "大王");
		numbers.add(0);
		initCard.put(1, "小王");
		numbers.add(1);

		// 打乱牌
		Collections.shuffle(numbers);
//		System.out.println(numbers);

		// 发牌，三个玩家,底牌集合，发牌主要是集合的索引%3拿到
		List<Integer> player1 = new ArrayList<Integer>();
		List<Integer> player2 = new ArrayList<Integer>();
		List<Integer> player3 = new ArrayList<Integer>();
		List<Integer> bottomCard = new ArrayList<Integer>();
		for (int i = 0; i < numbers.size(); i++) {
			if (i < 3) {// 先抽出三张底牌
				bottomCard.add(numbers.get(i));
			} else if (i % 3 == 0) {
				player1.add(numbers.get(i));
			} else if (i % 3 == 1) {
				player2.add(numbers.get(i));
			} else if (i % 3 == 2) {
				player3.add(numbers.get(i));
			}
		}
		
		//看牌
		Collections.sort(player1);
		Collections.sort(player2);
		Collections.sort(player3);
		
		look("player1",player1, initCard);
		look("player2",player2, initCard);
		look("player3",player3, initCard);
		look("bottomCard",bottomCard, initCard);
		
		/*
		 * //将序列号排列好 for (int i = 0; i < 52; i++) { numbers.add(i); } //将牌组装好
		 * for (int i = 0; i < card.length; i++) { for (int j = 0; j <
		 * colors.length; j++) { String cardPuke=colors[j]+card[i];
		 * initCard.put(numbers.get(i*4+j), cardPuke);//序号，扑克组装，辨别大小顺序
		 * System.out.println(cardPuke); } }
		 */
		/*System.out.println("----------------");
		Set<Entry<Integer, String>> keySet = initCard.entrySet();

		for (Entry<Integer, String> entry : keySet) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}*/
		
		
	}
	
	public void look(String name,List<Integer> player,Map<Integer,String> initCard){
		System.out.print(name+":");
		for (Integer integer : player) {
			String cc=initCard.get(integer);
			System.out.print(cc+"\t");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		PukeCardDemo puke = new PukeCardDemo();
		puke.getInitCard();
	}

}
