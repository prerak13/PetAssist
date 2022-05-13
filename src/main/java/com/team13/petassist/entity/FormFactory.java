package com.team13.petassist.entity;

import com.team13.petassist.interfaces.IForm;

public class FormFactory {
	public IForm getForm(String formType) {
		if(formType.equals("ItemForm")) {
			return ItemForm.getInstance();
		}
		else if(formType.equals("PetAdoptionForm")) {
			return  PetAdoptionForm.getInstance();
		}
		 return null;
	}
}
