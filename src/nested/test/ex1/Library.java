package nested.test.ex1;

public class Library {

	private Book[] books;
	private int count = 0;
	
	public Library(int max) {
		books = new Book[max];
		//count = 0; //생성자에서 생성할 때 count에 초기값을 넣어줘도 된다!
	}
	
	//Library 관련한 걸 써야 하면 static이면 안 된다.
	private static class Book { // 외부에 노출되면 안 되기 때문에 private
		private String title;
		private String author;

		public Book(String title, String author) {
			this.title = title;
			this.author = author;
		}

		// Getter 없어도 된다!! 내부에 있는 클래스들은 private이어도 양쪽으로 접근할 수 있다!
		/*
		public String getTitle() {
			return title;
		}
		public String getAuthor() {
			return author;
		}
		*/
	}

	public void addBook(String title, String author) {
		/*
		//검증 로직을 다 처리하고
		if(count < books.length) {
			System.out.println("도서관 저장 공간이 부족합니다.");
			return;
		}
		//정상 로직을 처리
		books[count++] = new Book(title, author);
		*/
	
		if(count < books.length) {
			books[count] = new Book(title, author);
			count++;
			// 합쳐서 books[count++] = new Book(title, author); 이렇게 적어도 된다.
		}else {
			System.out.println("도서관 저장 공간이 부족합니다.");
		}
	}
	
	public void showBooks() {
		System.out.println("== 책 목록 출력 ==");
		/*
		for(Book book : books) { // 책 하나도 없어도 배열 4개 다 돌수도
			System.out.println("도서 제목: " + book.getTitle() + ", 저자: " + book.getTitle());
		}
		*/
		for(int i = 0;i < count;i++) {
			System.out.println("도서 제목: " + books[i].title + ", 저자: " + books[i].author);
		}
	}
	
}
