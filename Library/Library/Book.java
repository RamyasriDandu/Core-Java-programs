package com.interview.library;


	public class Book {

		int bookId;
		String bookName;
		String category;
		
		public Book(int bookId, String bookName, String category) {
			super();
			this.bookId = bookId;
			this.bookName = bookName;
			this.category = category;
		}
		
		public Book() {
			super();
		}

		public int getBookId() {
			return bookId;
		}

		public void setBookId(int bookId) {
			this.bookId = bookId;
		}

		public String getBookName() {
			return bookName;
		}

		public void setBookName(String bookName) {
			this.bookName = bookName;
		}

		public String getCategory() {
			return category;
		}

		public void setCategory(String category) {
			this.category = category;
		}
		
		
		
	}


