package com.tdd;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;

public class Calculator {
	Cart cart = Cart.getCartInstance();
	PrintReceipt printReceipt = PrintReceipt.getPrintReceiptInstance();


	private ArrayList<IProduct> cartItems = Cart.getCartInstance().getProducts(); 
	
	// getting total of items's prices 
	public BigDecimal getTotalOfCartItems() {
		BigDecimal total = BigDecimal.valueOf(10);
		for ( int i = 0; i<cartItems.size(); i++ ) {
			 //total += cartItems.get(i).getPrice();
			total.add(cartItems.get(i).getPrice());
		}
		return total;
	}

	public ArrayList<IProduct> getCartItems() {
		return cartItems;
	}

	public BigDecimal addTax(ArrayList<IProduct> cartItems) {
		BigDecimal totalTax = BigDecimal.valueOf(0);
		for (IProduct item : cartItems) {
			// item is not exempted, not imported
			if (!item.isExempted() && !item.isImported()) {
				totalTax = totalTax.add(item.getPrice().multiply(Constants.TAX_RATE_TEN).setScale(2, RoundingMode.HALF_EVEN));
				item.setPrice(item.getPrice().multiply(Constants.MULT_TAX_RATE_TEN).setScale(2, RoundingMode.HALF_EVEN));;
			}
			// item is not exempted, but imported
			else if (!item.isExempted() && item.isImported()) {
				totalTax = totalTax.add(item.getPrice().multiply(Constants.TAX_RATE_FIFTEEN).setScale(2, RoundingMode.HALF_EVEN));
				item.setPrice(item.getPrice().multiply(Constants.MULT_TAX_RATE_FIFTEEN).setScale(2, RoundingMode.HALF_EVEN));
			}
			// item is exempted, but imported
			else if (item.isExempted() && item.isImported()) {
				totalTax = totalTax.add(item.getPrice().multiply(Constants.TAX_RATE_FIVE).setScale(2, RoundingMode.HALF_EVEN));
				item.setPrice(item.getPrice().multiply(Constants.MULT_TAX_RATE_FIVE).setScale(2, RoundingMode.HALF_EVEN));
			}
			// in all other cases
		}
		return totalTax;
	}

	// get all transactions
	public BigDecimal getAllTransactions () {
		BigDecimal result = BigDecimal.valueOf(0);
		result = getCartItems()
				.stream()
				.map(IProduct::getPrice)
				.reduce(BigDecimal.ZERO, BigDecimal::add);
		return result;
	}

	public void processTransactions(ArrayList<IProduct> products) {
		BigDecimal taxAmount = addTax(cart.getProducts());
		BigDecimal total = getAllTransactions();
		printReceipt.receiptPrinter(getCartItems(), taxAmount, total);
		cart.clearCart();
	}
}
