package com.skilltest.questionbank.questionbank.util;

import java.util.function.Supplier;

import com.skilltest.questionbank.questionbank.exception.QuestionBankException;

public class SupplierFactory {
	
	public static Supplier<QuestionBankException> getQuestionBankExceptionSupplier(String message){
		return () -> new QuestionBankException(message);
	}

}
