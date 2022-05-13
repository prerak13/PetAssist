package com.team13.petassist.interfaces;

import java.sql.SQLException;
import java.util.List;
import com.team13.petassist.entity.PetItems;
import com.team13.petassist.entity.ItemForm;
public interface IOrderRepo {

	List<IOrder> getAllOrders(String userId) throws SQLException;

	IOrder getOrder(String id) throws SQLException;

	Boolean updateOrder(IOrder o) throws SQLException;

	String storeOrder(PetItems petItems, ItemForm placeOrderForm) throws SQLException;

}
