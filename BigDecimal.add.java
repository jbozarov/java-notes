	// getting total of items's prices 
	public BigDecimal getTotalOfCartItems() {
		BigDecimal total = BigDecimal.valueOf(10);
		for ( int i = 0; i<cartItems.size(); i++ ) {
			 //total += cartItems.get(i).getPrice();
			total.add(cartItems.get(i).getPrice());
		}
		return total;
	}
