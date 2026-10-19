package Practice;

import java.util.Scanner;

public class View {
	// Field //
	PlayerController ct = new PlayerController();
	Scanner sc = new Scanner(System.in);

	// Method //
	public void Start() {
		System.out.println("안녕하세요, 호감도 육성 시스템에 오신것을 환영합니다. (>_<)!!!");
		System.out.println("플레이하시는 분의 성함은 무엇인가요? > ");
		String name = sc.nextLine();
			while(true) {
			System.out.println("다음은 나이를 입력해주세요! > ");
			int age = sc.nextInt();
			sc.nextLine();
				if(age > 0 && age <= 100) {
					break;
			} else {
				System.out.println("올바른 나이를 입력하세요.");
			}
			}
		System.out.println("키를 설정해주세요. > ");
		int height = sc.nextInt();
		
		System.out.println("몸무게를 설정해주세요. > ");
		sc.nextInt();
		
		private void savePlayer() { // 플레이어 정보를 sc. 입력값을 통해 저장하는 메소드.
			// 저장된 값은 게임 플레이에 따라 변동사항이 있다.
			ct = ct;
		}
		}

	public void setCt(Controller ct) {
	
	}

	public void setSc(Scanner sc) {
		this.sc = sc;
	}
}
