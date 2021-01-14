package hashmap;


public class MemberHashMapTest {

	public static void main(String[] args) {

		MemberHashMap manager = new MemberHashMap();
		
		Member memberLee = new Member(100, "Lee");
		Member memberPark = new Member(300, "Park");
		Member memberKim = new Member(200, "Kim");
		// key 값이 Integer이고 Integer 클래스에 equals와 hashCode가 재정의되어있기 때문에 추가 안됨
		Member memberPark2 = new Member(300, "Park2");
		
		manager.addMember(memberLee);
		manager.addMember(memberKim);
		manager.addMember(memberPark);
		manager.addMember(memberPark2);
		
		manager.showAllMember();
		
		manager.removeMember(200);
		manager.showAllMember();
	}

}
